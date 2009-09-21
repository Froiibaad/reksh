package simulator.elements;

public class Status extends KombMreza {
    public Status() {
        super(1, 1);
    }

    private int status = 0;

    public boolean getBoolStatus() {
        return (status == 0) ? false : true;
    }

    public int getIntStatus() {
        return status;
    }

    protected void calc() {
        status = inputs.get(0).getValue();
        outputs.get(0).set(status);
    }
}
