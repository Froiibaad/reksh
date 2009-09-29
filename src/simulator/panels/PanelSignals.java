package simulator.panels;

import java.util.ArrayList;

import simulator.MainFrame;


public class PanelSignals {
	private static int signala_po_panelu = 50;
	private static int koraka = 0x60;
	private MainFrame mf;
	private Byte[][] matricaSignala = new Byte[koraka][signala_po_panelu];
	public PanelSignals (MainFrame mf) {
		this.mf = mf;
	}
	public int getOutput(int i) {
		if (i > matricaSignala[mf.getClock()].length) return -2;
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
		
	}
	public void arb () {
		
	}
	public void cpu () {
		
	}
	public void cpuarb () {
		
	}
	public void komb () {
		
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
		matricaSignala[0x22][3] = new Byte("1");
		matricaSignala[0x22][7] = new Byte("1");
		matricaSignala[0x24][3] = new Byte("1");
		matricaSignala[0x24][7] = new Byte("1");
		matricaSignala[0x27][12] = new Byte("1");
		matricaSignala[0x29][2] = new Byte("1");
		matricaSignala[0x2B][2] = new Byte("1");
		matricaSignala[0x2C][12] = new Byte("1");
		matricaSignala[0x2E][2] = new Byte("1");
		matricaSignala[0x30][2] = new Byte("1");
		matricaSignala[0x38][6] = new Byte("1");
		matricaSignala[0x40][12] = new Byte("1");
		matricaSignala[0x44][2] = new Byte("1");
		matricaSignala[0x44][12] = new Byte("1");
		matricaSignala[0x45][0] = new Byte("1");
		matricaSignala[0x45][7] = new Byte("1");
		matricaSignala[0x47][12] = new Byte("1");
		matricaSignala[0x47][2] = new Byte("1");
		matricaSignala[0x48][12] = new Byte("1");
		matricaSignala[0x48][7] = new Byte("1");
		matricaSignala[0x4A][12] = new Byte("1");
		matricaSignala[0x50][6] = new Byte("1");
		matricaSignala[0x58][12] = new Byte("1");
		matricaSignala[0x5A][0] = new Byte("1");
		matricaSignala[0x5A][7] = new Byte("1");
		matricaSignala[0x5A][4] = new Byte("1");
		matricaSignala[0x5A][5] = new Byte("1");
		matricaSignala[0x5D][6] = new Byte("1");
		matricaSignala[0x5D][2] = new Byte("1");
		
	}
	public void oper2 () {
		
	}
	public void regf () {
		
	}
	public void regsel() {
		
	}
	public void signext() {
		
	}

}
