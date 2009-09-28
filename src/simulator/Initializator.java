package simulator;

import simulator.elements.*;
import simulator.upravljacka.*;

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
	public Mux2 MBRbusorcpu = new Mux2 ();

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
    
    
////////////////////////////////////////////////////////////////////////////////
//  REGFILE
////////////////////////////////////////////////////////////////////////////////
    public And andLdAX = new And(2);
    public And andOutAX = new And(2);
    public Register16 AX = new Register16("AX");
    public BusIn16 AXout = new BusIn16("AXout");

    public And andLdBX = new And(2);
    public And andOutBX = new And(2);
    public Register16 BX = new Register16("BX");
    public BusIn16 BXout = new BusIn16("BXout");

    public And andLdCX = new And(2);
    public And andOutCX = new And(2);
    public Register16 CX = new Register16("CX");
    public BusIn16 CXout = new BusIn16("CXout");

    public And andLdDX = new And(2);
    public And andOutDX = new And(2);
    public Register16 DX = new Register16("DX");
    public BusIn16 DXout = new BusIn16("DXout");

    public And andLdSP = new And(2);
    public And andOutSP = new And(2);
    public Or orLdSP = new Or(2);
    public Or orOutSP = new Or(2);
    public Register16 SP = new Register16("SP");
    public BusIn16 SPout = new BusIn16("SPout");
    
    public And andLdSI= new And(2);
    public And andOutSI = new And(2);
    public Or orLdSI = new Or(2);
    public Or orOutSI = new Or(2);
    public Register16 SI = new Register16("SI");
    public BusIn16 SIout = new BusIn16("SIout");
    
    public And andLdBP = new And(2);
    public And andOutBP = new And(2);
    public Register16 BP = new Register16("BP");
    public BusIn16 BPout = new BusIn16("BPout");
    
    public And andLdDI = new And(2);
    public And andOutDI = new And(2);
    public Register16 DI = new Register16("DI");
    public BusIn16 DIout = new BusIn16("DIout");
    
    //ADDER...REGFILE
    /*public Decoder8 adddec = new Decoder8 ();
    public Add addadd = new Add ();
    public Or addOr1 = new Or (2);*/
    //public Mux 
    
    //Regfile regsel
    public Mux2x3b RegselMux = new Mux2x3b ();
    public Decoder8 RegselDec = new Decoder8 ();

    //Ulazni mux za registarski file
    public MuxBus16 REGBUS = new MuxBus16("REGBUS");

    //public Not notIR10 = new Not();
    //public Not notIR11 = new Not();

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
    //public Or orTransY = new Or(2);
    public Or orMovs = new Or (2);
    
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
    public Not notPSWN = new Not();

    //PSWZ
    public Mux2b muxPSWZ = new Mux2b();
    public SRff PSWZ = new SRff();
    public And and1PSWZ = new And(2);
    public Not notPSWZ = new Not();

    //PSWC
    public Mux2b muxPSWC = new Mux2b();
    public SRff PSWC = new SRff();
    public And and1PSWC = new And(2);
    public Not notPSWC = new Not();

    //PSWV
    public Mux2b muxPSWV = new Mux2b();
    public SRff PSWV = new SRff();
    public And and1PSWV = new And(2);
    public Not notPSWV = new Not();
    
    //PSWI
    public SRff PSWI = new SRff();
    public And and1PSWI = new And(2);
    public Or or1PSWI = new Or(2);
    public Or or2PSWI = new Or(2);
    public Not notPSWI = new Not();

    //PSWT
    public SRff PSWT = new SRff();
    public And and1PSWT = new And(2);
    public Or or1PSWT = new Or(2);
    public Or or2PSWT = new Or(2);
    public Not notPSWT = new Not();

    //PSWL1
    public SRff PSWL1 = new SRff();

    //PSWL0
    public SRff PSWL0 = new SRff();

    //PSW Izlazi na magistrale
    public BusIn16 PSWM2 = new BusIn16("PSWM2");
    public BusIn16 PSWM3 = new BusIn16("PSWM3");
    
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
    public Not not1PswC = new Not();
    public Not not2PswC = new Not();
    public Not not3PswC = new Not();
    
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
    //public SRff intGen = new SRff (); // generator prekida
   
////////////////////////////////////////////////////////////////////////////////
//  Arbitracija
////////////////////////////////////////////////////////////////////////////////
    //Arbitrator
    //public Buffer BGR0 = new Buffer();
    //public Buffer BGR1 = new Buffer();
    //public Buffer BREQ0 = new Buffer();
    //public Buffer BREQ1 = new Buffer();
    public Coder8 arbCoder = new Coder8();
    public Decoder8 arbDecoder = new Decoder8();

    //Arbitracija u procesoru
    public BusIn busyBuss = new BusIn("CPUBusyBuss");
    public SRff busySet = new SRff ();
    public Or readorwrite =  new Or (2);
    public Dff BGRCpu = new Dff();
    public And BGRandBusyBus = new And (2);
    public Not noBusy = new Not();

