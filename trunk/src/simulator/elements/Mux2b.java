package simulator.elements;

public class Mux2b extends KombMreza {
    public Mux2b() {
        super(3, 1); // IN0, IN1, CTRL // OUT
    }

    protected void calc() {
        outputs.get(0).set(inputs.get(inputs.get(2).getValue()).getValue());
    }
}
