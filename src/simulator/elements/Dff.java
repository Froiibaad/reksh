package simulator.elements;

public class Dff extends SekvMreza {

    private int[] b = new int[2];

    public Dff() {
        super(1, 2);
        b[0] = 0; b[1] = 1;
    }

    public void calc() {
        b[0] = inputs.get(0).getValue();
        b[1] = (inputs.get(0).getValue() == 1) ? 0 : 1;
    }

    public void initialize(int init) {
        b[0] = init;
        b[1] = (init == 1) ? 0 : 1;
        setOutputs();
    }

    public void setOutputs() {
        for (int i = 0; i < 2; i++) {
            outputs.get(i).set(b[i]);
        }
    }

    public int getValue() {
        return outputs.get(0).getValue();
    }

}
