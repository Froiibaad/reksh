package simulator.upravljacka;

import java.io.*;
import simulator.elements.KombMreza;

public class Memorija extends KombMreza {
	private int numOfSteps;
	private int numOfOutputs;
	Red mem[];

	public Memorija(int numOfInputs, int numOfOutputs) {
		super(numOfInputs, numOfOutputs);
		this.numOfOutputs = numOfOutputs;
		mem = new Red[256];
	}

	public void loadFromFile(File file) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader(file));
		try {
			for (int numOfSteps = 0; numOfSteps < 256; numOfSteps++) {
				String line = in.readLine();
				if(line!=null)mem[numOfSteps] = new Red(numOfOutputs, line);
			}
		} catch (EOFException e) {
		}
		in.close();
	}

	@Override
	protected void calc() {
		int adr = 0;
		for (int i = 0; i < numOfInputs; i++)
			adr += inputs.get(i).getValue() << i;
		Red tek = mem[adr];
		for (int i = 0; i < numOfSteps; i++)
			outputs.get(i).set(tek.getValue(i));
	}
}
