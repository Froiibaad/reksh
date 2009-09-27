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
    
    
    //Registarski fajl
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
    
    //Regfile regsel
    public Mux2x3b RegselMux = new Mux2x3b ();
    public Decoder8 RegselDec = new Decoder8 ();

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
    //public And and1PSWI = new And(2);
    //public And and2PSWI = new And(2);
    public Not notPSWI = new Not();

    //PSWT
    public Mux2b muxPSWT = new Mux2b();
    public SRff PSWT = new SRff();
    //public And and1PSWT = new And(2);
    //public And and2PSWT = new And(2);
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
    public SRff intGen = new SRff (); // generator prekida
   
////////////////////////////////////////////////////////////////////////////////
//  Arbitracija
////////////////////////////////////////////////////////////////////////////////
    //Arbitrator
    public Buffer BGR0 = new Buffer();
    public Buffer BGR1 = new Buffer();
    public Buffer BREQ0 = new Buffer();
    public Buffer BREQ1 = new Buffer();
    public Coder8 arbCoder = new Coder8();
    public Decoder8 arbDecoder = new Decoder8();

    //Arbitracija u procesoru
    public BusIn busyBuss = new BusIn("CPUBusyBuss");
    public SRff busySet = new SRff ();
    public Or readorwrite =  new Or (2);
    public Buffer BGRCpu = new Buffer();
    public And BGRandBusyBus = new And (2);
    public Not noBusy = new Not();

////////////////////////////////////////////////////////////////////////////////
//  Upravljacka
////////////////////////////////////////////////////////////////////////////////
    public uMemory uMem = new uMemory (8, 80);
    public Register8 cnt = new Register8 ("CNT");
    public Mux4 upravljackaMux = new Mux4 ();
    public uMemory kmstore = new uMemory (3, 8);
    public uMemory kmop = new uMemory (4, 8);
    public uMemory kmaddr = new uMemory (3, 8);
    public Or upravljackaOr1 = new Or (2);
    public Or upravljackaOr2 = new Or (2);
    public Or upravljackaOr3 = new Or (4);
    public And upravljackaAnd = new And	(2);
    
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
    
