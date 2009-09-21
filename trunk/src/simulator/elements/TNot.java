package simulator.elements;

public class TNot extends KombMreza {

    private int numIn;
    public TNot(int numOfInputs) {
        super(numOfInputs + 1, numOfInputs); // IN0-IN<numIn-1>, CTRL<numIn> // OUT0-OUT<numIn-1>
        numIn = numOfInputs;
        for (int i = 0; i < numIn; i++) {
            outputs.get(i).setHighZ();
        }

    }

    protected void calc() {
        if (inputs.get(numIn).getValue() == 1) {
            for (int i = 0; i < numIn; i++) {
                outputs.get(i).set((inputs.get(i).getValue() == 0) ? 1 : 0);
            }
        } else {
            for (int i = 0; i < numIn; i++) {
                outputs.get(i).setHighZ();
            }
        }
    }
}
