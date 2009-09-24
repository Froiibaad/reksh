	package asm;

	import java.util.LinkedList;

	public class Asembler {

		/*
		 * (non-javadoc)
		 */
		private boolean radi;

		/*
		 * (non-javadoc)
		 */
		private int lc;

		/*
		 * (non-javadoc)
		 */
		private TabelaSimbola tabelaSimbola;

		/*
		 * (non-javadoc)
		 */
		private LinkedList<ObradjenToken> obradjeniTokeni;

		/*
		 * (non-javadoc)
		 */
		private Tokenizer tokenizer;

		/*
		 * (non-javadoc)
		 */
		private String ulazniFajl;

		/*
		 * (non-javadoc)
		 */
		private String kod;

		public Asembler(String ulazniFajl) {
			this.ulazniFajl = ulazniFajl;
			this.tokenizer = new Tokenizer(ulazniFajl);
			this.obradjeniTokeni = new LinkedList<ObradjenToken>();
			this.tabelaSimbola = new TabelaSimbola();
			this.radi = false;
			this.lc = 0;
		}

		public LinkedList<ObradjenToken> DrugiProlaz() {
			LinkedList<ObradjenToken> fin = new LinkedList<ObradjenToken>();
			for(ObradjenToken o : this.obradjeniTokeni)
			{
				TipInstrukcije ti = o.getTipInstr();
				switch(ti)
				{
				case DIR:
				{
					switch((Direktiva)o.getIntrukcija())
					{
					case BEG:
						this.lc=0;
						this.kod += "0\n";
						fin.add(o);
						break;
					case ORG:
						int i = Integer.parseInt(o.getOperand1().substring(1), 16);
						this.kod = o.getOperand1().substring(1) + "\n";
						this.lc = i;
						o.setVrednostOperanda1(i);
						fin.add(o);						
						break;
					case DC:
						i = Integer.parseInt(o.getOperand1().substring(1), 16);
						this.kod += o.getOperand1().substring(1) + " ";
						this.lc++ ;
						o.setVrednostOperanda1(i);
						fin.add(o);
						break;
					case DS:
						i = Integer.parseInt(o.getOperand1().substring(1), 16);
						for (int j = 0; j< i; j++) this.kod += "0 ";
						this.lc += i;
						o.setVrednostOperanda1(i);
						fin.add(o);
						break;
					}
					break;
				}
				
				case A:
				{
					this.lc++;
					switch((BezadresnaInstrukcija)o.getIntrukcija())
					{
					case RTS:
						fin.add(o);
						this.kod += "00 ";
						break;
					
					case RTI:
						fin.add(o);
						this.kod += "04 ";
						break;
					case INTE:
						fin.add(o);
						this.kod += "08 ";
						break;
					case INTD:
						fin.add(o);
						this.kod += "0C ";
						break;
					case TRPE:
						fin.add(o);
						this.kod += "10 ";
						break;
					case TRPD:
						fin.add(o);
						this.kod += "14 ";
						break;
					}
					break;
				}
				}
			}
			System.out.println(this.kod);
			return null;
		}

		public void PrviProlaz() {
			this.lc = 0;
			this.radi = true;
			while (radi) {
				Token temp = tokenizer.dohvatiToken();
				Instrukcija inst = temp.getInstrukcija();
				if (temp.getLabela() != null)
					tabelaSimbola.dodaj(new Simbol(temp.getLabela(), lc));
				if ("asm.Direktiva".equals(inst.getClass().getName())) {
					switch ((Direktiva) inst) {
					case BEG:
						this.lc = 0;
						break;
					case END:
						this.radi = false;
						break;
					case ORG:
						int i = Integer.parseInt(temp.getAdresnoPolje()
								.substring(1), 16);
						this.lc = i;
						break;
					case DC:
						lc += 1;
						break;
					case DS:
						i = Integer.parseInt(temp.getAdresnoPolje()
								.substring(1), 16);
						this.lc += i;
						break;
					}
					obradjeniTokeni.add(new ObradjenToken(TipInstrukcije.DIR,
							inst, temp.getAdresnoPolje(), null, null));
				}
				if ("asm.BezadresnaInstrukcija".equals(inst.getClass()
						.getName())) {
					this.lc++;
					obradjeniTokeni.add(new ObradjenToken(TipInstrukcije.A,
							inst, null, null, null));
				}
				if ("asm.JednoadresnaInstrukcija".equals(inst.getClass()
						.getName())) {
					switch ((JednoadresnaInstrukcija) inst) {
					case JMP:
					case JSR:
						this.lc += 3;
						obradjeniTokeni.add(new ObradjenToken(TipInstrukcije.B,
								inst, temp.getAdresnoPolje(), null, null));
						break;
					case JNZ:
					case INT:
						this.lc += 2;
						obradjeniTokeni.add(new ObradjenToken(TipInstrukcije.C,
								inst, null, null, temp.getAdresnoPolje()));
						break;
					default:
						// ako je registarsko direktno 2 bajta
						String reg = temp.getAdresnoPolje();
						try {
							Registri r = Registri.valueOf(reg);
							this.lc += 2;
							ObradjenToken o = new ObradjenToken(
									TipInstrukcije.D, inst, temp
											.getAdresnoPolje(), null, null);
							o.setOp1NacinAdresiranja(NacinAdresiranja.REGDIR);
							obradjeniTokeni.add(o);
							break;

						} catch (Exception e) {
							this.lc += 4;
							obradjeniTokeni.add(new ObradjenToken(
									TipInstrukcije.D, inst, temp
											.getAdresnoPolje(), null, null));
							break;
						}

					}
				}
				if ("asm.DvoadresnaInstrukcija".equals(inst.getClass()
						.getName())) {
					String[] c = temp.getAdresnoPolje().split(",");
					String[] d = c[1].split("]");
					ObradjenToken o = null;
					if (d.length > 1) {
						this.lc += 3;
						o = new ObradjenToken(TipInstrukcije.E, inst, c[0],
								d[0].substring(1), d[1]);

					} else {
						try {
							Registri r = Registri.valueOf(c[1]);
							this.lc += 2;
							o = new ObradjenToken(TipInstrukcije.E, inst, c[0],
									c[1], null);
						} catch (Exception e) {
							this.lc += 4;
							o = new ObradjenToken(TipInstrukcije.E, inst, c[0],
									c[1], null);
						}
					}
					o.setOp1NacinAdresiranja(NacinAdresiranja.REGDIR);
					obradjeniTokeni.add(o);
				}
			}

		}

		/**
		 * Getter of the property <tt>radi</tt>
		 * 
		 * @return Returns the radi.
		 * 
		 */

		public boolean getRadi() {
			return radi;
		}

		/**
		 * Setter of the property <tt>radi</tt>
		 * 
		 * @param radi
		 *            The radi to set.
		 * 
		 */
		public void setRadi(boolean radi) {
			this.radi = radi;
		}

		/**
		 * Getter of the property <tt>lc</tt>
		 * 
		 * @return Returns the lc.
		 * 
		 */

		public int getLc() {
			return lc;
		}

		/**
		 * Setter of the property <tt>lc</tt>
		 * 
		 * @param lc
		 *            The lc to set.
		 * 
		 */
		public void setLc(int lc) {
			this.lc = lc;
		}

		/**
		 * Getter of the property <tt>tabelaSimbola</tt>
		 * 
		 * @return Returns the tabelaSimbola.
		 * 
		 */

		public TabelaSimbola getTabelaSimbola() {
			return tabelaSimbola;
		}

		/**
		 * Setter of the property <tt>tabelaSimbola</tt>
		 * 
		 * @param tabelaSimbola
		 *            The tabelaSimbola to set.
		 * 
		 */
		public void setTabelaSimbola(TabelaSimbola tabelaSimbola) {
			this.tabelaSimbola = tabelaSimbola;
		}

		/**
		 * Getter of the property <tt>obradjeniTokeni</tt>
		 * 
		 * @return Returns the obradjeniTokeni.
		 * 
		 */

		public LinkedList<ObradjenToken> getObradjeniTokeni() {
			return obradjeniTokeni;
		}

		/**
		 * Setter of the property <tt>obradjeniTokeni</tt>
		 * 
		 * @param obradjeniTokeni
		 *            The obradjeniTokeni to set.
		 * 
		 */
		public void setObradjeniTokeni(LinkedList<ObradjenToken> obradjeniTokeni) {
			this.obradjeniTokeni = obradjeniTokeni;
		}

		/**
		 * Getter of the property <tt>tokenizer</tt>
		 * 
		 * @return Returns the tokenizer.
		 * 
		 */

		public Tokenizer getTokenizer() {
			return tokenizer;
		}

		/**
		 * Setter of the property <tt>tokenizer</tt>
		 * 
		 * @param tokenizer
		 *            The tokenizer to set.
		 * 
		 */
		public void setTokenizer(Tokenizer tokenizer) {
			this.tokenizer = tokenizer;
		}

		/**
		 * Getter of the property <tt>ulazniFajl</tt>
		 * 
		 * @return Returns the ulazniFajl.
		 * 
		 */

		public String getUlazniFajl() {
			return ulazniFajl;
		}

		/**
		 * Setter of the property <tt>ulazniFajl</tt>
		 * 
		 * @param ulazniFajl
		 *            The ulazniFajl to set.
		 * 
		 */
		public void setUlazniFajl(String ulazniFajl) {
			this.ulazniFajl = ulazniFajl;
		}

		public static void main(String[] args) {
			Asembler temp = new Asembler("asm.asm");
			temp.PrviProlaz();
			for (ObradjenToken e : temp.obradjeniTokeni) {
				System.out.println(e.getTipInstr() + "**" + e.getIntrukcija()
						+ "**" + e.getOperand1() + "**" + e.getOperand2()
						+ "**" + e.getPomeraj());
			}
			temp.DrugiProlaz();
			System.out.println("Sve proslo!");
		}

		/**
		 * Getter of the property <tt>kod</tt>
		 * 
		 * @return Returns the kod.
		 * 
		 */

		public String getKod() {
			return kod;
		}

		/**
		 * Setter of the property <tt>kod</tt>
		 * 
		 * @param kod
		 *            The kod to set.
		 * 
		 */
		public void setKod(String kod) {
			this.kod = kod;
		}

	}
