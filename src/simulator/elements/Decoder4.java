package simulator.elements;

public class Decoder4 extends KombMreza {
    public Decoder4() {
        super(3, 4); //IN0-IN1, E // OUT0-OUT3
    }

    protected void calc() {
        int val = 0;
        if (inputs.get(2).getValue() == 1) {
            int in0 = inputs.get(0).getValue();
            int in1 = inputs.get(1).getValue();
            if (in0 == 0 && in1 == 0) {
                val = 0;
            }
            if (in0 == 1 && in1 == 0) {
                val = 1;
            }
            if (in0 == 0 && in1 == 1) {
                val = 2;
            }
            if (in0 == 1 && in1 == 1) {
                val = 3;
            }
            for (int i = 0; i < 4; i++) {
                outputs.get(i).set((i == val) ? 1 : 0);
            }
        } else {
            for (int i = 0; i < 4; i++) {
                outputs.get(i).set0();
            }
        }
    }
}
