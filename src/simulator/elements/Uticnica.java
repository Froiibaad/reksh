package simulator.elements;

public class Uticnica {

    public Uticnica(Mreza mreza, int pinNo) {
        this.mreza = mreza;
        this.pinNo = pinNo;
    }

    private Mreza mreza;

    private int pinNo;

    public Mreza getMreza() {
        return mreza;
    }

    public int getPinNo() {
        return pinNo;
    }
}
