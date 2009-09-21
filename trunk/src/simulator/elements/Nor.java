package simulator.elements;

public class Nor extends KombMreza {
    public Nor(int numOfInputs) {
        super(numOfInputs, 1);
    }

    protected void calc() {
        int res = 0;
        for (int i = 0; i < inputs.size(); i++) {
            res += inputs.get(i).getValue();
        }
        outputs.get(0).set(res > 0 ? 0 : 1);
    }
}
