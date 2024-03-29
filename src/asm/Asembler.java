	package asm;

	import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
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
			this.kod = "";
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
						this.kod += Integer.toHexString(i).toUpperCase() + "\n";
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
						this.kod += "01 ";
						break;
					case INTE:
						fin.add(o);
						this.kod += "02 ";
						break;
					case INTD:
						fin.add(o);
						this.kod += "03 ";
						break;
					case TRPE:
						fin.add(o);
						this.kod += "04 ";
						break;
					case TRPD:
						fin.add(o);
						this.kod += "05 ";
						break;
					}
					break;
				}
				case B:
				{
					this.lc+=3;
					int i;
					String t = o.getOperand1();
					if (t.startsWith("#")) i = Integer.parseInt(t.substring(1), 16);
					else 
					{
						i = tabelaSimbola.pronadji(t).getVrednost();
					}
					switch((JednoadresnaInstrukcija)o.getIntrukcija())
					{
					case JMP:
						this.kod += "40 ";
						break;
					case JSR:
						this.kod += "41 ";
						break;
					}
					o.setOp1NacinAdresiranja(NacinAdresiranja.IMMED);
					fin.add(o);
					this.kod += Integer.toHexString(i / 256).toUpperCase() + " ";
					this.kod += Integer.toHexString(i % 256).toUpperCase() + " ";
				}
				break;
				case C:
				{
					this.lc += 2;
					int i;
					String t = o.getPomeraj();
					i = Integer.parseInt(t.substring(1), 16);
					switch((JednoadresnaInstrukcija)o.getIntrukcija())
					{
					case JNZ:
						this.kod += "60 ";
						break;
					case INT:
						this.kod += "61 ";
						break;
					}
					o.setVrednostPomeraja(i);
					this.kod += Integer.toHexString(i % 256).toUpperCase() + " ";	
					fin.add(o);
				}
				break;
				case D:
				{
					String s = o.getOperand1();
					if(s.startsWith("["))
					{
						s = s.replace("[", "");
						s = s.replace("]", "");
						try
						{
							Registri ri = Registri.valueOf(s);
							this.lc+=2;
							o.setOp1NacinAdresiranja(NacinAdresiranja.REGINDIR);
							o.setOperand1(s);
						}
						catch (Exception e)
						{
							this.lc+=4;
							o.setOp1NacinAdresiranja(NacinAdresiranja.MEMINDIR);
							o.setOperand1(s);						
							int i = tabelaSimbola.pronadji(s).getVrednost();
							o.setVrednostOperanda1(i);
						}
					}
					else
					{
						try
						{
							Registri ri = Registri.valueOf(s);
							this.lc+=2;
							o.setOp1NacinAdresiranja(NacinAdresiranja.REGDIR);
							o.setOperand1(s);
						}
						catch (Exception e)
						{
							this.lc+=4;
							o.setOp1NacinAdresiranja(NacinAdresiranja.MEMDIR);
							o.setOperand1(s);
							Simbol sim = tabelaSimbola.pronadji(s);
							int i = (tabelaSimbola.pronadji(s)).getVrednost();
							o.setVrednostOperanda1(i);
						}
						
					}
					int opc = 0;
					if (o.getOp1NacinAdresiranja()==NacinAdresiranja.REGDIR)
					{
						opc = 0 + Registri.valueOf(o.getOperand1()).ordinal();
					}
					else if (o.getOp1NacinAdresiranja()==NacinAdresiranja.REGINDIR)
					{
						opc = 64 + Registri.valueOf(o.getOperand1()).ordinal();
					}
					else if (o.getOp1NacinAdresiranja()==NacinAdresiranja.MEMDIR)
					{
						opc = 192;
					}
					else if (o.getOp1NacinAdresiranja()==NacinAdresiranja.MEMINDIR)
					{
						opc = 193;
					}
					switch((JednoadresnaInstrukcija)o.getIntrukcija())
					{
					case ASR:
						this.kod += Integer.toHexString(128).toUpperCase() + " ";
						this.kod += Integer.toHexString(opc).toUpperCase() + " ";
						break;
					case PUSH:
						this.kod += Integer.toHexString(255).toUpperCase() + " ";
						this.kod += Integer.toHexString(opc).toUpperCase() + " ";
						break;
					case POP:
						this.kod += Integer.toHexString(255).toUpperCase() + " ";
						this.kod += Integer.toHexString(opc + 8).toUpperCase() + " ";
						break;
					case INC:
						this.kod += Integer.toHexString(255).toUpperCase() + " ";
						this.kod += Integer.toHexString(opc + 16).toUpperCase() + " ";
						break;
					case DEC:
						this.kod += Integer.toHexString(255).toUpperCase() + " ";
						this.kod += Integer.toHexString(opc + 24).toUpperCase() + " ";
						break;
					case JMPIND:
						this.kod += Integer.toHexString(255).toUpperCase() + " ";
						this.kod += Integer.toHexString(opc + 32).toUpperCase() + " ";
						break;
					}
					if (o.getOp1NacinAdresiranja()==NacinAdresiranja.MEMDIR || o.getOp1NacinAdresiranja()==NacinAdresiranja.MEMINDIR)
					{
						this.kod += Integer.toHexString(o.getVrednostOperanda1()/256).toUpperCase() + " ";
						this.kod += Integer.toHexString(o.getVrednostOperanda1()%256).toUpperCase() + " ";
					}
					fin.add(o);
				}
				break;
				case E:
				{
					int i=0, opc=0, na = Registri.valueOf(o.getOperand1()).ordinal()*8;
					String op2 = o.getOperand2();
					if(o.getPomeraj() != null) {
						o.setOp2NacinAdresiranja(NacinAdresiranja.REGINDIROFF);
						String pom = o.getPomeraj();
						if (pom.startsWith("#")) i = Integer.parseInt(pom.substring(1), 16);
						else i = tabelaSimbola.pronadji(pom).getVrednost();
						o.setVrednostPomeraja(i);
						this.lc+=3;
						na+=128;
					}
					else
					{
						if(op2.contains("[")){
							op2 = op2.replaceAll("\\[|\\]", "");
							try
							{
								Registri ri = Registri.valueOf(op2);
								o.setOp2NacinAdresiranja(NacinAdresiranja.REGINDIR);
								o.setOperand2(op2);
								this.lc+=2;
								na+=64 + ri.ordinal();
							}
							catch (Exception e)
							{
								i = tabelaSimbola.pronadji(op2).getVrednost();
								o.setVrednostOperanda2(i);
								o.setOp2NacinAdresiranja(NacinAdresiranja.MEMINDIR);
								na+=193;
							}
						}
						else
						{
							try
							{
								Registri ri = Registri.valueOf(op2);
								o.setOp2NacinAdresiranja(NacinAdresiranja.REGDIR);
								this.lc+=2;
								na += ri.ordinal();
							}
							catch (Exception e)
							{
								i = tabelaSimbola.pronadji(op2).getVrednost();
								o.setVrednostOperanda2(i);
								o.setOp2NacinAdresiranja(NacinAdresiranja.MEMDIR);
								na += 192;
							}
						}
					}
					switch((DvoadresnaInstrukcija)o.getIntrukcija())
					{
					case MOVS:
						opc = 192;
						break;
					case MOVD:
						opc = 160;
						break;
					case ADD:
						opc = 144;
						break;
					case AND:
						opc = 136;
						break;
					}
					fin.add(o);
					if (opc < 16 ) this.kod += "0";
					this.kod += Integer.toHexString(opc).toUpperCase() + " ";
					if (na < 16)  this.kod += "0";
					this.kod += Integer.toHexString(na).toUpperCase() + " ";
					if(o.getOp2NacinAdresiranja()==NacinAdresiranja.REGINDIROFF) this.kod+= Integer.toHexString(o.getVrednostPomeraja()).toUpperCase() + " ";
					else if (o.getOp2NacinAdresiranja()==NacinAdresiranja.MEMDIR || o.getOp2NacinAdresiranja()==NacinAdresiranja.MEMINDIR)
					{	
						int v = o.getVrednostOperanda2()/256;
						if (v<16)
						{
							this.kod+= "0";
							
						}
						this.kod += Integer.toHexString(v).toUpperCase() + " ";
						v = o.getVrednostOperanda2()%256;
						if (v<16)
						{
							this.kod+= "0";
							
						}
						this.kod += Integer.toHexString(v).toUpperCase() + " ";
					}
				}break;
				}
			}
			 try{
				    // Create file 
				    FileWriter fstream = new FileWriter(new File("current.mc"));
				    fstream.append(this.kod);		   
				    //Close the output stream
				    fstream.close();
				    }catch (Exception e){//Catch exception if any
				      System.err.println("Error: " + e.getMessage());
				    }
			return fin;
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
						i = Integer.parseInt(temp.getAdresnoPolje().substring(1), 16);
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
				if ("asm.DvoadresnaInstrukcija".equals(inst.getClass().getName())) {
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
			temp.DrugiProlaz();
			System.out.print(temp.getKod());
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
