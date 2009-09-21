package simulator.elements;

public class Not extends KombMreza {
    public Not() {
        super(1, 1);
    }

    protected void calc() {
        outputs.get(0).set((inputs.get(0).getValue() == 1) ? 0 : 1);
    }
}
