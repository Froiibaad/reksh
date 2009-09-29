package simulator.panels;

import java.util.ArrayList;

import simulator.MainFrame;


public class PanelSignals {
	private static int signala_po_panelu = 100;
	private static int koraka = 0x60;
	private MainFrame mf;
	private Byte[][] matricaSignala = new Byte[koraka][signala_po_panelu];
	public PanelSignals (MainFrame mf) {
		this.mf = mf;
	}
	public int getOutput(int i) {
		if (i > matricaSignala[mf.getClock()].length) return -2;
		//System.out.println(i + " " + mf.getClock());
		return matricaSignala[mf.getClock()][i];
	}
	public void sve_na_nulu () {
		for (int i = 0; i<koraka; i++){
			for (int j = 0; j<signala_po_panelu; j++){
				matricaSignala[i][j] = new Byte("0");
			}
		}
	}
	public void alu () {
		matricaSignala[0][13] = new Byte("1");
		matricaSignala[0][27] = new Byte("1");
		matricaSignala[9][13] = new Byte("1");
		matricaSignala[9][27] = new Byte("1");
		matricaSignala[18][13] = new Byte("1");
		matricaSignala[18][27] = new Byte("1");
		matricaSignala[26][13] = new Byte("1");
		matricaSignala[26][27] = new Byte("1");
		matricaSignala[37][29] = new Byte("1");
		matricaSignala[44][14] = new Byte("1");
		matricaSignala[44][17] = new Byte("1");
		matricaSignala[44][27] = new Byte("1");
		matricaSignala[52][29] = new Byte("1");
		matricaSignala[55][0] = new Byte("1");
		matricaSignala[55][27] = new Byte("1");
		matricaSignala[55][2] = new Byte("1");
		matricaSignala[55][3] = new Byte("1");
		matricaSignala[55][4] = new Byte("1");
	}
	public void arb () {
		matricaSignala[2][0] = new Byte("1");
		/*matricaSignala[3][0] = new Byte("1");
		matricaSignala[4][0] = new Byte("1");
		matricaSignala[5][0] = new Byte("1");*/
		matricaSignala[11][0] = new Byte("1");
//		matricaSignala[12][0] = new Byte("1");
//		matricaSignala[13][0] = new Byte("1");
//		matricaSignala[14][0] = new Byte("1");
		matricaSignala[20][0] = new Byte("1");
//		matricaSignala[21][0] = new Byte("1");
//		matricaSignala[22][0] = new Byte("1");
//		matricaSignala[23][0] = new Byte("1");
		matricaSignala[28][0] = new Byte("1");
//		matricaSignala[29][0] = new Byte("1");
//		matricaSignala[30][0] = new Byte("1");
//		matricaSignala[31][0] = new Byte("1");
		matricaSignala[39][0] = new Byte("1");
//		matricaSignala[40][0] = new Byte("1");
//		matricaSignala[41][0] = new Byte("1");
//		matricaSignala[42][0] = new Byte("1");
		matricaSignala[46][0] = new Byte("1");
//		matricaSignala[47][0] = new Byte("1");
//		matricaSignala[48][0] = new Byte("1");
//		matricaSignala[49][0] = new Byte("1");
		
		
	}
	public void cpu () {
		
	}
	public void cpuarb () {
		matricaSignala[1][5] = new Byte("1");
		matricaSignala[1][7] = new Byte("1");
		matricaSignala[2][9] = new Byte("1");
		matricaSignala[2][1] = new Byte("1");
		matricaSignala[6][2] = new Byte("1");
		for (int i = 2; i < 6; i++) {
			matricaSignala[i+1][3] = new Byte("1");
			matricaSignala[i+1][4] = new Byte("1");
			matricaSignala[i+1][0] = new Byte("1");
			matricaSignala[i][5] = new Byte("1");
			matricaSignala[i][7] = new Byte("1");
			matricaSignala[i][8] = new Byte("1");
		}
		for (int i = 6; i < 10; i++) {
			matricaSignala[i][2] = new Byte("1");
		}
		matricaSignala[10][5] = new Byte("1");
		matricaSignala[10][7] = new Byte("1");
		matricaSignala[11][9] = new Byte("1");
		matricaSignala[11][1] = new Byte("1");
		matricaSignala[15][2] = new Byte("1");
		for (int i = 11; i < 15; i++) {
			matricaSignala[i+1][3] = new Byte("1");
			matricaSignala[i+1][4] = new Byte("1");
			matricaSignala[i+1][0] = new Byte("1");
			matricaSignala[i][5] = new Byte("1");
			matricaSignala[i][7] = new Byte("1");
			matricaSignala[i][8] = new Byte("1");
		}
		for (int i = 15; i < 19; i++) {
			matricaSignala[i][2] = new Byte("1");
		}
		matricaSignala[19][5] = new Byte("1");
		matricaSignala[19][7] = new Byte("1");
		matricaSignala[20][9] = new Byte("1");
		matricaSignala[20][1] = new Byte("1");
		matricaSignala[24][2] = new Byte("1");
		for (int i = 20; i < 24; i++) {
			matricaSignala[i+1][3] = new Byte("1");
			matricaSignala[i+1][4] = new Byte("1");
			matricaSignala[i+1][0] = new Byte("1");
			matricaSignala[i][5] = new Byte("1");
			matricaSignala[i][7] = new Byte("1");
			matricaSignala[i][8] = new Byte("1");
		}
		for (int i = 24; i < 27; i++) {
			matricaSignala[i][2] = new Byte("1");
		}
		matricaSignala[27][5] = new Byte("1");
		matricaSignala[27][7] = new Byte("1");
		matricaSignala[28][9] = new Byte("1");
		matricaSignala[28][1] = new Byte("1");
		matricaSignala[32][2] = new Byte("1");
		for (int i = 28; i < 32; i++) {
			matricaSignala[i+1][3] = new Byte("1");
			matricaSignala[i+1][4] = new Byte("1");
			matricaSignala[i+1][0] = new Byte("1");
			matricaSignala[i][5] = new Byte("1");
			matricaSignala[i][7] = new Byte("1");
			matricaSignala[i][8] = new Byte("1");
		}
		for (int i = 32; i < 38; i++) {
			matricaSignala[i][2] = new Byte("1");
		}
		matricaSignala[38][5] = new Byte("1");
		matricaSignala[38][7] = new Byte("1");
		matricaSignala[39][9] = new Byte("1");
		matricaSignala[39][1] = new Byte("1");
		matricaSignala[43][2] = new Byte("1");
		for (int i = 39; i < 43; i++) {
			matricaSignala[i+1][3] = new Byte("1");
			matricaSignala[i+1][4] = new Byte("1");
			matricaSignala[i+1][0] = new Byte("1");
			matricaSignala[i][5] = new Byte("1");
			matricaSignala[i][7] = new Byte("1");
			matricaSignala[i][8] = new Byte("1");
		}
		for (int i = 43; i < 45; i++) {
			matricaSignala[i][2] = new Byte("1");
		}
		matricaSignala[45][5] = new Byte("1");
		matricaSignala[45][7] = new Byte("1");
		matricaSignala[46][9] = new Byte("1");
		matricaSignala[46][1] = new Byte("1");
		matricaSignala[50][2] = new Byte("1");
		for (int i = 46; i < 50; i++) {
			matricaSignala[i+1][3] = new Byte("1");
			matricaSignala[i+1][4] = new Byte("1");
			matricaSignala[i+1][0] = new Byte("1");
			matricaSignala[i][5] = new Byte("1");
			matricaSignala[i][7] = new Byte("1");
			matricaSignala[i][8] = new Byte("1");
		}
		for (int i = 50; i < 0x37; i++) {
			matricaSignala[i][2] = new Byte("1");
		}
	}
	public void komb () {
		for (int i = 0; i<0x37; i++) {
			matricaSignala[i][26] = new Byte("1");
		}
		matricaSignala[0][2] = new Byte("1");
		matricaSignala[0][23] = new Byte("1");
		matricaSignala[0][26] = new Byte("0");
		matricaSignala[9][2] = new Byte("1");
		matricaSignala[9][23] = new Byte("1");
		matricaSignala[9][26] = new Byte("0");
		matricaSignala[18][2] = new Byte("1");
		matricaSignala[18][23] = new Byte("1");
		matricaSignala[18][26] = new Byte("0");
		matricaSignala[26][2] = new Byte("1");
		matricaSignala[26][23] = new Byte("1");
		matricaSignala[26][26] = new Byte("0");
		matricaSignala[55][26] = new Byte("0");
		
	}
	public void oper1 () {
		matricaSignala[0][3] = new Byte("1");
		matricaSignala[0][7] = new Byte("1");
		matricaSignala[0x9][3] = new Byte("1");
		matricaSignala[0x9][7] = new Byte("1");
		matricaSignala[0x12][3] = new Byte("1");
		matricaSignala[0x12][7] = new Byte("1");
		matricaSignala[0x1A][3] = new Byte("1");
		matricaSignala[0x1A][7] = new Byte("1");
		matricaSignala[0x22][2] = new Byte("1");
		matricaSignala[0x24][2] = new Byte("1");
		matricaSignala[0x25][6] = new Byte("1");
		matricaSignala[0x34][12] = new Byte("1");
		matricaSignala[0x37][0] = new Byte("1");
		matricaSignala[0x37][7] = new Byte("1");
		matricaSignala[0x37][4] = new Byte("1");
		matricaSignala[0x37][5] = new Byte("1");

		
	}
	public void oper2 () {
		matricaSignala[0][13] = new Byte("1");
		matricaSignala[0][7] = new Byte("1");
		matricaSignala[0][8] = new Byte("1");
		matricaSignala[0][1] = new Byte("1");
		matricaSignala[6][25] = new Byte("1");
		matricaSignala[6][2] = new Byte("1");
		matricaSignala[9][13] = new Byte("1");
		matricaSignala[9][7] = new Byte("1");
		matricaSignala[9][8] = new Byte("1");
		matricaSignala[9][1] = new Byte("1");
		matricaSignala[0xF][25] = new Byte("1");
		matricaSignala[0xF][3] = new Byte("1");
		matricaSignala[0x12][13] = new Byte("1");
		matricaSignala[0x12][7] = new Byte("1");
		matricaSignala[0x12][8] = new Byte("1");
		matricaSignala[0x12][1] = new Byte("1");
		matricaSignala[0x18][25] = new Byte("1");
		matricaSignala[0x18][4] = new Byte("1");
		matricaSignala[0x1A][13] = new Byte("1");
		matricaSignala[0x1A][7] = new Byte("1");
		matricaSignala[0x1A][8] = new Byte("1");
		matricaSignala[0x1A][1] = new Byte("1");
		matricaSignala[0x20][25] = new Byte("1");
		matricaSignala[0x20][5] = new Byte("1");
		matricaSignala[0x22][19] = new Byte("1");
		matricaSignala[0x22][30] = new Byte("1");
		matricaSignala[0x23][31] = new Byte("1");
		matricaSignala[0x24][21] = new Byte("1");
		matricaSignala[0x24][30] = new Byte("1");
		matricaSignala[0x25][8] = new Byte("1");
		matricaSignala[0x2B][25] = new Byte("1");
		matricaSignala[0x2B][28] = new Byte("1");
		matricaSignala[0x2C][7] = new Byte("1");
		matricaSignala[0x2C][8] = new Byte("1");
		matricaSignala[0x2C][29] = new Byte("1");
		matricaSignala[0x32][25] = new Byte("1");
		matricaSignala[0x32][28] = new Byte("1");
		matricaSignala[0x34][27] = new Byte("1");
	}
	public void regf () {
		for (int i = 0x10; i<0x37; i++) {
			matricaSignala[i][2] = new Byte("1");
		}
		matricaSignala[0x37][1] = new Byte("1");
		matricaSignala[0x37][3] = new Byte("1");
		matricaSignala[0x37][0] = new Byte("1");
	}
	public void regsel() {
		for (int i = 0x10; i<0x37; i++) {
			matricaSignala[i][0] = new Byte("1");
		}
		
	}
	public void signext() {
		matricaSignala[25][3] = new Byte("1");
		matricaSignala[34][3] = new Byte("1");
	}

	public void uprav() {
		for (int i = 15; i < 0x37; i++){
			matricaSignala[i][0] = new Byte("1");
			matricaSignala[i][23] = new Byte("1");
			matricaSignala[i][13] = new Byte("1");
		}
		for (int i = 0; i < 0x37; i++) {
			matricaSignala[i][35] = new Byte(mf.CPUArb.matricaSignala[i][2]); 
		}
		matricaSignala[33][25] = new Byte("1");
		matricaSignala[33][35] = new Byte("0");
		matricaSignala[33][31] = new Byte("1");
		matricaSignala[33][32] = new Byte("1");
		matricaSignala[33][33] = new Byte("1");	
		matricaSignala[54][26] = new Byte("1");
		matricaSignala[54][35] = new Byte("0");
		matricaSignala[54][31] = new Byte("1");
		
	}
}
