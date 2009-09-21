package simulator.elements;

public class Alu extends KombMreza {
    public Alu() {
        super(22, 9); // X0-X7, Y0-Y7, ADD, XOR, LSR, SHL, TRANSX, TRANSY
        // Z0-Z7, C8
    }

    public static int X0 = 0, X1 = 1, X2 = 2, X3 = 3, X4 = 4, X5 = 5, X6 = 6,
            X7 = 7, Y0 = 8, Y1 = 9, Y2 = 10, Y3 = 11, Y4 = 12, Y5 = 13, Y6 = 14,
            Y7 = 15, ADD = 16, XOR = 17, LSR = 18, SHL = 19, TRANSX = 20,
            TRANSY = 21;

    protected void calc() {
        if (inputs.get(Alu.ADD).getValue() == 1) {
            int c = 0;
            for (int i = 0; i < 8; i++) {
                int add = inputs.get(i).getValue() + inputs.get(i + 8).getValue() +
                          c;
                c = add / 2;
                outputs.get(i).set(add % 2);
            }
            outputs.get(8).set(c);
        }
        if (inputs.get(Alu.XOR).getValue() == 1) {
            for (int i = 0; i < 8; i++) {
                if (inputs.get(i).getValue() == inputs.get(i+8).getValue()) outputs.get(i).set0();
                else outputs.get(i).set1();
            }

        }

        if (inputs.get(Alu.LSR).getValue() == 1) {
            for (int i = 6; i >= 0; i--) {
                outputs.get(i).set(inputs.get(i + 1).getValue());
            }
            outputs.get(7).set0();
        }
        if (inputs.get(Alu.SHL).getValue() == 1) {
            for (int i = 1; i < 8; i++) {
                outputs.get(i).set(inputs.get(i - 1).getValue());
            }
            outputs.get(0).set0();

        }
        if (inputs.get(Alu.TRANSX).getValue() == 1) {
            for (int i = 0; i < 8; i++) {
                outputs.get(i).set(inputs.get(i).getValue());
            }
        }
        if (inputs.get(Alu.TRANSY).getValue() == 1) {
            for (int i = 0; i < 8; i++) {
                outputs.get(i).set(inputs.get(i + 8).getValue());
            }
        }
    }
}
