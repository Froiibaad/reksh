package simulator;

import simulator.elements.*;

/**
 * Ova klasa definise kako je ceo sistem sastavljen od elemenata i povezan.
 * Njenom izmenom moze se dobiti potpuno drugaciji simulator, sa istim
 * korisnickim interfejsom.
 * 
 */
public class Initializator {

////////////////////////////////////////////////////////////////////////////////
//  REGISTRI
////////////////////////////////////////////////////////////////////////////////
    //PC
	public Register16 PC = new Register16("PC");
	public BusIn16 PCM2 = new BusIn16("PCM2");
	public BusIn16 PCM3 = new BusIn16("PCM3");
	
    //MBR
	public Register8 MBR = new Register8("MBR");
	public BusIn16 MBRM1 = new BusIn16("MBRM1");
	public BusIn16 MBRM2 = new BusIn16("MBRM2");
	public BusIn16 MBRM3 = new BusIn16("MBRM3");

    //MAR 
    public Register16 MAR = new Register16("MAR");
    public MuxBus16 MARmp = new MuxBus16("MARmp");
    public BusIn16 MARM1 = new BusIn16("MARM1");

    //IVTP
    public Register16 IVTP = new Register16("IVTP");
    public BusIn16 IVTPM2 = new BusIn16("IVTPM2");
	public BusIn16 IVTPM3 = new BusIn16("IVTPM3");

    //IR1
    public Register8 IR1 = new Register8("IR1");
    public BusIn16 IR1M2 = new BusIn16("IR1M2");
	public BusIn16 IR1M3 = new BusIn16("IR1M3");
    
    //IR2
    public Register8 IR2 = new Register8("IR2");
    public BusIn16 IR2M2 = new BusIn16("IR2M2");
	public BusIn16 IR2M3 = new BusIn16("IR2M3");
    
    //IR3
    public Register8 IR3 = new Register8("IR3");
    public BusIn16 IR3M2 = new BusIn16("IR3M2");
	public BusIn16 IR3M3 = new BusIn16("IR3M3");
    
    //IR4
    public Register8 IR4 = new Register8("IR4");
    public BusIn16 IR4M2 = new BusIn16("IR4M2");
	public BusIn16 IR4M3 = new BusIn16("IR4M3");

    //Y
    public Register16 Y = new Register16("Y");
    
    //TEMP
    public Register16 TEMP = new Register16("TEMP");
    public BusIn16 TEMPM1 = new BusIn16("TEMPM1");
    
    //TEMP2
    public Register16 TEMP2 = new Register16("TEMP2");
    public MuxBus16 TEMP2mp = new MuxBus16 ("TEMP2mp");
    public BusIn16 TEMP2M1 = new BusIn16 ("TEMP2M1");
    
    //IRR
    public Register16 IRR = new Register16 ("IRR");
    public BusIn16 IRRM1 = new BusIn16 ("IRRM1");
    
    
    //Registarski fajl
    public And andLdAX = new And(2);
    public And andOutAX = new And(2);
    public Register16 AX = new Register16("AX");

    public And andLdBX = new And(2);
    public And andOutBX = new And(2);
    public Register16 BX = new Register16("BX");

    public And andLdCX = new And(2);
    public And andOutCX = new And(2);
    public Register16 CX = new Register16("CX");

    public And andLdDX = new And(2);
    public And andOutDX = new And(2);
    public Register16 DX = new Register16("DX");
    //TODO STRAHINJA DA ISPRAVI SLIKU 
    public And andLdSP = new And(2);
    public And andOutSP = new And(2);
    public Or orLdSP = new Or(2);
    public Or orOutSP = new Or(2);
    public Register16 SP = new Register16("SP");
    
    public And andLdSI= new And(2);
    public And andOutSI = new And(2);
    public Or orLdSI = new Or(2);
    public Or orOutSI = new Or(2);
    public Register16 SI = new Register16("SI");
    
    public And andLdBP = new And(2);
    public And andOutBP = new And(2);
    public Register16 BP = new Register16("BP");
    
    public And andLdDI = new And(2);
    public And andOutDI = new And(2);
    public Register16 DI = new Register16("DI");

    //Ulazni mux za registarski file
    public MuxBus16 REGBUS = new MuxBus16("REGBUS");

