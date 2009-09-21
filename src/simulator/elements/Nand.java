package simulator.elements;

public class Nand extends KombMreza {

    public Nand(int numOfInputs) {
        super(numOfInputs, 1);
    }

    protected void calc() {
        int res = 1;
        for (int i = 0; i < inputs.size(); i++) {
            res *= inputs.get(i).getValue();
        }
        outputs.get(0).set((res == 1) ? 0 : 1);
    }
}
