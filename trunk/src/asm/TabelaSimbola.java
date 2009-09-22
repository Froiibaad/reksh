	package asm;

	import java.util.HashMap;

	public class TabelaSimbola {

		/*
		 * (non-javadoc)
		 */
		private HashMap<String, Simbol> tabela;

		public void dodaj(Simbol simb) {
			this.tabela.put(simb.getIme(), simb);

		}

		public Simbol pronadji(String ime) {

			return this.tabela.get(ime);

		}

		/**
		 * Getter of the property <tt>tabela</tt>
		 * 
		 * @return Returns the tabela.
		 * 
		 */

		public HashMap<String, Simbol> getTabela() {
			return tabela;
		}

		/**
		 * Setter of the property <tt>tabela</tt>
		 * 
		 * @param tabela
		 *            The tabela to set.
		 * 
		 */
		public void setTabela(HashMap<String, Simbol> tabela) {
			this.tabela = tabela;
		}

	}