    public Not notIR10 = new Not();
    public Not notIR11 = new Not();

////////////////////////////////////////////////////////////////////////////////
//  ALU
////////////////////////////////////////////////////////////////////////////////
    //ALU
    public Alu alu = new Alu ();

    //signals
    public And andMovs = new And(2);
    public And andAdd = new And(2);
    public And andAnd = new And(2);
    public And andInc = new And(2);
    public And andDec = new And(2);
    public And andAsr = new And(2);
    public Or orAdd = new Or(2);
    public Or orIncY = new Or(2);
    public Or orDecY = new Or(2);
    public Or orTransY = new Or(2);
    
    //Mx and outs
    MuxBus16 mpAlu = new MuxBus16("ALUmp");
    BusIn16 ALUM2 = new BusIn16("ALUM2");
    BusIn16 ALUM3 = new BusIn16("ALUM3");
    
////////////////////////////////////////////////////////////////////////////////
//  PSW
////////////////////////////////////////////////////////////////////////////////
    //PSWN
    public Mux2b muxPSWN = new Mux2b();
    public SRff PSWN = new SRff();
    public And and1PSWN = new And(2);
    public And and2PSWN = new And(2);
    public Not notPSWN = new Not();

    //PSWZ
    public Mux2b muxPSWZ = new Mux2b();
    public SRff PSWZ = new SRff();
    public And and1PSWZ = new And(2);
    public And and2PSWZ = new And(2);
    public Not notPSWZ = new Not();

    //PSWC
    public Mux2b muxPSWC = new Mux2b();
    public SRff PSWC = new SRff();
    public And and1PSWC = new And(2);
    public And and2PSWC = new And(2);
    public Not notPSWC = new Not();

    //PSWV
    public Mux2b muxPSWV = new Mux2b();
    public SRff PSWV = new SRff();
    public And and1PSWV = new And(2);
    public And and2PSWV = new And(2);
    public Not notPSWV = new Not();
    
    //PSWI
    public Mux2b muxPSWI = new Mux2b();
    public SRff PSWI = new SRff();
    public And and1PSWI = new And(2);
    public And and2PSWI = new And(2);
    public Not notPSWI = new Not();

    //PSWT
    public Mux2b muxPSWT = new Mux2b();
    public SRff PSWT = new SRff();
    public And and1PSWT = new And(2);
    public And and2PSWT = new And(2);
    public Not notPSWT = new Not();

    //PSWL1
    public SRff PSWL1 = new SRff();

    //PSWL0
    public SRff PSWL0 = new SRff();

////////////////////////////////////////////////////////////////////////////////
//  Sign Ext
////////////////////////////////////////////////////////////////////////////////
    
    public BusIn16 YM1 = new BusIn16 ("YM1");
    public BusIn16 YM2 = new BusIn16 ("YM2");
    public BusIn16 YM3 = new BusIn16 ("YM3");
    public BusIn16 YM1Ex = new BusIn16 ("YM1Ex");
    public Bus16 signEx = new Bus16(4);
    
////////////////////////////////////////////////////////////////////////////////
//  KMPSW
////////////////////////////////////////////////////////////////////////////////
    //N ide direktno z15
    
    public Or orPswZ = new Or(16);
    public Not notPswZ = new Not();
    
    public And and1PswC = new And(2);
    public And and2PswC = new And(2);
    public Or or1PswC = new Or(2);
    public Or or2PswC = new Or(2);
    public Not notPswC = new Not();
    
    public And andIII1PswV = new And (3);
    public And andIII2PswV = new And (3);
    public And andIII3PswV = new And (3);
    public And andIII4PswV = new And (3);
    public And andII1PswV = new And (2);
    public Or orIIPswV = new Or (2);
    public Or orIIIPswV = new Or (3);
    public Not not1PswV = new Not();
    public Not not2PswV = new Not();
    public Not not3PswV = new Not();
    public Not not4PswV = new Not();
    public Not not5PswV = new Not();
    
    
    
    
////////////////////////////////////////////////////////////////////////////////
//  Prekidi
////////////////////////////////////////////////////////////////////////////////
    public SRff intGen = new SRff (); // generator prekida
   
////////////////////////////////////////////////////////////////////////////////
//  Arbitracija
////////////////////////////////////////////////////////////////////////////////
    //Arbitrator
    public Buffer BGR0 = new Buffer();
    public Buffer BGR1 = new Buffer();
    public Buffer BREQ0 = new Buffer();
    public Buffer BREQ1 = new Buffer();
    public Coder4 arbCoder = new Coder4();
    public Decoder4 arbDecoder = new Decoder4();

