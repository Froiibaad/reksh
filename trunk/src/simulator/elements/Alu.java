package simulator.elements;

public class Alu extends KombMreza {
    public Alu() {
        super(41, 17); // X0-X15, Y0-Y15, ADD, AND, ARS, INCX, INCY, DECX, DECY, TRANSX, TRANSY, 
        // Z0-Z15, C
    }

    public static int X0 = 0, X1 = 1, X2 = 2, X3 = 3, X4 = 4, X5 = 5, X6 = 6,
            X7 = 7, X8 = 8, X9 = 9, X10 = 10, X11 = 11, X12 = 12, X13 = 13, X14 = 14, X15 = 15, 
            Y0 = 16, Y1 = 17, Y2 = 18, Y3 = 19, Y4 = 20, Y5 = 21, Y6 = 22, Y7 = 23,
            Y8 = 24, Y9 = 25, Y10 = 26, Y11 = 27, Y12 = 28, Y13 = 29, Y14 = 30, Y15 = 31, 
            ADD = 32, AND = 33, ARS = 34, INCX = 35, INCY = 36, DECX = 37, DECY = 38, TRANSX = 39, TRANSY = 40;

    protected void calc() {
    	if (inputs.get(Alu.ADD).getValue() == 1) {
    		int c = 0;
    		for (int i = 0; i < 16; i++) {
    			int add = inputs.get(i).getValue() + inputs.get(i + 16).getValue() + c;
    			c = add / 2;
    			outputs.get(i).set(add % 2);
    		}
    		outputs.get(16).set(c);
    	}
    	if (inputs.get(Alu.INCX).getValue() == 1) {
    		int c = 1;
    		for (int i = 0; i < 16; i++) {
    			if (inputs.get(i).getValue() == 1 && c == 1) {outputs.get(i).set0(); c = 1;}
    			if (inputs.get(i).getValue() == 0 && c == 1) {outputs.get(i).set1(); c = 0;}
    			if (inputs.get(i).getValue() == 1 && c == 0) {outputs.get(i).set1(); c = 0;}
    			if (inputs.get(i).getValue() == 0 && c == 0) {outputs.get(i).set0(); c = 0;}
    		}
    		outputs.get(16).set(c);
    	}
    	if (inputs.get(Alu.INCY).getValue() == 1) {
    		int c = 1;
    		for (int i = 0; i < 16; i++) {
    			if (inputs.get(i+Alu.Y0).getValue() == 1 && c == 1) {outputs.get(i).set0(); c = 1;}
    			if (inputs.get(i+Alu.Y0).getValue() == 0 && c == 1) {outputs.get(i).set1(); c = 0;}
    			if (inputs.get(i+Alu.Y0).getValue() == 1 && c == 0) {outputs.get(i).set1(); c = 0;}
    			if (inputs.get(i+Alu.Y0).getValue() == 0 && c == 0) {outputs.get(i).set0(); c = 0;}
    		}
    		outputs.get(16).set(c);
    	}
    	if (inputs.get(Alu.DECX).getValue() == 1) {
    		int c = 1;
    		for (int i = 0; i < 16; i++) {
    			if (inputs.get(i).getValue() == 1 && c == 1) {outputs.get(i).set0(); c = 0;}
    			if (inputs.get(i).getValue() == 0 && c == 1) {outputs.get(i).set1(); c = 1;}
    			if (inputs.get(i).getValue() == 1 && c == 0) {outputs.get(i).set1(); c = 0;}
    			if (inputs.get(i).getValue() == 0 && c == 0) {outputs.get(i).set0(); c = 0;}
    		}
    		outputs.get(16).set(c);
    	}
    	if (inputs.get(Alu.DECY).getValue() == 1) {
    		int c = 1;
    		for (int i = 0; i < 16; i++) {
    			if (inputs.get(i+Alu.Y0).getValue() == 1 && c == 1) {outputs.get(i).set0(); c = 0;}
    			if (inputs.get(i+Alu.Y0).getValue() == 0 && c == 1) {outputs.get(i).set1(); c = 1;}
    			if (inputs.get(i+Alu.Y0).getValue() == 1 && c == 0) {outputs.get(i).set1(); c = 0;}
    			if (inputs.get(i+Alu.Y0).getValue() == 0 && c == 0) {outputs.get(i).set0(); c = 0;}
    		}
    		outputs.get(16).set(c);
    	}
    	if (inputs.get(Alu.TRANSX).getValue() == 1) {
    		for (int i = 0; i < 16; i++) {
    			outputs.get(i).set(inputs.get(i).getValue());
    		}
    	}
    	if (inputs.get(Alu.AND).getValue() == 1){
    		for (int i = 0; i < 16; i++) {
    			if (inputs.get(i).getValue() == 1 && inputs.get(i).getValue() == 1) outputs.get(i).set1();
    			else outputs.get(i).set0();
    		}
    	}
    	if (inputs.get(Alu.ARS).getValue() == 1) {						//asr radi nad y
    		for (int i = Alu.Y15; i > Alu.Y0 ; i--) {
    			outputs.get(i - Alu.Y0 - 1).set(inputs.get(i).getValue());
    		}
    	}
    	if (inputs.get(Alu.TRANSY).getValue() == 1){
    		for (int i = 0; i < 16; i++){
    			outputs.get(i).set(inputs.get(i + Alu.Y0).getValue());
    		}
    	}
    }
}
