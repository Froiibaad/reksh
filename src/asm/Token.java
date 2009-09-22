	package asm;

	public class Token {

		/*
		 * (non-javadoc)
		 */
		private String labela;

		/*
		 * (non-javadoc)
		 */
		private Instrukcija instrukcija;

		/*
		 * (non-javadoc)
		 */
		private String adresnoPolje;

		public Token(String labela, Instrukcija instr, String adrPolje) {
			// TODO Auto-generated constructor stub
			this.labela = labela;
			this.instrukcija = instr;
			this.adresnoPolje = adrPolje;
		}

		/**
		 * Getter of the property <tt>labela</tt>
		 * 
		 * @return Returns the labela.
		 * 
		 */

		public String getLabela() {
			return labela;
		}

		/**
		 * Setter of the property <tt>labela</tt>
		 * 
		 * @param labela
		 *            The labela to set.
		 * 
		 */
		public void setLabela(String labela) {
			this.labela = labela;
		}

		/**
		 * Getter of the property <tt>instrukcija</tt>
		 * 
		 * @return Returns the instrukcija.
		 * 
		 */

		public Instrukcija getInstrukcija() {
			return instrukcija;
		}

		/**
		 * Setter of the property <tt>instrukcija</tt>
		 * 
		 * @param instrukcija
		 *            The instrukcija to set.
		 * 
		 */
		public void setInstrukcija(Instrukcija instrukcija) {
			this.instrukcija = instrukcija;
		}

		/**
		 * Getter of the property <tt>adresnoPolje</tt>
		 * 
		 * @return Returns the adresnoPolje.
		 * 
		 */

		public String getAdresnoPolje() {
			return adresnoPolje;
		}

		/**
		 * Setter of the property <tt>adresnoPolje</tt>
		 * 
		 * @param adresnoPolje
		 *            The adresnoPolje to set.
		 * 
		 */
		public void setAdresnoPolje(String adresnoPolje) {
			this.adresnoPolje = adresnoPolje;
		}

	}
