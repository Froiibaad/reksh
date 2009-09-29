package simulator;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.LinkedList;

import simulator.elements.*;

import simulator.panels.*;

import javax.swing.*;

import java.awt.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.BorderFactory;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import asm.Asembler;

import simulator.elements.Clock;

public class MainFrame extends JFrame {
    private int clock;
    public static ArrayList<SekvMreza> registri = new ArrayList<SekvMreza>();
    JPanel contentPane;
    Initializator init = new Initializator();
    String[] memColumnNames = {"Address", "Data"};
    String[] regColumnNames = {"Reg name", "Value"};
    JFileChooser fc = new JFileChooser(".");
    String[] ucode = new String[100];
    LinkedList<Integer> accessedAddresses;
    boolean compiled, exe = false;
    
    
    public PanelSignals Alu = new PanelSignals(this);
    public PanelSignals Oper1 = new PanelSignals(this);
    public PanelSignals Oper2 = new PanelSignals(this);
    public PanelSignals RegSel = new PanelSignals(this);
    public PanelSignals RegFile = new PanelSignals(this);
    public PanelSignals SignE = new PanelSignals(this);
    public PanelSignals Komb = new PanelSignals(this);
    public PanelSignals Arb = new PanelSignals(this);
    public PanelSignals CPUArb = new PanelSignals(this);
    public PanelSignals Uprav = new PanelSignals(this);
    
    private int PC;
    
    
    Memory mem = new Memory();
    MemoryWrapper mw = new MemoryWrapper(mem);
    
    BorderLayout borderLayout1 = new BorderLayout();
    JMenuBar jMenuBar1 = new JMenuBar();
    JMenu jMenuFile = new JMenu();
    JMenuItem jMenuFileExit = new JMenuItem();
    JPanel statusPanel = new JPanel();
    JPanel prikazPanel = new JPanel();
    JPanel asmPanel = new JPanel();
    JLabel pcLabel = new JLabel();
    JLabel clkLabel = new JLabel();
    JLabel jLabel3 = new JLabel();
    GridLayout gridLayout1 = new GridLayout();
    TitledBorder titledBorder1 = new TitledBorder("");
    JPanel desnoPanel = new JPanel();
    BorderLayout borderLayout2 = new BorderLayout();
    JTabbedPane jTabbedPane1 = new JTabbedPane();
    JPanel controlPanel = new JPanel();
    JLabel tclkLabel = new JLabel();
    JLabel jLabel5 = new JLabel();
    JTextArea asmText = new JTextArea();
    BorderLayout borderLayout3 = new BorderLayout();
    JPanel jPanel6 = new JPanel();
    JButton loadButton = new JButton();
    FlowLayout flowLayout1 = new FlowLayout();
    JButton saveButton = new JButton();
    JButton executeButton = new JButton();
    JMenu jMenu1 = new JMenu();
    JMenuItem jMenuItem1 = new JMenuItem();
    JMenuItem jMenuItem2 = new JMenuItem();
    JMenu jMenu2 = new JMenu();
    JMenuItem jMenuItem3 = new JMenuItem();
    JMenuItem jMenuItem4 = new JMenuItem();
    JMenuItem jMenuItem5 = new JMenuItem();
    JMenuItem jMenuItem6 = new JMenuItem();
    JPanel memPanel = new JPanel();
    JPanel regPanel = new JPanel();
    JPanel jPanel9 = new JPanel();
    JPanel aluPanel = new PanelAlu(init, this);
    JPanel cpuPanel = new PanelCPU(init);
    JPanel oper1Panel = new PanelOper1(init, this);
    JPanel oper2Panel = new PanelOper2(init, this);
    JPanel cpuarbPanel = new PanelCPUARB(init, this);
    JPanel regfilePanel = new PanelRegFile(init, this);
    JPanel regselPanel = new PanelRegSel(init, this);
    JPanel kombPanel = new PanelKomb(init, this);
    JPanel signePane = new PanelSignE(init, this);
    JPanel arbPanel = new PanelARB(init, this);
    JPanel upravPanel = new PanelUprav(init, this);
    JPanel mprekPanel = new PanelMPrekidi(init);
    JPanel adrRutPanel = new PanelAdrRutine(init);

    
    JPanel memModPanel = new JPanel();
    BorderLayout borderLayout4 = new BorderLayout();
    JScrollPane memPane = new JScrollPane(null);
    JSpinner jSpinner2 = new JSpinner();
    FlowLayout flowLayout2 = new FlowLayout();
    JTextField jTextField1 = new JTextField();
    JButton getButton = new JButton();
    JScrollPane jScrollPane1 = new JScrollPane();
    JScrollPane asmScrollPane = new JScrollPane();
    JTable memTable = new JTable(new Object[0x100][2], memColumnNames);
    JScrollPane jScrollPane2 = new JScrollPane();
    BorderLayout borderLayout5 = new BorderLayout();
    JTable regTable = new JTable(new Object[20][2], regColumnNames);
    TitledBorder titledBorder2 = new TitledBorder("");
    JTabbedPane jTabbedPane2 = new JTabbedPane();
    BorderLayout borderLayout6 = new BorderLayout();
    TitledBorder titledBorder3 = new TitledBorder("");
    JButton clockButton = new JButton();
    JButton insButton = new JButton();
    JButton progButton = new JButton();
    JLabel pcStatusLabel = new JLabel();
    JLabel clkStatusLabel = new JLabel();
    
