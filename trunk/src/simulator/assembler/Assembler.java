//Fasada za asemblerski podsistem

package simulator.assembler;

public class Assembler {
	private static Parser parser = null;

        //vraca ime izlaznog fajla ili null ako je neuspesno parsiranje
        public static String assemble(String fileName) {
                if (parser == null) parser = new Parser();
                Object o = parser.parse(fileName);
                String outputFile = fileName.substring(0, fileName.lastIndexOf(".")) + ".mc";
                if (o == null) return null;
                else           return outputFile;
        }

	public static void main(String args[]) {
		Parser p = new Parser();
		p.parse(args[0]);
	}
}
