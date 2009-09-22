	package asm;

	public class Simbol {

		/*
		 * (non-javadoc)
		 */
		private String ime;

		/*
		 * (non-javadoc)
		 */
		private int vrednost;

		public Simbol(String ime, int vrednost) {
			this.ime = ime;
			this.vrednost = vrednost;
		}

		/**
		 * Getter of the property <tt>ime</tt>
		 * 
		 * @return Returns the ime.
		 * 
		 */

		public String getIme() {
			return ime;
		}

		/**
		 * Setter of the property <tt>ime</tt>
		 * 
		 * @param ime
		 *            The ime to set.
		 * 
		 */
		public void setIme(String ime) {
			this.ime = ime;
		}

		/**
		 * Getter of the property <tt>vrednost</tt>
		 * 
		 * @return Returns the vrednost.
		 * 
		 */

		public int getVrednost() {
			return vrednost;
		}

		/**
		 * Setter of the property <tt>vrednost</tt>
		 * 
		 * @param vrednost
		 *            The vrednost to set.
		 * 
		 */
		public void setVrednost(int vrednost) {
			this.vrednost = vrednost;
		}

	}
