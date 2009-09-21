package simulator.elements;

public class Bus1 extends KombMreza {
    public Bus1(int numOfInputs) {
        super(numOfInputs, 1);
        outputs.get(0).setHighZ();
    }

    protected void calc() {
        boolean highZ = true;
        for (int i = 0; i < numOfInputs; i++) {
            if (inputs.get(i).getValue() != -1) {
                outputs.get(0).set(inputs.get(i).getValue());
                highZ = false;
                break;
            }
        }
        if (highZ) {
            outputs.get(0).setHighZ();
        }
    }
}
