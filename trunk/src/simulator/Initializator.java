package simulator;
s
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
    public Mux8 muxMAR2 = new Mux8();
    public BusIn8 MARM1 = new BusIn8("MARM1");

    //IVTP
    public Register16 IVTP = new Register16("IVTP");
    public BusIn16 IVTPM2 = new BusIn16("IVTPM2");
	public BusIn16 IVTPM3 = new BusIn16("IVTPM3");

    //IR1
    public Register8 IR1 = new Register8("IR1");
    public BusIn8 IR1M2 = new BusIn8("IR1M2");
	public BusIn8 IR1M3 = new BusIn8("IR1M3");
    
    //IR2
    public Register8 IR2 = new Register8("IR2");
    public BusIn8 IR2M2 = new BusIn8("IR2M2");
	public BusIn8 IR2M3 = new BusIn8("IR2M3");
    
    //IR3
    public Register8 IR3 = new Register8("IR3");
    public BusIn8 IR3M2 = new BusIn8("IR3M2");
	public BusIn8 IR3M3 = new BusIn8("IR3M3");
    
    //IR4
    public Register8 IR4 = new Register8("IR4");
    public BusIn8 IR4M2 = new BusIn8("IR4M2");
	public BusIn8 IR4M3 = new BusIn8("IR4M3");

    //Y
    public Register16 Y = new Register16("Y");

    //TODO Ovo nisam znao kuci sta sve treba u regfile
    //Registarski fajl
    public And andLdR0 = new And(3);
    public Register8 R0 = new Register8("R0");

    public And andLdR1 = new And(3);
    public Register8 R1 = new Register8("R1");

    public And andLdR2 = new And(3);
    public Register8 R2 = new Register8("R2");

    public And andLdR3 = new And(3);
    public Register8 R3 = new Register8("R3");

    public Mux4 R = new Mux4();

    public Not notIR10 = new Not();
    public Not notIR11 = new Not();

////////////////////////////////////////////////////////////////////////////////
//  ALU
////////////////////////////////////////////////////////////////////////////////
    //ALU
    public Mux4 muxX = new Mux4();
    public Register8 X = new Register8("X");
    public Mux4 muxY = new Mux4();
    public Register8 Y = new Register8("Y");
    public Alu alu = new Alu();
    public Register8 ZL = new Register8("ZL");

    //ADDER
    public Mux2 muxAdderA = new Mux2();
    public Mux2 muxAdderB = new Mux2();
    public Add adder = new Add();
    public Register8 ZH = new Register8("ZH");
    public Mux2b muxADDC = new Mux2b();
    public Dff ADDC = new Dff();

    //ALU signals
    public Or add = new Or(2);
    public And add1 = new And(2);
    public And xor = new And(2);
    public And lsr = new And(2);
    public Buffer shl = new Buffer();
    public And trans = new And(2);

    //flags
    public Buffer IN = new Buffer();
    public Nor IZ = new Nor(8);
    public And IC = new And(2);
    public Or IV = new Or(2);
    public And IV1 = new And(4);
    public And IV2 = new And(4);
    public Not IV14 = new Not();
    public Not IV22 = new Not();
    public Not IV23 = new Not();
    
////////////////////////////////////////////////////////////////////////////////
//  PSW
////////////////////////////////////////////////////////////////////////////////
    //PSWN
    public Mux4b muxPSWN = new Mux4b();
    public Dff PSWN = new Dff();

    //PSWZ
    public Mux4b muxPSWZ = new Mux4b();
    public Dff PSWZ = new Dff();

    //PSWC
    public Mux4b muxPSWC = new Mux4b();
    public Dff PSWC = new Dff();

    //PSWV
    public Mux4b muxPSWV = new Mux4b();
    public Dff PSWV = new Dff();

    //PSWL1
    public Mux4b muxPSWL1 = new Mux4b();
    public Dff PSWL1 = new Dff();

    //PSWL0
    public Mux4b muxPSWL0 = new Mux4b();
    public Dff PSWL0 = new Dff();

    //PSWI
    public Mux4b muxPSWI = new Mux4b();
    public Dff PSWI = new Dff();

    //PSWT
    public Mux4b muxPSWT = new Mux4b();
    public Dff PSWT = new Dff();

////////////////////////////////////////////////////////////////////////////////
//  Prekidi
////////////////////////////////////////////////////////////////////////////////
    //IRR
    public SRff trap = new SRff();
    public SRff ffIRQ3 = new SRff();
    public SRff ffIRQ2 = new SRff();
    public SRff ffIRQ1 = new SRff();
    public SRff inm = new SRff();
    public SRff cintr = new SRff(); //kod instrukcije
    public SRff aintr = new SRff(); //ilegalno adresiranje

    //Unutrasnji
    public And inn = new And(2);

    //Maskirajuci
    public Dff imr3 = new Dff(); //unapred def. vrednosti
    public Dff imr2 = new Dff();
    public Dff imr1 = new Dff();
    public And irqImr3 = new And(2);
    public And irqImr2 = new And(2);
    public And irqImr1 = new And(2);
    public Or afterImr = new Or(3);
    public Coder4 irqCoder = new Coder4();
    public Comparator cmp = new Comparator(2);
    public And irq = new And(3);

    //Svi
    public Coder4 allIntr = new Coder4();
    public Decoder4 interrupts = new Decoder4();
    public Or INTR = new Or(4);

    //Acknowlagements
    public And intaTRAP = new And(2);
    public And andIntaIRQ = new And(2);
    public Decoder4 intaIRQ = new Decoder4();
    public And intaINM = new And(2);
    public And intaINN = new And(2);
    public And intaCODE = new And(2);
    public And intaADR = new And(2);

    //Broj Ulaza
    public Coder8 IEN = new Coder8();

    //L bitovi
    public Coder4 prior = new Coder4();
    public SRff MASK = new SRff();
    public SRff IL1 = new SRff();
    public SRff IL0 = new SRff();

////////////////////////////////////////////////////////////////////////////////
//  Sinhronizacija Master
////////////////////////////////////////////////////////////////////////////////
    //read write
    public Or sStartRead = new Or(2);
    public SRff startRead = new SRff();
    public And RD = new And(2);
    public Or sStartWrite = new Or(2);
    public SRff startWrite = new SRff();
    public And WR = new And(2);
    public Or RW = new Or(2);

    //FCBUS ACKBUS
    public Not FCin = new Not();
    public Not nFCin = new Not();
    public And sAck = new And(2);
    public Not nACKBUS = new Not();
    public And rAck = new And(2);
    public SRff ack = new SRff();

    //master cyc counter
    public Counter2 masterCycCnt = new Counter2();
    public Decoder4 masterCyc = new Decoder4();
    public And cond0Master = new And(2);
    public And cond1Master = new And(3);
    public And cond2Master = new And(3);
    public And cycEndMaster = new And(2);
    public Or masterInc = new Or(4);

    //veza sa magistralom
    public Or busout = new Or(3);
    public And RDbusout = new And(2);
    public And WRbusout = new And(2);
    public TBuffer abusBuff = new TBuffer(16);
    public TBuffer dbusBuff = new TBuffer(8);
    public TNot rdbusBuff = new TNot(1);
    public TNot wrbusBuff = new TNot(1);

    //kontrola ciklusa
    public And rdRepeat = new And(3);
    public And wrRepeat = new And(3);
    public And wrDone = new And(3);

    //run
    public Or sRun = new Or(2);
    public Or rRun = new Or(3);
    public SRff run = new SRff();

////////////////////////////////////////////////////////////////////////////////
//  Sinhronizacija Slave
////////////////////////////////////////////////////////////////////////////////
    //ABUS DBUS DABUS
    public Register8 procId = new Register8("Proc ID");
    public Comparator cmpHIT = new Comparator(8);
    public Buffer HIT = new Buffer();
    public Buffer MBRin = new Buffer();
    public Not DAin = new Not();
    public Not nDAin = new Not();

    //slave cyc counter
    public Counter2 slaveCycCnt = new Counter2();
    public Decoder4 slaveCyc = new Decoder4();
    public And cond0Slave = new And(3);
    public And cond1Slave = new And(3);
    public And cond2Slave = new And(2);
    public And cycEndSlave = new And(2);
    public Or slaveInc = new Or(4);

    //veza sa magistralom
    public Or FCbusout = new Or(3);
    public Buffer ACKbusout = new Buffer();
    public TNot fcbusBuff = new TNot(1);
    public TBuffer ackbusBuff = new TBuffer(1);

    //kontrola ciklusa
    public Buffer rdDone = new Buffer();

////////////////////////////////////////////////////////////////////////////////
//  Arbitracija
////////////////////////////////////////////////////////////////////////////////
    //Arbitrator
    public Buffer BGR0 = new Buffer();
    public Buffer BGR1 = new Buffer();
    public Buffer BGR2 = new Buffer();
    public Buffer BGR3 = new Buffer();
    public Buffer BREQ0 = new Buffer();
    public Buffer BREQ1 = new Buffer();
    public Buffer BREQ2 = new Buffer();
    public Buffer BREQ3 = new Buffer();
    public Coder4 arbCoder = new Coder4();
    public Decoder4 arbDecoder = new Decoder4();

    //Arbitracija u procesoru
    public HighZAdapter busyAdapter = new HighZAdapter();
    public Or REQ = new Or(4);
    public SRff BREQ = new SRff();
    public Buffer BGR = new Buffer();
    public And arbAnd = new And(3);
    public SRff GR = new SRff();
    public TNot busybusBuff = new TNot(1);

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
    public Not notPSWZ = new Not();
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
//  MemModul1 Slave
////////////////////////////////////////////////////////////////////////////////
    //ulaz sa magistrale
    public Not m1RDin = new Not();
    public Not m1WRin = new Not();
    public Or m1RWin = new Or(2);
    public Not m1nRWin = new Not();
    public Not m1HIT = new Not();

    //slave cyc counter
    public Counter2 m1SlaveCycCnt = new Counter2();
    public Decoder4 m1SlaveCyc = new Decoder4();
    public And m1Cond0Slave = new And(3);
    public And m1Cond1Slave = new And(3);
    public And m1Cond2Slave = new And(2);
    public And m1CycEndSlave = new And(2);
    public Or m1SlaveInc = new Or(4);

    //registri i memorija
    public And m1LdAR = new And(2);
    public Register16 m1AR = new Register16("modul1 AR");
    //TODO: Ovaj bafer ukloni kad se sredi KombMreza!!!!!!!!
    public Buffer8 m1dbusInBuff = new Buffer8();
    public Mux2 m1MuxDR = new Mux2();
    public And m1aLdDR = new And(3);
    public Or m1LdDR = new Or(2);
    public Register8 m1DR = new Register8("modul1 DR");
    public And m1LdIR = new And(3);
    public Register8 m1IR = new Register8("modul1 ID reg");
    public And m1RdMem = new And(2);
    public And m1WrMem = new And(2);
    public Memory m1Mem = new Memory();

    //izlaz na magistralu
    public Or m1FCbusout = new Or(3);
    public Buffer m1ACKbusout = new Buffer();
    public TNot m1fcbusBuff = new TNot(1);
    public TBuffer m1ackbusBuff = new TBuffer(1);

    //kontrola ciklusa
    public And m1sBusy = new And(3);
    public Or m1rBusy = new Or(2);
    public SRff m1Busy = new SRff();
    public And m1sSlaveAck = new And(2);
    public And m1rSlaveAck = new And(2);
    public SRff m1SlaveAck = new SRff();
    public And m1sReadCyc = new And(3);
    public And m1rReadCyc = new And(2);
    public SRff m1ReadCyc = new SRff();
    public And m1sWriteCyc = new And(3);
    public And m1rWriteCyc = new And(2);
    public SRff m1WriteCyc = new SRff();
    public And m1ReturnCyc = new And(2);
    public And m1WrDone = new And(2);

    //pristup memoriji
    public Or m1rwCyc = new Or(2);
    public And m1Count = new And(2);
    public Not m1nCount = new Not();
    public Register8 m1MemAccTime = new Register8("Memory modul1 access time");
    public Counter m1MemAcc = new Counter();
    public Nor m1MemAccDone = new Nor(8);

////////////////////////////////////////////////////////////////////////////////
//  MemModul1 Master
////////////////////////////////////////////////////////////////////////////////
    //return
    public Or m1sRetFF = new Or(2);
    public SRff m1RetFF = new SRff();
    public And m1RET = new And(2);

    //ulaz sa magistrale
    public Not m1FCin = new Not();
    public Not m1nFCin = new Not();
    public Not m1nACKBUS = new Not();
    public And m1sMasterAck = new And(2);
    public And m1rMasterAck = new And(2);
    public SRff m1MasterAck = new SRff();

    //master cyc counter
    public Counter2 m1MasterCycCnt = new Counter2();
    public Decoder4 m1MasterCyc = new Decoder4();
    public And m1Cond0Master = new And(2);
    public And m1Cond1Master = new And(3);
    public And m1Cond2Master = new And(3);
    public And m1CycEndMaster = new And(2);
    public Or m1MasterInc = new Or(4);

    //izlaz na magistralu
    public Or m1busout = new Or(3);
    public TBuffer m1abusBuff = new TBuffer(16);
    public TBuffer m1dbusBuff = new TBuffer(8);
    public TNot m1dabusBuff = new TNot(1);

    //kontola ciklusa
    public And m1RetRepeat = new And(2);
    public And m1RdDone = new And(2);