////////////////////////////////////////////////////////////////////////////////
//  Upravljacka
////////////////////////////////////////////////////////////////////////////////
    public uMemory uMem = new uMemory (8, 81);
    public Register8 cnt = new Register8 ("CNT");
    public Mux4 upravljackaMux = new Mux4 ();
    //public uMemory kmstore = new uMemory (3, 8);
    //public uMemory kmop = new uMemory (4, 8);
    //public uMemory kmaddr = new uMemory (3, 8);
    public Or upravljackaOr1 = new Or (2);
    public Or upravljackaOr2 = new Or (2);
    public Or upravljackaOr3 = new Or (4);
    
    public And upravljackaAnd1 = new And(2);
    public And upravljackaAnd2 = new And(3);
    public Not upravljackaNot = new Not();
    
    
    //logika za branch
    public And brAnd1 = new And (2);
    //public And brAnd2 = new And (2);
    //public And brAnd3 = new And (2);
    //public And brAnd4 = new And (2);
    //public And brAnd5 = new And (2);
    //public And brAnd6 = new And (2);
    //public And brAnd7 = new And (2);
    //public And brAnd8 = new And (2);
    public Or brOr = new Or (4);
    public SRff run = new SRff();
    
    public Not notRW = new Not();
    
    
////////////////////////////////////////////////////////////////////////////////
//  Dekoder instrukcija
////////////////////////////////////////////////////////////////////////////////
    public Or diOr1 = new Or (2);
    public Not diNot1 = new Not ();
    public Decoder8 diDec81 = new Decoder8 ();
    public Or diOr2 = new Or (2);
    public And diAndod7 = new And (7);
    public Or diOrod7 = new Or (7);
    public Not diNot2 = new Not ();
    public Or diOr3 =  new Or (2);
    public And diAnd1 = new And (3);
    public Not diNot3 =  new Not ();
    public Or diOr4 =  new Or (3);
    public Not diNot4 = new Not ();
    public Decoder4 diDec41 = new Decoder4 ();
    public And diAnd3 = new And (2);
    public And diAnd2 = new And (2);
    public Decoder8 diDec82 = new Decoder8 ();
    public And diAnd4 = new And (2);
    
    public And diAnd5 = new And (3);
    public And diAnd6 = new And (3);
    public And diAnd7 = new And (3);
    public And diAnd8 = new And (3);
    public Not diNot5 = new Not ();
    
    public Or diOr5 = new Or(4);
    public Or diOr6 = new Or(3);
    public Or diOr7 = new Or(3);
    public Or aluop = new Or(2);
       
    //ADRESIRANJE
    public Decoder4 daDec41 = new Decoder4 ();
    public Decoder4 daDec42 = new Decoder4 ();
    public And daAnd = new And (2);
    
    
    
    
   

    
    
    
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
    public Bus16 M1 = new Bus16(15);
    public Bus16 M2 = new Bus16(10);
    public Bus16 M3 = new Bus16(10);

////////////////////////////////////////////////////////////////////////////////
//  PRESPAJACI	
////////////////////////////////////////////////////////////////////////////////
    public BusIn16 M1M2 = new BusIn16("M1M2");
    public BusIn16 M1M3 = new BusIn16("M1M3");
    public BusIn16 M3M1 = new BusIn16("M3M1");
    public BusIn16 M2M1 = new BusIn16("M2M1");

    
    //Nula za sve prazne ulaze
    public static Const nula = new Const(0);
    //Jedan za sve stalno aktivne ulaze
    public static Const jedan = new Const(1);
    
