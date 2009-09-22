package simulator.elements;

import simulator.MainFrame;

public class Register16 extends SekvMreza {

    private int[] b = new int[16];

    public Register16(String name) {
        super(23, 16);
        this.name = name;
        for (int i = 0; i < 16; i++) {
            b[i] = 0;
        }
    }

    public static final int IN0 = 0, IN1 = 1, IN2 = 2, IN3 = 3, IN4 = 4,
            IN5 = 5, IN6 = 6, IN7 = 7, IN8 = 8, IN9 = 9, IN10 = 10, IN11 = 11,
            IN12 = 12, IN13 = 13, IN14 = 14, IN15 = 15, LD = 16, LDL = 17,
            LDH = 18, CLR = 19, INC = 20, DEC = 21, SWAP = 22;

    public void calc() {
        boolean done = false;
        if (inputs.get(LD).getValue() == 1) {
            for (int i = 0; i < 16; i++) {
                b[i] = inputs.get(i).getValue();
            }
        }
        if (inputs.get(CLR).getValue() == 1) {
            for (int i = 0; i < 16; i++) {
                b[i] = 0;
            }
        }
        if (inputs.get(INC).getValue() == 1) {
            for (int i = 0; i < 16; i++) {
                if (!done) {
                    if (b[i] == 1) {
                        b[i] = 0;
                    } else {
                        b[i] = 1;
                        done = true;
                    }
                }
            }
        }
        if (inputs.get(DEC).getValue() == 1) {
            for (int i = 0; i < 16; i++) {
                if (!done) {
                    if (b[i] == 0) {
                        b[i] = 1;
                    } else {
                        b[i] = 0;
                        done = true;
                    }
                }
            }
        }
        if (inputs.get(LDL).getValue() == 1) {
            for (int i = 0; i < 8; i++) {
                b[i] = inputs.get(i).getValue();
            }
        }
        if (inputs.get(LDH).getValue() == 1) {
            for (int i = 8; i < 16; i++) {
                b[i] = inputs.get(i).getValue();
            }
        }
        if (inputs.get(SWAP).getValue() == 1) {
        	int [] c = new int [8];
        	for (int i = 0; i < 8; i++) {
        		c[i] = b[i];
        		b[i] = b[i+8];
        	}
        	for(int i = 8; i < 16; i++) {
        		b[i] = c[i-8];
        	}
        }
    }

    public void setOutputs() {
        for (int i = 0; i < 16; i++) {
            outputs.get(i).set(b[i]);
        }
    }


    public void initialize(int init) {
        for (int i = 0; i < 16; i++) {
            b[i] = init % 2;
            init = init / 2;
            outputs.get(i).set(b[i]);
        }
    }

    public void addToRegs() {
        MainFrame.registri.add(this);
    }


    public int getValue() {
        int val = 0;
        for (int i = 0; i < 16; i++) {
            val += b[i] * Math.pow(2, i);
        }
        return val;
    }

}