////////////////////////////////////////////////////////////////////////////////
//  MemModul1 Arbitracija
////////////////////////////////////////////////////////////////////////////////
    //Arbitracija
    public HighZAdapter m1BusyAdapter = new HighZAdapter();
    public Or m1REQ = new Or(2);
    public SRff m1BREQ = new SRff();
    public Buffer m1BGR = new Buffer();
    public And m1sGR = new And(3);
    public SRff m1GR = new SRff();
    public TNot m1busybusBuff = new TNot(1);

////////////////////////////////////////////////////////////////////////////////
//  MemModul2 Slave
////////////////////////////////////////////////////////////////////////////////
    //ulaz sa magistrale
    public Not m2RDin = new Not();
    public Not m2WRin = new Not();
    public Or m2RWin = new Or(2);
    public Not m2nRWin = new Not();
    public Buffer m2HIT = new Buffer();

    //slave cyc counter
    public Counter2 m2SlaveCycCnt = new Counter2();
    public Decoder4 m2SlaveCyc = new Decoder4();
    public And m2Cond0Slave = new And(3);
    public And m2Cond1Slave = new And(3);
    public And m2Cond2Slave = new And(2);
    public And m2CycEndSlave = new And(2);
    public Or m2SlaveInc = new Or(4);

    //registri i memorija
    public And m2LdAR = new And(2);
    public Register16 m2AR = new Register16("modul2 AR");
    //TODO: Ovaj bafer ukloni kad se sredi KombMreza!!!!!!!!
    public Buffer8 m2dbusInBuff = new Buffer8();
    public Mux2 m2MuxDR = new Mux2();
    public And m2aLdDR = new And(3);
    public Or m2LdDR = new Or(2);
    public Register8 m2DR = new Register8("modul2 DR");
    public And m2LdIR = new And(3);
    public Register8 m2IR = new Register8("modul2 ID reg");
    public And m2RdMem = new And(2);
    public And m2WrMem = new And(2);
    public Memory m2Mem = new Memory();

    //izlaz na magistralu
    public Or m2FCbusout = new Or(3);
    public Buffer m2ACKbusout = new Buffer();
    public TNot m2fcbusBuff = new TNot(1);
    public TBuffer m2ackbusBuff = new TBuffer(1);

    //kontrola ciklusa
    public And m2sBusy = new And(3);
    public Or m2rBusy = new Or(2);
    public SRff m2Busy = new SRff();
    public And m2sSlaveAck = new And(2);
    public And m2rSlaveAck = new And(2);
    public SRff m2SlaveAck = new SRff();
    public And m2sReadCyc = new And(3);
    public And m2rReadCyc = new And(2);
    public SRff m2ReadCyc = new SRff();
    public And m2sWriteCyc = new And(3);
    public And m2rWriteCyc = new And(2);
    public SRff m2WriteCyc = new SRff();
    public And m2ReturnCyc = new And(2);
    public And m2WrDone = new And(2);

    //pristup memoriji
    public Or m2rwCyc = new Or(2);
    public And m2Count = new And(2);
    public Not m2nCount = new Not();
    public Register8 m2MemAccTime = new Register8("Memory modul2 access time");
    public Counter m2MemAcc = new Counter();
    public Nor m2MemAccDone = new Nor(8);

////////////////////////////////////////////////////////////////////////////////
//  MemModul2 Master
////////////////////////////////////////////////////////////////////////////////
    //return
    public Or m2sRetFF = new Or(2);
    public SRff m2RetFF = new SRff();
    public And m2RET = new And(2);

    //ulaz sa magistrale
    public Not m2FCin = new Not();
    public Not m2nFCin = new Not();
    public Not m2nACKBUS = new Not();
    public And m2sMasterAck = new And(2);
    public And m2rMasterAck = new And(2);
    public SRff m2MasterAck = new SRff();

    //master cyc counter
    public Counter2 m2MasterCycCnt = new Counter2();
    public Decoder4 m2MasterCyc = new Decoder4();
    public And m2Cond0Master = new And(2);
    public And m2Cond1Master = new And(3);
    public And m2Cond2Master = new And(3);
    public And m2CycEndMaster = new And(2);
    public Or m2MasterInc = new Or(4);

    //izlaz na magistralu
    public Or m2busout = new Or(3);
    public TBuffer m2abusBuff = new TBuffer(16);
    public TBuffer m2dbusBuff = new TBuffer(8);
    public TNot m2dabusBuff = new TNot(1);

    //kontola ciklusa
    public And m2RetRepeat = new And(2);
    public And m2RdDone = new And(2);

////////////////////////////////////////////////////////////////////////////////
//  MemModul2 Arbitracija
////////////////////////////////////////////////////////////////////////////////
    //Arbitracija
    public HighZAdapter m2BusyAdapter = new HighZAdapter();
    public Or m2REQ = new Or(2);
    public SRff m2BREQ = new SRff();
    public Buffer m2BGR = new Buffer();
    public And m2sGR = new And(3);
    public SRff m2GR = new SRff();
    public TNot m2busybusBuff = new TNot(1);

////////////////////////////////////////////////////////////////////////////////
//  MemoryWrapper
////////////////////////////////////////////////////////////////////////////////
    public MemoryWrapper mw = new MemoryWrapper(m1Mem, m2Mem);

////////////////////////////////////////////////////////////////////////////////
//  Magistrale
////////////////////////////////////////////////////////////////////////////////
    public Bus16 ABUS = new Bus16(3);
    public Bus8 DBUS = new Bus8(3);
    public Bus1 FCBUS = new Bus1(3);
    public Bus1 RDBUS = new Bus1(1);
    public Bus1 WRBUS = new Bus1(1);
    public Bus1 DABUS = new Bus1(2);
    public Bus1 ACKBUS = new Bus1(3);
    public Bus1 BUSYBUS = new Bus1(3);

////////////////////////////////////////////////////////////////////////////////
//  Uredjaji
////////////////////////////////////////////////////////////////////////////////
    public Dff IRQ1 = new Dff();
    public Dff IRQ2 = new Dff();
    public Dff IRQ3 = new Dff();
    public Dff INM = new Dff();