    //Arbitracija u procesoru
    public BusIn busyBuss = new BusIn("CPUBusyBuss");
    public SRff busySet = new SRff ();
    public Or readorwrite =  new Or (2);
    public Buffer BGR = new Buffer();
    public And BGRandBusyBus = new And (2);

////////////////////////////////////////////////////////////////////////////////
//  Upravljacka
////////////////////////////////////////////////////////////////////////////////
    //Generisanje vrednosti brojaca koraka
    //Instrukcije RTI, RTS, INTE, INTD, TRPE, TRPD, JZ, JMP, INT, JSR, LOAD, ALUOP, STORE, HALT
    public int[] nizInstrukcija = {0x25, 0x29, 0x30, 0x31, 0x32, 0x33, 0x34,
                                  0x35, 0x36, 0x37, 0x4D, 0x4D, 0x50, 0x59};
    public NumGen kmoper = new NumGen(nizInstrukcija);
    //Adresiranja IMM, REGDIR, RELATIV, MEMDIR, MEMIND
    public int[] nizAdresiranja = {0x11, 0x12, 0x13, 0x18, 0x19};
    public NumGen kmadr = new NumGen(nizAdresiranja);
    //Skokovi val00, ..., val57
    public int[] nizSkokova = {0x00, 0x06, 0x0F, 0x17, 0x20, 0x24, 0x37, 0x4C,
                              0x52, 0x54, 0x57};
    public NumGen kmbr = new NumGen(nizSkokova);
    //MUX
    public Mux4 ctrlMux = new Mux4();

    //Brojac i dekoder
    public Counter cnt = new Counter();
    public And cntLd = new And(2);
    public And cntInc = new And(2);
    public Not cntIncNot = new Not();
    public Or cntBranch = new Or(3);
    public Decoder256 ctrlDec = new Decoder256();

    //Generisanje uslova
    //notIRs
    public Not notIR0 = new Not();
    public Not notIR1 = new Not();
    public Not notIR2 = new Not();
    public Not notIR3 = new Not();
    public Not notIR4 = new Not();
    public Not notIR5 = new Not();
    public Not notIR6 = new Not();
    public Not notIR7 = new Not();
    //Instructions
    public And RTI = new And(8);
    public And RTS = new And(8);
    public And INTE = new And(8);
    public And INTD = new And(8);
    public And TRPE = new And(8);
    public And TRPD = new And(8);
    public And HALT = new And(8);
    public And JZ = new And(8);
    public And JMP = new And(8);
    public And JSR = new And(8);
    public And INT = new And(8);
    public And LOAD = new And(5);
    public And STORE = new And(5);
    public And ADD = new And(5);
    public And XOR = new And(5);
    public And LSR = new And(5);
    public Or ALUOP = new Or(3);
    //Address modes
    public And IMM = new And(4);
    public And REGDIR = new And(2);
    public And RELATIV = new And(4);
    public And MEMDIR = new And(4);
    public And MEMIND = new And(4);
    //notBADCODE, L1, L2, ADRLESS, notIMM, notREGDIR
    public Or notBADCODE = new Or(16);
    public Not notREGDIR = new Not();
    public Not notIMM = new Not();
    public Not ADRLESS = new Not();
    public And andL1 = new And(2);
    public Or L1 = new Or(2);
    public Or L2 = new Or(2);
    //ADDC, PSWZ, MASK, INTR
    public Not notADDC = new Not();
    //public Not notPSWZ = new Not();
    public Not notMASK = new Not();
    public Not notINTR = new Not();

