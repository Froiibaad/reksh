package simulator.elements;

public class Bus8 extends KombMreza {
    public Bus8(int numOfInputs) {
        super(numOfInputs * 8, 8);
        for (int i = 0; i < 8; i++) {
            outputs.get(i).setHighZ();
        }

    }


    protected void calc() {
        boolean highZ = true;
        for (int i = 0; i < numOfInputs; i += 8) {
            if (inputs.get(i).getValue() != -1) {
                for (int j = 0; j < 8; j++) {
                    outputs.get(j).set(inputs.get(i + j).getValue());
                }
                highZ = false;
                break;
            }
        }
        if (highZ) {
            for (int i = 0; i < 8; i++) {
                outputs.get(i).setHighZ();
            }
        }
    }

    public int getValue() {
        int val = 0;
        for (int i = 0; i < 8; i++) {
            val += outputs.get(i).getValue() * Math.pow(2, i);
        }
        return val;
    }
}
