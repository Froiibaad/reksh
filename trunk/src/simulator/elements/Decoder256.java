package simulator.elements;

public class Decoder256 extends KombMreza {
    public Decoder256() {
        super(9, 256); //IN0-IN7, E // OUT0-OUT255
    }

    protected void calc() {
        int val = 0;
        if (inputs.get(8).getValue() == 1) {
            for (int i = 0; i < 8; i++) {
                val += inputs.get(i).getValue() * Math.pow(2, i);
            }
            for (int i = 0; i < 256; i++) {
                if (i == val) {
                    outputs.get(i).set1();
                } else {
                    outputs.get(i).set0();
                }
            }

        } else {
            for (int i = 0; i < 256; i++) {
                outputs.get(i).set0();
            }
        }

    }
}