    //Generisanje upravljackih signala upravljacke jedinice
    //uslovni skokovi
    public Buffer brnotBADCODE = new Buffer();
    public Buffer brL1 = new Buffer();
    public Buffer brL2 = new Buffer();
    public Buffer brADRLESS = new Buffer();
    public Buffer brnotADDC = new Buffer();
    public Buffer brSTORE = new Buffer();
    public Buffer brnotPSWZ = new Buffer();
    public Buffer brJSR = new Buffer();
    public Buffer brnotMASK = new Buffer();
    public Buffer brnotIMM = new Buffer();
    public Buffer brnotREGDIR = new Buffer();
    public Buffer brnotINTR = new Buffer();
    //bezuslovni skok
    public Or bruncond = new Or(18);
    //branch
    public And andBr1 = new And(2);
    public And andBr2 = new And(2);
    public And andBr3 = new And(2);
    public And andBr4 = new And(2);
    public And andBr5 = new And(2);
    public And andBr6 = new And(2);
    public And andBr7 = new And(2);
    public And andBr8 = new And(2);
    public And andBr9 = new And(2);
    public And andBr10 = new And(2);
    public And andBr11 = new And(2);
    public And andBr12 = new And(2);
    public Or branch = new Or(13);
    //visestruki uslovni skokovi
    public Buffer broper = new Buffer();
    public Buffer bradr = new Buffer();
    //adrese skoka
    public Or val00 = new Or(3);
    public Buffer val06 = new Buffer();
    public Or val0F = new Or(2);
    public Buffer val17 = new Buffer();
    public Or val20 = new Or(2);
    public Or val24 = new Or(4);
    public Buffer val37 = new Buffer();
    public Buffer val4C = new Buffer();
    public Buffer val52 = new Buffer();
    public Buffer val54 = new Buffer();
    public Or val57 = new Or(13);

