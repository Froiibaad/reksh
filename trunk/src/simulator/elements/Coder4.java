package simulator.elements;

public class Coder4 extends KombMreza {
    public Coder4() {
        super(5, 3); // IN0-IN3, E // OUT0-OUT1, W
    }

    protected void calc() {
        int w = 0;
        int num = 0;
        for (int i = 3; i >= 0; i--) {
            if (inputs.get(i).getValue() == 1) {
                w = 1;
                num = i;
                break;
            }
        }
        switch (num) {
        case 3:
            outputs.get(0).set(1);
            outputs.get(1).set(1);
            break;
        case 2:
            outputs.get(0).set(0);
            outputs.get(1).set(1);
            break;
        case 1:
            outputs.get(0).set(1);
            outputs.get(1).set(0);
            break;
        case 0:
            outputs.get(0).set(0);
            outputs.get(1).set(0);
            break;
        }
        outputs.get(2).set(w);
    }
}
