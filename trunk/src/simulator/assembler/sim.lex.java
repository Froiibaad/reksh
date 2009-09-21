package simulator.assembler;
import java_cup.runtime.*;


class Tokenizer implements java_cup.runtime.Scanner {
	private final int YY_BUFFER_SIZE = 512;
	private final int YY_F = -1;
	private final int YY_NO_STATE = -1;
	private final int YY_NOT_ACCEPT = 0;
	private final int YY_START = 1;
	private final int YY_END = 2;
	private final int YY_NO_ANCHOR = 4;
	private final int YY_BOL = 128;
	private final int YY_EOF = 129;

int getLine() {return yyline;}
	private java.io.BufferedReader yy_reader;
	private int yy_buffer_index;
	private int yy_buffer_read;
	private int yy_buffer_start;
	private int yy_buffer_end;
	private char yy_buffer[];
	private int yyline;
	private boolean yy_at_bol;
	private int yy_lexical_state;

	Tokenizer (java.io.Reader reader) {
		this ();
		if (null == reader) {
			throw (new Error("Error: Bad input stream initializer."));
		}
		yy_reader = new java.io.BufferedReader(reader);
	}

	Tokenizer (java.io.InputStream instream) {
		this ();
		if (null == instream) {
			throw (new Error("Error: Bad input stream initializer."));
		}
		yy_reader = new java.io.BufferedReader(new java.io.InputStreamReader(instream));
	}

	private Tokenizer () {
		yy_buffer = new char[YY_BUFFER_SIZE];
		yy_buffer_read = 0;
		yy_buffer_index = 0;
		yy_buffer_start = 0;
		yy_buffer_end = 0;
		yyline = 0;
		yy_at_bol = true;
		yy_lexical_state = YYINITIAL;
	}

