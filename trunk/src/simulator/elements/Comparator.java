package simulator.elements;

public class Comparator extends KombMreza {
    public Comparator(int operandSize) {
        super(2*operandSize, 3); // A0, A1, ..., An, B0, B1, ..., Bn // LESS EQL GRT
    }

    protected void calc() {
        int a = 0, b = 0;
        for (int i=inputs.size()/2-1; i>-1; i--) {
            a = 2*a + inputs.get(i).getValue();
            b = 2*b + inputs.get(i+inputs.size()/2).getValue();
        }

        if (a > b) {
            outputs.get(0).set0();
            outputs.get(1).set0();
            outputs.get(2).set1();
        } else if (b > a) {
            outputs.get(0).set1();
            outputs.get(1).set0();
            outputs.get(2).set0();
        } else {
            outputs.get(0).set0();
            outputs.get(1).set1();
            outputs.get(2).set0();
        }
    }
}
