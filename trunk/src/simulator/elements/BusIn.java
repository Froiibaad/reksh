package simulator.elements;

public class BusIn extends KombMreza {
	private String name = null;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BusIn(String name) {
		super(2, 1); // in, signal , out
		this.name = name;
		outputs.get(0).setHighZ();
	}
	protected void calc() {
		if (inputs.get(1).getValue() == 1){
			outputs.get(0).set(inputs.get(0).getValue());
		}
		else {
			outputs.get(0).setHighZ();
		}
	}

}
