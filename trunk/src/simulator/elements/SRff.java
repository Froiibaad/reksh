package simulator.elements;

/**
 * 
 * IN0 - S;
 * IN1 - R
 *
 */
public class SRff extends SekvMreza {

    private int[] b = new int[2];
    
    public SRff() {
        super(2, 2);
        b[0] = 0; b[1] = 1;
    }

    public void calc() {
        if (inputs.get(1).getValue() == 1) {
            b[0] = 0;
            b[1] = 1;
        } else if (inputs.get(0).getValue() == 1) {
            b[0] = 1;
            b[1] = 0;
        }
    }

    public void setOutputs() {
        for (int i = 0; i < 2; i++) {
            outputs.get(i).set(b[i]);
        }
    }

    public void initialize(int init) {
        b[0] = init;
        b[1] = (init == 1) ? 0 : 1;
        setOutputs();
    }

    public int getValue() {
        return outputs.get(0).getValue();
    }
}
