	package asm;

	import java.io.*;

	public class Tokenizer {
		BufferedReader in;

		public Tokenizer(String imeFajla) {
			try {
				in = new BufferedReader(new FileReader(imeFajla));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		public Token dohvatiToken() {
			Token tok=null;
			try {
				String linija = in.readLine();
				boolean b = true;
				linija = linija.trim();
				linija = linija.replaceAll("\t", " ");
				while(b)
				{
					String temp = linija.replaceAll("  ", " ");
					if(linija.equals(temp)) b=false;
					linija = temp;
				}
				linija = linija.replaceAll(" ,", ",");
				linija = linija.replaceAll(", ", ",");
				linija = (linija.split(";"))[0];
				
				if (linija.length() < 3) return this.dohvatiToken();
	
				String[] temp = linija.split(":");
				String labela = null, adrPolje = null;

				if (temp.length > 1) {
					labela = temp[0];
					linija = temp[1];
					linija = linija.trim();
				}
				
				temp = linija.split(" ");
				if (temp.length > 1)
				{
					adrPolje = temp[1];
					linija = temp[0];
				}
				
				Instrukcija instr = null;
				try
				{
				instr = BezadresnaInstrukcija.valueOf(linija.toUpperCase());
				}
				catch(Exception e)
				{
					try
					{
					instr = JednoadresnaInstrukcija.valueOf(linija.toUpperCase());
					}
					catch(Exception d)
					{
						
						try
						{
							instr = DvoadresnaInstrukcija.valueOf(linija.toUpperCase());
						}
						catch(Exception c)
						{
							instr = Direktiva.valueOf(linija.toUpperCase());
						}
					}
				}
				tok = new Token (labela, instr, adrPolje);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return tok;

		}
		public static void main(String[] args)
		{
			
			 Token t = new Tokenizer("asm.asm").dohvatiToken();
			 System.out.println(t.getInstrukcija().getClass().getName());
		}
	}
	
