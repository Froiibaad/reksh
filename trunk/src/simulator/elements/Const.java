package simulator.elements;

public class Const extends KombMreza {

    private int value;

    public Const(int value) {
        super(0, 16);
        this.value = value;
        for (int i = 0; i < 16; i++) {
            outputs.get(i).set(value);
        }
    }

    protected void calc() {
    }
}