	private boolean yy_eof_done = false;
	private final int YYINITIAL = 0;
	private final int COMMENT = 1;
	private final int yy_state_dtrans[] = {
		0,
		32
	};
	private void yybegin (int state) {
		yy_lexical_state = state;
	}
	private int yy_advance ()
		throws java.io.IOException {
		int next_read;
		int i;
		int j;

		if (yy_buffer_index < yy_buffer_read) {
			return yy_buffer[yy_buffer_index++];
		}

		if (0 != yy_buffer_start) {
			i = yy_buffer_start;
			j = 0;
			while (i < yy_buffer_read) {
				yy_buffer[j] = yy_buffer[i];
				++i;
				++j;
			}
			yy_buffer_end = yy_buffer_end - yy_buffer_start;
			yy_buffer_start = 0;
			yy_buffer_read = j;
			yy_buffer_index = j;
			next_read = yy_reader.read(yy_buffer,
					yy_buffer_read,
					yy_buffer.length - yy_buffer_read);
			if (-1 == next_read) {
				return YY_EOF;
			}
			yy_buffer_read = yy_buffer_read + next_read;
		}

		while (yy_buffer_index >= yy_buffer_read) {
			if (yy_buffer_index >= yy_buffer.length) {
				yy_buffer = yy_double(yy_buffer);
			}
			next_read = yy_reader.read(yy_buffer,
					yy_buffer_read,
					yy_buffer.length - yy_buffer_read);
			if (-1 == next_read) {
				return YY_EOF;
			}
			yy_buffer_read = yy_buffer_read + next_read;
		}
		return yy_buffer[yy_buffer_index++];
	}
	private void yy_move_end () {
		if (yy_buffer_end > yy_buffer_start &&
		    '\n' == yy_buffer[yy_buffer_end-1])
			yy_buffer_end--;
		if (yy_buffer_end > yy_buffer_start &&
		    '\r' == yy_buffer[yy_buffer_end-1])
			yy_buffer_end--;
	}
	private boolean yy_last_was_cr=false;
	private void yy_mark_start () {
		int i;
		for (i = yy_buffer_start; i < yy_buffer_index; ++i) {
			if ('\n' == yy_buffer[i] && !yy_last_was_cr) {
				++yyline;
			}
			if ('\r' == yy_buffer[i]) {
				++yyline;
				yy_last_was_cr=true;
			} else yy_last_was_cr=false;
		}
		yy_buffer_start = yy_buffer_index;
	}
	private void yy_mark_end () {
		yy_buffer_end = yy_buffer_index;
	}
	private void yy_to_mark () {
		yy_buffer_index = yy_buffer_end;
		yy_at_bol = (yy_buffer_end > yy_buffer_start) &&
		            ('\r' == yy_buffer[yy_buffer_end-1] ||
		             '\n' == yy_buffer[yy_buffer_end-1] ||
		             2028/*LS*/ == yy_buffer[yy_buffer_end-1] ||
		             2029/*PS*/ == yy_buffer[yy_buffer_end-1]);
	}
	private java.lang.String yytext () {
		return (new java.lang.String(yy_buffer,
			yy_buffer_start,
			yy_buffer_end - yy_buffer_start));
	}
	private int yylength () {
		return yy_buffer_end - yy_buffer_start;
	}
	private char[] yy_double (char buf[]) {
		int i;
		char newbuf[];
		newbuf = new char[2*buf.length];
		for (i = 0; i < buf.length; ++i) {
			newbuf[i] = buf[i];
		}
		return newbuf;
	}
	private final int YY_E_INTERNAL = 0;
	private final int YY_E_MATCH = 1;
	private java.lang.String yy_error_string[] = {
		"Error: Internal error.\n",
		"Error: Unmatched input.\n"
	};
	private void yy_error (int code,boolean fatal) {
		java.lang.System.out.print(yy_error_string[code]);
		java.lang.System.out.flush();
		if (fatal) {
			throw new Error("Fatal Error.\n");
		}
	}
	private int[][] unpackFromString(int size1, int size2, String st) {
		int colonIndex = -1;
		String lengthString;
		int sequenceLength = 0;
		int sequenceInteger = 0;

		int commaIndex;
		String workString;

		int res[][] = new int[size1][size2];
		for (int i= 0; i < size1; i++) {
			for (int j= 0; j < size2; j++) {
				if (sequenceLength != 0) {
					res[i][j] = sequenceInteger;
					sequenceLength--;
					continue;
				}
				commaIndex = st.indexOf(',');
				workString = (commaIndex==-1) ? st :
					st.substring(0, commaIndex);
				st = st.substring(commaIndex+1);
				colonIndex = workString.indexOf(':');
				if (colonIndex == -1) {
					res[i][j]=Integer.parseInt(workString);
					continue;
				}
				lengthString =
					workString.substring(colonIndex+1);
				sequenceLength=Integer.parseInt(lengthString);
				workString=workString.substring(0,colonIndex);
				sequenceInteger=Integer.parseInt(workString);
				res[i][j] = sequenceInteger;
				sequenceLength--;
			}
		}
		return res;
	}
	private int yy_acpt[] = {
		/* 0 */ YY_NOT_ACCEPT,
		/* 1 */ YY_NO_ANCHOR,
		/* 2 */ YY_NO_ANCHOR,
		/* 3 */ YY_NO_ANCHOR,
		/* 4 */ YY_NO_ANCHOR,
		/* 5 */ YY_NO_ANCHOR,
		/* 6 */ YY_NO_ANCHOR,
		/* 7 */ YY_NO_ANCHOR,
		/* 8 */ YY_NO_ANCHOR,
		/* 9 */ YY_NO_ANCHOR,
		/* 10 */ YY_NO_ANCHOR,
		/* 11 */ YY_NO_ANCHOR,
		/* 12 */ YY_NO_ANCHOR,
		/* 13 */ YY_NO_ANCHOR,
		/* 14 */ YY_NO_ANCHOR,
		/* 15 */ YY_NO_ANCHOR,
		/* 16 */ YY_NO_ANCHOR,
		/* 17 */ YY_NO_ANCHOR,
		/* 18 */ YY_NO_ANCHOR,
		/* 19 */ YY_NO_ANCHOR,
		/* 20 */ YY_NO_ANCHOR,
		/* 21 */ YY_NO_ANCHOR,
		/* 22 */ YY_NO_ANCHOR,
		/* 23 */ YY_NO_ANCHOR,
		/* 24 */ YY_NO_ANCHOR,
		/* 25 */ YY_NO_ANCHOR,
		/* 26 */ YY_NOT_ACCEPT,
		/* 27 */ YY_NO_ANCHOR,
		/* 28 */ YY_NO_ANCHOR,
		/* 29 */ YY_NO_ANCHOR,
		/* 30 */ YY_NOT_ACCEPT,
		/* 31 */ YY_NO_ANCHOR,
		/* 32 */ YY_NOT_ACCEPT,
		/* 33 */ YY_NO_ANCHOR,
		/* 34 */ YY_NOT_ACCEPT,
		/* 35 */ YY_NO_ANCHOR,
		/* 36 */ YY_NO_ANCHOR,
		/* 37 */ YY_NO_ANCHOR,
		/* 38 */ YY_NO_ANCHOR,
		/* 39 */ YY_NO_ANCHOR,
		/* 40 */ YY_NO_ANCHOR,
		/* 41 */ YY_NO_ANCHOR,
		/* 42 */ YY_NO_ANCHOR,
		/* 43 */ YY_NO_ANCHOR,
		/* 44 */ YY_NO_ANCHOR,
		/* 45 */ YY_NO_ANCHOR,
		/* 46 */ YY_NO_ANCHOR,
		/* 47 */ YY_NO_ANCHOR,
		/* 48 */ YY_NO_ANCHOR,
		/* 49 */ YY_NO_ANCHOR,
		/* 50 */ YY_NO_ANCHOR,
		/* 51 */ YY_NO_ANCHOR,
		/* 52 */ YY_NO_ANCHOR,
		/* 53 */ YY_NO_ANCHOR,
		/* 54 */ YY_NO_ANCHOR,
		/* 55 */ YY_NO_ANCHOR,
		/* 56 */ YY_NO_ANCHOR,
		/* 57 */ YY_NO_ANCHOR,
		/* 58 */ YY_NO_ANCHOR,
		/* 59 */ YY_NO_ANCHOR,
		/* 60 */ YY_NO_ANCHOR,
		/* 61 */ YY_NO_ANCHOR,
		/* 62 */ YY_NO_ANCHOR,
		/* 63 */ YY_NO_ANCHOR,
		/* 64 */ YY_NO_ANCHOR,
		/* 65 */ YY_NO_ANCHOR,
		/* 66 */ YY_NO_ANCHOR,
		/* 67 */ YY_NO_ANCHOR,
		/* 68 */ YY_NO_ANCHOR,
		/* 69 */ YY_NO_ANCHOR,
		/* 70 */ YY_NO_ANCHOR,
		/* 71 */ YY_NO_ANCHOR,
		/* 72 */ YY_NO_ANCHOR,
		/* 73 */ YY_NO_ANCHOR,
		/* 74 */ YY_NO_ANCHOR,
		/* 75 */ YY_NO_ANCHOR,
		/* 76 */ YY_NO_ANCHOR,
		/* 77 */ YY_NO_ANCHOR,
		/* 78 */ YY_NO_ANCHOR,
		/* 79 */ YY_NO_ANCHOR,
		/* 80 */ YY_NO_ANCHOR,
		/* 81 */ YY_NO_ANCHOR,
		/* 82 */ YY_NO_ANCHOR,
		/* 83 */ YY_NO_ANCHOR,
		/* 84 */ YY_NO_ANCHOR,
		/* 85 */ YY_NO_ANCHOR,
		/* 86 */ YY_NO_ANCHOR,
		/* 87 */ YY_NO_ANCHOR,
		/* 88 */ YY_NO_ANCHOR,
		/* 89 */ YY_NO_ANCHOR,
		/* 90 */ YY_NO_ANCHOR,
		/* 91 */ YY_NO_ANCHOR
	};
	private int yy_cmap[] = unpackFromString(1,130,
"53:8,1:2,3,53,1,2,53:18,1,53:2,46,53:4,44,45,53:3,50,53:2,40:4,48:6,41,52,5" +
"3:5,22,47:2,10,9,38,36,34,7,28,47,20,30,8,21,11,47,4,6,5,47:3,23,47,29,42,5" +
"3,43,53,49,53,26,51:2,18,17,39,37,35,15,31,47,24,33,16,25,19,47,12,14,13,47" +
":3,27,47,32,53,51,53:3,0:2")[0];

