package simulator.elements;
/**
 * 
 * Memory predstavlja samo jedan memoriski modul unutar sistema,
 * class {@MemoryWrapper} je pretstavlja nacin organizacije memorije
 * i brine se o upisu i citanju.
 *
 */
public class Memory extends SekvMreza {

    private int[] data;

    public Memory() {
        super(25, 8); // Address 0-15, DataIn 16-23, WR // DataOut 0-7
        data = new int[65536]; //2^16 lokacija
    }

    public void calc() {
        int addr = 0;
        for (int i = 0; i <= 15; i++) {
            addr += inputs.get(i).getValue() * Math.pow(2, i);
        }
        int dataIn = 0;
        for (int i = 16; i <= 23; i++) {
            dataIn += inputs.get(i).getValue() * Math.pow(2, i-15);
        }
        int dataOut = read(addr);
        for (int i = 0; i < 8; i++) {
            outputs.get(i).set(dataOut % 2);
            dataOut = dataOut / 2;
        }
        if (inputs.get(24).getValue() == 1) { // Write
            write(dataIn, addr);
        }
    }

    public void setOutputs() {}
    public void initialize(int init) {}

    public int getValue() {
        int val = 0;
        for (int i = 0; i <= 8; i++) {
            val += outputs.get(i).getValue() * Math.pow(2, i);
        }
        return val;
    }

    public void write(int dat, int address) {
        data[address] = dat;
    }

    public int read(int address) {
        return data[address];
    }

}
