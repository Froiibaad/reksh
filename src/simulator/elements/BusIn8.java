package simulator.elements;

public class BusIn8 extends KombMreza {
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BusIn8 (String name){
		super(9,8); // in0..in7, signal, out0..out7
		this.name = name;
		for (int i=0; i<8; i++){
			outputs.get(i).setHighZ();
		}
	}
	protected void calc() {
		if (inputs.get(8).getValue() == 1){
			for (int i=0; i<8; i++){
				outputs.get(i).set(inputs.get(i).getValue());
			}
		}
		else {
			for (int i=0; i<8; i++){
				outputs.get(i).setHighZ();
			}
		}

	}
    public void notifySuccessors() {
    	if (inputs.get(8).getValue() == 1)
    	{
    		for (int i = 0; i < successor.size(); i++) {
    			successor.get(i).wakeUp();
    		}
    	}
    }
}