    //Generisanje upravljackih signala operacione jedinice
    public Or ldMAR = new Or(14);
    public Or incPC = new Or(3);
    public Or clMBR = new Or(13);
    public Or read = new Or(11);
    public Or wmfc = new Or(15);
    public Buffer ldIR1 = new Buffer();
    public Buffer ldIR2 = new Buffer();
    public Buffer ldIR3 = new Buffer();
    public Buffer setCINTR = new Buffer();
    public Or mxB1 = new Or(3);
    public Or ldB = new Or(6);
    public Or mxX0 = new Or(2);
    public Or ldX = new Or(3);
    public Or mxY0 = new Or(2);
    public Or ldY = new Or(4);
    public Or ALUadd = new Or(2);
    public Or ldZL = new Or(4);
    public Or ldZH = new Or(2);
    public Buffer ldADDC = new Buffer();
    public Or setAINTR = new Or(2);
    public Or mxMAR1 = new Or(3);
    public Or mxMAR0 = new Or(4);
    public Or incMAR = new Or(2);
    public Or mxB0 = new Or(3);
    public Or mxMAR2 = new Or(6);
    public Or decSP = new Or(4);
    public Buffer ldPSW = new Buffer();
    public Or mxPC = new Or(4);
    public Or ldPCL = new Or(4);
    public Or ldPCH = new Or(4);
    public Or it = new Or(2);
    public Or ldI = new Or(3);
    public Or ldT = new Or(3);
    public Or incSP = new Or(3);
    public Or mxMBR1 = new Or(2);
    public Or ldMBR = new Or(4);
    public Or write = new Or(4);
    public Or mxMBR0 = new Or(2);
    public Buffer mxMBR2 = new Buffer();
    public Buffer ALUshl = new Buffer();
    public Buffer mxY1 = new Buffer();
    public Buffer mxX1 = new Buffer();
    public Buffer mxADD = new Buffer();
    public Buffer ldL1L0 = new Buffer();
    public Buffer ALUop = new Buffer();
    public Buffer ldNZCV = new Buffer();
    public Buffer ldA = new Buffer();
    public Buffer REGin = new Buffer();
    public Buffer inta = new Buffer();
    public Buffer halt = new Buffer();



////////////////////////////////////////////////////////////////////////////////
//  Memory
////////////////////////////////////////////////////////////////////////////////
    public Memory Mem = new Memory ();

////////////////////////////////////////////////////////////////////////////////
//  Magistrale
////////////////////////////////////////////////////////////////////////////////
    public Bus16 ABUS = new Bus16(2);
    public Bus8 DBUS = new Bus8(2);
    public Bus1 WRBUS = new Bus1(1);
    public Bus1 BUSYBUS = new Bus1(1);
    public Bus16 M1 = new Bus16(8);
    public Bus16 M2 = new Bus16(10);
    public Bus16 M3 = new Bus16(10);

////////////////////////////////////////////////////////////////////////////////
//  PRESPAJACI	
////////////////////////////////////////////////////////////////////////////////
    public BusIn16 M1M2 = new BusIn16("M1M2");
    public BusIn16 M1M3 = new BusIn16("M1M3");
    public BusIn16 M3M1 = new BusIn16("M3M1");
    public BusIn16 M2M1 = new BusIn16("M2M1");
    
////////////////////////////////////////////////////////////////////////////////
//  Konstruktor
////////////////////////////////////////////////////////////////////////////////
    public Initializator() {
        //Nula za sve prazne ulaze
        Const nula = new Const(0);
        //Jedan za sve stalno aktivne ulaze
        Const jedan = new Const(1);
        
////////////////////////////////////////////////////////////////////////////////
//  PRESPAJANJE MAGISTRALA
////////////////////////////////////////////////////////////////////////////////
        M1M2.addInput16(M1, 0);
        M2.addInput16(M1M2, 0);
        
        M2M1.addInput16(M2, 0);
        M1.addInput16(M2M1, 0);
        
        M1M3.addInput16(M1, 0);
        M3.addInput16(M1M3, 0);
        
        M3M1.addInput16(M3, 0);
        M1.addInput16(M3M1, 0);
        
////////////////////////////////////////////////////////////////////////////////
//  REGISTRI
////////////////////////////////////////////////////////////////////////////////
        //PC
        PC.addInput16(M1, 0);
        PCM2.addInput16(PC, 0);
        PCM3.addInput16(PC, 0);
        M2.addInput16(PCM2, 0);
        M3.addInput16(PCM3, 0);
        
        
        //MBR
        MBR.addInput8(M1, 0);
        MBRM1.addInput8(MBR, 0);
        MBRM1.addInput8(nula, 0);
        MBRM2.addInput8(MBR, 0);
        MBRM2.addInput8(nula, 0);
        MBRM3.addInput8(MBR, 0);
        MBRM3.addInput8(nula, 0);
        M1.addInput16(MBRM1, 0);
        M2.addInput16(MBRM2, 0);
        M3.addInput16(MBRM3, 0);

        //MAR
        MARmp.addInput16(M1, 0);
        MARmp.addInput16(M2, 0);
        MAR.addInput16(MARmp, 0);
        MARM1.addInput16(MAR, 0);
        M1.addInput16(MARM1, 0);
        
        /*//SP 
        SP.addInput8(nula, 0); //informacioni ulazi sve nule
        SP.addInput8(nula, 0); //
        SP.addInput(nula, 0); //LD
        SP.addInput(nula, 0); //LDL
        SP.addInput(nula, 0); //LDH
        SP.addInput(nula, 0); //CLR
        SP.addInput(incSP, 0); //INC		//TODO: CU
        SP.addInput(decSP, 0); //DEC		//TODO: CU */

        //IVTP	NULOVAN
        IVTP.addInput8(nula, 0); //informacioni ulazi sve nule
        IVTP.addInput8(nula, 0); //
        IVTP.addInput(nula, 0); //LD
        IVTP.addInput(nula, 0); //LDL
        IVTP.addInput(nula, 0); //LDH
        IVTP.addInput(nula, 0); //CLR
        IVTP.addInput(nula, 0); //INC		//TODO: CU
        IVTP.addInput(nula, 0); //DEC		//TODO: CU

        //IR	
        //IR1
        IR1.addInput8(M1,0);
        IR1M2.addInput8(IR1, 0);
        IR1M2.addInput8(nula, 0);
        IR1M3.addInput8(IR1, 0);
        IR1M3.addInput8(nula, 0);
        M2.addInput16(IR1M2, 0);
        M3.addInput16(IR1M3, 0);
        
        //IR2
        IR2.addInput8(M1,0);
        IR2M2.addInput8(IR2, 0);
        IR2M2.addInput8(nula, 0);
        IR2M3.addInput8(IR2, 0);
        IR2M3.addInput8(nula, 0);
        M2.addInput16(IR2M2, 0);
        M3.addInput16(IR2M3, 0);
        //IR3
        IR3.addInput8(M1,0);
        IR3M2.addInput8(IR3, 0);
        IR3M2.addInput8(nula, 0);
        IR3M3.addInput8(IR3, 0);
        IR3M3.addInput8(nula, 0);
        M2.addInput16(IR3M2, 0);
        M3.addInput16(IR3M3, 0);
        //IR4
        IR4.addInput8(M1,0);
        IR4M2.addInput8(IR4, 0);
        IR4M2.addInput8(nula, 0);
        IR4M3.addInput8(IR4, 0);
        IR4M3.addInput8(nula, 0);
        M2.addInput16(IR4M2, 0);
        M3.addInput16(IR4M3, 0);
        
        //Temp & Temp2
        TEMP.addInput16(M1, 0);
        TEMP2M1.addInput16(TEMP, 0);
        M1.addInput16(TEMP2M1, 0);
        
        TEMP2mp.addInput16(M1, 0);
        TEMP2mp.addInput16(M3, 0);
        TEMP2.addInput16(TEMP2mp, 0);
        TEMP2M1.addInput16(TEMP2, 0);
        M1.addInput16(TEMP2M1, 0);
        
        //IRR
        IRR.addInput16(M1, 0);
        IRRM1.addInput16(IRR, 0);
        M1.addInput16(IRRM1, 0);
        
        //Sign Ex
        YM1.addInput16(M1, 0);
        YM2.addInput16(M2, 0);
        YM3.addInput16(M3, 0);
        YM1Ex.addInput8(M1, 0);
        for (int i = 0; i < 8; i++){
        	YM1Ex.addInput(M1, 7);
        }
        signEx.addInput16(YM1, 0);
        signEx.addInput16(YM2, 0);
        signEx.addInput16(YM3, 0);
        signEx.addInput16(YM1Ex, 0);
        
        //Y
        Y.addInput16(signEx, 0);

////////////////////////////////////////////////////////////////////////////////
//  ALU
////////////////////////////////////////////////////////////////////////////////
      //Alump
        mpAlu.addInput16(M2, 0);
        mpAlu.addInput16(M3, 0);
        
        
        //ALU
        alu.addInput16(mpAlu, 0);
        alu.addInput16(Y, 0);
        ALUM2.addInput16(alu, 0);
        ALUM3.addInput16(alu, 0);
        M2.addInput16(ALUM2, 0);
        M3.addInput16(ALUM3, 0);
        
        //KM PSW

////////////////////////////////////////////////////////////////////////////////
//  PSW
////////////////////////////////////////////////////////////////////////////////
        

////////////////////////////////////////////////////////////////////////////////
//  Prekidi
////////////////////////////////////////////////////////////////////////////////
        
////////////////////////////////////////////////////////////////////////////////
//  Arbitracija
////////////////////////////////////////////////////////////////////////////////
   
////////////////////////////////////////////////////////////////////////////////
//  Upravljacka
////////////////////////////////////////////////////////////////////////////////
        //Generisanje vrednosti brojaca koraka


////////////////////////////////////////////////////////////////////////////////
//  Magistrale
////////////////////////////////////////////////////////////////////////////////
 
        /*       
////////////////////////////////////////////////////////////////////////////////
//  Prijavljivanje registara
////////////////////////////////////////////////////////////////////////////////
        PC.addToRegs();
        MBR.addToRegs();
        MAR.addToRegs();
        SP.addToRegs();
        IR1.addToRegs();
        IR2.addToRegs();
        IR3.addToRegs();
        A.addToRegs();
        B.addToRegs();
        R0.addToRegs();
        R1.addToRegs();
        R2.addToRegs();
        R3.addToRegs();
        X.addToRegs();
        Y.addToRegs();
        ZL.addToRegs();
        ZH.addToRegs();
        cnt.addToRegs();*/

    }

/*
////////////////////////////////////////////////////////////////////////////////
//  Inicijalizacija
////////////////////////////////////////////////////////////////////////////////
public void initialize(String mcFile) {

////////////////////////////////////////////////////////////////////////////////
//  Inicijalizacija vrednosti registara i flip-flopova
////////////////////////////////////////////////////////////////////////////////
        //TODO: omoguciti promene sadrzaja
        SP.initialize(0x1000);
        IVTP.initialize(0);
        PSWI.initialize(1);
        PSWT.initialize(0);
        imr1.initialize(1);
        imr2.initialize(1);
        imr3.initialize(1);
        run.initialize(1);
        procId.initialize(0x0);
        m1MemAccTime.initialize(1);
        m2MemAccTime.initialize(1);

////////////////////////////////////////////////////////////////////////////////
//  Inicijalizacija memorije i PC
////////////////////////////////////////////////////////////////////////////////
        //Inicijalizacija programa (code) i PC-ja
        int startAdr = Loader.loadMemory(mw, mcFile);
        PC.initialize(startAdr);
        //Inicijalizacija podataka u memoriji (data)
        Loader.loadMemory(mw, "test\\memoryContent.mc");

    }*/
}