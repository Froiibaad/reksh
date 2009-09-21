package simulator.elements;

public class Counter2 extends SekvMreza {

    private int[] b = new int[2];

    public Counter2() {
        super(1, 2); //INC // OUT0-OUT1
    }

    public void calc() {
        if (inputs.get(0).getValue() == 1) {
            if      (b[0] == 0 && b[1] == 0) b[0] = 1;
            else if (b[0] == 1 && b[1] == 0) {b[0] = 0; b[1] = 1;}
            else if (b[0] == 0 && b[1] == 1) b[0] = 1;
            else                             {b[0] = 0; b[1] = 0;}
        }
    }

    public void setOutputs() {
        outputs.get(0).set(b[0]);
        outputs.get(1).set(b[1]);
    }

    public void initialize(int init) {
        b[0] = 0; b[1] = 0;
        setOutputs();
    }

    public int getValue() {
        int val = 0;
        for (int i = 0; i < 2; i++) {
            val += b[i] * Math.pow(2, i);
        }
        return val;
    }

}
