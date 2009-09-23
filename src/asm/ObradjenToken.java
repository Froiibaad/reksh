	package asm;

	public class ObradjenToken {

		/*
		 * (non-javadoc)
		 */
		private TipInstrukcije tipInstr;

		/*
		 * (non-javadoc)
		 */
		private Instrukcija intrukcija;

		/*
		 * (non-javadoc)
		 */
		private String operand1;

		/*
		 * (non-javadoc)
		 */
		private String operand2;

		/*
		 * (non-javadoc)
		 */
		private String pomeraj;

		/*
		 * (non-javadoc)
		 */
		private String vrednostOperanda1;

		/*
		 * (non-javadoc)
		 */
		private String vrednostOperanda2;

		/*
		 * (non-javadoc)
		 */
		private String vrednostPomeraja;

		/*
		 * (non-javadoc)
		 */
		private NacinAdresiranja op1NacinAdresiranja;

		/*
		 * (non-javadoc)
		 */
		private NacinAdresiranja op2NacinAdresiranja;

		public ObradjenToken(TipInstrukcije tip, Instrukcija instr, String op1,
				String op2, String pom) {
			this.tipInstr = tip;
			this.intrukcija = instr;
			this.operand1 = op1;
			this.operand2 = op2;
			this.pomeraj = pom;

		}

		/**
		 * Getter of the property <tt>tipInstr</tt>
		 * 
		 * @return Returns the tipInstr.
		 * 
		 */

		public TipInstrukcije getTipInstr() {
			return tipInstr;
		}

		/**
		 * Setter of the property <tt>tipInstr</tt>
		 * 
		 * @param tipInstr
		 *            The tipInstr to set.
		 * 
		 */
		public void setTipInstr(TipInstrukcije tipInstr) {
			this.tipInstr = tipInstr;
		}

		/**
		 * Getter of the property <tt>intrukcija</tt>
		 * 
		 * @return Returns the intrukcija.
		 * 
		 */

		public Instrukcija getIntrukcija() {
			return intrukcija;
		}

		/**
		 * Setter of the property <tt>intrukcija</tt>
		 * 
		 * @param intrukcija
		 *            The intrukcija to set.
		 * 
		 */
		public void setIntrukcija(Instrukcija intrukcija) {
			this.intrukcija = intrukcija;
		}

		/**
		 * Getter of the property <tt>operand1</tt>
		 * 
		 * @return Returns the operand1.
		 * 
		 */

		public String getOperand1() {
			return operand1;
		}

		/**
		 * Setter of the property <tt>operand1</tt>
		 * 
		 * @param operand1
		 *            The operand1 to set.
		 * 
		 */
		public void setOperand1(String operand1) {
			this.operand1 = operand1;
		}

		/**
		 * Getter of the property <tt>operand2</tt>
		 * 
		 * @return Returns the operand2.
		 * 
		 */

		public String getOperand2() {
			return operand2;
		}

		/**
		 * Setter of the property <tt>operand2</tt>
		 * 
		 * @param operand2
		 *            The operand2 to set.
		 * 
		 */
		public void setOperand2(String operand2) {
			this.operand2 = operand2;
		}

		/**
		 * Getter of the property <tt>pomeraj</tt>
		 * 
		 * @return Returns the pomeraj.
		 * 
		 */

		public String getPomeraj() {
			return pomeraj;
		}

		/**
		 * Setter of the property <tt>pomeraj</tt>
		 * 
		 * @param pomeraj
		 *            The pomeraj to set.
		 * 
		 */
		public void setPomeraj(String pomeraj) {
			this.pomeraj = pomeraj;
		}

		/**
		 * Getter of the property <tt>vrednostOperanda1</tt>
		 * 
		 * @return Returns the vrednostOperanda1.
		 * 
		 */

		public String getVrednostOperanda1() {
			return vrednostOperanda1;
		}

		/**
		 * Setter of the property <tt>vrednostOperanda1</tt>
		 * 
		 * @param vrednostOperanda1
		 *            The vrednostOperanda1 to set.
		 * 
		 */
		public void setVrednostOperanda1(String vrednostOperanda1) {
			this.vrednostOperanda1 = vrednostOperanda1;
		}

		/**
		 * Getter of the property <tt>vrednostOperanda2</tt>
		 * 
		 * @return Returns the vrednostOperanda2.
		 * 
		 */

		public String getVrednostOperanda2() {
			return vrednostOperanda2;
		}

		/**
		 * Setter of the property <tt>vrednostOperanda2</tt>
		 * 
		 * @param vrednostOperanda2
		 *            The vrednostOperanda2 to set.
		 * 
		 */
		public void setVrednostOperanda2(String vrednostOperanda2) {
			this.vrednostOperanda2 = vrednostOperanda2;
		}

		/**
		 * Getter of the property <tt>vrednostPomeraja</tt>
		 * 
		 * @return Returns the vrednostPomeraja.
		 * 
		 */

		public String getVrednostPomeraja() {
			return vrednostPomeraja;
		}

		/**
		 * Setter of the property <tt>vrednostPomeraja</tt>
		 * 
		 * @param vrednostPomeraja
		 *            The vrednostPomeraja to set.
		 * 
		 */
		public void setVrednostPomeraja(String vrednostPomeraja) {
			this.vrednostPomeraja = vrednostPomeraja;
		}

		/**
		 * Getter of the property <tt>op1NacinAdresiranja</tt>
		 * 
		 * @return Returns the op1NacinAdresiranja.
		 * 
		 */

		public NacinAdresiranja getOp1NacinAdresiranja() {
			return op1NacinAdresiranja;
		}

		/**
		 * Setter of the property <tt>op1NacinAdresiranja</tt>
		 * 
		 * @param op1NacinAdresiranja
		 *            The op1NacinAdresiranja to set.
		 * 
		 */
		public void setOp1NacinAdresiranja(NacinAdresiranja op1NacinAdresiranja) {
			this.op1NacinAdresiranja = op1NacinAdresiranja;
		}

		/**
		 * Getter of the property <tt>op2NacinAdresiranja</tt>
		 * 
		 * @return Returns the op2NacinAdresiranja.
		 * 
		 */

		public NacinAdresiranja getOp2NacinAdresiranja() {
			return op2NacinAdresiranja;
		}

		/**
		 * Setter of the property <tt>op2NacinAdresiranja</tt>
		 * 
		 * @param op2NacinAdresiranja
		 *            The op2NacinAdresiranja to set.
		 * 
		 */
		public void setOp2NacinAdresiranja(NacinAdresiranja op2NacinAdresiranja) {
			this.op2NacinAdresiranja = op2NacinAdresiranja;
		}

	}
