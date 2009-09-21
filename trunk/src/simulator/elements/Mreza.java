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
     * Obave�tavanje mre�a vezanih na izlaz ove mre�e o promeni stanja.
     */

    public void notifySuccessors() {
        for (int i = 0; i < successor.size(); i++) {
            successor.get(i).wakeUp();
        }
    }

    /**
     * Generisanje novog izlaza trenutne mre�e.
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
     * Dodavanje kombinacione mre�e u listu sukcesivnih mre�a.
     * @param m KombMreza - pokaziva\u010D na �eljenu kombinacionu mre�u
     */

    protected void addSuccessor(KombMreza m) {
        successor.add(m);
    }

    /**
     * Povezivanje n-tog izlaza �eljene mre�e na ulaz teku\u0107e.
     * @param m Mreza - izvori�na mre�a
     * @param outputNo int - broj izlaza izvori�ne mre�e
     */

    public abstract void addInput(Mreza m, int outputNo);

    public abstract void addInput(int inputNo, Mreza m, int outputNo);

    public void addInput8(Mreza m, int startNo) {
        for (int i = startNo; i < startNo + 8; i++) {
            addInput(m, i);
        }
    }
}
