package simulator.elements;

public class Bus16 extends KombMreza {
    public Bus16(int numOfInputs) {
        super(numOfInputs * 16, 16);
        for (int i = 0; i < 16; i++) {
            outputs.get(i).setHighZ();
        }

    }

    protected void calc() {
        boolean highZ = true;
        for (int i = 0; i < numOfInputs; i += 16) {

            if (inputs.get(i).getValue() != -1) {
                for (int j = 0; j < 16; j++) {
                    outputs.get(j).set(inputs.get(i + j).getValue());
                }
                highZ = false;
                break;
            }
        }
        if (highZ) {
            for (int i = 0; i < 16; i++) {
                outputs.get(i).setHighZ();
            }
        }
    }

    public int getValue() {
        int val = 0;
        for (int i = 0; i < 16; i++) {
            val += outputs.get(i).getValue() * Math.pow(2, i);
        }
        return val;
    }
}
