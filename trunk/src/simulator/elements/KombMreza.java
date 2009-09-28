package simulator.elements;

import simulator.Initializator;

public abstract class KombMreza extends Mreza {

    public KombMreza(int numOfInputs, int numOfOutputs) {
        super(numOfInputs, numOfOutputs);
    }

    public void wakeUp() {
        boolean bad = false;
        //for (int i = 0; i < numOfInputs; i++) {
        for (int i = 0; i < inputs.size(); i++) {
            if (inputs.get(i).getValue() == -1) {
                bad = true;
            }
        }

        if ((!bad) ||
            (this.getClass().getSimpleName().equalsIgnoreCase(Bus8.class.
                getSimpleName()))
            ||
            (this.getClass().getSimpleName().equalsIgnoreCase(Bus16.class.
                getSimpleName()))
            ||
            (this.getClass().getSimpleName().equalsIgnoreCase(Bus1.class.
                getSimpleName()))
            ||
            (this.getClass().getSimpleName().equalsIgnoreCase(HighZAdapter.class.
                getSimpleName())))
        {
            this.calc();
            notifySuccessors();
        }
    }

    public void addInput(Mreza m, int outputNo) {
        m.addSuccessor(this);
        inputs.add(m.getOutput(outputNo));
    }

    public void addInput(int inputNo, Mreza m, int outputNo) {
        m.addSuccessor(this);
        int size = this.inputs.size();
        for (int i = size; i < inputNo; i++) {
        	inputs.add(Initializator.nula.getOutput(0));
        }
        inputs.add(m.getOutput(outputNo));
    }

    protected abstract void calc();
}
