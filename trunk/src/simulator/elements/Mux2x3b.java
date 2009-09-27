package simulator.elements;

public class Mux2x3b extends KombMreza {
	public Mux2x3b() {
        super(7, 3); // IN00, IN01, IN02, IN10, IN11, IN12, SIGNAL, OUT0, OUT1, OUT2
    }

    protected void calc() {
    	if(inputs.get(6).getValue() == 1){
    		outputs.get(0).set(inputs.get(3).getValue());
    		outputs.get(1).set(inputs.get(4).getValue());
    		outputs.get(2).set(inputs.get(5).getValue());
    	}
    	else {
    		outputs.get(0).set(inputs.get(0).getValue());
    		outputs.get(1).set(inputs.get(1).getValue());
    		outputs.get(2).set(inputs.get(2).getValue());
    	}
    }

}
