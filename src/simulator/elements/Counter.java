package simulator.elements;

import simulator.MainFrame;

public class Counter extends SekvMreza {

    private int[] b = new int[8];

    public Counter() {
        super(10, 8); // IN0-IN7, INC, DEC, LD // OUT0-OUT7
    }

    public void calc() {
        boolean done = false;
        if (inputs.get(10).getValue() == 1) {
            for (int i = 0; i < 8; i++) {
                b[i] = inputs.get(i).getValue();
            }
        }
        else if (inputs.get(9).getValue() == 1) {
            for (int i = 0; i < 8; i++) {
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
        else if (inputs.get(8).getValue() == 1) {
            for (int i = 0; i < 8; i++) {
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
    }

    public void setOutputs() {
        for (int i = 0; i < 8; i++) {
            outputs.get(i).set(b[i]);
        }
    }

    public void initialize(int init) {
        for (int i = 0; i < 8; i++) {
            b[i] = init % 2;
            init = init / 2;
            outputs.get(i).set(b[i]);
        }
    }

    public int getValue() {
        int val = 0;
        for (int i = 0; i < 8; i++) {
            val += b[i] * Math.pow(2, i);
        }
        return val;
    }

    public void addToRegs() {
        MainFrame.registri.add(this);
    }
}
