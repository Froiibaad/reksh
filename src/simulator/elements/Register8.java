package simulator.elements;

import simulator.elements.*;
import simulator.MainFrame;

public class Register8 extends SekvMreza {

    private int[] b = new int[8];

    public Register8(String name) {
        super(12, 8);
        this.name = name;
        for (int i = 0; i < 8; i++) {
            b[i] = 0;
        }
    }

    public static final int IN0 = 0, IN1 = 1, IN2 = 2, IN3 = 3, IN4 = 4,
            IN5 = 5, IN6 = 6, IN7 = 7, LD = 8, CLR = 9, INC = 10, DEC = 11;

    public void calc() {
        boolean done = false;
        if (inputs.get(LD).getValue() == 1) {
            for (int i = 0; i < 8; i++) {
                b[i] = inputs.get(i).getValue();
            }
        }
        if (inputs.get(CLR).getValue() == 1) {
            for (int i = 0; i < 8; i++) {
                b[i] = 0;
            }
        }
        if (inputs.get(INC).getValue() == 1) {
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
        if (inputs.get(DEC).getValue() == 1) {
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

    public void addToRegs() {
        MainFrame.registri.add(this);
    }

    public int getValue() {
        int val = 0;
        for (int i = 0; i < 8; i++) {
            val += b[i] * Math.pow(2, i);
        }
        return val;
    }
}
