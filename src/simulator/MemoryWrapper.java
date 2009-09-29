 /*******************************************************************************
 * Klasa MemoryWrapper predstavlja celokupnu memoriju u sistemu. Ona apstrahuje *
 * podelu memorije na memorijske module. Tako klasa Loader ne zavisi od         *
 * organizacije memorije, vec samo od formata .mc fajla.                        *
 * Ova klasa je kao proxy za pristup do objekata memorijskih modula koji cine   *
 * memoriju.                                                                    *
 * Izmena organizacije memorije po memorijskim modulima i adresa po njima utice *
 * na izmenu ove klase.                                                         *
 * Ovde je data organizacija sa 2 memorijska modula sa susednim adresama u      *
 * susednim modulima.                                                           *
 * Takodje, klasa vodi racuna o adresama na kojima su vrsene ismene podataka    *
 *******************************************************************************/

package simulator;

import java.util.LinkedList;
import simulator.elements.Memory;

public class MemoryWrapper {
    private Memory modul1;
    private LinkedList<Integer> accessedAddresses;

    public MemoryWrapper(Memory modul1) {
        this.modul1 = modul1;
        accessedAddresses = new LinkedList<Integer>();
    }

    public void write(int data, int address) {
    	//System.out.println("daodajem sledeci bajt: " + Integer.toHexString(data));
    	modul1.write(data, address);
        accessedAddresses.add(address);
    }
    public int read(int address) {
        return modul1.read(address);
    }

    public LinkedList<Integer> getAccessedAddresses(){
        return accessedAddresses;
    }

    public void clearAccessedAddresses(){
        accessedAddresses.clear();
    }
}
