	package asm;

	import java.io.*;

	public class Tokenizer {
		BufferedReader in;

		public Tokenizer(String imeFajla) {
			try {
				in = new BufferedReader(new FileReader("infilename"));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		public Token dohvatiToken() {
			try {
				String linija = in.readLine();
				boolean b = true;
				linija = linija.trim();
				while(b)
				{
					String temp = linija.replaceAll("  ", " ");
					if(linija.equals(temp)) b=false;
					linija = temp;
				}
				linija = linija.replaceAll(" ,", ",");
				linija = linija.replaceAll(", ", ",");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return null;

		}

	}
