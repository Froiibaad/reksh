package simulator.elements;

import simulator.Initializator;

public abstract class SekvMreza extends Mreza {
    public String name = "";

    public SekvMreza(int numOfInputs, int numOfOutputs) {
        super(numOfInputs, numOfOutputs);
        Clock.addToClock(this);
    }

    public void addInput(Mreza m, int outputNo) {
        inputs.add(m.getOutput(outputNo));
    }

    public void addInput(int inputNo, Mreza m, int outputNo) {
        int size = this.inputs.size();
        for (int i = size; i < inputNo; i++) {
        	inputs.add(Initializator.nula.getOutput(0));
        }
        inputs.add(m.getOutput(outputNo));
    }

    public void wakeUp() {}

    public abstract void calc();

    public abstract void setOutputs();

    public abstract void initialize(int init);
    public abstract int getValue();
}