////////////////////////////////////////////////////////////////////////////////
//  Konstruktor
////////////////////////////////////////////////////////////////////////////////
    public Initializator() {
        //Nula za sve prazne ulaze
        Const nula = new Const(0);
        //Jedan za sve stalno aktivne ulaze
        Const jedan = new Const(1);
        
////////////////////////////////////////////////////////////////////////////////
//  PRESPAJANJE INTERNIH MAGISTRALA
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
        MBRbusorcpu.addInput8(M1, 0);
        MBRbusorcpu.addInput8(DBUS, 0);
        MBR.addInput8(MBRbusorcpu, 0);
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
//  REGFILE
////////////////////////////////////////////////////////////////////////////////        
       REGBUS.addInput16(M2, 0);
       REGBUS.addInput16(M3, 0);
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
       AX.addInput(andLdAX, 0);
       AXout.addInput(andOutAX, 0);
       BX.addInput(andLdBX, 0);
       BXout.addInput(andOutBX, 0);
       CX.addInput(andLdCX, 0);
       CXout.addInput(andOutCX, 0);
       DX.addInput(andLdDX, 0);
       DXout.addInput(andOutDX, 0);
       orLdSP.addInput(andLdSP, 0);
       SP.addInput(orLdSP, 0);
       orOutSP.addInput(andOutSP, 0);
       SPout.addInput(orOutSP, 0);
       orLdSI.addInput(andLdSI, 0);
       SI.addInput(orLdSI, 0);
       orOutSI.addInput(andOutSI, 0);
       SIout.addInput(orOutSI, 0);
       BP.addInput(andLdBP, 0);
       BPout.addInput(andOutBP, 0);
       DI.addInput(andLdDI, 0);
       DIout.addInput(andOutDI, 0);
       
       
       //Regsel
       RegselMux.addInput(IR2, 0);
       RegselMux.addInput(IR2, 1);
       RegselMux.addInput(IR2, 2);
       RegselMux.addInput(IR2, 3);
       RegselMux.addInput(IR2, 4);
       RegselMux.addInput(IR2, 5);
       //TODO Signal iz upravljacke
       RegselDec.addInput(RegselMux, 0);
       RegselDec.addInput(RegselMux, 1);
       RegselDec.addInput(RegselMux, 2);
       RegselDec.addInput(jedan, 0);
       andLdAX.addInput(RegselDec, 0);
       andLdBX.addInput(RegselDec, 1);
       andLdCX.addInput(RegselDec, 2);
       andLdDX.addInput(RegselDec, 3);
       andLdSP.addInput(RegselDec, 4);
       andLdBP.addInput(RegselDec, 5);
       andLdSI.addInput(RegselDec, 6);
       andLdDI.addInput(RegselDec, 7);
       
       
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
        orPswZ.addInput16(alu, 0);
        notPswZ.addInput(orPswZ, 0);
        
        and1PswC.addInput(not1PswC, 0);
        //fale ulazni signali
        not1PswC.addInput(alu, 16);
        not2PswC.addInput(and1PswC, 0);
        and2PswC.addInput(alu, 16);
        and2PswC.addInput(or1PswC, 0);
        not3PswC.addInput(and2PswC, 0);
        or2PswC.addInput(not2PswC, 0);
        or2PswC.addInput(not3PswC, 0);
        
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
        
        not4PswV.addInput(Y, 15);
        andIII3PswV.addInput(not4PswV, 0);
        andIII3PswV.addInput(alu, 15);
        
        not5PswV.addInput(alu, 15);
        andIII4PswV.addInput(not5PswV, 0);
        andIII4PswV.addInput(Y, 15);
        
        
        orIIIPswV.addInput(andIII4PswV, 0);
        orIIIPswV.addInput(andIII3PswV, 0);
        orIIIPswV.addInput(andII1PswV, 0);
        
        
////////////////////////////////////////////////////////////////////////////////
//  PSW
////////////////////////////////////////////////////////////////////////////////
        // N
        muxPSWN.addInput(alu, 15);
        muxPSWN.addInput(M1, 0);
        
        and1PSWN.addInput(muxPSWN, 0);
        
        notPSWN.addInput(muxPSWN, 0);
        and2PSWN.addInput(notPSWN, 0);
        
        PSWN.addInput(and1PSWN, 0);
        PSWN.addInput(and2PSWN, 0);
        PSWM2.addInput(PSWN, 0);
        PSWM3.addInput(PSWN, 0);
        
        // Z
        muxPSWZ.addInput(notPswZ, 0);
        muxPSWZ.addInput(M1, 1);
        
        and1PSWZ.addInput(muxPSWZ, 0);
        
        notPSWZ.addInput(muxPSWZ, 0);
        and2PSWZ.addInput(notPSWZ, 0);
        
        PSWZ.addInput(and1PSWZ, 0);
        PSWZ.addInput(and2PSWZ, 0);
        PSWM2.addInput(PSWZ, 0);
        PSWM3.addInput(PSWZ, 0);
        
        //C
        muxPSWC.addInput(or2PswC, 0);
        muxPSWC.addInput(M1, 2);
        
        and1PSWC.addInput(muxPSWC, 0);
        
        notPSWC.addInput(muxPSWC, 0);
        and2PSWC.addInput(notPSWC, 0);
        
        PSWC.addInput(and1PSWC, 0);
        PSWC.addInput(and2PSWC, 0);
        PSWM2.addInput(PSWC, 0);
        PSWM3.addInput(PSWC, 0);
        
        //V
        muxPSWV.addInput(orIIIPswV, 0);
        muxPSWV.addInput(M1, 3);
        
        and1PSWV.addInput(muxPSWV, 0);
        
        notPSWV.addInput(muxPSWV, 0);
        and2PSWV.addInput(notPSWV, 0);
        
        PSWV.addInput(and1PSWV, 0);
        PSWV.addInput(and2PSWV, 0);
        PSWM2.addInput(PSWV, 0);
        PSWM3.addInput(PSWV, 0);
        
        //I
        //TODO OVAVEZNO OVDE DODATI SIGNAL INTE, NE ISPOD
        muxPSWI.addInput(M1, 4);
        
        notPSWI.addInput(muxPSWI, 0);
        PSWI.addInput(muxPSWI, 0);
        PSWI.addInput(notPSWI, 0);
        PSWM2.addInput(PSWI, 0);
        PSWM3.addInput(PSWI, 0);
        
        //T
        //TODO isto kako i za I
        muxPSWT.addInput(M1, 5);
        
        notPSWI.addInput(muxPSWT, 0);
        PSWT.addInput(muxPSWT, 0);
        PSWT.addInput(notPSWT, 0);
        PSWM2.addInput(PSWT, 0);
        PSWM3.addInput(PSWT, 0);
        
        PSWM2.addInput(PSWL0, 0);
        PSWM2.addInput(PSWL1, 0);
        
        PSWM3.addInput(PSWL0, 0);
        PSWM3.addInput(PSWL1, 0);
        
        PSWM2.addInput8(nula, 0);
        PSWM3.addInput8(nula, 0);
        

////////////////////////////////////////////////////////////////////////////////
//  Prekidi
////////////////////////////////////////////////////////////////////////////////
        
////////////////////////////////////////////////////////////////////////////////
//  Arbitracija
////////////////////////////////////////////////////////////////////////////////
        //CPU
        BUSYBUS.addInput(busyBuss, 0);
        busyBuss.addInput(busySet, 0);
        BGRCpu.addInput(readorwrite, 0);
        BGRandBusyBus.addInput(BGRCpu, 0);
        BGRandBusyBus.addInput(noBusy, 0);
        noBusy.addInput(BUSYBUS, 0);
        
        //ARBITRATOR
        arbCoder.addInput(BGRandBusyBus, 0);
        for (int i = 0; i < 7; i++ ){
        	arbCoder.addInput(nula, 0);
        }
        //TODO add arbotrator E signal.
        arbDecoder.addInput(arbCoder, 0);
        arbDecoder.addInput(arbCoder, 1);
        arbDecoder.addInput(arbCoder, 2);
        arbDecoder.addInput(arbCoder, 3);

        
        
////////////////////////////////////////////////////////////////////////////////
//  Upravljacka
////////////////////////////////////////////////////////////////////////////////
        uMem.addInput8(cnt, 0);
        cnt.addInput8(upravljackaMux, 0);
        upravljackaMux.addInput8(uMem, 73);
        upravljackaMux.addInput8(kmaddr, 0);


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
