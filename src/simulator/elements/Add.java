package simulator.elements;

public class Add extends KombMreza {
	//public static int C0 = 32;
    public Add() {
        super(33, 17); // A0-A15, B0-B15, C0 // OUT0-OUT15, C8
    }

    protected void calc() {
        int c = inputs.get(32).getValue();
        for (int i = 0; i < 16; i++) {
            int add = inputs.get(i).getValue() + inputs.get(i + 16).getValue() + c;
            c = add / 2;
            outputs.get(i).set(add % 2);
        }
        outputs.get(16).set(c);
    }
}
