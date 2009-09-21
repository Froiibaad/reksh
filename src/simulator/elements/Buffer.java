package simulator.elements;

public class Buffer extends KombMreza {
    public Buffer() {
        super(1, 1);
    }

    private int status = 0;

    protected void calc() {
        status = inputs.get(0).getValue();
        outputs.get(0).set(status);
    }
}
