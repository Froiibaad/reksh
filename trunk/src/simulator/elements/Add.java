package simulator.elements;

public class Add extends KombMreza {
    public Add() {
        super(17, 9); // A0-A7, B0-B7, C0 // OUT0-OUT7, C8
    }

    protected void calc() {
        int c = inputs.get(16).getValue();
        for (int i = 0; i < 8; i++) {
            int add = inputs.get(i).getValue() + inputs.get(i + 8).getValue() +
                      c;
            c = add / 2;
            outputs.get(i).set(add % 2);
        }
        outputs.get(8).set(c);
    }
}
