package simulator.elements;

public class Decoder8 extends KombMreza {
	public Decoder8 () {
		super(4, 8); // IN0..IN2, E, OUT0..OUT7
	}
	protected void calc() {
		int val = 0;
        if (inputs.get(3).getValue() == 1) {
        	int in0 = inputs.get(0).getValue();
            int in1 = inputs.get(1).getValue();
            int in2 = inputs.get(2).getValue();
            val += (in0 == 1) ? 1 : 0;
            val += (in1 == 1) ? 2 : 0;
            val += (in2 == 1) ? 4 : 0;
            for (int i = 0; i < 8; i++) {
                outputs.get(i).set((i == val) ? 1 : 0);
            }
        }
        else {
        	for (int i = 0; i < 8; i++) {
                outputs.get(i).set0();
            }
        }
	}

}