////////////////////////////////////////////////////////////////////////////////
//  Konstruktor
////////////////////////////////////////////////////////////////////////////////
    public Initializator() {
        //Nula za sve prazne ulaze
        Const nula = new Const(0);
        //Jedan za sve stalno aktivne ulaze
        Const jedan = new Const(1);

////////////////////////////////////////////////////////////////////////////////
//  REGISTRI
////////////////////////////////////////////////////////////////////////////////
        //PC	16b
        //mux1
        muxPC1.addInput8(IR2, 0);
        muxPC1.addInput8(MBR, 0);
        muxPC1.addInput(mxPC, 0); //TODO: CU
        //mux2
        muxPC2.addInput8(IR3, 0);
        muxPC2.addInput8(MBR, 0);
        muxPC2.addInput(mxPC, 0); //TODO: CU
        //PC
        PC.addInput8(muxPC2, 0); //nizih 8b
        PC.addInput8(muxPC1, 0); //visih 8b
        PC.addInput(nula, 0); //LD
        PC.addInput(ldPCL, 0); //LDL		//TODO: CU
        PC.addInput(ldPCH, 0); //LDH		//TODO: CU
        PC.addInput(nula, 0); //CLR
        PC.addInput(incPC, 0); //INC		//TODO: CU
        PC.addInput(nula, 0); //DEC

        //MBR	8b
        //muxMBR
        //TODO: izbaci
        dbusInBuff.addInput8(DBUS, 0);
        //TODO: promeni dbusBuff u DBUS
        muxMBR.addInput8(dbusInBuff, 0);
        //muxMBR.addInput8(DBUS, 0); //DBUS
        muxMBR.addInput8(A, 0);
        muxMBR.addInput8(PC, 8); //PCH
        muxMBR.addInput8(PC, 0); //PCL
        muxMBR.addInput(PSWT, 0); //PSW (N Z C V L1 L0 I T)
        muxMBR.addInput(PSWI, 0); //
        muxMBR.addInput(PSWL0, 0); //
        muxMBR.addInput(PSWL1, 0); //
        muxMBR.addInput(PSWV, 0); //
        muxMBR.addInput(PSWC, 0); //
        muxMBR.addInput(PSWZ, 0); //
        muxMBR.addInput(PSWN, 0); //
        muxMBR.addInput8(nula, 0);
        muxMBR.addInput8(nula, 0);
        muxMBR.addInput8(nula, 0);
        muxMBR.addInput(mxMBR0, 0); //TODO: CU
        muxMBR.addInput(mxMBR1, 0); //TODO: CU
        muxMBR.addInput(mxMBR2, 0); //TODO: CU
        //orMbrLd
        orMbrLd.addInput(ldMBR, 0); //TODO: CU
        orMbrLd.addInput(MBRin, 0);
        //MBR
        MBR.addInput8(muxMBR, 0);
        MBR.addInput(orMbrLd, 0); //LD
        MBR.addInput(clMBR, 0); //CLR  //TODO: CU
        MBR.addInput(nula, 0); //INC
        MBR.addInput(nula, 0); //DEC

        //MAR	16b
        //mux1
        muxMAR1.addInput8(PC, 8); //PCH
        muxMAR1.addInput8(IR2, 0);
        muxMAR1.addInput8(B, 0);
        muxMAR1.addInput8(ZH, 0);
        muxMAR1.addInput8(SP, 8); //SPH
        muxMAR1.addInput8(nula, 0);
        muxMAR1.addInput8(nula, 0);
        muxMAR1.addInput8(nula, 0);
        muxMAR1.addInput(mxMAR0, 0); //TODO: CU
        muxMAR1.addInput(mxMAR1, 0); //TODO: CU
        muxMAR1.addInput(mxMAR2, 0); //TODO: CU
        //mux2
        muxMAR2.addInput8(PC, 0); //PCL
        muxMAR2.addInput8(IR3, 0);
        muxMAR2.addInput8(MBR, 0);
        muxMAR2.addInput8(ZL, 0);
        muxMAR2.addInput8(SP, 0); //SPL
        muxMAR2.addInput8(nula, 0);
        muxMAR2.addInput8(nula, 0);
        muxMAR2.addInput8(nula, 0);
        muxMAR2.addInput(mxMAR0, 0); //TODO: CU
        muxMAR2.addInput(mxMAR1, 0); //TODO: CU
        muxMAR2.addInput(mxMAR2, 0); //TODO: CU
        //MAR
        MAR.addInput8(muxMAR2, 0); //nizih 8b
        MAR.addInput8(muxMAR1, 0); //visih 8b
        MAR.addInput(ldMAR, 0); //LD		//TODO: CU
        MAR.addInput(nula, 0); //LDL
        MAR.addInput(nula, 0); //LDH
        MAR.addInput(nula, 0); //CLR
        MAR.addInput(incMAR, 0); //INC		//TODO: CU
        MAR.addInput(nula, 0); //DEC

        //SP	16b
        SP.addInput8(nula, 0); //informacioni ulazi sve nule
        SP.addInput8(nula, 0); //
        SP.addInput(nula, 0); //LD
        SP.addInput(nula, 0); //LDL
        SP.addInput(nula, 0); //LDH
        SP.addInput(nula, 0); //CLR
        SP.addInput(incSP, 0); //INC		//TODO: CU
        SP.addInput(decSP, 0); //DEC		//TODO: CU

        //IVTP	16b
        IVTP.addInput8(nula, 0); //informacioni ulazi sve nule
        IVTP.addInput8(nula, 0); //
        IVTP.addInput(nula, 0); //LD
        IVTP.addInput(nula, 0); //LDL
        IVTP.addInput(nula, 0); //LDH
        IVTP.addInput(nula, 0); //CLR
        IVTP.addInput(nula, 0); //INC		//TODO: CU
        IVTP.addInput(nula, 0); //DEC		//TODO: CU

        //IR	3x8b
        //IR1
        IR1.addInput8(MBR, 0); //MBR->IR1
        IR1.addInput(ldIR1, 0); //LD		//TODO: CU
        IR1.addInput(nula, 0); //CLR
        IR1.addInput(nula, 0); //INC
        IR1.addInput(nula, 0); //DEC
        //IR2
        IR2.addInput8(MBR, 0); //MBR->IR1
        IR2.addInput(ldIR2, 0); //LD		//TODO: CU
        IR2.addInput(nula, 0); //CLR
        IR2.addInput(nula, 0); //INC
        IR2.addInput(nula, 0); //DEC
        //IR3
        IR3.addInput8(MBR, 0); //MBR->IR1
        IR3.addInput(ldIR3, 0); //LD		//TODO: CU
        IR3.addInput(nula, 0); //CLR
        IR3.addInput(nula, 0); //INC
        IR3.addInput(nula, 0); //DEC

        //A	8b
        A.addInput8(ZL, 0);
        A.addInput(ldA, 0); //LD	//TODO: CU
        A.addInput(nula, 0); //CLR
        A.addInput(nula, 0); //INC
        A.addInput(nula, 0); //DEC

        //B	8b
        muxB.addInput8(R, 0);
        muxB.addInput8(MBR, 0);
        muxB.addInput8(IR2, 0);
        muxB.addInput(IEN, 0); //IEN
        muxB.addInput(IEN, 1); //
        muxB.addInput(IEN, 2); //
        muxB.addInput(nula, 0); //5 nula
        muxB.addInput(nula, 0); //
        muxB.addInput(nula, 0); //
        muxB.addInput(nula, 0); //
        muxB.addInput(nula, 0); //
        muxB.addInput(mxB0, 0); //TODO: CU
        muxB.addInput(mxB1, 0); //TODO: CU
        B.addInput8(muxB, 0);
        B.addInput(ldB, 0); //LD	//TODO: CU
        B.addInput(nula, 0); //CLR
        B.addInput(nula, 0); //INC
        B.addInput(nula, 0); //DEC

        //Registarski fajl	4x8b
        notIR10.addInput(IR1, 0);
        notIR11.addInput(IR1, 1);
        //R0
        R0.addInput8(A, 0); //A->R0
        R0.addInput(andLdR0, 0); //LD
        R0.addInput(nula, 0); //CLR
        R0.addInput(nula, 0); //INC
        R0.addInput(nula, 0); //DEC
        //andLdR0
        andLdR0.addInput(REGin, 0); //TODO: CU
        andLdR0.addInput(notIR11, 0);
        andLdR0.addInput(notIR10, 0);
        //R1
        R1.addInput8(A, 0); //A->R1
        R1.addInput(andLdR1, 0); //LD
        R1.addInput(nula, 0); //CLR
        R1.addInput(nula, 0); //INC
        R1.addInput(nula, 0); //DEC
        //andLdR1
        andLdR1.addInput(REGin, 0); //TODO: CU
        andLdR1.addInput(notIR11, 0);
        andLdR1.addInput(IR1, 0);
        //R2
        R2.addInput8(A, 0); //A->R2
        R2.addInput(andLdR2, 0); //LD
        R2.addInput(nula, 0); //CLR
        R2.addInput(nula, 0); //INC
        R2.addInput(nula, 0); //DEC
        //andLdR2
        andLdR2.addInput(REGin, 0); //TODO: CU
        andLdR2.addInput(IR1, 1);
        andLdR2.addInput(notIR10, 0);
        //R3
        R3.addInput8(A, 0); //A->R3
        R3.addInput(andLdR3, 0); //LD
        R3.addInput(nula, 0); //CLR
        R3.addInput(nula, 0); //INC
        R3.addInput(nula, 0); //DEC
        //andLdR3
        andLdR3.addInput(REGin, 0); //TODO: CU
        andLdR3.addInput(IR1, 1);
        andLdR3.addInput(IR1, 0);
        //R MUX
        R.addInput8(R0, 0);
        R.addInput8(R1, 0);
        R.addInput8(R2, 0);
        R.addInput8(R3, 0);
        R.addInput(IR1, 0);
        R.addInput(IR1, 1);

////////////////////////////////////////////////////////////////////////////////
//  ALU
////////////////////////////////////////////////////////////////////////////////
        //ALU
        //muxX
        muxX.addInput8(A, 0);
        muxX.addInput8(PC, 0); //PCL
        muxX.addInput8(IVTP, 0); //IVTPL
        muxX.addInput8(nula, 0);
        muxX.addInput(mxX0, 0); //TODO: CU
        muxX.addInput(mxX1, 0); //TODO: CU
        //X	8b
        X.addInput8(muxX, 0);
        X.addInput(ldX, 0); //LD	//TODO: CU
        X.addInput(nula, 0); //CLR
        X.addInput(nula, 0); //INC
        X.addInput(nula, 0); //DEC
        //muxY
        muxY.addInput8(B, 0);
        muxY.addInput8(IR3, 0);
        muxY.addInput8(ZL, 0);
        muxY.addInput8(nula, 0);
        muxY.addInput(mxY0, 0); //TODO: CU
        muxY.addInput(mxY1, 0); //TODO: CU
        //Y	8b
        Y.addInput8(muxY, 0);
        Y.addInput(ldY, 0); //LD	//TODO: CU
        Y.addInput(nula, 0); //CLR
        Y.addInput(nula, 0); //INC
        Y.addInput(nula, 0); //DEC
        //alu
        alu.addInput8(X, 0);
        alu.addInput8(Y, 0);
        alu.addInput(add, 0);
        alu.addInput(xor, 0);
        alu.addInput(lsr, 0);
        alu.addInput(shl, 0);
        alu.addInput(nula, 0); //transX
        alu.addInput(trans, 0);
        //ZL 8b
        ZL.addInput8(alu, 0);
        ZL.addInput(ldZL, 0); //LD	//TODO: CU
        ZL.addInput(nula, 0); //CLR
        ZL.addInput(nula, 0); //INC
        ZL.addInput(nula, 0); //DEC

        //ADDER
        //muxAdderA
        muxAdderA.addInput8(PC, 8); //PCH
        muxAdderA.addInput8(IVTP, 8); //IVTPH
        muxAdderA.addInput(mxADD, 0); //TODO: CU
        //muxAdderB
        muxAdderB.addInput8(IR2, 0);
        muxAdderB.addInput8(nula, 0);
        muxAdderB.addInput(mxADD, 0); //TODO: CU
        //adder
        adder.addInput8(muxAdderA, 0);
        adder.addInput8(muxAdderB, 0);
        adder.addInput(alu, 8); //ALU C8 -> ADDER C0
        //ZH 8b
        ZH.addInput8(adder, 0);
        ZH.addInput(ldZH, 0); //LD	//TODO: CU
        ZH.addInput(nula, 0); //CLR
        ZH.addInput(nula, 0); //INC
        ZH.addInput(nula, 0); //DEC
        //muxADDC
        muxADDC.addInput(ADDC, 0);
        muxADDC.addInput(adder, 8); //ADDER C8 -> muxADDC I1
        muxADDC.addInput(ldADDC, 0); //TODO: CU
        //ADDC
        ADDC.addInput(muxADDC, 0);

        //ALU signals
        //add
        add.addInput(add1, 0);
        add.addInput(ALUadd, 0); //TODO: CU
        add1.addInput(ADD, 0); //TODO: CU
        add1.addInput(ALUop, 0); //TODO: CU
        //xor
        xor.addInput(XOR, 0); //TODO: CU
        xor.addInput(ALUop, 0); //TODO: CU
        //lsr
        lsr.addInput(LSR, 0); //TODO: CU
        lsr.addInput(ALUop, 0); //TODO: CU
        //shl
        shl.addInput(ALUshl, 0); //TODO: CU
        //transY
        trans.addInput(LOAD, 0); //TODO: CU
        trans.addInput(ALUop, 0); //TODO: CU

        //Flags
        //IN
        IN.addInput(alu, 7);
        //IZ
        IZ.addInput(alu, 0);
        IZ.addInput(alu, 1);
        IZ.addInput(alu, 2);
        IZ.addInput(alu, 3);
        IZ.addInput(alu, 4);
        IZ.addInput(alu, 5);
        IZ.addInput(alu, 6);
        IZ.addInput(alu, 7);
        //IC
        IC.addInput(ADD, 0); //TODO: CU
        IC.addInput(alu, 8); //C8
        //IV
        IV.addInput(IV1, 0);
        IV.addInput(IV2, 0);
        IV1.addInput(ADD, 0); //TODO: CU
        IV1.addInput(X, 7);
        IV1.addInput(Y, 7);
        IV1.addInput(IV14, 0); //not ALU7
        IV2.addInput(ADD, 0); //TODO: CU
        IV2.addInput(IV22, 0); //not X7
        IV2.addInput(IV23, 0); //not Y7
        IV2.addInput(alu, 7);
        IV14.addInput(alu, 7);
        IV22.addInput(X, 7);
        IV23.addInput(Y, 7);

////////////////////////////////////////////////////////////////////////////////
//  PSW
////////////////////////////////////////////////////////////////////////////////
        //PSWN
        muxPSWN.addInput(PSWN, 0); //informacioni ulazi
        muxPSWN.addInput(MBR, 7); //
        muxPSWN.addInput(IN, 0); //
        muxPSWN.addInput(nula, 0); //
        muxPSWN.addInput(ldPSW, 0); //kontrolni ulazi	//TODO: CU
        muxPSWN.addInput(ldNZCV, 0); //					//TODO: CU
        PSWN.addInput(muxPSWN, 0);

        //PSWZ
        muxPSWZ.addInput(PSWZ, 0); //informacioni ulazi
        muxPSWZ.addInput(MBR, 6); //
        muxPSWZ.addInput(IZ, 0); //
        muxPSWZ.addInput(nula, 0); //
        muxPSWZ.addInput(ldPSW, 0); //kontrolni ulazi	//TODO: CU
        muxPSWZ.addInput(ldNZCV, 0); //					//TODO: CU
        PSWZ.addInput(muxPSWZ, 0);

        //PSWC
        muxPSWC.addInput(PSWC, 0); //informacioni ulazi
        muxPSWC.addInput(MBR, 5); //
        muxPSWC.addInput(IC, 0); //
        muxPSWC.addInput(nula, 0); //
        muxPSWC.addInput(ldPSW, 0); //kontrolni ulazi	//TODO: CU
        muxPSWC.addInput(ldNZCV, 0); //					//TODO: CU
        PSWC.addInput(muxPSWC, 0);

        //PSWV
        muxPSWV.addInput(PSWV, 0); //informacioni ulazi
        muxPSWV.addInput(MBR, 4); //
        muxPSWV.addInput(IV, 0); //
        muxPSWV.addInput(nula, 0); //
        muxPSWV.addInput(ldPSW, 0); //kontrolni ulazi	//TODO: CU
        muxPSWV.addInput(ldNZCV, 0); //					//TODO: CU
        PSWV.addInput(muxPSWV, 0);

        //PSWL1
        muxPSWL1.addInput(PSWL1, 0); //informacioni ulazi
        muxPSWL1.addInput(MBR, 3); //
        muxPSWL1.addInput(IL1, 0); //
        muxPSWL1.addInput(nula, 0); //
        muxPSWL1.addInput(ldPSW, 0); //kontrolni ulazi	//TODO: CU
        muxPSWL1.addInput(ldL1L0, 0); //					//TODO: CU
        PSWL1.addInput(muxPSWL1, 0);

        //PSWL0
        muxPSWL0.addInput(PSWL0, 0); //informacioni ulazi
        muxPSWL0.addInput(MBR, 2); //
        muxPSWL0.addInput(IL0, 0); //
        muxPSWL0.addInput(nula, 0); //
        muxPSWL0.addInput(ldPSW, 0); //kontrolni ulazi	//TODO: CU
        muxPSWL0.addInput(ldL1L0, 0); //					//TODO: CU
        PSWL0.addInput(muxPSWL0, 0);

        //PSWI
        muxPSWI.addInput(PSWI, 0); //informacioni ulazi
        muxPSWI.addInput(MBR, 1); //
        muxPSWI.addInput(it, 0); //					//TODO: CU
        muxPSWI.addInput(nula, 0); //
        muxPSWI.addInput(ldPSW, 0); //kontrolni ulazi	//TODO: CU
        muxPSWI.addInput(ldI, 0); //					//TODO: CU
        PSWI.addInput(muxPSWI, 0);

        //PSWT
        muxPSWT.addInput(PSWT, 0); //informacioni ulazi
        muxPSWT.addInput(MBR, 0); //
        muxPSWT.addInput(it, 0); //					//TODO: CU
        muxPSWT.addInput(nula, 0); //
        muxPSWT.addInput(ldPSW, 0); //kontrolni ulazi	//TODO: CU
        muxPSWT.addInput(ldT, 0); //					//TODO: CU
        PSWT.addInput(muxPSWT, 0);

////////////////////////////////////////////////////////////////////////////////
//  Prekidi
////////////////////////////////////////////////////////////////////////////////
        //IRR
        //trap
        trap.addInput(PSWT, 0);
        trap.addInput(intaTRAP, 0);
        //IRQ
        ffIRQ3.addInput(IRQ3, 0);
        ffIRQ3.addInput(intaIRQ, 3);
        ffIRQ2.addInput(IRQ2, 0);
        ffIRQ2.addInput(intaIRQ, 2);
        ffIRQ1.addInput(IRQ1, 0);
        ffIRQ1.addInput(intaIRQ, 1);
        //nemaskirajuci
        inm.addInput(INM, 0);
        inm.addInput(intaINM, 0);
        //unutrasnji
        cintr.addInput(setCINTR, 0); //TODO: CU
        cintr.addInput(intaCODE, 0);
        aintr.addInput(setAINTR, 0); //TODO: CU
        aintr.addInput(intaADR, 0);

        //Unutrasnji
        inn.addInput(cintr, 0);
        inn.addInput(aintr, 0);

        //Maskirajuci
        //IMR
        imr3.addInput(nula, 0);
        imr2.addInput(nula, 0);
        imr1.addInput(nula, 0);
        //and kola
        irqImr3.addInput(imr3, 0);
        irqImr3.addInput(ffIRQ3, 0);
        irqImr2.addInput(imr2, 0);
        irqImr2.addInput(ffIRQ2, 0);
        irqImr1.addInput(imr1, 0);
        irqImr1.addInput(ffIRQ1, 0);
        //or kolo
        afterImr.addInput(irqImr3, 0);
        afterImr.addInput(irqImr2, 0);
        afterImr.addInput(irqImr1, 0);
        //koder
        irqCoder.addInput(nula, 0);
        irqCoder.addInput(irqImr1, 0);
        irqCoder.addInput(irqImr2, 0);
        irqCoder.addInput(irqImr3, 0);
        irqCoder.addInput(jedan, 0); //E=1
        //komparator
        cmp.addInput(PSWL0, 0); //A0
        cmp.addInput(PSWL1, 0); //A1
        cmp.addInput(irqCoder, 0); //B0
        cmp.addInput(irqCoder, 1); //B1
        //poslednje and kolo
        irq.addInput(PSWI, 0);
        irq.addInput(afterImr, 0);
        irq.addInput(cmp, 0);

        //Svi
        //koder za sve prekide
        allIntr.addInput(trap, 0);
        allIntr.addInput(irq, 0);
        allIntr.addInput(inm, 0);
        allIntr.addInput(inn, 0);
        allIntr.addInput(jedan, 0); //E=1
        //sledeci dekoder
        interrupts.addInput(allIntr, 0);
        interrupts.addInput(allIntr, 1);
        interrupts.addInput(allIntr, 2); //E=W kodera
        //INTR ili kolo
        INTR.addInput(interrupts, 0);
        INTR.addInput(interrupts, 1);
        INTR.addInput(interrupts, 2);
        INTR.addInput(interrupts, 3);

        //Acknowlagements
        //inta trap
        intaTRAP.addInput(inta, 0); //TODO: CU
        intaTRAP.addInput(interrupts, 0);
        //inta IRQ
        andIntaIRQ.addInput(inta, 0); //TODO: CU
        andIntaIRQ.addInput(interrupts, 1);
        intaIRQ.addInput(irqCoder, 0);
        intaIRQ.addInput(irqCoder, 1);
        intaIRQ.addInput(andIntaIRQ, 0); //E
        //inta nemaskirajuci
        intaINM.addInput(inta, 0); //TODO: CU
        intaINM.addInput(interrupts, 2);
        //inta unutrasnji
        intaINN.addInput(inta, 0); //TODO: CU
        intaINN.addInput(interrupts, 3);
        intaCODE.addInput(intaINN, 0);
        intaCODE.addInput(cintr, 0);
        intaADR.addInput(intaINN, 0);
        intaADR.addInput(aintr, 0);

        //Broj Ulaza
        IEN.addInput(intaTRAP, 0);
        IEN.addInput(intaINM, 0);
        IEN.addInput(intaADR, 0);
        IEN.addInput(intaCODE, 0);
        IEN.addInput(nula, 0);
        IEN.addInput(intaIRQ, 1);
        IEN.addInput(intaIRQ, 2);
        IEN.addInput(intaIRQ, 3);
        IEN.addInput(jedan, 0); //E=1

        //L bitovi
        //koder za L bitove
        prior.addInput(nula, 0);
        prior.addInput(intaIRQ, 1);
        prior.addInput(intaIRQ, 2);
        prior.addInput(intaIRQ, 3);
        prior.addInput(jedan, 0); //E=1
        //flip-flopovi
        MASK.addInput(prior, 2); //MASK.S=prior.W
        MASK.addInput(ldL1L0, 0); //TODO: CU
        IL1.addInput(prior, 1);
        IL1.addInput(ldL1L0, 0); //TODO: CU
        IL0.addInput(prior, 0);
        IL0.addInput(ldL1L0, 0); //TODO: CU

////////////////////////////////////////////////////////////////////////////////
//  Sinhronizacija Master
////////////////////////////////////////////////////////////////////////////////
        //read write
        //RD
        sStartRead.addInput(read, 0);
        sStartRead.addInput(rdRepeat, 0);
        startRead.addInput(sStartRead, 0);
        startRead.addInput(cycEndMaster, 0);
        RD.addInput(startRead, 0);
        RD.addInput(GR, 0);
        //WR
        sStartWrite.addInput(write, 0);
        sStartWrite.addInput(wrRepeat, 0);
        startWrite.addInput(sStartWrite, 0);
        startWrite.addInput(cycEndMaster, 0);
        WR.addInput(startWrite, 0);
        WR.addInput(GR, 0);
        //RW
        RW.addInput(RD, 0);
        RW.addInput(WR, 0);

        //FCBUS
        FCin.addInput(FCBUS, 0);
        nFCin.addInput(FCin, 0);
        //ACKBUS
        sAck.addInput(ACKBUS, 0);
        sAck.addInput(masterCyc, 1);
        nACKBUS.addInput(ACKBUS, 0);
        rAck.addInput(nACKBUS, 0);
        rAck.addInput(masterCyc, 1);
        ack.addInput(sAck, 0);
        ack.addInput(rAck, 0);

        //master cyc counter
        //cnt
        masterCycCnt.addInput(masterInc, 0);
        //decoder
        masterCyc.addInput(masterCycCnt, 0);
        masterCyc.addInput(masterCycCnt, 1);
        masterCyc.addInput(jedan, 0); //E
        //ands for inc
        cond0Master.addInput(RW, 0);
        cond0Master.addInput(masterCyc, 0);
        cond1Master.addInput(RW, 0);
        cond1Master.addInput(masterCyc, 1);
        cond1Master.addInput(FCin, 0);
        cond2Master.addInput(RW, 0);
        cond2Master.addInput(masterCyc, 2);
        cond2Master.addInput(nFCin, 0);
        cycEndMaster.addInput(RW, 0);
        cycEndMaster.addInput(masterCyc, 3);
        //inc
        masterInc.addInput(cond0Master, 0);
        masterInc.addInput(cond1Master, 0);
        masterInc.addInput(cond2Master, 0);
        masterInc.addInput(cycEndMaster, 0);

        //veza sa magistralom
        //out signals
        busout.addInput(cond0Master, 0);
        busout.addInput(masterCyc, 1);
        busout.addInput(masterCyc, 2);
        RDbusout.addInput(RD, 0);
        RDbusout.addInput(busout, 0);
        WRbusout.addInput(WR, 0);
        WRbusout.addInput(busout, 0);
        //buffers
        abusBuff.addInput8(MAR, 0);
        abusBuff.addInput8(MAR, 8);
        abusBuff.addInput(busout, 0);
        dbusBuff.addInput8(MBR, 0);
        dbusBuff.addInput(busout, 0);
        rdbusBuff.addInput(masterCyc, 1);
        rdbusBuff.addInput(RDbusout, 0);
        wrbusBuff.addInput(masterCyc, 1);
        wrbusBuff.addInput(WRbusout, 0);

        //kontrola ciklusa
        //rd_repeat
        rdRepeat.addInput(cycEndMaster, 0);
        rdRepeat.addInput(ack, 1); //not ack
        rdRepeat.addInput(RD, 0);
        //wr_repeat
        wrRepeat.addInput(cycEndMaster, 0);
        wrRepeat.addInput(ack, 1); //not ack
        wrRepeat.addInput(WR, 0);
        //wr_done
        wrDone.addInput(cycEndMaster, 0);
        wrDone.addInput(ack, 0);
        wrDone.addInput(WR, 0);

        //run
        sRun.addInput(rdDone, 0);
        sRun.addInput(wrDone, 0);
        rRun.addInput(read, 0);
        rRun.addInput(write, 0);
        rRun.addInput(halt, 0);
        run.addInput(sRun, 0);
        run.addInput(rRun, 0);

////////////////////////////////////////////////////////////////////////////////
//  Sinhronizacija Slave
////////////////////////////////////////////////////////////////////////////////
        //ABUS
        procId.addInput8(nula, 0);
        procId.addInput(nula, 0);
        procId.addInput(nula, 0);
        procId.addInput(nula, 0);
        procId.addInput(nula, 0);
        cmpHIT.addInput8(ABUS, 0);
        cmpHIT.addInput8(procId, 0);
        HIT.addInput(cmpHIT, 1);
        //DBUS
        MBRin.addInput(cond0Slave, 0);
        //DABUS
        DAin.addInput(DABUS, 0);
        nDAin.addInput(DAin, 0);

        //slave cyc counter
        //cnt
        slaveCycCnt.addInput(slaveInc, 0);
        //decoder
        slaveCyc.addInput(slaveCycCnt, 0);
        slaveCyc.addInput(slaveCycCnt, 1);
        slaveCyc.addInput(jedan, 0); //E
        //ands for inc
        cond0Slave.addInput(HIT, 0);
        cond0Slave.addInput(slaveCyc, 0);
        cond0Slave.addInput(DAin, 0);
        cond1Slave.addInput(HIT, 0);
        cond1Slave.addInput(slaveCyc, 1);
        cond1Slave.addInput(nDAin, 0);
        cond2Slave.addInput(HIT, 0);
        cond2Slave.addInput(slaveCyc, 2);
        cycEndSlave.addInput(HIT, 0);
        cycEndSlave.addInput(slaveCyc, 3);
        //inc
        slaveInc.addInput(cond0Slave, 0);
        slaveInc.addInput(cond1Slave, 0);
        slaveInc.addInput(cond2Slave, 0);
        slaveInc.addInput(cycEndSlave, 0);

        //veza sa magistralom
        //out signals
        FCbusout.addInput(cond0Slave, 0);
        FCbusout.addInput(slaveCyc, 1);
        FCbusout.addInput(slaveCyc, 2);
        ACKbusout.addInput(slaveCyc, 1);
        //buffers
        fcbusBuff.addInput(slaveCyc, 1);
        fcbusBuff.addInput(FCbusout, 0);
        ackbusBuff.addInput(jedan, 0);
        ackbusBuff.addInput(ACKbusout, 0);

        //kontrola ciklusa
        rdDone.addInput(cond0Slave, 0);

////////////////////////////////////////////////////////////////////////////////
//  Arbitracija
////////////////////////////////////////////////////////////////////////////////
        //Arbitrator
        arbCoder.addInput(BREQ0, 0);
        arbCoder.addInput(BREQ1, 0);
        arbCoder.addInput(BREQ2, 0);
        arbCoder.addInput(BREQ3, 0);
        arbCoder.addInput(jedan, 0); //E=1
        arbDecoder.addInput(arbCoder, 0);
        arbDecoder.addInput(arbCoder, 1);
        arbDecoder.addInput(jedan, 0); //E=1
        BGR0.addInput(arbDecoder, 0);
        BGR1.addInput(arbDecoder, 1);
        BGR2.addInput(arbDecoder, 2);
        BGR3.addInput(arbDecoder, 3);

        //Arbitracija u procesoru
        busyAdapter.addInput(BUSYBUS, 0);
        REQ.addInput(read, 0);
        REQ.addInput(rdRepeat, 0);
        REQ.addInput(write, 0);
        REQ.addInput(wrRepeat, 0);
        BREQ.addInput(REQ, 0);
        BREQ.addInput(arbAnd, 0);
        //procesor je master1
        BREQ1.addInput(BREQ, 0);
        BGR.addInput(BGR1, 0);
        //and, drugi FF i bafer
        arbAnd.addInput(busyAdapter, 0);
        arbAnd.addInput(BREQ, 0);
        arbAnd.addInput(BGR, 0);
        GR.addInput(arbAnd, 0);
        GR.addInput(cycEndMaster, 0);
        busybusBuff.addInput(jedan, 0);
        busybusBuff.addInput(GR, 0);

        //Ostala arbitracija
        BREQ0.addInput(nula, 0);

////////////////////////////////////////////////////////////////////////////////
//  Upravljacka
////////////////////////////////////////////////////////////////////////////////
        //Generisanje vrednosti brojaca koraka
        //KMOPER
        kmoper.addInput(RTI, 0);
        kmoper.addInput(RTS, 0);
        kmoper.addInput(INTE, 0);
        kmoper.addInput(INTD, 0);
        kmoper.addInput(TRPE, 0);
        kmoper.addInput(TRPD, 0);
        kmoper.addInput(JZ, 0);
        kmoper.addInput(JMP, 0);
        kmoper.addInput(INT, 0);
        kmoper.addInput(JSR, 0);
        kmoper.addInput(LOAD, 0);
        kmoper.addInput(ALUOP, 0);
        kmoper.addInput(STORE, 0);
        kmoper.addInput(HALT, 0);
        //KMADR
        kmadr.addInput(IMM, 0);
        kmadr.addInput(REGDIR, 0);
        kmadr.addInput(RELATIV, 0);
        kmadr.addInput(MEMDIR, 0);
        kmadr.addInput(MEMIND, 0);
        //KMBR
        kmbr.addInput(val00, 0);
        kmbr.addInput(val06, 0);
        kmbr.addInput(val0F, 0);
        kmbr.addInput(val17, 0);
        kmbr.addInput(val20, 0);
        kmbr.addInput(val24, 0);
        kmbr.addInput(val37, 0);
        kmbr.addInput(val4C, 0);
        kmbr.addInput(val52, 0);
        kmbr.addInput(val54, 0);
        kmbr.addInput(val57, 0);
        //MUX
        ctrlMux.addInput8(kmbr, 0);
        ctrlMux.addInput8(kmadr, 0);
        ctrlMux.addInput8(kmoper, 0);
        ctrlMux.addInput8(nula, 0);
        ctrlMux.addInput(bradr, 0);
        ctrlMux.addInput(broper, 0);

        //Brojac
        cnt.addInput8(ctrlMux, 0);
        cnt.addInput(cntInc, 0); //INC
        cnt.addInput(nula, 0); //DEC
        cnt.addInput(cntLd, 0); //LD
        cntLd.addInput(run, 0);
        cntLd.addInput(cntBranch, 0);
        cntInc.addInput(run, 0);
        cntInc.addInput(cntIncNot, 0);
        cntIncNot.addInput(cntBranch, 0);
        cntBranch.addInput(branch, 0);
        cntBranch.addInput(broper, 0);
        cntBranch.addInput(bradr, 0);
        //Dekoder
        ctrlDec.addInput8(cnt, 0);
        ctrlDec.addInput(jedan, 0); //E=1

        //Generisanje uslova
        //notIRs
        notIR0.addInput(IR1, 0);
        notIR1.addInput(IR1, 1);
        notIR2.addInput(IR1, 2);
        notIR3.addInput(IR1, 3);
        notIR4.addInput(IR1, 4);
        notIR5.addInput(IR1, 5);
        notIR6.addInput(IR1, 6);
        notIR7.addInput(IR1, 7);

        //Instructions
        //RTS
        RTS.addInput(notIR0, 0);
        RTS.addInput(notIR1, 0);
        RTS.addInput(notIR2, 0);
        RTS.addInput(notIR3, 0);
        RTS.addInput(notIR4, 0);
        RTS.addInput(notIR5, 0);
        RTS.addInput(notIR6, 0);
        RTS.addInput(notIR7, 0);
        //RTI
        RTI.addInput(IR1, 0);
        RTI.addInput(notIR1, 0);
        RTI.addInput(notIR2, 0);
        RTI.addInput(notIR3, 0);
        RTI.addInput(notIR4, 0);
        RTI.addInput(notIR5, 0);
        RTI.addInput(notIR6, 0);
        RTI.addInput(notIR7, 0);
        //INTE
        INTE.addInput(notIR0, 0);
        INTE.addInput(IR1, 1);
        INTE.addInput(notIR2, 0);
        INTE.addInput(notIR3, 0);
        INTE.addInput(notIR4, 0);
        INTE.addInput(notIR5, 0);
        INTE.addInput(notIR6, 0);
        INTE.addInput(notIR7, 0);
        //INTD
        INTD.addInput(IR1, 0);
        INTD.addInput(IR1, 1);
        INTD.addInput(notIR2, 0);
        INTD.addInput(notIR3, 0);
        INTD.addInput(notIR4, 0);
        INTD.addInput(notIR5, 0);
        INTD.addInput(notIR6, 0);
        INTD.addInput(notIR7, 0);
        //TRPE
        TRPE.addInput(notIR0, 0);
        TRPE.addInput(notIR1, 0);
        TRPE.addInput(IR1, 2);
        TRPE.addInput(notIR3, 0);
        TRPE.addInput(notIR4, 0);
        TRPE.addInput(notIR5, 0);
        TRPE.addInput(notIR6, 0);
        TRPE.addInput(notIR7, 0);
        //TRPD
        TRPD.addInput(IR1, 0);
        TRPD.addInput(notIR1, 0);
        TRPD.addInput(IR1, 2);
        TRPD.addInput(notIR3, 0);
        TRPD.addInput(notIR4, 0);
        TRPD.addInput(notIR5, 0);
        TRPD.addInput(notIR6, 0);
        TRPD.addInput(notIR7, 0);
        //HALT
        HALT.addInput(notIR0, 0);
        HALT.addInput(IR1, 1);
        HALT.addInput(IR1, 2);
        HALT.addInput(notIR3, 0);
        HALT.addInput(notIR4, 0);
        HALT.addInput(notIR5, 0);
        HALT.addInput(notIR6, 0);
        HALT.addInput(notIR7, 0);
        //JZ
        JZ.addInput(notIR0, 0);
        JZ.addInput(notIR1, 0);
        JZ.addInput(notIR2, 0);
        JZ.addInput(notIR3, 0);
        JZ.addInput(notIR4, 0);
        JZ.addInput(notIR5, 0);
        JZ.addInput(IR1, 6);
        JZ.addInput(notIR7, 0);
        //JMP
        JMP.addInput(IR1, 0);
        JMP.addInput(notIR1, 0);
        JMP.addInput(notIR2, 0);
        JMP.addInput(notIR3, 0);
        JMP.addInput(notIR4, 0);
        JMP.addInput(notIR5, 0);
        JMP.addInput(IR1, 6);
        JMP.addInput(notIR7, 0);
        //JSR
        JSR.addInput(notIR0, 0);
        JSR.addInput(IR1, 1);
        JSR.addInput(notIR2, 0);
        JSR.addInput(notIR3, 0);
        JSR.addInput(notIR4, 0);
        JSR.addInput(notIR5, 0);
        JSR.addInput(IR1, 6);
        JSR.addInput(notIR7, 0);
        //INT
        INT.addInput(IR1, 0);
        INT.addInput(IR1, 1);
        INT.addInput(notIR2, 0);
        INT.addInput(notIR3, 0);
        INT.addInput(notIR4, 0);
        INT.addInput(notIR5, 0);
        INT.addInput(IR1, 6);
        INT.addInput(notIR7, 0);
        //LOAD
        LOAD.addInput(notIR3, 0);
        LOAD.addInput(notIR4, 0);
        LOAD.addInput(notIR5, 0);
        LOAD.addInput(notIR6, 0);
        LOAD.addInput(IR1, 7);
        //STORE
        STORE.addInput(IR1, 3);
        STORE.addInput(notIR4, 0);
        STORE.addInput(notIR5, 0);
        STORE.addInput(notIR6, 0);
        STORE.addInput(IR1, 7);
        //ADD
        ADD.addInput(notIR3, 0);
        ADD.addInput(IR1, 4);
        ADD.addInput(notIR5, 0);
        ADD.addInput(notIR6, 0);
        ADD.addInput(IR1, 7);
        //XOR
        XOR.addInput(IR1, 3);
        XOR.addInput(IR1, 4);
        XOR.addInput(notIR5, 0);
        XOR.addInput(notIR6, 0);
        XOR.addInput(IR1, 7);
        //LSR
        LSR.addInput(notIR3, 0);
        LSR.addInput(notIR4, 0);
        LSR.addInput(IR1, 5);
        LSR.addInput(notIR6, 0);
        LSR.addInput(IR1, 7);
        //ALUOP
        ALUOP.addInput(ADD, 0);
        ALUOP.addInput(XOR, 0);
        ALUOP.addInput(LSR, 0);

        //Address modes
        //IMM
        IMM.addInput(IR1, 0);
        IMM.addInput(IR1, 1);
        IMM.addInput(IR1, 2);
        IMM.addInput(IR1, 7);
        //REGDIR
        REGDIR.addInput(notIR2, 0);
        REGDIR.addInput(IR1, 7);
        //RELATIV
        RELATIV.addInput(notIR0, 0);
        RELATIV.addInput(IR1, 1);
        RELATIV.addInput(IR1, 2);
        RELATIV.addInput(IR1, 7);
        //MEMDIR
        MEMDIR.addInput(notIR0, 0);
        MEMDIR.addInput(notIR1, 0);
        MEMDIR.addInput(IR1, 2);
        MEMDIR.addInput(IR1, 7);
        //MEMIND
        MEMIND.addInput(IR1, 0);
        MEMIND.addInput(notIR1, 0);
        MEMIND.addInput(IR1, 2);
        MEMIND.addInput(IR1, 7);

        //notBADCODE
        notBADCODE.addInput(RTS, 0);
        notBADCODE.addInput(RTI, 0);
        notBADCODE.addInput(INTE, 0);
        notBADCODE.addInput(INTD, 0);
        notBADCODE.addInput(TRPE, 0);
        notBADCODE.addInput(TRPD, 0);
        notBADCODE.addInput(HALT, 0);
        notBADCODE.addInput(JZ, 0);
        notBADCODE.addInput(JMP, 0);
        notBADCODE.addInput(JSR, 0);
        notBADCODE.addInput(INT, 0);
        notBADCODE.addInput(LOAD, 0);
        notBADCODE.addInput(STORE, 0);
        notBADCODE.addInput(ADD, 0);
        notBADCODE.addInput(XOR, 0);
        notBADCODE.addInput(LSR, 0);
        notBADCODE.addInput(RTS, 0);
        //L1, L2
        andL1.addInput(notIR6, 0);
        andL1.addInput(notIR7, 0);
        L1.addInput(andL1, 0);
        L1.addInput(REGDIR, 0);
        L2.addInput(INT, 0);
        L2.addInput(IMM, 0);
        //ADRLESS, notIMM, notREGDIR
        ADRLESS.addInput(IR1, 7);
        notIMM.addInput(IMM, 0);
        notREGDIR.addInput(REGDIR, 0);
        //ADDC, PSWZ, MASK, INTR
        notADDC.addInput(ADDC, 0);
        notPSWZ.addInput(PSWZ, 0);
        notMASK.addInput(MASK, 0);
        notINTR.addInput(INTR, 0);

        //Generisanje upravljackih signala upravljacke jedinice
        //Uslovni skokovi
        brnotBADCODE.addInput(ctrlDec, 0x04);
        brL1.addInput(ctrlDec, 0x06);
        brL2.addInput(ctrlDec, 0x0A);
        brADRLESS.addInput(ctrlDec, 0x0F);
        brnotADDC.addInput(ctrlDec, 0x15);
        brSTORE.addInput(ctrlDec, 0x20);
        brnotPSWZ.addInput(ctrlDec, 0x34);
        brJSR.addInput(ctrlDec, 0x3E);
        brnotMASK.addInput(ctrlDec, 0x4A);
        brnotIMM.addInput(ctrlDec, 0x50);
        brnotREGDIR.addInput(ctrlDec, 0x52);
        brnotINTR.addInput(ctrlDec, 0x57);
        //Bezuslovni skok
        bruncond.addInput(ctrlDec, 0x05);
        bruncond.addInput(ctrlDec, 0x11);
        bruncond.addInput(ctrlDec, 0x12);
        bruncond.addInput(ctrlDec, 0x16);
        bruncond.addInput(ctrlDec, 0x17);
        bruncond.addInput(ctrlDec, 0x18);
        bruncond.addInput(ctrlDec, 0x2F);
        bruncond.addInput(ctrlDec, 0x30);
        bruncond.addInput(ctrlDec, 0x31);
        bruncond.addInput(ctrlDec, 0x32);
        bruncond.addInput(ctrlDec, 0x33);
        bruncond.addInput(ctrlDec, 0x35);
        bruncond.addInput(ctrlDec, 0x4B);
        bruncond.addInput(ctrlDec, 0x4C);
        bruncond.addInput(ctrlDec, 0x4F);
        bruncond.addInput(ctrlDec, 0x51);
        bruncond.addInput(ctrlDec, 0x53);
        bruncond.addInput(ctrlDec, 0x58);
        //branch
        andBr1.addInput(brnotBADCODE, 0);
        andBr1.addInput(notBADCODE, 0);
        andBr2.addInput(brL1, 0);
        andBr2.addInput(L1, 0);
        andBr3.addInput(brL2, 0);
        andBr3.addInput(L2, 0);
        andBr4.addInput(brADRLESS, 0);
        andBr4.addInput(ADRLESS, 0);
        andBr5.addInput(brnotADDC, 0);
        andBr5.addInput(notADDC, 0);
        andBr6.addInput(brSTORE, 0);
        andBr6.addInput(STORE, 0);
        andBr7.addInput(brnotPSWZ, 0);
        andBr7.addInput(notPSWZ, 0);
        andBr8.addInput(brJSR, 0);
        andBr8.addInput(JSR, 0);
        andBr9.addInput(brnotMASK, 0);
        andBr9.addInput(notMASK, 0);
        andBr10.addInput(brnotIMM, 0);
        andBr10.addInput(notIMM, 0);
        andBr11.addInput(brnotREGDIR, 0);
        andBr11.addInput(notREGDIR, 0);
        andBr12.addInput(brnotINTR, 0);
        andBr12.addInput(notINTR, 0);
        branch.addInput(andBr1, 0);
        branch.addInput(andBr2, 0);
        branch.addInput(andBr3, 0);
        branch.addInput(andBr4, 0);
        branch.addInput(andBr5, 0);
        branch.addInput(andBr6, 0);
        branch.addInput(andBr7, 0);
        branch.addInput(andBr8, 0);
        branch.addInput(andBr9, 0);
        branch.addInput(andBr10, 0);
        branch.addInput(andBr11, 0);
        branch.addInput(andBr12, 0);
        branch.addInput(bruncond, 0);
        //Visestruki uslovni skokovi
        broper.addInput(ctrlDec, 0x24);
        bradr.addInput(ctrlDec, 0x10);
        //Adrese skokova
        val00.addInput(ctrlDec, 0x4A);
        val00.addInput(ctrlDec, 0x4B);
        val00.addInput(ctrlDec, 0x57);
        val06.addInput(ctrlDec, 0x04);
        val0F.addInput(ctrlDec, 0x06);
        val0F.addInput(ctrlDec, 0x0A);
        val17.addInput(ctrlDec, 0x15);
        val20.addInput(ctrlDec, 0x17);
        val20.addInput(ctrlDec, 0x18);
        val24.addInput(ctrlDec, 0x0F);
        val24.addInput(ctrlDec, 0x11);
        val24.addInput(ctrlDec, 0x12);
        val24.addInput(ctrlDec, 0x20);
        val37.addInput(ctrlDec, 0x58);
        val4C.addInput(ctrlDec, 0x3E);
        val52.addInput(ctrlDec, 0x50);
        val54.addInput(ctrlDec, 0x52);
        val57.addInput(ctrlDec, 0x05);
        val57.addInput(ctrlDec, 0x16);
        val57.addInput(ctrlDec, 0x2F);
        val57.addInput(ctrlDec, 0x30);
        val57.addInput(ctrlDec, 0x31);
        val57.addInput(ctrlDec, 0x32);
        val57.addInput(ctrlDec, 0x33);
        val57.addInput(ctrlDec, 0x34);
        val57.addInput(ctrlDec, 0x35);
        val57.addInput(ctrlDec, 0x4C);
        val57.addInput(ctrlDec, 0x4F);
        val57.addInput(ctrlDec, 0x51);
        val57.addInput(ctrlDec, 0x53);

        //Generisanje upravljackih signala operacione jedinice
        //ldMAR
        ldMAR.addInput(ctrlDec, 0x00);
        ldMAR.addInput(ctrlDec, 0x07);
        ldMAR.addInput(ctrlDec, 0x0B);
        ldMAR.addInput(ctrlDec, 0x17);
        ldMAR.addInput(ctrlDec, 0x18);
        ldMAR.addInput(ctrlDec, 0x19);
        ldMAR.addInput(ctrlDec, 0x1F);
        ldMAR.addInput(ctrlDec, 0x25);
        ldMAR.addInput(ctrlDec, 0x29);
        ldMAR.addInput(ctrlDec, 0x2C);
        ldMAR.addInput(ctrlDec, 0x38);
        ldMAR.addInput(ctrlDec, 0x3B);
        ldMAR.addInput(ctrlDec, 0x3F);
        ldMAR.addInput(ctrlDec, 0x44);
        //incPC
        incPC.addInput(ctrlDec, 0x00);
        incPC.addInput(ctrlDec, 0x07);
        incPC.addInput(ctrlDec, 0x0B);
        //clMBR
        clMBR.addInput(ctrlDec, 0x00);
        clMBR.addInput(ctrlDec, 0x07);
        clMBR.addInput(ctrlDec, 0x0B);
        clMBR.addInput(ctrlDec, 0x17);
        clMBR.addInput(ctrlDec, 0x18);
        clMBR.addInput(ctrlDec, 0x19);
        clMBR.addInput(ctrlDec, 0x1C);
        clMBR.addInput(ctrlDec, 0x1F);
        clMBR.addInput(ctrlDec, 0x25);
        clMBR.addInput(ctrlDec, 0x29);
        clMBR.addInput(ctrlDec, 0x2C);
        clMBR.addInput(ctrlDec, 0x44);
        clMBR.addInput(ctrlDec, 0x47);
        //read
        read.addInput(ctrlDec, 0x01);
        read.addInput(ctrlDec, 0x08);
        read.addInput(ctrlDec, 0x0C);
        read.addInput(ctrlDec, 0x1A);
        read.addInput(ctrlDec, 0x1D);
        read.addInput(ctrlDec, 0x21);
        read.addInput(ctrlDec, 0x26);
        read.addInput(ctrlDec, 0x2A);
        read.addInput(ctrlDec, 0x2D);
        read.addInput(ctrlDec, 0x45);
        read.addInput(ctrlDec, 0x48);
        //wmfc
        wmfc.addInput(ctrlDec, 0x02);
        wmfc.addInput(ctrlDec, 0x09);
        wmfc.addInput(ctrlDec, 0x0D);
        wmfc.addInput(ctrlDec, 0x1B);
        wmfc.addInput(ctrlDec, 0x1E);
        wmfc.addInput(ctrlDec, 0x22);
        wmfc.addInput(ctrlDec, 0x27);
        wmfc.addInput(ctrlDec, 0x2B);
        wmfc.addInput(ctrlDec, 0x2E);
        wmfc.addInput(ctrlDec, 0x3A);
        wmfc.addInput(ctrlDec, 0x3D);
        wmfc.addInput(ctrlDec, 0x41);
        wmfc.addInput(ctrlDec, 0x46);
        wmfc.addInput(ctrlDec, 0x49);
        wmfc.addInput(ctrlDec, 0x56);
        //ldIR1
        ldIR1.addInput(ctrlDec, 0x03);
        //ldIR2
        ldIR2.addInput(ctrlDec, 0x0A);
        //ldIR3
        ldIR3.addInput(ctrlDec, 0x0E);
        //setCINTR
        setCINTR.addInput(ctrlDec, 0x05);
        //mxB1
        mxB1.addInput(ctrlDec, 0x11);
        mxB1.addInput(ctrlDec, 0x36);
        mxB1.addInput(ctrlDec, 0x58);
        //ldB
        ldB.addInput(ctrlDec, 0x11);
        ldB.addInput(ctrlDec, 0x12);
        ldB.addInput(ctrlDec, 0x1C);
        ldB.addInput(ctrlDec, 0x23);
        ldB.addInput(ctrlDec, 0x36);
        ldB.addInput(ctrlDec, 0x58);
        //mxX0
        mxX0.addInput(ctrlDec, 0x13);
        mxX0.addInput(ctrlDec, 0x42);
        //ldX
        ldX.addInput(ctrlDec, 0x13);
        ldX.addInput(ctrlDec, 0x42);
        ldX.addInput(ctrlDec, 0x4D);
        //mxY0
        mxY0.addInput(ctrlDec, 0x13);
        mxY0.addInput(ctrlDec, 0x42);
        //ldY
        ldY.addInput(ctrlDec, 0x13);
        ldY.addInput(ctrlDec, 0x3F);
        ldY.addInput(ctrlDec, 0x42);
        ldY.addInput(ctrlDec, 0x4D);
        //ALUadd
        ALUadd.addInput(ctrlDec, 0x14);
        ALUadd.addInput(ctrlDec, 0x43);
        //ldZL
        ldZL.addInput(ctrlDec, 0x14);
        ldZL.addInput(ctrlDec, 0x40);
        ldZL.addInput(ctrlDec, 0x43);
        ldZL.addInput(ctrlDec, 0x4E);
        //ldZH
        ldZH.addInput(ctrlDec, 0x14);
        ldZH.addInput(ctrlDec, 0x43);
        //ldADDC
        ldADDC.addInput(ctrlDec, 0x14);
        //setAINTR
        setAINTR.addInput(ctrlDec, 0x16);
        setAINTR.addInput(ctrlDec, 0x51);
        //mxMAR1
        mxMAR1.addInput(ctrlDec, 0x17);
        mxMAR1.addInput(ctrlDec, 0x1F);
        mxMAR1.addInput(ctrlDec, 0x44);
        //mxMAR0
        mxMAR0.addInput(ctrlDec, 0x17);
        mxMAR0.addInput(ctrlDec, 0x18);
        mxMAR0.addInput(ctrlDec, 0x19);
        mxMAR0.addInput(ctrlDec, 0x44);
        //incMAR
        incMAR.addInput(ctrlDec, 0x1C);
        incMAR.addInput(ctrlDec, 0x47);
        //mxB0
        mxB0.addInput(ctrlDec, 0x1C);
        mxB0.addInput(ctrlDec, 0x23);
        mxB0.addInput(ctrlDec, 0x58);
        //mxMAR2
        mxMAR2.addInput(ctrlDec, 0x25);
        mxMAR2.addInput(ctrlDec, 0x29);
        mxMAR2.addInput(ctrlDec, 0x2C);
        mxMAR2.addInput(ctrlDec, 0x38);
        mxMAR2.addInput(ctrlDec, 0x3B);
        mxMAR2.addInput(ctrlDec, 0x3F);
        //decSP
        decSP.addInput(ctrlDec, 0x25);
        decSP.addInput(ctrlDec, 0x29);
        decSP.addInput(ctrlDec, 0x2C);
        decSP.addInput(ctrlDec, 0x4C);
        //ldPSW
        ldPSW.addInput(ctrlDec, 0x28);
        //mxPC
        mxPC.addInput(ctrlDec, 0x2C);
        mxPC.addInput(ctrlDec, 0x2F);
        mxPC.addInput(ctrlDec, 0x47);
        mxPC.addInput(ctrlDec, 0x4A);
        //ldPCL
        ldPCL.addInput(ctrlDec, 0x2C);
        ldPCL.addInput(ctrlDec, 0x35);
        ldPCL.addInput(ctrlDec, 0x4A);
        ldPCL.addInput(ctrlDec, 0x4C);
        //ldPCH
        ldPCH.addInput(ctrlDec, 0x2F);
        ldPCH.addInput(ctrlDec, 0x35);
        ldPCH.addInput(ctrlDec, 0x47);
        ldPCH.addInput(ctrlDec, 0x4C);
        //it
        it.addInput(ctrlDec, 0x30);
        it.addInput(ctrlDec, 0x32);
        //ldI
        ldI.addInput(ctrlDec, 0x30);
        ldI.addInput(ctrlDec, 0x31);
        ldI.addInput(ctrlDec, 0x4A);
        //ldT
        ldT.addInput(ctrlDec, 0x32);
        ldT.addInput(ctrlDec, 0x33);
        ldT.addInput(ctrlDec, 0x4A);
        //incSP
        incSP.addInput(ctrlDec, 0x37);
        incSP.addInput(ctrlDec, 0x38);
        incSP.addInput(ctrlDec, 0x3B);
        //mxMBR1
        mxMBR1.addInput(ctrlDec, 0x38);
        mxMBR1.addInput(ctrlDec, 0x3B);
        //ldMBR
        ldMBR.addInput(ctrlDec, 0x38);
        ldMBR.addInput(ctrlDec, 0x3B);
        ldMBR.addInput(ctrlDec, 0x3F);
        ldMBR.addInput(ctrlDec, 0x54);
        //write
        write.addInput(ctrlDec, 0x39);
        write.addInput(ctrlDec, 0x3C);
        write.addInput(ctrlDec, 0x40);
        write.addInput(ctrlDec, 0x55);
        //mxMBR0
        mxMBR0.addInput(ctrlDec, 0x3B);
        mxMBR0.addInput(ctrlDec, 0x54);
        //mxMBR2
        mxMBR2.addInput(ctrlDec, 0x3F);
        //ALUshl
        ALUshl.addInput(ctrlDec, 0x40);
        //mxY1
        mxY1.addInput(ctrlDec, 0x42);
        //mxX1
        mxX1.addInput(ctrlDec, 0x42);
        //mxADD
        mxADD.addInput(ctrlDec, 0x43);
        //ldL1L0
        ldL1L0.addInput(ctrlDec, 0x4B);
        //ALUop
        ALUop.addInput(ctrlDec, 0x4E);
        //ldNZCV
        ldNZCV.addInput(ctrlDec, 0x4E);
        //ldA
        ldA.addInput(ctrlDec, 0x4F);
        //REGin
        REGin.addInput(ctrlDec, 0x53);
        //inta
        inta.addInput(ctrlDec, 0x58);
        //halt
        halt.addInput(ctrlDec, 0x59);

////////////////////////////////////////////////////////////////////////////////
//  MemModul1 Slave
////////////////////////////////////////////////////////////////////////////////
        //ulaz sa magistrale
        //RDBUS
        m1RDin.addInput(RDBUS, 0);
        //WRBUS
        m1WRin.addInput(WRBUS, 0);
        //RW
        m1RWin.addInput(m1RDin, 0);
        m1RWin.addInput(m1WRin, 0);
        m1nRWin.addInput(m1RWin, 0);
        //HIT
        m1HIT.addInput(ABUS, 0);

        //slave cyc counter
        //cnt
        m1SlaveCycCnt.addInput(m1SlaveInc, 0);
        //decoder
        m1SlaveCyc.addInput(m1SlaveCycCnt, 0);
        m1SlaveCyc.addInput(m1SlaveCycCnt, 1);
        m1SlaveCyc.addInput(jedan, 0); //E
        //ands
        m1Cond0Slave.addInput(m1HIT, 0);
        m1Cond0Slave.addInput(m1SlaveCyc, 0);
        m1Cond0Slave.addInput(m1RWin, 0);
        m1Cond1Slave.addInput(m1HIT, 0);
        m1Cond1Slave.addInput(m1SlaveCyc, 1);
        m1Cond1Slave.addInput(m1nRWin, 0);
        m1Cond2Slave.addInput(m1HIT, 0);
        m1Cond2Slave.addInput(m1SlaveCyc, 2);
        m1CycEndSlave.addInput(m1HIT, 0);
        m1CycEndSlave.addInput(m1SlaveCyc, 3);
        //inc
        m1SlaveInc.addInput(m1Cond0Slave, 0);
        m1SlaveInc.addInput(m1Cond1Slave, 0);
        m1SlaveInc.addInput(m1Cond2Slave, 0);
        m1SlaveInc.addInput(m1CycEndSlave, 0);

        //registri i memorija
        //AR
        m1LdAR.addInput(m1Cond0Slave, 0);
        m1LdAR.addInput(m1Busy, 1); //not busy
        m1AR.addInput8(ABUS, 0);
        m1AR.addInput8(ABUS, 8);
        m1AR.addInput(m1LdAR, 0); //LD
        m1AR.addInput(nula, 0); //LDL
        m1AR.addInput(nula, 0); //LDH
        m1AR.addInput(nula, 0); //CLR
        m1AR.addInput(nula, 0); //INC
        m1AR.addInput(nula, 0); //DEC
        //DR mux
        //TODO: izbaci
        m1dbusInBuff.addInput8(DBUS, 0);
        //TODO: promeni dbusBuff u DBUS
        m1MuxDR.addInput8(m1dbusInBuff, 0);
        m1MuxDR.addInput8(m1Mem, 0);
        m1MuxDR.addInput(m1RdMem, 0);
        //DR
        m1aLdDR.addInput(m1Cond0Slave, 0);
        m1aLdDR.addInput(m1Busy, 1); //not busy
        m1aLdDR.addInput(m1WRin, 0);
        m1LdDR.addInput(m1aLdDR, 0);
        m1LdDR.addInput(m1RdMem, 0);
        m1DR.addInput8(m1MuxDR, 0);
        m1DR.addInput(m1LdDR, 0); //LD
        m1DR.addInput(nula, 0); //CLR
        m1DR.addInput(nula, 0); //INC
        m1DR.addInput(nula, 0); //DEC
        //IR
        m1LdIR.addInput(m1Cond0Slave, 0);
        m1LdIR.addInput(m1Busy, 1); //not busy
        m1LdIR.addInput(m1RDin, 0);
        m1IR.addInput8(DBUS, 0);
        m1IR.addInput(m1LdIR, 0); //LD
        m1IR.addInput(nula, 0); //CLR
        m1IR.addInput(nula, 0); //INC
        m1IR.addInput(nula, 0); //DEC
        //memorija
        m1RdMem.addInput(m1SlaveCyc, 3);
        m1RdMem.addInput(m1ReadCyc, 0);
        m1WrMem.addInput(m1SlaveCyc, 3);
        m1WrMem.addInput(m1WriteCyc, 0);
        for (int i=1; i<16; i++)     //AR 1..15
            m1Mem.addInput(m1AR, i);
        m1Mem.addInput8(m1DR, 0);
        m1Mem.addInput(m1WrMem, 0);

        //izlaz na magistralu
        //out signals
        m1FCbusout.addInput(m1Cond0Slave, 0);
        m1FCbusout.addInput(m1SlaveCyc, 1);
        m1FCbusout.addInput(m1SlaveCyc, 2);
        m1ACKbusout.addInput(m1SlaveCyc, 1);
        //buffers
        m1fcbusBuff.addInput(m1SlaveCyc, 1);
        m1fcbusBuff.addInput(m1FCbusout, 0);
        m1ackbusBuff.addInput(m1SlaveAck, 0);
        m1ackbusBuff.addInput(m1ACKbusout, 0);

        //kontrola ciklusa
        //busy
        m1sBusy.addInput(m1HIT, 0);
        m1sBusy.addInput(m1SlaveCyc, 3);
        m1sBusy.addInput(m1SlaveAck, 0);
        m1rBusy.addInput(m1RdDone, 0);
        m1rBusy.addInput(m1WrDone, 0);
        m1Busy.addInput(m1sBusy, 0);
        m1Busy.addInput(m1rBusy, 0);
        //ack
        m1sSlaveAck.addInput(m1Cond0Slave, 0);
        m1sSlaveAck.addInput(m1Busy, 1); //not busy
        m1rSlaveAck.addInput(m1Cond0Slave, 0);
        m1rSlaveAck.addInput(m1Busy, 0);
        m1SlaveAck.addInput(m1sSlaveAck, 0);
        m1SlaveAck.addInput(m1rSlaveAck, 0);
        //read_cyc
        m1sReadCyc.addInput(m1Cond0Slave, 0);
        m1sReadCyc.addInput(m1Busy, 1); //not busy
        m1sReadCyc.addInput(m1RDin, 0);
        m1rReadCyc.addInput(m1MemAccDone, 0);
        m1rReadCyc.addInput(m1ReadCyc, 0);
        m1ReadCyc.addInput(m1sReadCyc, 0);
        m1ReadCyc.addInput(m1rReadCyc, 0);
        //write_cyc
        m1sWriteCyc.addInput(m1Cond0Slave, 0);
        m1sWriteCyc.addInput(m1Busy, 1); //not busy
        m1sWriteCyc.addInput(m1WRin, 0);
        m1rWriteCyc.addInput(m1MemAccDone, 0);
        m1rWriteCyc.addInput(m1WriteCyc, 0);
        m1WriteCyc.addInput(m1sWriteCyc, 0);
        m1WriteCyc.addInput(m1rWriteCyc, 0);
        //return_cyc
        m1ReturnCyc.addInput(m1ReadCyc, 0);
        m1ReturnCyc.addInput(m1MemAccDone, 0);
        //wr_done
        m1WrDone.addInput(m1MemAccDone, 0);
        m1WrDone.addInput(m1WriteCyc, 0);

        //pristup memoriji
        //ld dec
        m1rwCyc.addInput(m1ReadCyc, 0);
        m1rwCyc.addInput(m1WriteCyc, 0);
        m1Count.addInput(m1rwCyc, 0);
        m1Count.addInput(m1Busy, 0);
        m1nCount.addInput(m1Count, 0);
        //mem_acc_time
        m1MemAccTime.addInput8(nula, 0);
        m1MemAccTime.addInput(nula, 0); //LD
        m1MemAccTime.addInput(nula, 0); //CLR
        m1MemAccTime.addInput(nula, 0); //INC
        m1MemAccTime.addInput(nula, 0); //DEC
        //mem_acc cnt
        m1MemAcc.addInput8(m1MemAccTime, 0);
        m1MemAcc.addInput(nula, 0); //INC
        m1MemAcc.addInput(m1Count, 0); //DEC
        m1MemAcc.addInput(m1nCount, 0); //LD
        //mem_acc_done
        m1MemAccDone.addInput8(m1MemAcc, 0);

////////////////////////////////////////////////////////////////////////////////
//  MemModul1 Master
////////////////////////////////////////////////////////////////////////////////
        //return
        m1sRetFF.addInput(m1ReturnCyc, 0);
        m1sRetFF.addInput(m1RetRepeat, 0);
        m1RetFF.addInput(m1sRetFF, 0);
        m1RetFF.addInput(m1CycEndMaster, 0);
        m1RET.addInput(m1RetFF, 0);
        m1RET.addInput(m1GR, 0);

        //ulaz sa magistrale
        //FCBUS
        m1FCin.addInput(FCBUS, 0);
        m1nFCin.addInput(m1FCin, 0);
        //ACKBUS
        m1nACKBUS.addInput(ACKBUS, 0);
        m1sMasterAck.addInput(ACKBUS, 0);
        m1sMasterAck.addInput(m1MasterCyc, 1);
        m1rMasterAck.addInput(m1nACKBUS, 0);
        m1rMasterAck.addInput(m1MasterCyc, 1);
        m1MasterAck.addInput(m1sMasterAck, 0);
        m1MasterAck.addInput(m1rMasterAck, 0);

        //master cyc counter
        //cnt
        m1MasterCycCnt.addInput(m1MasterInc, 0);
        //decoder
        m1MasterCyc.addInput(m1MasterCycCnt, 0);
        m1MasterCyc.addInput(m1MasterCycCnt, 1);
        m1MasterCyc.addInput(jedan, 0); //E
        //ands
        m1Cond0Master.addInput(m1RET, 0);
        m1Cond0Master.addInput(m1MasterCyc, 0);
        m1Cond1Master.addInput(m1RET, 0);
        m1Cond1Master.addInput(m1MasterCyc, 1);
        m1Cond1Master.addInput(m1FCin, 0);
        m1Cond2Master.addInput(m1RET, 0);
        m1Cond2Master.addInput(m1MasterCyc, 2);
        m1Cond2Master.addInput(m1nFCin, 0);
        m1CycEndMaster.addInput(m1RET, 0);
        m1CycEndMaster.addInput(m1MasterCyc, 3);
        //inc
        m1MasterInc.addInput(m1Cond0Master, 0);
        m1MasterInc.addInput(m1Cond1Master, 0);
        m1MasterInc.addInput(m1Cond2Master, 0);
        m1MasterInc.addInput(m1CycEndMaster, 0);

        //izlaz na magistralu
        //out signals
        m1busout.addInput(m1Cond0Master, 0);
        m1busout.addInput(m1MasterCyc, 1);
        m1busout.addInput(m1MasterCyc, 2);
        //buffers
        m1abusBuff.addInput8(m1IR, 0);
        m1abusBuff.addInput8(nula, 0);
        m1abusBuff.addInput(m1busout, 0);
        m1dbusBuff.addInput8(m1DR, 0);
        m1dbusBuff.addInput(m1busout, 0);
        m1dabusBuff.addInput(m1MasterCyc, 1);
        m1dabusBuff.addInput(m1busout, 0);

        //kontrola ciklusa
        //ret_repeat
        m1RetRepeat.addInput(m1CycEndMaster, 0);
        m1RetRepeat.addInput(m1MasterAck, 1); //not ack
        //rd_done
        m1RdDone.addInput(m1CycEndMaster, 0);
        m1RdDone.addInput(m1MasterAck, 0);

////////////////////////////////////////////////////////////////////////////////
//  MemModul1 Arbitracija
////////////////////////////////////////////////////////////////////////////////
        //Arbitracija u modulu1
        m1BusyAdapter.addInput(BUSYBUS, 0);
        m1REQ.addInput(m1ReturnCyc, 0);
        m1REQ.addInput(m1RetRepeat, 0);
        m1BREQ.addInput(m1REQ, 0);
        m1BREQ.addInput(m1sGR, 0);
        //modul1 je master2
        BREQ2.addInput(m1BREQ, 0);
        m1BGR.addInput(BGR2, 0);
        //and, drugi FF i bafer
        m1sGR.addInput(m1BusyAdapter, 0);
        m1sGR.addInput(m1BREQ, 0);
        m1sGR.addInput(m1BGR, 0);
        m1GR.addInput(m1sGR, 0);
        m1GR.addInput(m1CycEndMaster, 0);
        m1busybusBuff.addInput(jedan, 0);
        m1busybusBuff.addInput(m1GR, 0);

////////////////////////////////////////////////////////////////////////////////
//  MemModul2 Slave
////////////////////////////////////////////////////////////////////////////////
        //ulaz sa magistrale
        //RDBUS
        m2RDin.addInput(RDBUS, 0);
        //WRBUS
        m2WRin.addInput(WRBUS, 0);
        //RW
        m2RWin.addInput(m2RDin, 0);
        m2RWin.addInput(m2WRin, 0);
        m2nRWin.addInput(m2RWin, 0);
        //HIT
        m2HIT.addInput(ABUS, 0);

        //slave cyc counter
        //cnt
        m2SlaveCycCnt.addInput(m2SlaveInc, 0);
        //decoder
        m2SlaveCyc.addInput(m2SlaveCycCnt, 0);
        m2SlaveCyc.addInput(m2SlaveCycCnt, 1);
        m2SlaveCyc.addInput(jedan, 0); //E
        //ands
        m2Cond0Slave.addInput(m2HIT, 0);
        m2Cond0Slave.addInput(m2SlaveCyc, 0);
        m2Cond0Slave.addInput(m2RWin, 0);
        m2Cond1Slave.addInput(m2HIT, 0);
        m2Cond1Slave.addInput(m2SlaveCyc, 1);
        m2Cond1Slave.addInput(m2nRWin, 0);
        m2Cond2Slave.addInput(m2HIT, 0);
        m2Cond2Slave.addInput(m2SlaveCyc, 2);
        m2CycEndSlave.addInput(m2HIT, 0);
        m2CycEndSlave.addInput(m2SlaveCyc, 3);
        //inc
        m2SlaveInc.addInput(m2Cond0Slave, 0);
        m2SlaveInc.addInput(m2Cond1Slave, 0);
        m2SlaveInc.addInput(m2Cond2Slave, 0);
        m2SlaveInc.addInput(m2CycEndSlave, 0);

        //registri i memorija
        //AR
        m2LdAR.addInput(m2Cond0Slave, 0);
        m2LdAR.addInput(m2Busy, 1); //not busy
        m2AR.addInput8(ABUS, 0);
        m2AR.addInput8(ABUS, 8);
        m2AR.addInput(m2LdAR, 0); //LD
        m2AR.addInput(nula, 0); //LDL
        m2AR.addInput(nula, 0); //LDH
        m2AR.addInput(nula, 0); //CLR
        m2AR.addInput(nula, 0); //INC
        m2AR.addInput(nula, 0); //DEC
        //DR mux
        //TODO: izbaci
        m2dbusInBuff.addInput8(DBUS, 0);
        //TODO: promeni dbusBuff u DBUS
        m2MuxDR.addInput8(m2dbusInBuff, 0);
        m2MuxDR.addInput8(m2Mem, 0);
        m2MuxDR.addInput(m2RdMem, 0);
        //DR
        m2aLdDR.addInput(m2Cond0Slave, 0);
        m2aLdDR.addInput(m2Busy, 1); //not busy
        m2aLdDR.addInput(m2WRin, 0);
        m2LdDR.addInput(m2aLdDR, 0);
        m2LdDR.addInput(m2RdMem, 0);
        m2DR.addInput8(m2MuxDR, 0);
        m2DR.addInput(m2LdDR, 0); //LD
        m2DR.addInput(nula, 0); //CLR
        m2DR.addInput(nula, 0); //INC
        m2DR.addInput(nula, 0); //DEC
        //IR
        m2LdIR.addInput(m2Cond0Slave, 0);
        m2LdIR.addInput(m2Busy, 1); //not busy
        m2LdIR.addInput(m2RDin, 0);
        m2IR.addInput8(DBUS, 0);
        m2IR.addInput(m2LdIR, 0); //LD
        m2IR.addInput(nula, 0); //CLR
        m2IR.addInput(nula, 0); //INC
        m2IR.addInput(nula, 0); //DEC
        //memorija
        m2RdMem.addInput(m2SlaveCyc, 3);
        m2RdMem.addInput(m2ReadCyc, 0);
        m2WrMem.addInput(m2SlaveCyc, 3);
        m2WrMem.addInput(m2WriteCyc, 0);
        for (int i=1; i<16; i++)     //AR 1..15
            m2Mem.addInput(m2AR, i);
        m2Mem.addInput8(m2DR, 0);
        m2Mem.addInput(m2WrMem, 0);

        //izlaz na magistralu
        //out signals
        m2FCbusout.addInput(m2Cond0Slave, 0);
        m2FCbusout.addInput(m2SlaveCyc, 1);
        m2FCbusout.addInput(m2SlaveCyc, 2);
        m2ACKbusout.addInput(m2SlaveCyc, 1);
        //buffers
        m2fcbusBuff.addInput(m2SlaveCyc, 1);
        m2fcbusBuff.addInput(m2FCbusout, 0);
        m2ackbusBuff.addInput(m2SlaveAck, 0);
        m2ackbusBuff.addInput(m2ACKbusout, 0);

        //kontrola ciklusa
        //busy
        m2sBusy.addInput(m2HIT, 0);
        m2sBusy.addInput(m2SlaveCyc, 3);
        m2sBusy.addInput(m2SlaveAck, 0);
        m2rBusy.addInput(m2RdDone, 0);
        m2rBusy.addInput(m2WrDone, 0);
        m2Busy.addInput(m2sBusy, 0);
        m2Busy.addInput(m2rBusy, 0);
        //ack
        m2sSlaveAck.addInput(m2Cond0Slave, 0);
        m2sSlaveAck.addInput(m2Busy, 1); //not busy
        m2rSlaveAck.addInput(m2Cond0Slave, 0);
        m2rSlaveAck.addInput(m2Busy, 0);
        m2SlaveAck.addInput(m2sSlaveAck, 0);
        m2SlaveAck.addInput(m2rSlaveAck, 0);
        //read_cyc
        m2sReadCyc.addInput(m2Cond0Slave, 0);
        m2sReadCyc.addInput(m2Busy, 1); //not busy
        m2sReadCyc.addInput(m2RDin, 0);
        m2rReadCyc.addInput(m2MemAccDone, 0);
        m2rReadCyc.addInput(m2ReadCyc, 0);
        m2ReadCyc.addInput(m2sReadCyc, 0);
        m2ReadCyc.addInput(m2rReadCyc, 0);
        //write_cyc
        m2sWriteCyc.addInput(m2Cond0Slave, 0);
        m2sWriteCyc.addInput(m2Busy, 1); //not busy
        m2sWriteCyc.addInput(m2WRin, 0);
        m2rWriteCyc.addInput(m2MemAccDone, 0);
        m2rWriteCyc.addInput(m2WriteCyc, 0);
        m2WriteCyc.addInput(m2sWriteCyc, 0);
        m2WriteCyc.addInput(m2rWriteCyc, 0);
        //return_cyc
        m2ReturnCyc.addInput(m2ReadCyc, 0);
        m2ReturnCyc.addInput(m2MemAccDone, 0);
        //wr_done
        m2WrDone.addInput(m2MemAccDone, 0);
        m2WrDone.addInput(m2WriteCyc, 0);

        //pristup memoriji
        //ld dec
        m2rwCyc.addInput(m2ReadCyc, 0);
        m2rwCyc.addInput(m2WriteCyc, 0);
        m2Count.addInput(m2rwCyc, 0);
        m2Count.addInput(m2Busy, 0);
        m2nCount.addInput(m2Count, 0);
        //mem_acc_time
        m2MemAccTime.addInput8(nula, 0);
        m2MemAccTime.addInput(nula, 0); //LD
        m2MemAccTime.addInput(nula, 0); //CLR
        m2MemAccTime.addInput(nula, 0); //INC
        m2MemAccTime.addInput(nula, 0); //DEC
        //mem_acc cnt
        m2MemAcc.addInput8(m2MemAccTime, 0);
        m2MemAcc.addInput(nula, 0); //INC
        m2MemAcc.addInput(m2Count, 0); //DEC
        m2MemAcc.addInput(m2nCount, 0); //LD
        //mem_acc_done
        m2MemAccDone.addInput8(m2MemAcc, 0);

////////////////////////////////////////////////////////////////////////////////
//  MemModul2 Master
////////////////////////////////////////////////////////////////////////////////
        //return
        m2sRetFF.addInput(m2ReturnCyc, 0);
        m2sRetFF.addInput(m2RetRepeat, 0);
        m2RetFF.addInput(m2sRetFF, 0);
        m2RetFF.addInput(m2CycEndMaster, 0);
        m2RET.addInput(m2RetFF, 0);
        m2RET.addInput(m2GR, 0);

        //ulaz sa magistrale
        //FCBUS
        m2FCin.addInput(FCBUS, 0);
        m2nFCin.addInput(m2FCin, 0);
        //ACKBUS
        m2nACKBUS.addInput(ACKBUS, 0);
        m2sMasterAck.addInput(ACKBUS, 0);
        m2sMasterAck.addInput(m2MasterCyc, 1);
        m2rMasterAck.addInput(m2nACKBUS, 0);
        m2rMasterAck.addInput(m2MasterCyc, 1);
        m2MasterAck.addInput(m2sMasterAck, 0);
        m2MasterAck.addInput(m2rMasterAck, 0);

        //master cyc counter
        //cnt
        m2MasterCycCnt.addInput(m2MasterInc, 0);
        //decoder
        m2MasterCyc.addInput(m2MasterCycCnt, 0);
        m2MasterCyc.addInput(m2MasterCycCnt, 1);
        m2MasterCyc.addInput(jedan, 0); //E
        //ands
        m2Cond0Master.addInput(m2RET, 0);
        m2Cond0Master.addInput(m2MasterCyc, 0);
        m2Cond1Master.addInput(m2RET, 0);
        m2Cond1Master.addInput(m2MasterCyc, 1);
        m2Cond1Master.addInput(m2FCin, 0);
        m2Cond2Master.addInput(m2RET, 0);
        m2Cond2Master.addInput(m2MasterCyc, 2);
        m2Cond2Master.addInput(m2nFCin, 0);
        m2CycEndMaster.addInput(m2RET, 0);
        m2CycEndMaster.addInput(m2MasterCyc, 3);
        //inc
        m2MasterInc.addInput(m2Cond0Master, 0);
        m2MasterInc.addInput(m2Cond1Master, 0);
        m2MasterInc.addInput(m2Cond2Master, 0);
        m2MasterInc.addInput(m2CycEndMaster, 0);

        //izlaz na magistralu
        //out signals
        m2busout.addInput(m2Cond0Master, 0);
        m2busout.addInput(m2MasterCyc, 1);
        m2busout.addInput(m2MasterCyc, 2);
        //buffers
        m2abusBuff.addInput8(m2IR, 0);
        m2abusBuff.addInput8(nula, 0);
        m2abusBuff.addInput(m2busout, 0);
        m2dbusBuff.addInput8(m2DR, 0);
        m2dbusBuff.addInput(m2busout, 0);
        m2dabusBuff.addInput(m2MasterCyc, 1);
        m2dabusBuff.addInput(m2busout, 0);

        //kontrola ciklusa
        //ret_repeat
        m2RetRepeat.addInput(m2CycEndMaster, 0);
        m2RetRepeat.addInput(m2MasterAck, 1); //not ack
        //rd_done
        m2RdDone.addInput(m2CycEndMaster, 0);
        m2RdDone.addInput(m2MasterAck, 0);

////////////////////////////////////////////////////////////////////////////////
//  MemModul2 Arbitracija
////////////////////////////////////////////////////////////////////////////////
        //Arbitracija u modulu1
        m2BusyAdapter.addInput(BUSYBUS, 0);
        m2REQ.addInput(m2ReturnCyc, 0);
        m2REQ.addInput(m2RetRepeat, 0);
        m2BREQ.addInput(m2REQ, 0);
        m2BREQ.addInput(m2sGR, 0);
        //modul1 je master2
        BREQ3.addInput(m2BREQ, 0);
        m2BGR.addInput(BGR3, 0);
        //and, drugi FF i bafer
        m2sGR.addInput(m2BusyAdapter, 0);
        m2sGR.addInput(m2BREQ, 0);
        m2sGR.addInput(m2BGR, 0);
        m2GR.addInput(m2sGR, 0);
        m2GR.addInput(m2CycEndMaster, 0);
        m2busybusBuff.addInput(jedan, 0);
        m2busybusBuff.addInput(m2GR, 0);

////////////////////////////////////////////////////////////////////////////////
//  Magistrale
////////////////////////////////////////////////////////////////////////////////
        //ABUS
        //sa procesora na ABUS
        ABUS.addInput8(abusBuff, 0);
        ABUS.addInput8(abusBuff, 8);
        //sa modul1 na ABUS
        ABUS.addInput8(m1abusBuff, 0);
        ABUS.addInput8(m1abusBuff, 8);
        //sa modul2 na ABUS
        ABUS.addInput8(m2abusBuff, 0);
        ABUS.addInput8(m2abusBuff, 8);

        //DBUS
        //sa procesora na DBUS
        DBUS.addInput8(dbusBuff, 0);
        //sa modul1 na DBUS
        DBUS.addInput8(m1dbusBuff, 0);
        //sa modul2 na DBUS
        DBUS.addInput8(m2dbusBuff, 0);

        //FCBUS
        //sa procesora na FCBUS
        FCBUS.addInput(fcbusBuff, 0);
        //sa modul1 na FCBUS
        FCBUS.addInput(m1fcbusBuff, 0);
        //sa modul2 na FCBUS
        FCBUS.addInput(m2fcbusBuff, 0);

        //RDBUS
        //sa procesora na RDBUS
        RDBUS.addInput(rdbusBuff, 0);

        //WRBUS
        //sa procesora na WRBUS
        WRBUS.addInput(wrbusBuff, 0);

        //DABUS
        //sa modul1 na DABUS
        DABUS.addInput(m1dabusBuff, 0);
        //sa modul2 na DABUS
        DABUS.addInput(m2dabusBuff, 0);

        //ACKBUS
        //sa procesora na ACKBUS
        ACKBUS.addInput(ackbusBuff, 0);
        //sa modul1 na ACKBUS
        ACKBUS.addInput(m1ackbusBuff, 0);
        //sa modul2 na ACKBUS
        ACKBUS.addInput(m2ackbusBuff, 0);

        //BUSYBUS
        //sa procesora na BUSYBUS
        BUSYBUS.addInput(busybusBuff, 0);
        //sa modul1 na BUSYBUS
        BUSYBUS.addInput(m1busybusBuff, 0);
        //sa modul2 na BUSYBUS
        BUSYBUS.addInput(m2busybusBuff, 0);

////////////////////////////////////////////////////////////////////////////////
//  Uredjaji
////////////////////////////////////////////////////////////////////////////////
        IRQ1.addInput(nula, 0);
        IRQ2.addInput(nula, 0);
        IRQ3.addInput(nula, 0);
        INM.addInput(nula, 0);

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
        cnt.addToRegs();

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

    }
}