	private int yy_rmap[] = unpackFromString(1,92,
"0,1:2,2,3,1:8,4:2,1,4,5,4:6,1:2,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21" +
",22,23,24,25,26,27,28,29,30,5,9,31,32,33,34,35,36,37,38,39,40,41,42,43,44,4" +
"5,46,47,48,49,50,51,52,53,4,54,55,56,57,58,59,53:2,60,4,61,62,53,63,64")[0];

	private int yy_nxt[][] = unpackFromString(65,54,
"1,2,26,-1,3,27,85,58,86:2,60,86,57,87,88,61,86,89,62,86,63,64,65,66,67,68,6" +
"9,70,31,86:2,33,86:2,90,91,86:3,89,4,5,6,7,8,9,10,86,4,11,28,89,12,11,-1:58" +
",86,35,86:34,13,-1:6,86:3,-1,86,-1:19,30:2,-1:7,30,-1:7,15:2,-1:3,30,4,-1:7" +
",4,-1:2,30,-1:6,86:37,-1:6,86:3,-1,86,-1:6,86:5,16:2,86:30,-1:6,86:3,-1,86," +
"-1:5,2,-1:54,71,86:36,-1:6,86:3,-1,86,-1:19,30:2,-1:7,30,-1:12,30,4,-1:7,4," +
"-1:2,30,-1:6,86:13,19:2,86:22,-1:6,86:3,-1,86,-1:19,30:2,-1:7,30,-1:7,15:2," +
"-1:3,30:2,-1:7,30,-1:2,30,-1:6,86:2,47,86:22,14,48,86:10,-1:6,86:3,-1,86,-1" +
":2,1,24,34,-1,24:50,-1:4,86:10,49,86:17,14,50,86:7,-1:6,86:3,-1,86,-1:5,25," +
"-1:54,86:2,16:2,86:33,-1:6,86:3,-1,86,-1:6,86,17,86:35,-1:6,86:3,-1,86,-1:6" +
",86:34,18,86:2,-1:6,86:3,-1,86,-1:6,86:10,19:2,86:25,-1:6,86:3,-1,86,-1:6,8" +
"6:9,29,86:27,-1:6,86:3,-1,86,-1:6,86:13,75:2,86:7,75,86:7,76:2,86:3,83,75,-" +
"1:6,86,75,86,-1,75,-1:6,20,86:36,-1:6,86:3,-1,86,-1:6,86:32,21,86:4,-1:6,86" +
":3,-1,86,-1:6,86:6,20,86:30,-1:6,86:3,-1,86,-1:6,86:8,22,86:28,-1:6,86:3,-1" +
",86,-1:6,86:33,21,86:3,-1:6,86:3,-1,86,-1:6,86:13,75,84,86:7,75,86:7,76:2,8" +
"6:3,75:2,-1:6,86,75,86,-1,75,-1:6,14,86:36,-1:6,86:3,-1,86,-1:6,86:7,14,86:" +
"29,-1:6,86:3,-1,86,-1:6,86:8,14,86:28,-1:6,86:3,-1,86,-1:6,86:15,14,86:21,-" +
"1:6,86:3,-1,86,-1:6,86,23,86:35,-1:6,86:3,-1,86,-1:6,86:9,23,86:27,-1:6,86:" +
"3,-1,86,-1:6,86:5,20,86:31,-1:6,86:3,-1,86,-1:6,86:13,22,86:23,-1:6,86:3,-1" +
",86,-1:6,86:9,38,86:26,13,-1:6,86:3,-1,86,-1:6,86:4,36,86:32,-1:6,86:3,-1,8" +
"6,-1:6,86:14,22,86:22,-1:6,86:3,-1,86,-1:6,86:5,37,86:31,-1:6,86:3,-1,86,-1" +
":6,86:12,39,86:24,-1:6,86:3,-1,86,-1:6,86:13,40,75,86:7,75,86:7,76:2,86:3,7" +
"5:2,-1:6,86,75,86,-1,75,-1:6,86:2,41,86:14,77,86:19,-1:6,86:3,-1,86,-1:6,42" +
",86:36,-1:6,86:3,-1,86,-1:6,86:6,43,86:30,-1:6,86:3,-1,86,-1:6,86:17,41,86:" +
"19,-1:6,86:3,-1,86,-1:6,86:10,44,86:10,78,86:15,-1:6,86:3,-1,86,-1:6,86:8,4" +
"5,86:28,-1:6,86:3,-1,86,-1:6,86:13,75,46,86:7,75,86:7,76:2,86:3,75:2,-1:6,8" +
"6,75,86,-1,75,-1:6,86:21,44,86:15,-1:6,86:3,-1,86,-1:6,86:7,51,86:29,-1:6,8" +
"6:3,-1,86,-1:6,86:17,81,86:19,-1:6,86:3,-1,86,-1:6,86:15,52,86:21,-1:6,86:3" +
",-1,86,-1:6,86:21,82,86:15,-1:6,86:3,-1,86,-1:6,86:13,75:2,86:7,75,86:7,76:" +
"2,86:3,75:2,-1:6,86,75,86,-1,75,-1:6,86:18,43,86:18,-1:6,86:3,-1,86,-1:6,86" +
":22,59,86:14,-1:6,86:3,-1,86,-1:6,86:16,53,86:20,-1:6,86:3,-1,86,-1:6,86:20" +
",54,86:16,-1:6,86:3,-1,86,-1:6,55,86:36,-1:6,86:3,-1,86,-1:6,86:8,56,86:28," +
"-1:6,86:3,-1,86,-1:6,86,72,86:35,-1:6,86:3,-1,86,-1:6,86:8,73,86:28,-1:6,86" +
":3,-1,86,-1:6,86:9,74,86:27,-1:6,86:3,-1,86,-1:6,86:18,79,86:18,-1:6,86:3,-" +
"1,86,-1:6,86:22,80,86:14,-1:6,86:3,-1,86,-1:2");

