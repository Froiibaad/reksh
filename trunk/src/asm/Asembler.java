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

		public Asembler(String ulazniFajl) {
			this.ulazniFajl = ulazniFajl;
			this.tokenizer = new Tokenizer(ulazniFajl);
			this.obradjeniTokeni = new LinkedList<ObradjenToken>();
			this.tabelaSimbola = new TabelaSimbola();
			this.radi = false;
			this.lc = 0;
		}

		public void DrugiProlaz() {

		}

		public void PrviProlaz() {
			this.lc = 0;
			this.radi = true;
			while(radi)
			{
				Token temp = tokenizer.dohvatiToken();
				Instrukcija inst = temp.getInstrukcija();
				if(temp.getLabela()!=null) tabelaSimbola.dodaj(new Simbol(temp.getLabela(), lc));
				if("asm.Direktiva".equals(inst.getClass().getName()))
				{
					switch((Direktiva)inst)
					{
					case BEG: this.lc = 0; break;
					case END: this.radi = false;
					case ORG: int i = Integer.parseInt(temp.getAdresnoPolje().substring(1), 16); this.lc = i; break;
					case DC: lc+=1; break;
					case DS: i = Integer.parseInt(temp.getAdresnoPolje().substring(1), 16); this.lc += i; break;
					}
					obradjeniTokeni.add(new ObradjenToken(TipInstrukcije.DIR, inst, temp.getAdresnoPolje(), null, null ));
				}
				if("asm.BezadresnaInstrukcija".equals(inst.getClass().getName()))
				{
					this.lc++; 
					obradjeniTokeni.add(new ObradjenToken(TipInstrukcije.A, inst, null, null, null ));
				}
				if("asm.JednoadresnaInstrukcija".equals(inst.getClass().getName()))
				{
					switch((JednoadresnaInstrukcija)inst)
					{
					case JMP: case JSR: 
						this.lc += 3;
						
					}
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
		
		public static void main(String[] args)
		{
			Asembler temp = new Asembler("asm1.asm");
			temp.PrviProlaz();
			System.out.println("Sve proslo!");
		}

	}
