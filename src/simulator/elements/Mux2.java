package simulator.elements;

public class Mux2 extends KombMreza {
    public Mux2() {
        super(17, 8); // IN0 - IN7, IN8 - IN15, CTRL // OUT0 - OUT7
    }

    protected void calc() {
        if (inputs.get(16).getValue() == 0) {
            for (int i = 0; i < 8; i++) {
                outputs.get(i).set(inputs.get(i).getValue());
            }
        }
        if (inputs.get(16).getValue() == 1) {
            for (int i = 0; i < 8; i++) {
                outputs.get(i).set(inputs.get(i + 8).getValue());
            }
        }
    }

    //TODO: ovo u Mreza
    public int getValue() {
        int val = 0;
        for (int i = 0; i < 8; i++) {
            val += outputs.get(i).getValue() * Math.pow(2, i);
        }
        return val;
    }

}
