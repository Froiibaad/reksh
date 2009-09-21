package simulator.elements;

public class Mux4 extends KombMreza {
    public Mux4() {
        super(34, 8); // IN0-IN7, IN8-IN15, IN16-IN23, IN24-IN31, CTRL0, CTRL1 // OUT0-OUT7
    }

    protected void calc() {
        int ctrl0 = inputs.get(32).getValue();
        int ctrl1 = inputs.get(33).getValue();

        if (ctrl0 == 0 && ctrl1 == 0) {
            for (int i = 0; i < 8; i++) {
                outputs.get(i).set(inputs.get(i).getValue());
            }
        }
        if (ctrl0 == 1 && ctrl1 == 0) {
            for (int i = 0; i < 8; i++) {
                outputs.get(i).set(inputs.get(i + 8).getValue());
            }

        }
        if (ctrl0 == 0 && ctrl1 == 1) {
            for (int i = 0; i < 8; i++) {
                outputs.get(i).set(inputs.get(i + 16).getValue());
            }

        }
        if (ctrl0 == 1 && ctrl1 == 1) {
            for (int i = 0; i < 8; i++) {
                outputs.get(i).set(inputs.get(i + 24).getValue());
            }
        }
    }
}
