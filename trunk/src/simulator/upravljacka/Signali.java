package simulator.upravljacka;

public enum Signali {
	UpSignal, MARmp, MARin, ALUincX, ALUM3out, M3M1out, PCin, read, MBRM1out, IR1in, IR2in, IR3in, IR4in,
	ALUdecX, TEMPcl, IRRin, TEMPout, REGout, YselM1, Yin, IR3M2out, M2M1out, TEMPinLOW,
	TEMPswap, IR4M2out, TEMP2inLOW, ALUincY, ALUM2out, TEMP2swap, TEMP2out, TEMP2in, YsignEx,
	M1M2out, ALUadd, TEMP2mp, YselM3, regsel2, ALUop, PCM2out, REGBUSsel, REGin, PSWupdateNZCV,
	TEMPin, ALUtransY, SPout, ALUdecY, YselM2, MBRin, SPin, ALUtransX, IR2M2out, PCM3out, PSWin, PSWupdateT,
	M1M3out, ALUmp, write, IADDRout, PSWM3out, intack, PSWinta, bruncnd, brilop, brl1,
	brl2, brl3, briladr, brcaseadr, brMEMINDIR, brINTERRUPT, brcaseop, brZ, brcasestore;
}
