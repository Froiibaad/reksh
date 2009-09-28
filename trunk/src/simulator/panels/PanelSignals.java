package simulator.panels;

import java.util.ArrayList;

import simulator.MainFrame;


public class PanelSignals {
	private static int signala_po_panelu = 50;
	private static int koraka = 50;
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
