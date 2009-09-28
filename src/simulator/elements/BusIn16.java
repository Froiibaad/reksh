package simulator.elements;

public class BusIn16 extends KombMreza {
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BusIn16 (String name){
		super(17,16); // in0..in15, signal, out0..out15
		this.name = name;
		for (int i=0; i<16; i++){
			outputs.get(i).setHighZ();
		}
	}
	protected void calc() {
		if (inputs.get(16).getValue() == 1){
			for (int i=0; i<16; i++){
				outputs.get(i).set(inputs.get(i).getValue());
			}
		}
		else {
			for (int i=0; i<16; i++){
				outputs.get(i).setHighZ();
			}
		}

	}
    public void notifySuccessors() {
    	if (inputs.get(16).getValue() == 1)
    	{
    		for (int i = 0; i < successor.size(); i++) {
    			successor.get(i).wakeUp();
    		}
    	}
    }
}
