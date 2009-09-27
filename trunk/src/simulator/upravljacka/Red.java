package simulator.upravljacka;

public class Red {
	private boolean izlaz[];

	public Red(int w, String line) {
		izlaz = new boolean[w];

		boolean b = true;
		line = line.trim();
		line = line.replaceAll("\t", " ");
		while (b) {
			String temp = line.replaceAll("  ", " ");
			if (line.equals(temp))
				b = false;
			line = temp;
		}
		line = line.replaceAll(" ,", ",");
		line = line.replaceAll(", ", ",");
		String tokeni[] = line.split(",");

		if (tokeni[0].startsWith("br")) {
			izlaz[0] = true;
			izlaz[Signali.valueOf(tokeni[0]).ordinal()] = true;
			String adr = "00";
			if (tokeni.length > 1)
				adr = tokeni[1].substring(4, 6);
			int a = Integer.parseInt(adr, 16);
			int i = 0;
			while (i < 8) {
				izlaz[w - 8 + i] = ((a % 2) == 1);
				a /= 2;
				i++;
			}
		} else
			for (int i = 0; i < tokeni.length; i++)
				izlaz[Signali.valueOf(tokeni[i]).ordinal()] = true;
	}

	public int getValue(int i) {
		if (izlaz[i])
			return 1;
		return 0;
	}

}