	public java_cup.runtime.Symbol next_token ()
		throws java.io.IOException {
		int yy_lookahead;
		int yy_anchor = YY_NO_ANCHOR;
		int yy_state = yy_state_dtrans[yy_lexical_state];
		int yy_next_state = YY_NO_STATE;
		int yy_last_accept_state = YY_NO_STATE;
		boolean yy_initial = true;
		int yy_this_accept;

		yy_mark_start();
		yy_this_accept = yy_acpt[yy_state];
		if (YY_NOT_ACCEPT != yy_this_accept) {
			yy_last_accept_state = yy_state;
			yy_mark_end();
		}
		while (true) {
			if (yy_initial && yy_at_bol) yy_lookahead = YY_BOL;
			else yy_lookahead = yy_advance();
			yy_next_state = YY_F;
			yy_next_state = yy_nxt[yy_rmap[yy_state]][yy_cmap[yy_lookahead]];
			if (YY_EOF == yy_lookahead && true == yy_initial) {

return (new Symbol(sym.EOF));
			}
			if (YY_F != yy_next_state) {
				yy_state = yy_next_state;
				yy_initial = false;
				yy_this_accept = yy_acpt[yy_state];
				if (YY_NOT_ACCEPT != yy_this_accept) {
					yy_last_accept_state = yy_state;
					yy_mark_end();
				}
			}
			else {
				if (YY_NO_STATE == yy_last_accept_state) {
					throw (new Error("Lexical Error: Unmatched Input."));
				}
				else {
					yy_anchor = yy_acpt[yy_last_accept_state];
					if (0 != (YY_END & yy_anchor)) {
						yy_move_end();
					}
					yy_to_mark();
					switch (yy_last_accept_state) {
					case 1:

					case -2:
						break;
					case 2:
						{}
					case -3:
						break;
					case 3:
						{return new Symbol(sym.IDENT, yytext());}
					case -4:
						break;
					case 4:
						{return new Symbol(sym.NUMBER, new Integer(yytext()));}
					case -5:
						break;
					case 5:
						{return new Symbol(sym.COLON);}
					case -6:
						break;
					case 6:
						{return new Symbol(sym.LSQUARE);}
					case -7:
						break;
					case 7:
						{return new Symbol(sym.RSQUARE);}
					case -8:
						break;
					case 8:
						{return new Symbol(sym.LBRACE);}
					case -9:
						break;
					case 9:
						{return new Symbol(sym.RBRACE);}
					case -10:
						break;
					case 10:
						{return new Symbol(sym.HASH);}
					case -11:
						break;
					case 11:
						{return new Symbol(sym.INVALID, yytext());}
					case -12:
						break;
					case 12:
						{yybegin(COMMENT);}
					case -13:
						break;
					case 13:
						{return new Symbol(sym.REG, new Integer(yytext().substring(1)) );}
					case -14:
						break;
					case 14:
						{return new Symbol(sym.INS_JUMP, yytext().toUpperCase());}
					case -15:
						break;
					case 15:
						{String str = yytext(); str = str.substring(0, str.length()-1);
                                           return new Symbol(sym.NUMBER, new Integer( Integer.parseInt(str, 16) ));
                                          }
					case -16:
						break;
					case 16:
						{return new Symbol(sym.INS_A0, yytext());}
					case -17:
						break;
					case 17:
						{return new Symbol(sym.INS_INT, yytext().toUpperCase());}
					case -18:
						break;
					case 18:
						{return new Symbol(sym.DEF);}
					case -19:
						break;
					case 19:
						{return new Symbol(sym.INS_A0, yytext().toUpperCase());}
					case -20:
						break;
					case 20:
						{return new Symbol(sym.INS_A1, yytext());}
					case -21:
						break;
					case 21:
						{return new Symbol(sym.ORG);}
					case -22:
						break;
					case 22:
						{return new Symbol(sym.INS_A1, yytext().toUpperCase());}
					case -23:
						break;
					case 23:
						{return new Symbol(sym.INS_HALT, yytext().toUpperCase());}
					case -24:
						break;
					case 24:
						{}
					case -25:
						break;
					case 25:
						{yybegin(YYINITIAL);}
					case -26:
						break;
					case 27:
						{return new Symbol(sym.IDENT, yytext());}
					case -27:
						break;
					case 28:
						{return new Symbol(sym.INVALID, yytext());}
					case -28:
						break;
					case 29:
						{return new Symbol(sym.INS_INT, yytext().toUpperCase());}
					case -29:
						break;
					case 31:
						{return new Symbol(sym.IDENT, yytext());}
					case -30:
						break;
					case 33:
						{return new Symbol(sym.IDENT, yytext());}
					case -31:
						break;
					case 35:
						{return new Symbol(sym.IDENT, yytext());}
					case -32:
						break;
					case 36:
						{return new Symbol(sym.IDENT, yytext());}
					case -33:
						break;
					case 37:
						{return new Symbol(sym.IDENT, yytext());}
					case -34:
						break;
					case 38:
						{return new Symbol(sym.IDENT, yytext());}
					case -35:
						break;
					case 39:
						{return new Symbol(sym.IDENT, yytext());}
					case -36:
						break;
					case 40:
						{return new Symbol(sym.IDENT, yytext());}
					case -37:
						break;
					case 41:
						{return new Symbol(sym.IDENT, yytext());}
					case -38:
						break;
					case 42:
						{return new Symbol(sym.IDENT, yytext());}
					case -39:
						break;
					case 43:
						{return new Symbol(sym.IDENT, yytext());}
					case -40:
						break;
					case 44:
						{return new Symbol(sym.IDENT, yytext());}
					case -41:
						break;
					case 45:
						{return new Symbol(sym.IDENT, yytext());}
					case -42:
						break;
					case 46:
						{return new Symbol(sym.IDENT, yytext());}
					case -43:
						break;
					case 47:
						{return new Symbol(sym.IDENT, yytext());}
					case -44:
						break;
					case 48:
						{return new Symbol(sym.IDENT, yytext());}
					case -45:
						break;
					case 49:
						{return new Symbol(sym.IDENT, yytext());}
					case -46:
						break;
					case 50:
						{return new Symbol(sym.IDENT, yytext());}
					case -47:
						break;
					case 51:
						{return new Symbol(sym.IDENT, yytext());}
					case -48:
						break;
					case 52:
						{return new Symbol(sym.IDENT, yytext());}
					case -49:
						break;
					case 53:
						{return new Symbol(sym.IDENT, yytext());}
					case -50:
						break;
					case 54:
						{return new Symbol(sym.IDENT, yytext());}
					case -51:
						break;
					case 55:
						{return new Symbol(sym.IDENT, yytext());}
					case -52:
						break;
					case 56:
						{return new Symbol(sym.IDENT, yytext());}
					case -53:
						break;
					case 57:
						{return new Symbol(sym.IDENT, yytext());}
					case -54:
						break;
					case 58:
						{return new Symbol(sym.IDENT, yytext());}
					case -55:
						break;
					case 59:
						{return new Symbol(sym.IDENT, yytext());}
					case -56:
						break;
					case 60:
						{return new Symbol(sym.IDENT, yytext());}
					case -57:
						break;
					case 61:
						{return new Symbol(sym.IDENT, yytext());}
					case -58:
						break;
					case 62:
						{return new Symbol(sym.IDENT, yytext());}
					case -59:
						break;
					case 63:
						{return new Symbol(sym.IDENT, yytext());}
					case -60:
						break;
					case 64:
						{return new Symbol(sym.IDENT, yytext());}
					case -61:
						break;
					case 65:
						{return new Symbol(sym.IDENT, yytext());}
					case -62:
						break;
					case 66:
						{return new Symbol(sym.IDENT, yytext());}
					case -63:
						break;
					case 67:
						{return new Symbol(sym.IDENT, yytext());}
					case -64:
						break;
					case 68:
						{return new Symbol(sym.IDENT, yytext());}
					case -65:
						break;
					case 69:
						{return new Symbol(sym.IDENT, yytext());}
					case -66:
						break;
					case 70:
						{return new Symbol(sym.IDENT, yytext());}
					case -67:
						break;
					case 71:
						{return new Symbol(sym.IDENT, yytext());}
					case -68:
						break;
					case 72:
						{return new Symbol(sym.IDENT, yytext());}
					case -69:
						break;
					case 73:
						{return new Symbol(sym.IDENT, yytext());}
					case -70:
						break;
					case 74:
						{return new Symbol(sym.IDENT, yytext());}
					case -71:
						break;
					case 75:
						{return new Symbol(sym.IDENT, yytext());}
					case -72:
						break;
					case 76:
						{return new Symbol(sym.IDENT, yytext());}
					case -73:
						break;
					case 77:
						{return new Symbol(sym.IDENT, yytext());}
					case -74:
						break;
					case 78:
						{return new Symbol(sym.IDENT, yytext());}
					case -75:
						break;
					case 79:
						{return new Symbol(sym.IDENT, yytext());}
					case -76:
						break;
					case 80:
						{return new Symbol(sym.IDENT, yytext());}
					case -77:
						break;
					case 81:
						{return new Symbol(sym.IDENT, yytext());}
					case -78:
						break;
					case 82:
						{return new Symbol(sym.IDENT, yytext());}
					case -79:
						break;
					case 83:
						{return new Symbol(sym.DEF);}
					case -80:
						break;
					case 84:
						{return new Symbol(sym.INS_A1, yytext().toUpperCase());}
					case -81:
						break;
					case 85:
						{return new Symbol(sym.IDENT, yytext());}
					case -82:
						break;
					case 86:
						{return new Symbol(sym.IDENT, yytext());}
					case -83:
						break;
					case 87:
						{return new Symbol(sym.IDENT, yytext());}
					case -84:
						break;
					case 88:
						{return new Symbol(sym.IDENT, yytext());}
					case -85:
						break;
					case 89:
						{return new Symbol(sym.IDENT, yytext());}
					case -86:
						break;
					case 90:
						{return new Symbol(sym.IDENT, yytext());}
					case -87:
						break;
					case 91:
						{return new Symbol(sym.IDENT, yytext());}
					case -88:
						break;
					default:
						yy_error(YY_E_INTERNAL,false);
					case -1:
					}
					yy_initial = true;
					yy_state = yy_state_dtrans[yy_lexical_state];
					yy_next_state = YY_NO_STATE;
					yy_last_accept_state = YY_NO_STATE;
					yy_mark_start();
					yy_this_accept = yy_acpt[yy_state];
					if (YY_NOT_ACCEPT != yy_this_accept) {
						yy_last_accept_state = yy_state;
						yy_mark_end();
					}
				}
			}
		}
	}
}
