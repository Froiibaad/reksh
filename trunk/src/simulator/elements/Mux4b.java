package simulator.elements;

public class Mux4b extends KombMreza {
    public Mux4b() {
        super(6, 1); // IN0, IN1, IN2, IN3, CTRL0, CTRL1 // OUT
    }

    protected void calc() {
        int ctrl0 = inputs.get(4).getValue();
        int ctrl1 = inputs.get(5).getValue();
        if (ctrl0 == 0 && ctrl1 == 0) {
            outputs.get(0).set(inputs.get(0).getValue());
        }
        if (ctrl0 == 1 && ctrl1 == 0) {
            outputs.get(0).set(inputs.get(1).getValue());
        }
        if (ctrl0 == 0 && ctrl1 == 1) {
            outputs.get(0).set(inputs.get(2).getValue());
        }
        if (ctrl0 == 1 && ctrl1 == 1) {
            outputs.get(0).set(inputs.get(3).getValue());
        }
    }
}
