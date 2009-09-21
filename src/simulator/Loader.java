 /*******************************************************************************
 * Klasa Loader sluzi za ucitavanje masinskog fajla u memoriju. Ona zavisi samo *
 * formata .mc fajla, ali ne i od organizacije memorije, jer u memoriju upisuje *
 * posredno, preko klase MemoryWrapper koja brine o tome.                       *
 * Povratna vrednost je pocetna adresa koda u memoriji da bi se njom            *
 * inicijalizovao PC.                                                           *
 *******************************************************************************/

package simulator;

import java.io.*;

public class Loader {
    public static int loadMemory(MemoryWrapper mem, String filename) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            int address = Integer.parseInt(reader.readLine(), 16);
            int startAddress = address;
            char[] code = new char[2];
            while (reader.read(code, 0, 2) != -1) {
                int data = Integer.parseInt(String.valueOf(code), 16);
                mem.write(data, address);
                address++;
                reader.read(); //skip blank
            }
            reader.close();
            return startAddress;
        } catch (Exception e) {
            System.out.println(e);
            return -1;
        }
    }
}