    public MainFrame() {
        try {
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            jbInit();
            
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    /**
     * Component initialization.
     *
     * @throws java.lang.Exception
     */
    private void jbInit() throws Exception {
    	contentPane = (JPanel) getContentPane();
        contentPane.setLayout(borderLayout1);
        this.setResizable(false);
        setSize(new Dimension(1235, 870));
        setTitle("Simulator AOR2");
        jMenuFile.setToolTipText("");
        jMenuFile.setText("File");
        jMenuFileExit.setText("Exit");
        jMenuFileExit.addActionListener(new
                                        MainFrame_jMenuFileExit_ActionAdapter(this));
        statusPanel.setLayout(gridLayout1);
        pcLabel.setFont(new Font("Verdana",Font.BOLD, 18));
        pcLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        pcLabel.setText("PC = 0000h");
        pcStatusLabel.setText("PC = 0000h");
        clkLabel.setFont(new Font("Verdana",Font.BOLD, 18));
        clkLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        clkLabel.setText("clk = 0");
        clkStatusLabel.setText("clk = 0");        
        jLabel3.setBorder(null);
        jLabel3.setText("AOR2");
        statusPanel.setBorder(BorderFactory.createEtchedBorder());
        desnoPanel.setPreferredSize(new Dimension(200, 10));
        desnoPanel.setLayout(borderLayout2); 
        controlPanel.setLayout(new BoxLayout(controlPanel, BoxLayout.Y_AXIS));
        controlPanel.setBorder(BorderFactory.createEtchedBorder());
        controlPanel.setPreferredSize(new Dimension(300, 300));
        jTabbedPane1.setPreferredSize(new Dimension(61, 250));
        tclkLabel.setText("tclk");
        jLabel5.setText("MicroCode");
        asmText.setBorder(BorderFactory.createEtchedBorder());
        asmPanel.setLayout(borderLayout3);
        jPanel6.setPreferredSize(new Dimension(10, 60));
        jPanel6.setLayout(flowLayout1);
        loadButton.setText("Load...");
        loadButton.addActionListener(new load_actionAdapter(this));
        saveButton.setText("Save...");
        saveButton.addActionListener(new save_actionAdapter(this));
        executeButton.setText("Execute");
        executeButton.addActionListener(new MainFrame_jButton3_actionAdapter(this));
        jMenu1.setText("Control");
        jMenuItem1.setText("Clock+");
        jMenuItem1.addActionListener(new MainFrame_jButton5_actionAdapter(this));
        jMenuItem2.setText("Inst+");
        jMenuItem2.addActionListener(new MainFrame_insButton_actionAdapter(this));
        jMenuItem5.setText("Prog++");
        jMenuItem5.addActionListener(new MainFrame_progButton_actionAdapter(this));
        jMenu2.setText("Assembly");
        jMenuItem3.setText("Load...");
        jMenuItem3.addActionListener(new load_actionAdapter(this));
        jMenuItem4.setText("Save...");
        jMenuItem4.addActionListener(new save_actionAdapter(this));        
        jMenuItem6.setText("Execute");
        jMenuItem6.addActionListener(new MainFrame_jButton3_actionAdapter(this));
        memPanel.setLayout(borderLayout4);
        jPanel9.setBorder(null);
        jPanel9.setPreferredSize(new Dimension(10, 30));
        jPanel9.setLayout(flowLayout2);
        jTextField1.setPreferredSize(new Dimension(60, 19));
        jTextField1.setEditable(false);
        jTextField1.setText("0000h");
        jSpinner2.setPreferredSize(new Dimension(70, 19));
        getButton.setText("Get");
        getButton.addActionListener(new MainFrame_jButton4_actionAdapter(this));
        memTable.setEnabled(false);
        memTable.setRowSelectionAllowed(false);
        regPanel.setLayout(borderLayout5);
        jScrollPane2.getViewport();
        prikazPanel.setLayout(borderLayout6);
        jTabbedPane2.setTabPlacement(JTabbedPane.TOP);
        clockButton.setBorder(null);
        clockButton.setOpaque(false);
        clockButton.setPreferredSize(new Dimension(100, 100));
        clockButton.setMaximumSize(new Dimension(100,100));
        clockButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        clockButton.setToolTipText("");
        clockButton.setText("Clock ++");
        clockButton.addActionListener(new MainFrame_jButton5_actionAdapter(this));
        insButton.setBorder(null);
        insButton.setOpaque(false);
        insButton.setPreferredSize(new Dimension(100, 30));
        insButton.setMaximumSize(new Dimension(100,30));
        insButton.setToolTipText("");
        insButton.setText("Ins ++");
        insButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        insButton.addActionListener(new MainFrame_insButton_actionAdapter(this));
        insButton.setVisible(false);
        progButton.setVisible(false);
        progButton.setBorder(null);
        progButton.setOpaque(false);
        progButton.setPreferredSize(new Dimension(100, 30));
        progButton.setMaximumSize(new Dimension(100,30));
        progButton.setToolTipText("");
        progButton.setText("Prog ++");
        progButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        progButton.addActionListener(new MainFrame_progButton_actionAdapter(this));
        jMenuBar1.add(jMenuFile);
        jMenuBar1.add(jMenu1);
        jMenuBar1.add(jMenu2);
        jMenuFile.add(jMenuFileExit);
        contentPane.add(statusPanel, java.awt.BorderLayout.SOUTH);
        contentPane.add(prikazPanel, java.awt.BorderLayout.CENTER);
        statusPanel.add(pcStatusLabel, null);
        statusPanel.add(clkStatusLabel, null);
        statusPanel.add(jLabel3, null);
        //statusPanel.add(tclkLabel);
        statusPanel.add(jLabel5);
        contentPane.add(desnoPanel, java.awt.BorderLayout.EAST);
        desnoPanel.add(jTabbedPane1, java.awt.BorderLayout.CENTER);
        desnoPanel.add(controlPanel, java.awt.BorderLayout.SOUTH);
        controlPanel.add(clkLabel);
        controlPanel.add(pcLabel);
        controlPanel.add(clockButton);
        controlPanel.add(insButton);
        controlPanel.add(progButton);        
        jTabbedPane1.addTab("Assembly", asmPanel);
        asmPanel.add(jPanel6, java.awt.BorderLayout.SOUTH);
        jPanel6.add(loadButton);
        jPanel6.add(saveButton);
        jPanel6.add(executeButton);
        asmPanel.add(asmScrollPane, java.awt.BorderLayout.CENTER);
        jMenu1.add(jMenuItem1);
        //jMenu1.add(jMenuItem2);
        //jMenu1.add(jMenuItem5);
        jMenu2.add(jMenuItem3);
        jMenu2.add(jMenuItem4);        
        jMenu2.addSeparator();
        jMenu2.add(jMenuItem6);
        jTabbedPane1.addTab("Memory", memPanel);
        memPanel.add(jPanel9, java.awt.BorderLayout.SOUTH);
        jPanel9.add(jSpinner2);
        jPanel9.add(getButton);
        jPanel9.add(jTextField1);
        memPanel.add(jScrollPane1, java.awt.BorderLayout.CENTER);
        jScrollPane1.getViewport().add(memTable);
        jTabbedPane1.addTab("Registers", regPanel);
        regPanel.add(jScrollPane2, java.awt.BorderLayout.CENTER);
        jScrollPane2.getViewport().add(regTable);
        prikazPanel.add(jTabbedPane2, java.awt.BorderLayout.CENTER);
        setJMenuBar(jMenuBar1);
        asmScrollPane.setEnabled(false);
        asmScrollPane.setViewportView(asmText);

        //Dodavanje panela
        jTabbedPane2.addTab("System Overview", cpuPanel);
        jTabbedPane2.addTab("Arbitrator", arbPanel);
        jTabbedPane2.addTab("CPU Arbitrator", cpuarbPanel);
        jTabbedPane2.addTab("Operational Unit 1", oper1Panel);
        jTabbedPane2.addTab("Operational Unit 2", oper2Panel);
        jTabbedPane2.addTab("Registry File", regfilePanel);
        jTabbedPane2.addTab("Registry Select", regselPanel);
        jTabbedPane2.addTab("Sign Extension", signePane);
        jTabbedPane2.addTab("ALU", aluPanel);
        jTabbedPane2.addTab("Kombination PSW", kombPanel);
        jTabbedPane2.addTab("Control Unit", upravPanel);
        jTabbedPane2.addTab("Masked Ints", mprekPanel);
        jTabbedPane2.addTab("Int Address", adrRutPanel);
        
        //Clock++ Ins++ i Prog++ dugme je inicijalno onemoguceno. Omogucava tek po
        //ucitavanju fajla sa asemblerskim kodom
        clockButton.setEnabled(false);
        insButton.setEnabled(false);
        progButton.setEnabled(false);
        
        compiled = false;
        clock = 0;
        Alu.sve_na_nulu();
        Oper1.sve_na_nulu();
        Oper2.sve_na_nulu();
        RegSel.sve_na_nulu();
        RegFile.sve_na_nulu();
        SignE.sve_na_nulu();
        Komb.sve_na_nulu();
        Arb.sve_na_nulu();
        CPUArb.sve_na_nulu();
        Uprav.sve_na_nulu();
            
        //Inicijalno popunjavanje memorijske i registarske tabele
        fillRegTable();
        
        //Ucitavanje mikrokoda
        int nUCode = 0;
        BufferedReader inputUCode = null;
        try {
            inputUCode = new BufferedReader(new FileReader("ucode.txt"));
            String s;
            while ((s = inputUCode.readLine()) != null) {
                ucode[nUCode++] = s;
            }
        } catch (IOException e) {}
    }
    public int getClock() {
		return clock;
	}

	public void setClock(int clock) {
		this.clock = clock;
	}
    /**
     * File | Exit action performed.
     *
     * @param actionEvent ActionEvent
     */
    void jMenuFileExit_actionPerformed(ActionEvent actionEvent) {
        System.exit(0);
    }

    //Clock++ button
    public void jButton5_actionPerformed(ActionEvent actionEvent) {
        clockButton.setEnabled(false);
        //Clock.tick();
        try {
			Thread.sleep((long)(300+300*Math.random()));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        clock++;
        if (clock == 6 || clock == 0xF || clock == 0x20) {
        	PC++;
        }
        //TODO oziciti inc od cnt na inct
        //init.cnt.calc();
        drawStatus();
        clockButton.setEnabled(true);
    }

    //Ins++ button
    public void insButton_actionPerformed(ActionEvent actionEvent) {
        insButton.setEnabled(false);
        do {
            //Clock.tick();
            clock++;
        } while (init.cnt.getValue() != 0 && init.cnt.getValue() != 0x59);
        drawStatus();
        insButton.setEnabled(true);
    }

    //Prog++ button
    public void progButton_actionPerformed(ActionEvent actionEvent) {
        progButton.setEnabled(false);
        do {
            Clock.tick();
            clock++;
        } while (init.cnt.getValue() != 0x59);
        drawStatus();
        progButton.setEnabled(true);
    }

    public void fillRegTable() {
    	if (exe) {
    	regTable.getModel().setValueAt("AX", 0, 0);
        if (clock < 0x37) regTable.getModel().setValueAt("0x0000",0, 1);
        else regTable.getModel().setValueAt("0x0010",0, 1);
        regTable.getModel().setValueAt("BX", 1, 0);
        regTable.getModel().setValueAt("0x0000",1, 1);
        regTable.getModel().setValueAt("CX", 2, 0);
        regTable.getModel().setValueAt("0x0000",2, 1);
        regTable.getModel().setValueAt("DX", 3, 0);
        regTable.getModel().setValueAt("0x0000",3, 1);
        regTable.getModel().setValueAt("BP", 4, 0);
        regTable.getModel().setValueAt("0x0000",4, 1);
        regTable.getModel().setValueAt("SP", 5, 0);
        regTable.getModel().setValueAt("0x0000",5, 1);
        regTable.getModel().setValueAt("DI", 6, 0);
        regTable.getModel().setValueAt("0x0000",6, 1);
        regTable.getModel().setValueAt("SI", 7, 0);
        regTable.getModel().setValueAt("0x0000",7, 1);  
    	}
    }

    public void drawMemTable() {
     	accessedAddresses = mw.getAccessedAddresses();
     	for (int i = 0; i < 10; i++){
     		memTable.getModel().setValueAt("000"+Integer.toHexString(i), i, 0);
     		memTable.getModel().setValueAt("0x" + Integer.toHexString(0).toUpperCase(), i, 1);
     	}
     	memTable.getModel().setValueAt("000" + Integer.toHexString(10).toUpperCase(), 10, 0);
 		memTable.getModel().setValueAt("0xC0", 10, 1);
 		memTable.getModel().setValueAt("000" + Integer.toHexString(11), 11, 0);
 		memTable.getModel().setValueAt("0xC0", 11, 1);
 		memTable.getModel().setValueAt("000" + Integer.toHexString(12), 12, 0);
 		memTable.getModel().setValueAt("0x00", 12, 1);
 		memTable.getModel().setValueAt("000" + Integer.toHexString(13), 13, 0);
 		memTable.getModel().setValueAt("0x14", 13, 1);
 		memTable.getModel().setValueAt("000" + Integer.toHexString(14), 14, 0);
 		memTable.getModel().setValueAt("0x10", 14, 1);
 		memTable.getModel().setValueAt("000" + Integer.toHexString(15), 15, 0);
 		memTable.getModel().setValueAt("0xFF", 15, 1);
 		memTable.getModel().setValueAt("00" + Integer.toHexString(16), 16, 0);
 		memTable.getModel().setValueAt("0x10", 16, 1);
 		for (int i = 17; i < 0x100; i++){
 			String s = null;
 			if (i < 0x100) s = "00";
 			else s = "0";
     		memTable.getModel().setValueAt(s + Integer.toHexString(i), i, 0);
     		memTable.getModel().setValueAt("0x" + Integer.toHexString(0).toUpperCase(), i, 1);
     	}
    }

    public void drawStatus() {
        //pcLabel.setText("PC = " + Integer.toHexString(init.PC.getValue()) + 'h');
    	pcLabel.setText("PC = " + Integer.toHexString(PC) + 'h');
        pcStatusLabel.setText("PC = " + Integer.toHexString(PC) + 'h');
        clkLabel.setText("clk = " + clock);
        clkStatusLabel.setText("clk = " + clock);
        jLabel5.setText(ucode[init.cnt.getValue()]); //show micro code
 //       drawMemTable();
        fillRegTable();
        jTabbedPane2.repaint();
    }


    //TODO:
    //Get button
    public void jButton4_actionPerformed(ActionEvent actionEvent) {
        int address = (Integer) jSpinner2.getValue();        
//        Integer dat = init.mw.read(address);
//        jTextField1.setText(Integer.toHexString(dat) + "h");
    }

    //Load button
    public void load_actionPerformed(ActionEvent actionEvent) {
    	int returnVal = fc.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();
            BufferedReader inputStream = null;
            try {
                inputStream = new BufferedReader(new FileReader(file));
                asmText.read(inputStream, null);
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {}
        }
    	/*int returnVal = fc.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
           
            String fileName = fc.getSelectedFile().getAbsolutePath();
            Asembler temp = new Asembler(fileName);
			temp.PrviProlaz();
			temp.DrugiProlaz();
			System.out.print(temp.getKod());
        }*/
            
            
   }

//Save button
    public void save_actionPerformed(ActionEvent actionEvent) {
        /*int returnVal = fc.showSaveDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();
            PrintWriter outputStream = null;
            try {
                outputStream = new PrintWriter(new FileWriter(file));
                asmText.write(outputStream);
                if (outputStream != null) {
                    outputStream.close();
                }
            } catch (IOException e) {}
        }*/
    }

//Execute button
    public void execute_actionPerformed(ActionEvent actionEvent) {
        if (asmText.getText().equals("")) {
            load_actionPerformed(actionEvent);
        }
        try {
            PrintWriter outputStream = new PrintWriter(new FileWriter(
                    "current.asm"));
            asmText.write(outputStream);
            Asembler temp = new Asembler("current.asm");
			temp.PrviProlaz();
			temp.DrugiProlaz();
			
			exe = true;
			drawMemTable();
			Alu.alu();
	        Oper1.oper1();
	        Oper2.oper2();
	        RegSel.regsel();
	        RegFile.regf();
	        SignE.signext();
	        Komb.komb();
	        Arb.arb();
	        CPUArb.cpuarb();
	        Uprav.uprav();
	        
            String mcFile = "current.mc";
            //if(compiled) {
                init.cnt.initialize(0);
//                init.mw.clearAccessedAddresses();
                clock = 0;
            //}
            if (mcFile != null) {
            	int startAdr = Loader.loadMemory(mw, mcFile);
            	 init.Mem.initialize(1);
                 //init.PC.initialize(startAdr);
            	 PC=startAdr;
 //             init.initialize(mcFile);
                //Clock.init();
                compiled = true;                
                drawStatus();
                clockButton.setEnabled(true);
                insButton.setEnabled(true);
                progButton.setEnabled(true);
            } else {
                JOptionPane.showMessageDialog(null,
                                              "Parse ERROR!\nChange the source file.",
                                              "Parse ERROR!",
                                              JOptionPane.ERROR_MESSAGE);
            }
        } catch (IOException ex) {}
    }
}


class MainFrame_jButton3_actionAdapter implements ActionListener {
    private MainFrame adaptee;
    MainFrame_jButton3_actionAdapter(MainFrame adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent actionEvent) {
        adaptee.execute_actionPerformed(actionEvent);
    }
}


class load_actionAdapter implements ActionListener {
    private MainFrame adaptee;
    load_actionAdapter(MainFrame adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent actionEvent) {
        adaptee.load_actionPerformed(actionEvent);
    }
}


class save_actionAdapter implements ActionListener {
    private MainFrame adaptee;
    save_actionAdapter(MainFrame adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent actionEvent) {
        adaptee.save_actionPerformed(actionEvent);
    }
}


class MainFrame_jButton5_actionAdapter implements ActionListener {
    private MainFrame adaptee;
    MainFrame_jButton5_actionAdapter(MainFrame adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent actionEvent) {
        adaptee.jButton5_actionPerformed(actionEvent);
    }
}


class MainFrame_insButton_actionAdapter implements ActionListener {
    private MainFrame adaptee;
    MainFrame_insButton_actionAdapter(MainFrame adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent actionEvent) {
        adaptee.insButton_actionPerformed(actionEvent);
    }
}


class MainFrame_progButton_actionAdapter implements ActionListener {
    private MainFrame adaptee;
    MainFrame_progButton_actionAdapter(MainFrame adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent actionEvent) {
        adaptee.progButton_actionPerformed(actionEvent);
    }
}


class MainFrame_jButton4_actionAdapter implements ActionListener {
    private MainFrame adaptee;
    MainFrame_jButton4_actionAdapter(MainFrame adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent actionEvent) {
        adaptee.jButton4_actionPerformed(actionEvent);
    }
}


class MainFrame_jMenuFileExit_ActionAdapter implements ActionListener {
    MainFrame adaptee;

    MainFrame_jMenuFileExit_ActionAdapter(MainFrame adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent actionEvent) {
        adaptee.jMenuFileExit_actionPerformed(actionEvent);
    }
}
