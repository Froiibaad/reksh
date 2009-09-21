package simulator.elements;

public class NumGen extends KombMreza {

    private int[] outVal;

    public NumGen(int[] outVal) {
        super(outVal.length, 8);
        this.outVal = outVal;
    }

    protected void calc() {
        for (int i = 0; i < outVal.length; i++) {
            if (inputs.get(i).getValue() == 1) {
                int init = outVal[i];
                for (int j = 0; j < 8; j++) {
                    outputs.get(j).set(init % 2);
                    init = init / 2;
                }
                break;
            }
        }
    }
}
