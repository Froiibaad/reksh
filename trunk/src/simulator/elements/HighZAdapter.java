package simulator.elements;

public class HighZAdapter extends KombMreza {
    public HighZAdapter() {
        super(1, 1);
        outputs.get(0).set1();
    }

    protected void calc() {
        if (inputs.get(0).getValue() == -1) {
            outputs.get(0).set1();
        } else {
            outputs.get(0).set0();
        }
    }
}
