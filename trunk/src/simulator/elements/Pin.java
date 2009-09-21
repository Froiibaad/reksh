package simulator.elements;

public class Pin {

    public static final int ZERO = 0;
    public static final int ONE = 1;
    public static final int HIGHZ = -1;

    private int value;

    public Pin() {
        value = 0;
    }

    public void set(int val) {
        value = val;
    }

    public void set1() {
        value = ONE;
    }

    public void set0() {
        value = ZERO;
    }

    public void setHighZ() {
        value = HIGHZ;
    }

    public int getValue() {
        return value;
    }
}
