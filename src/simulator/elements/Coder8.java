package simulator.elements;

public class Coder8 extends KombMreza {
    public Coder8() {
        super(9, 4); // IN0-IN7, E // OUT0-OUT2, W
    }

    protected void calc() {
        int w = 0;
        int num = 0;
        for (int i = 7; i >= 0; i--) {
            if (inputs.get(i).getValue() == 1) {
                w = 1;
                num = i;
                break;
            }
        }
        switch (num) {
        case 7:
            outputs.get(0).set(1);
            outputs.get(1).set(1);
            outputs.get(2).set(1);
            break;
        case 6:
            outputs.get(0).set(0);
            outputs.get(1).set(1);
            outputs.get(2).set(1);
            break;
        case 5:
            outputs.get(0).set(1);
            outputs.get(1).set(0);
            outputs.get(2).set(1);
            break;
        case 4:
            outputs.get(0).set(0);
            outputs.get(1).set(0);
            outputs.get(2).set(1);
            break;
        case 3:
            outputs.get(0).set(1);
            outputs.get(1).set(1);
            outputs.get(2).set(0);
            break;
        case 2:
            outputs.get(0).set(0);
            outputs.get(1).set(1);
            outputs.get(2).set(0);
            break;
        case 1:
            outputs.get(0).set(1);
            outputs.get(1).set(0);
            outputs.get(2).set(0);
            break;
        case 0:
            outputs.get(0).set(0);
            outputs.get(1).set(0);
            outputs.get(2).set(0);
            break;
        }
        outputs.get(3).set(w);

    }
}
