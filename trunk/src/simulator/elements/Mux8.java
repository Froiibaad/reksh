package simulator.elements;

public class Mux8 extends KombMreza {
    public Mux8() {
        super(67, 8); // IN0-IN7, IN8-IN15, IN16-IN23, IN24-IN31, IN32-IN39,
        // IN40-47, IN48-IN55, IN56-IN63 CTRL0, CTRL1, CTRL2 // OUT0-OUT7
    }

    protected void calc() {
        int ctrl0 = inputs.get(64).getValue();
        int ctrl1 = inputs.get(65).getValue();
        int ctrl2 = inputs.get(66).getValue();

        if (ctrl0 == 0 && ctrl1 == 0 && ctrl2 == 0) {
            for (int i = 0; i < 8; i++) {
                outputs.get(i).set(inputs.get(i).getValue());
            }
        }
        if (ctrl0 == 1 && ctrl1 == 0 && ctrl2 == 0) {
            for (int i = 0; i < 8; i++) {
                outputs.get(i).set(inputs.get(i + 8).getValue());
            }
        }
        if (ctrl0 == 0 && ctrl1 == 1 && ctrl2 == 0) {
            for (int i = 0; i < 8; i++) {
                outputs.get(i).set(inputs.get(i + 8 * 2).getValue());
            }
        }
        if (ctrl0 == 1 && ctrl1 == 1 && ctrl2 == 0) {
            for (int i = 0; i < 8; i++) {
                outputs.get(i).set(inputs.get(i + 8 * 3).getValue());
            }
        }
        if (ctrl0 == 0 && ctrl1 == 0 && ctrl2 == 1) {
            for (int i = 0; i < 8; i++) {
                outputs.get(i).set(inputs.get(i + 8 * 4).getValue());
            }
        }
        if (ctrl0 == 1 && ctrl1 == 0 && ctrl2 == 1) {
            for (int i = 0; i < 8; i++) {
                outputs.get(i).set(inputs.get(i + 8 * 5).getValue());
            }
        }
        if (ctrl0 == 0 && ctrl1 == 1 && ctrl2 == 1) {
            for (int i = 0; i < 8; i++) {
                outputs.get(i).set(inputs.get(i + 8 * 6).getValue());
            }
        }
        if (ctrl0 == 1 && ctrl1 == 1 && ctrl2 == 1) {
            for (int i = 0; i < 8; i++) {
                outputs.get(i).set(inputs.get(i + 8 * 7).getValue());
            }
        }
    }
}