////////////////////////////////////////////////////////////////////////////////
//  Konstruktor
////////////////////////////////////////////////////////////////////////////////
    public Initializator() {
        
////////////////////////////////////////////////////////////////////////////////
//  PRESPAJANJE INTERNIH MAGISTRALA
////////////////////////////////////////////////////////////////////////////////
        M1M2.addInput16(M1, 0);
        M1M2.addInput(uMem, Signali.M1M2out.ordinal());
        M2.addInput16(M1M2, 0);
        
        M2M1.addInput16(M2, 0);
        M2M1.addInput(uMem, Signali.M2M1out.ordinal());
        M1.addInput16(M2M1, 0);
        
        M1M3.addInput16(M1, 0);
        M1M3.addInput(uMem, Signali.M1M3out.ordinal());
        M3.addInput16(M1M3, 0);
        
        M3M1.addInput16(M3, 0);
        M3M1.addInput(uMem, Signali.M3M1out.ordinal());
        M1.addInput16(M3M1, 0);
        
////////////////////////////////////////////////////////////////////////////////
//  REGISTRI
////////////////////////////////////////////////////////////////////////////////
        //PC
        PC.addInput16(M1, 0);
        PC.addInput(uMem, Signali.PCin.ordinal());
        PCM2.addInput16(PC, 0);
        PCM3.addInput16(PC, 0);
        PCM2.addInput(uMem, Signali.PCM2out.ordinal());
        PCM3.addInput(uMem, Signali.PCM3out.ordinal());
        M2.addInput16(PCM2, 0);
        M3.addInput16(PCM3, 0);
        
        //MBR
        MBRbusorcpu.addInput8(M1, 0);
        MBRbusorcpu.addInput8(DBUS, 0);
        MBR.addInput8(MBRbusorcpu, 0);
        MBR.addInput(uMem, Signali.MBRin.ordinal());
        MBRM1.addInput8(MBR, 0);
        MBRM1.addInput8(nula, 0);
        MBRM1.addInput(uMem, Signali.MBRM1out.ordinal());
        MBRM2.addInput8(MBR, 0);
        MBRM2.addInput8(nula, 0);
        MBRM2.addInput(nula, 0);
        MBRM3.addInput8(MBR, 0);
        MBRM3.addInput8(nula, 0);
        MBRM3.addInput(nula, 0);
        M1.addInput16(MBRM1, 0);
        M2.addInput16(MBRM2, 0);
        M3.addInput16(MBRM3, 0);

        //MAR
        MARmp.addInput16(M1, 0);
        MARmp.addInput16(M2, 0);
        MARmp.addInput(uMem, Signali.MARmp.ordinal());
        MAR.addInput16(MARmp, 0);
        MAR.addInput(uMem, Signali.MARin.ordinal());
        MARM1.addInput16(MAR, 0);
        MARM1.addInput(nula, 0);
        M1.addInput16(MARM1, 0);

        //IVTP	NULOVAN
        IVTP.addInput8(nula, 0); //informacioni ulazi sve nule
        IVTPM2.addInput16(nula, 0); //
        IVTPM3.addInput16(nula, 0); //
        IVTPM2.addInput(nula, 0);
        IVTPM3.addInput(nula, 0);
        IVTP.addInput(nula, 0); //LD
        IVTP.addInput(nula, 0); //LDL
        IVTP.addInput(nula, 0); //LDH
        IVTP.addInput(nula, 0); //CLR
        IVTP.addInput(nula, 0); //INC		//TODO: CU
        IVTP.addInput(nula, 0); //DEC		//TODO: CU
        

        //IR	
        //IR1
        IR1.addInput8(M1,0);
        IR1.addInput(uMem, Signali.IR1in.ordinal());
        IR1M2.addInput8(IR1, 0);
        IR1M2.addInput8(nula, 0);
        IR1M2.addInput(nula, 0);
        IR1M3.addInput8(IR1, 0);
        IR1M3.addInput8(nula, 0);
        IR1M3.addInput(nula, 0);
        M2.addInput16(IR1M2, 0);
        M3.addInput16(IR1M3, 0);
        
        //IR2
        IR2.addInput8(M1,0);
        IR2.addInput(uMem, Signali.IR2in.ordinal());
        IR2M2.addInput8(IR2, 0);
        IR2M2.addInput8(nula, 0);
        IR2M2.addInput(uMem, Signali.IR2M2out.ordinal());
        IR2M3.addInput8(IR2, 0);
        IR2M3.addInput8(nula, 0);
        IR2M3.addInput(nula, 0);
        M2.addInput16(IR2M2, 0);
        M3.addInput16(IR2M3, 0);
        //IR3
        IR3.addInput8(M1,0);
        IR3.addInput(uMem, Signali.IR3in.ordinal());
        IR3M2.addInput8(IR3, 0);
        IR3M2.addInput8(nula, 0);
        IR3M3.addInput(uMem, Signali.IR3M2out.ordinal());
        IR3M3.addInput8(IR3, 0);
        IR3M3.addInput8(nula, 0);
        IR3M3.addInput(nula, 0);
        M2.addInput16(IR3M2, 0);
        M3.addInput16(IR3M3, 0);
        //IR4
        IR4.addInput8(M1,0);
        IR4.addInput(uMem, Signali.IR4in.ordinal());
        IR4M2.addInput8(IR4, 0);
        IR4M2.addInput8(nula, 0);
        IR4M2.addInput(uMem, Signali.IR4M2out.ordinal());
        IR4M3.addInput8(IR4, 0);
        IR4M3.addInput8(nula, 0);
        IR4M3.addInput(nula, 0);
        M2.addInput16(IR4M2, 0);
        M3.addInput16(IR4M3, 0);
        
        //Temp
        TEMP.addInput16(M1, 0);
        TEMP.addInput(uMem, Signali.TEMPin.ordinal());
        TEMP.addInput(Register16.LDL, uMem, Signali.TEMPinLOW.ordinal());
        //TEMP.addInput(inputNo, m, outputNo)
        TEMP.addInput(Register16.SWAP, uMem, Signali.TEMPswap.ordinal());
        TEMPM1.addInput16(TEMP, 0);
        M1.addInput16(TEMPM1, 0);
               
        //Temp2
        TEMP2mp.addInput16(M1, 0);
        TEMP2mp.addInput16(M3, 0);
        TEMP2mp.addInput(uMem, Signali.TEMP2mp.ordinal());
        TEMP2.addInput16(TEMP2mp, 0);
        TEMP2.addInput(uMem, Signali.TEMP2in.ordinal());
        TEMP2.addInput(Register16.LDL, uMem, Signali.TEMP2inLOW.ordinal());
        TEMP2.addInput(Register16.SWAP, uMem, Signali.TEMP2swap.ordinal());
        TEMP2M1.addInput16(TEMP2, 0);
        TEMP2M1.addInput(uMem, Signali.TEMP2out.ordinal());
        M1.addInput16(TEMP2M1, 0);
        
        //IRR
        IRR.addInput16(M1, 0);
        IRR.addInput(uMem, Signali.IRRin.ordinal());
        IRRM1.addInput16(IRR, 0);
        IRRM1.addInput(nula, 0);
        M1.addInput16(IRRM1, 0);
        
////////////////////////////////////////////////////////////////////////////////
//  SIGN EXT
////////////////////////////////////////////////////////////////////////////////
        YM1.addInput16(M1, 0);
        YM1.addInput(uMem, Signali.YselM1.ordinal());
        YM2.addInput16(M2, 0);
        YM2.addInput(uMem, Signali.YselM2.ordinal());
        YM3.addInput16(M3, 0);
        YM3.addInput(uMem, Signali.YselM3.ordinal());
        YM1Ex.addInput8(M1, 0);
        for (int i = 0; i < 8; i++){
        	YM1Ex.addInput(M1, 7);
        }
        YM1Ex.addInput(uMem, Signali.YsignEx.ordinal());
        signEx.addInput16(YM1, 0);
        signEx.addInput16(YM2, 0);
        signEx.addInput16(YM3, 0);
        signEx.addInput16(YM1Ex, 0);
        
        //Y
        Y.addInput16(signEx, 0);
        Y.addInput(Register16.LD, uMem, Signali.Yin.ordinal());
        
////////////////////////////////////////////////////////////////////////////////
//  REGFILE
////////////////////////////////////////////////////////////////////////////////        
       REGBUS.addInput16(M2, 0);
       REGBUS.addInput16(M3, 0);
       REGBUS.addInput(uMem, Signali.REGBUSsel.ordinal());
       AX.addInput16(REGBUS, 0);
       BX.addInput16(REGBUS, 0);
       CX.addInput16(REGBUS, 0);
       DX.addInput16(REGBUS, 0);
       SP.addInput16(REGBUS, 0);
       BP.addInput16(REGBUS, 0);
       DI.addInput16(REGBUS, 0);
       SI.addInput16(REGBUS, 0);
       AXout.addInput16(AX, 0);
       BXout.addInput16(BX, 0);
       CXout.addInput16(CX, 0);
       DXout.addInput16(DX, 0);
       SPout.addInput16(SP, 0);
       BPout.addInput16(BP, 0);
       DIout.addInput16(DI, 0);
       SIout.addInput16(SI, 0);
       M1.addInput16(AXout, 0);
       M1.addInput16(BXout, 0);
       M1.addInput16(CXout, 0);
       M1.addInput16(DXout, 0);
       M1.addInput16(SPout, 0);
       M1.addInput16(BPout, 0);
       M1.addInput16(DIout, 0);
       M1.addInput16(SIout, 0);

       
       //Logika...
       //AX
       andLdAX.addInput(uMem, Signali.REGin.ordinal());
       andLdAX.addInput(RegselDec, 0);
       AX.addInput(andLdAX, 0);
       
       andOutAX.addInput(uMem, Signali.REGout.ordinal());
       andOutAX.addInput(RegselDec, 0);
       AXout.addInput(andOutAX, 0);
       
       //BX
       andLdBX.addInput(uMem, Signali.REGin.ordinal());
       andLdBX.addInput(RegselDec, 1);
       BX.addInput(andLdBX, 0);
       
       andOutBX.addInput(uMem, Signali.REGout.ordinal());
       andOutBX.addInput(RegselDec, 1);
       BXout.addInput(andOutBX, 0);
       
       //CX
       andLdCX.addInput(uMem, Signali.REGin.ordinal());
       andLdCX.addInput(RegselDec, 2);
       CX.addInput(andLdCX, 0);
       
       andOutCX.addInput(uMem, Signali.REGout.ordinal());
       andOutCX.addInput(RegselDec, 2);
       CXout.addInput(andOutCX, 0);
       
       //DX
       andLdDX.addInput(uMem, Signali.REGin.ordinal());
       andLdDX.addInput(RegselDec, 3);
       DX.addInput(andLdDX, 0);
       andOutDX.addInput(uMem, Signali.REGout.ordinal());
       andOutDX.addInput(RegselDec, 3);
       DXout.addInput(andOutDX, 0);
       
       //SP
       andLdSP.addInput(uMem, Signali.REGin.ordinal());
       andLdSP.addInput(RegselDec, 4);
       orLdSP.addInput(andLdSP, 0);
       orLdSP.addInput(uMem, Signali.SPin.ordinal());
       SP.addInput(orLdSP, 0);
       andOutSP.addInput(uMem, Signali.REGout.ordinal());
       andOutSP.addInput(RegselDec, 4);
       orOutSP.addInput(andOutSP, 0);
       orOutSP.addInput(uMem, Signali.SPout.ordinal());
       SPout.addInput(orOutSP, 0);
       
       //BP
       andLdBP.addInput(uMem, Signali.REGin.ordinal());
       andLdBP.addInput(RegselDec, 5);
       BP.addInput(andLdBP, 0);
       andOutBP.addInput(uMem, Signali.REGout.ordinal());
       andOutBP.addInput(RegselDec, 5);
       BPout.addInput(andOutBP, 0);
       
       //DI
       andLdDI.addInput(uMem, Signali.REGin.ordinal());
       andLdDI.addInput(RegselDec, 7);
       DI.addInput(andLdDI, 0);
       andOutDI.addInput(uMem, Signali.REGout.ordinal());
       andOutDI.addInput(RegselDec, 7);
       DIout.addInput(andOutDI, 0);
       
       //SI
       andLdSI.addInput(uMem, Signali.REGin.ordinal());
       andLdSI.addInput(RegselDec, 6);
       orLdSI.addInput(andLdSI, 0);
       SI.addInput(orLdSI, 0);
       andOutSI.addInput(uMem, Signali.REGout.ordinal());
       andOutSI.addInput(RegselDec, 6);
       orOutSI.addInput(andOutSI, 0);
       SIout.addInput(orOutSI, 0);
      
       //Regsel
       RegselMux.addInput(IR2, 0);
       RegselMux.addInput(IR2, 1);
       RegselMux.addInput(IR2, 2);
       RegselMux.addInput(IR2, 3);
       RegselMux.addInput(IR2, 4);
       RegselMux.addInput(IR2, 5);
       RegselMux.addInput(uMem, Signali.regsel2.ordinal());
       
       RegselDec.addInput(RegselMux, 0);
       RegselDec.addInput(RegselMux, 1);
       RegselDec.addInput(RegselMux, 2);
       RegselDec.addInput(jedan, 0);
       
       
       //ADDER 
       /*addOr1.addInput(daDec41, 1);
       addOr1.addInput(daDec41, 2);
       adddec.addInput(IR2, 0);
       adddec.addInput(IR2, 1);
       adddec.addInput(IR2, 2);
       adddec.addInput(addOr1, 0);*/
       
       
////////////////////////////////////////////////////////////////////////////////
//  ALU
////////////////////////////////////////////////////////////////////////////////
       	//Alump
        mpAlu.addInput16(M2, 0);
        mpAlu.addInput16(M3, 0);
        mpAlu.addInput(uMem, Signali.ALUmp.ordinal());
                
        //ALU
        alu.addInput16(mpAlu, 0);
        alu.addInput16(Y, 0);
        ALUM2.addInput16(alu, 0);
        ALUM2.addInput(uMem, Signali.ALUM2out.ordinal());
        ALUM3.addInput16(alu, 0);
        ALUM3.addInput(uMem, Signali.ALUM3out.ordinal());
        M2.addInput16(ALUM2, 0);
        M3.addInput16(ALUM3, 0);
        
        //ALU LOGIKA
        alu.addInput(Alu.INCX, uMem, Signali.ALUincX.ordinal());
        alu.addInput(Alu.DECX, uMem, Signali.ALUdecX.ordinal());
        alu.addInput(Alu.TRANSX, uMem, Signali.ALUtransX.ordinal());
        andMovs.addInput(aluop, 0);
        andMovs.addInput(diAnd8, 0);
        orMovs.addInput(andMovs, 0);
        orMovs.addInput(uMem, Signali.ALUtransY.ordinal());
        alu.addInput(Alu.TRANSY, orMovs, 0);
        andAdd.addInput(aluop, 0);
        andAdd.addInput(diAnd6, 0);
        orAdd.addInput(andAdd, 0);
        orAdd.addInput(uMem, Signali.ALUadd.ordinal());
        alu.addInput(Alu.ADD, orAdd, 0);
        andAnd.addInput(aluop, 0);
        andAnd.addInput(diAnd5, 0);
        alu.addInput(Alu.AND, andAnd, 0);
        andAsr.addInput(aluop, 0);
        andAsr.addInput(diAnd2, 0);
        alu.addInput(Alu.ARS, andAsr, 0);
        andInc.addInput(aluop, 0);
        andInc.addInput(diDec82, 2);
        orIncY.addInput(andInc, 0);
        orIncY.addInput(uMem, Signali.ALUincY.ordinal());
        alu.addInput(Alu.INCY, orIncY, 0);
        andDec.addInput(aluop, 0);
        andDec.addInput(diDec82, 3);
        orDecY.addInput(andDec, 0);
        orDecY.addInput(uMem, Signali.ALUdecY.ordinal());
        alu.addInput(Alu.DECY, orDecY, 0);
        
        
        
        //KM PSW
        //Z
        orPswZ.addInput16(alu, 0);
        notPswZ.addInput(orPswZ, 0);
        
        //C
        not1PswC.addInput(alu, 16);
        and1PswC.addInput(not1PswC, 0);
        and1PswC.addInput(diDec82, 3);        
        not2PswC.addInput(and1PswC, 0);
        or1PswC.addInput(diAnd6, 0);
        or1PswC.addInput(diDec82, 2);
        and2PswC.addInput(alu, 16);
        and2PswC.addInput(or1PswC, 0);
        not3PswC.addInput(and2PswC, 0);
        or2PswC.addInput(not2PswC, 0);
        or2PswC.addInput(not3PswC, 0);
        
        //V
        andIII1PswV.addInput(mpAlu, 15);
        andIII1PswV.addInput(Y, 15);
        not1PswV.addInput(alu, 15);
        andIII1PswV.addInput(not1PswV, 0);
        
        not2PswV.addInput(mpAlu, 15);
        not3PswV.addInput(Y, 15);
        andIII2PswV.addInput(not2PswV, 0);
        andIII2PswV.addInput(not3PswV, 0);
        andIII2PswV.addInput(alu, 15);
        
        orIIPswV.addInput(andIII1PswV, 0);
        orIIPswV.addInput(andIII2PswV, 0);
        
        andII1PswV.addInput(orIIPswV, 0);
        andII1PswV.addInput(diAnd6, 0);
        
        not4PswV.addInput(Y, 15);
        andIII3PswV.addInput(not4PswV, 0);
        andIII3PswV.addInput(alu, 15);
        andIII3PswV.addInput(diDec82, 2);
        
        not5PswV.addInput(alu, 15);
        andIII4PswV.addInput(not5PswV, 0);
        andIII4PswV.addInput(Y, 15);
        andIII4PswV.addInput(diDec82, 3);
        
        orIIIPswV.addInput(andIII4PswV, 0);
        orIIIPswV.addInput(andIII3PswV, 0);
        orIIIPswV.addInput(andII1PswV, 0);
        
        
////////////////////////////////////////////////////////////////////////////////
//  PSW
////////////////////////////////////////////////////////////////////////////////
        // N
        and1PSWN.addInput(alu, 15);
        and1PSWN.addInput(uMem, Signali.PSWupdateNZCV.ordinal());
        
        muxPSWN.addInput(and1PSWN, 0);
        muxPSWN.addInput(M1, 0);
        muxPSWN.addInput(uMem, Signali.PSWin.ordinal());
        
        notPSWN.addInput(muxPSWN, 0);
                
        PSWN.addInput(muxPSWN, 0);
        PSWN.addInput(notPSWN, 0);
        
        PSWM2.addInput(PSWN, 0);
        PSWM3.addInput(PSWN, 0);
        
        // Z
        and1PSWZ.addInput(notPswZ, 0);
        and1PSWZ.addInput(uMem, Signali.PSWupdateNZCV.ordinal());
        
        muxPSWZ.addInput(and1PSWZ, 0);
        muxPSWZ.addInput(M1, 1);
        muxPSWZ.addInput(uMem, Signali.PSWin.ordinal());
        
        notPSWZ.addInput(muxPSWZ, 0);
                
        PSWZ.addInput(muxPSWZ, 0);
        PSWZ.addInput(notPSWZ, 0);
        
        PSWM2.addInput(PSWZ, 0);
        PSWM3.addInput(PSWZ, 0);
        
        //C
        and1PSWC.addInput(or2PswC, 0);
        and1PSWC.addInput(uMem, Signali.PSWupdateNZCV.ordinal());
        
        muxPSWC.addInput(and1PSWC, 0);
        muxPSWC.addInput(M1, 2);
        muxPSWC.addInput(uMem, Signali.PSWin.ordinal());
        
        notPSWC.addInput(muxPSWC, 0);
                
        PSWC.addInput(muxPSWC, 0);
        PSWC.addInput(notPSWC, 0);
        
        PSWM2.addInput(PSWC, 0);
        PSWM3.addInput(PSWC, 0);
        
        //V
        and1PSWV.addInput(orIIIPswV, 0);
        and1PSWV.addInput(uMem, Signali.PSWupdateNZCV.ordinal());
        
        muxPSWV.addInput(and1PSWV, 0);
        muxPSWV.addInput(M1, 3);
        muxPSWV.addInput(uMem, Signali.PSWin.ordinal());
        
        notPSWV.addInput(muxPSWV, 0);
                
        PSWV.addInput(muxPSWV, 0);
        PSWV.addInput(notPSWV, 0);
        
        PSWM2.addInput(PSWV, 0);
        PSWM3.addInput(PSWV, 0);
        
        //I
        and1PSWI.addInput(M1, 4);
        and1PSWI.addInput(uMem, Signali.PSWin.ordinal());
        notPSWI.addInput(and1PSWI, 0);
        or1PSWI.addInput(and1PSWI, 0);
        or1PSWI.addInput(diDec81, 2);
        or2PSWI.addInput(notPSWI, 0);
        or2PSWI.addInput(diDec81, 3);
        
        PSWI.addInput(or1PSWI, 0);
        PSWI.addInput(or2PSWI, 0);
        PSWM2.addInput(PSWI, 0);
        PSWM3.addInput(PSWI, 0);
        
        //T
        and1PSWT.addInput(M1, 5);
        and1PSWT.addInput(uMem, Signali.PSWin.ordinal());
        notPSWT.addInput(and1PSWT, 0);
        or1PSWT.addInput(and1PSWT, 0);
        or1PSWT.addInput(diDec81, 4);
        or2PSWT.addInput(notPSWT, 0);
        or2PSWT.addInput(diDec81, 5);
        
        PSWT.addInput(or1PSWT, 0);
        PSWT.addInput(or2PSWT, 0);
        PSWM2.addInput(PSWT, 0);
        PSWM3.addInput(PSWT, 0);
                
        PSWM2.addInput(PSWL0, 0);
        PSWM2.addInput(PSWL1, 0);
        
        PSWM3.addInput(PSWL0, 0);
        PSWM3.addInput(PSWL1, 0);
        
        PSWM2.addInput8(nula, 0);
        PSWM3.addInput8(nula, 0);
        
        PSWM2.addInput(nula, 0);
        PSWM3.addInput(uMem, Signali.PSWM3out.ordinal());
             
////////////////////////////////////////////////////////////////////////////////
//  Arbitracija
////////////////////////////////////////////////////////////////////////////////
        //CPU
        BUSYBUS.addInput(busyBuss, 0);
        busySet.addInput(arbDecoder, 0);
        
        busyBuss.addInput(busySet, 0);
        BGRCpu.addInput(readorwrite, 0);
        noBusy.addInput(BUSYBUS, 0);
        BGRandBusyBus.addInput(BGRCpu, 0);
        BGRandBusyBus.addInput(noBusy, 0);
        
        
        //ARBITRATOR
        arbCoder.addInput(BGRandBusyBus, 0);
        for (int i = 0; i < 7; i++ ){
        	arbCoder.addInput(nula, 0);
        }
        arbCoder.addInput(jedan, 0);
        arbDecoder.addInput(arbCoder, 0);
        arbDecoder.addInput(arbCoder, 1);
        arbDecoder.addInput(arbCoder, 2);
        arbDecoder.addInput(arbCoder, 3);

        
 
////////////////////////////////////////////////////////////////////////////////
//  Dekoder instrukcija
////////////////////////////////////////////////////////////////////////////////
        //L1
        diOr1.addInput(IR1, 7);
        diOr1.addInput(IR1, 6);
        diNot1.addInput(diOr1, 0);
        //Dekoder - RTS, RTI, INTE, INTD, TRPE, TRPD, ILEGAL0, ILEGAL0
        diDec81.addInput(IR1, 0);
        diDec81.addInput(IR1, 1);
        diDec81.addInput(IR1, 2);
        diDec81.addInput(diNot1, 0);
        diNot4.addInput(IR1, 7);
        //Deckoder za - JMP, JSR, BNZ, INT
        diAnd3.addInput(diNot4, 0);
        diAnd3.addInput(IR1, 6);
        diDec41.addInput(IR1, 0);
        diDec41.addInput(IR1, 5);
        diDec41.addInput(diAnd3, 0);
        //ILOP
        diOr2.addInput(diDec81, 6);
        diOr2.addInput(diDec81, 7);
        //L2
        diAndod7.addInput(IR1, 0);
        diAndod7.addInput(IR1, 1);
        diAndod7.addInput(IR1, 2);
        diAndod7.addInput(IR1, 3);
        diAndod7.addInput(IR1, 4);
        diAndod7.addInput(IR1, 5);
        diAndod7.addInput(IR1, 6);
        diOrod7.addInput(IR1, 0);
        diOrod7.addInput(IR1, 1);
        diOrod7.addInput(IR1, 2);
        diOrod7.addInput(IR1, 3);
        diOrod7.addInput(IR1, 4);
        diOrod7.addInput(IR1, 5);
        diOrod7.addInput(IR1, 6);
        diNot2.addInput(diOrod7, 0);
        diOr3.addInput(diNot2, 0);
        diOr3.addInput(diAndod7, 0);
        diAnd1.addInput(IR1, 7);
        diAnd1.addInput(diOr3, 0);
        diNot3.addInput(IR2, 7);
        diAnd1.addInput(diNot3, 0);
        diOr4.addInput(diAnd1, 0);
        diOr4.addInput(diDec41, 2);
        diOr4.addInput(diDec41, 3);
        
        //L3
        diOr5.addInput(diDec41, 0);
        diOr5.addInput(diDec41, 1);
        diOr5.addInput(daDec42, 2);
        diOr5.addInput(daDec41, 2);
        
        
        //ASR
        diAnd2.addInput(IR1, 7);
        diAnd2.addInput(diNot2, 0);
        //Dekoder - PUSH, POP, INC, DEC, JMPIND
        diAnd4.addInput(IR1, 7);
        diAnd4.addInput(diAndod7, 0);
        diDec82.addInput(IR2, 3);
        diDec82.addInput(IR2, 4);
        diDec82.addInput(IR2, 5);
        diDec82.addInput(diAnd4, 0);
        
        diNot5.addInput(diAndod7, 0);
        //AND
        diAnd5.addInput(IR1, 7);
        diAnd5.addInput(IR1, 3);
        diAnd5.addInput(diNot5, 0);
        //ADD
        diAnd6.addInput(IR1, 7);
        diAnd6.addInput(IR1, 4);
        diAnd6.addInput(diNot5, 0);
        //MOVD
        diAnd7.addInput(IR1, 7);
        diAnd7.addInput(IR1, 5);
        diAnd7.addInput(diNot5, 0);
        //MOVS
        diAnd8.addInput(IR1, 7);
        diAnd8.addInput(IR1, 6);
        diAnd8.addInput(diNot5, 0);
        //ALUOPDRP
        diOr6.addInput(diAnd6, 0);
        diOr6.addInput(diAnd7, 0);
        diOr6.addInput(diAnd8, 0);
        //ALUREGOP
        diOr7.addInput(diDec82, 2);
        diOr7.addInput(diDec82, 3);
        diOr7.addInput(diAnd2, 0);
        //ALUOP
        aluop.addInput(diOr7, 0);
        aluop.addInput(diOr6, 0);
        
        //GENERISANJE SIGNALA ZA ADRESIRANJE
        //REGDIR, REGIND, REGINDOF
        daDec41.addInput(IR2, 6);
        daDec41.addInput(IR2, 7);
        daDec41.addInput(diOr1, 0);
        //TRECI
        
        //MEMDIR, MEMIND, PCREL, IMMED
        daDec42.addInput(IR2, 0);
        daDec42.addInput(IR2, 1);
        daDec42.addInput(daDec41, 3);
        
        //MEMADR
        daAnd.addInput(daDec42, 0);
        daAnd.addInput(daDec42, 1);

        
        
        
        
        

////////////////////////////////////////////////////////////////////////////////
//  Upravljacka
////////////////////////////////////////////////////////////////////////////////
        //branch 
        brAnd1.addInput(diDec41, 2);
        brAnd1.addInput(PSWZ, 0);
        brOr.addInput(brAnd1, 0);
        brOr.addInput(diDec41, 0);
        brOr.addInput(diDec41, 1);
        brOr.addInput(diDec41, 3);
        
        
        //brAnd1.addInput(nula, Signali.)
        
        
        //uMem.addInput8(cnt, 0);
        cnt.addInput8(upravljackaMux, 0);
        upravljackaMux.addInput8(uMem, 73);
        //upravljackaMux.addInput8(kmaddr, 0);
        //upravljackaMux.addInput8(kmstore, 0);
        //upravljackaMux.addInput8(kmop, 0);
        upravljackaMux.addInput8(nula, 0);
        upravljackaMux.addInput8(nula, 0);
        upravljackaMux.addInput8(nula, 0);
        
        upravljackaOr3.addInput(uMem, Signali.brcaseadr.ordinal());
        upravljackaOr3.addInput(uMem, Signali.brcaseop.ordinal());
        upravljackaOr3.addInput(uMem, Signali.brcasestore.ordinal());
        upravljackaOr3.addInput(brOr, 0);
        
        upravljackaNot.addInput(uMem, 0);
        upravljackaAnd1.addInput(run, 0);
        upravljackaAnd1.addInput(upravljackaNot, 0);
        upravljackaAnd2.addInput(run, 0);
        upravljackaAnd2.addInput(uMem, 0);
        upravljackaAnd2.addInput(upravljackaOr3, 0);
        
        cnt.addInput(upravljackaAnd2, 0);
        cnt.addInput(Register8.INC, upravljackaAnd1, 0);
        
        
        upravljackaOr1.addInput(uMem, Signali.brcaseop.ordinal());
        upravljackaOr1.addInput(uMem, Signali.brcaseadr.ordinal());
        upravljackaOr2.addInput(uMem, Signali.brcaseop.ordinal());
        upravljackaOr2.addInput(uMem, Signali.brcasestore.ordinal());
        upravljackaMux.addInput(upravljackaOr1, 0);
        upravljackaMux.addInput(upravljackaOr2, 0);
        
        notRW.addInput(readorwrite, 0);
        
        run.addInput(notRW, 0);
        run.addInput(readorwrite, 0);


////////////////////////////////////////////////////////////////////////////////
//  Magistrale
////////////////////////////////////////////////////////////////////////////////
         ABUS.addInput16(MAR, 0);
         Mem.addInput16(ABUS, 0);
         DBUS.addInput8(MBR, 0);
         Mem.addInput8(DBUS, 0);
         Mem.addInput(WRBUS, 0);
       
////////////////////////////////////////////////////////////////////////////////
//  Prijavljivanje registara
////////////////////////////////////////////////////////////////////////////////
 /*       PC.addToRegs();
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
        //imr1.initialize(1);
        //imr2.initialize(1);
        //imr3.initialize(1);
        run.initialize(1);
        //procId.initialize(0x0);
        //m1MemAccTime.initialize(1);
        //m2MemAccTime.initialize(1);
        uMem.initialize(0);

////////////////////////////////////////////////////////////////////////////////
//  Inicijalizacija memorije i PC
////////////////////////////////////////////////////////////////////////////////
        //Inicijalizacija programa (code) i PC-ja
        //int startAdr = Loader.loadMemory(mw, mcFile);
        //PC.initialize(startAdr);
        //Inicijalizacija podataka u memoriji (data)
        //Loader.loadMemory(mw, "test\\memoryContent.mc");

    }
}
