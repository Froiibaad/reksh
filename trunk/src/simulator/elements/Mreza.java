package simulator.elements;

import java.util.ArrayList;

public abstract class Mreza {
    public Mreza() {
    }

    private ArrayList<KombMreza> successor;
    protected ArrayList<Pin> outputs;
    protected ArrayList<Pin> inputs;
    protected int numOfInputs;

    public Mreza(int numOfInputs, int numOfOutputs) {
        successor = new ArrayList<KombMreza>();
        outputs = new ArrayList<Pin>(numOfOutputs);
        outputs.ensureCapacity(numOfOutputs);
        inputs = new ArrayList<Pin>(numOfInputs);
        inputs.ensureCapacity(numOfInputs);
        for (int i = 0; i < numOfOutputs; i++) {
            addOutput();
        }
        this.numOfInputs = numOfInputs;
    }

    /**
     * Obaveštavanje mreža vezanih na izlaz ove mreže o promeni stanja.
     */

    public void notifySuccessors() {
        for (int i = 0; i < successor.size(); i++) {
            successor.get(i).wakeUp();
        }
    }

    /**
     * Generisanje novog izlaza trenutne mreže.
     */

    private void addOutput() {
        outputs.add(new Pin());
    }

    /**
     * Dohvatanje izlaznog pina
     * @param outputNo int - redni broj izlaza
     * @return Pin - pokaziva\u010D na izlazni pin
     */

    public Pin getOutput(int outputNo) {
        return outputs.get(outputNo);
    }

    /**
     * Dodavanje kombinacione mreže u listu sukcesivnih mreža.
     * @param m KombMreza - pokaziva\u010D na željenu kombinacionu mrežu
     */

    protected void addSuccessor(KombMreza m) {
        successor.add(m);
    }

    /**
     * Povezivanje n-tog izlaza željene mreže na ulaz teku\u0107e.
     * @param m Mreza - izvorišna mreža
     * @param outputNo int - broj izlaza izvorišne mreže
     */

    public abstract void addInput(Mreza m, int outputNo);

    public abstract void addInput(int inputNo, Mreza m, int outputNo);

    public void addInput8(Mreza m, int startNo) {
        for (int i = startNo; i < startNo + 8; i++) {
            addInput(m, i);
        }
    }
}
