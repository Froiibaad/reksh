package simulator.elements;

public class MuxBus16 extends KombMreza {
	public static int signal = 32;
	private String name = null;
	public MuxBus16(String name) {
		super(33, 16); // A0..A15, B0..B15, signal, C0..C15
		this.setName(name);
	}
	protected void calc() {
		if (inputs.get(signal).getValue() == 1){
			for (int i = 0; i < 16; i++){
				outputs.get(i).set(inputs.get(i+16).getValue());
			}
		}
		else {
			for (int i = 0; i < 16; i++){
				outputs.get(i).set(inputs.get(i).getValue());
			}
		}
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
}
