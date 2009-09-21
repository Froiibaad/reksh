package simulator.elements;

public class And extends KombMreza {
    public And(int numOfInputs) {
        super(numOfInputs, 1);
    }

    protected void calc() {
        int res = 1;
        for (int i = 0; i < inputs.size(); i++) {
            res *= inputs.get(i).getValue();
        }
        outputs.get(0).set(res);
    }
}
