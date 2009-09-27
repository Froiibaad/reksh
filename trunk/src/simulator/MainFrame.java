package simulator;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.LinkedList;

import simulator.elements.*;
import simulator.assembler.*;
import simulator.panels.*;

import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.BorderFactory;
import javax.swing.border.TitledBorder;

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
    boolean compiled;

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
    JPanel aluPCPanel = new PanelAluPC(init);
    JPanel IRPanel = new PanelAluIR(init);
    JPanel aluPanel = new PanelAlu(init);
    JPanel cpuPanel = new PanelCPU(init);
    JPanel oper1Panel = new PanelOper1(init);
    JPanel oper2Panel = new PanelOper2(init);
    JPanel cpuarbPanel = new PanelCPUARB(init);
    JPanel regfilePanel = new PanelRegFile(init);
    JPanel regselPanel = new PanelRegSel(init);
    JPanel kombPanel = new PanelKomb(init);
    JPanel signePane = new PanelSignE(init);
    
    JPanel aluSigPanel = new PanelAluSig(init);
    JPanel cuPanel = new PanelCU(init);
    JPanel arbPanel = new PanelARB(init);
    JPanel perPanel = new PanelPer(init);
    JPanel pswPanel = new PanelPSW(init);
    JPanel synchPanel = new PanelSynch(init);
    JPanel synchPanel1 = new PanelSynch1(init);
    JPanel synchPanel2 = new PanelSynch2(init);
    JPanel synchPanel3 = new PanelSynch3(init);
    JPanel synchPanel4 = new PanelSynch4(init);
    JPanel intPanel1 = new PanelPrekid1(init);
    JPanel intPanel2 = new PanelPrekid2(init);
    JPanel intPanel3 = new PanelPrekid3(init);
    JPanel memModPanel = new JPanel();
    BorderLayout borderLayout4 = new BorderLayout();
    JScrollPane memPane = new JScrollPane(null);
    JSpinner jSpinner2 = new JSpinner();
    FlowLayout flowLayout2 = new FlowLayout();
    JTextField jTextField1 = new JTextField();
    JButton getButton = new JButton();
    JScrollPane jScrollPane1 = new JScrollPane();
    JScrollPane asmScrollPane = new JScrollPane();
    JTable memTable = new JTable(new Object[80][2], memColumnNames);
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
        jMenu1.add(jMenuItem2);
        jMenu1.add(jMenuItem5);
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
        /*jTabbedPane2.addTab("ALU signali", aluSigPanel);
        jTabbedPane2.addTab("ALU IR", IRPanel);
        jTabbedPane2.addTab("ALU PC", aluPCPanel);
        jTabbedPane2.addTab("CU", cuPanel);
        jTabbedPane2.addTab("Arbitration", arbPanel);
        jTabbedPane2.addTab("PSW", pswPanel);
        jTabbedPane2.addTab("Periferije", perPanel);
        jTabbedPane2.addTab("Sync M", synchPanel);
        jTabbedPane2.addTab("Sync M2", synchPanel1);
        jTabbedPane2.addTab("Sync S", synchPanel2);
        jTabbedPane2.addTab("Mem Master", synchPanel3);
        jTabbedPane2.addTab("Mem Slave", synchPanel4);
        jTabbedPane2.addTab("Interrupt1", intPanel1);
        jTabbedPane2.addTab("Interrupt2", intPanel2);
        jTabbedPane2.addTab("Interrupt3", intPanel3);*/
        //Clock++ Ins++ i Prog++ dugme je inicijalno onemoguceno. Omogucava tek po
        //ucitavanju fajla sa asemblerskim kodom
        clockButton.setEnabled(false);
        insButton.setEnabled(false);
        progButton.setEnabled(false);
        compiled = false;
        clock = 0;
        //Inicijalno popunjavanje memorijske i registarske tabele
        fillRegTable();
 //       drawMemTable();
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
        Clock.tick();
        clock++;
        drawStatus();
        clockButton.setEnabled(true);
    }

    //Ins++ button
    public void insButton_actionPerformed(ActionEvent actionEvent) {
        insButton.setEnabled(false);
        do {
            Clock.tick();
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
        for (int i = 0; i < registri.size(); i++) {
            regTable.getModel().setValueAt(registri.get(i).name, i, 0);
            regTable.getModel().setValueAt("0x" +
                                           Integer.toHexString(registri.get(i).
                    getValue()).toUpperCase(), i, 1);
        }
    }

/*    public void drawMemTable() {
//        accessedAddresses = init.mw.getAccessedAddresses();        
        Integer addr;
        if (accessedAddresses != null) {
//            int n = accessedAddresses.size();
//            if (n >= 20)
//               memTable = new JTable(new Object[n][2], memColumnNames);
            for (int i = 0; i < accessedAddresses.size(); i++) {
                addr = accessedAddresses.get(i);
                memTable.getModel().setValueAt(Integer.toHexString(addr).
                                               toUpperCase(), i, 0);
                memTable.getModel().setValueAt("0x" +
                                               Integer.toHexString(init.
                        mw.read(addr)).toUpperCase(), i, 1);
            }
        }
    }*/

    public void drawStatus() {
        pcLabel.setText("PC = " + Integer.toHexString(init.PC.getValue()) + 'h');
        pcStatusLabel.setText("PC = " + Integer.toHexString(init.PC.getValue()) + 'h');
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
    }

//Save button
    public void save_actionPerformed(ActionEvent actionEvent) {
        int returnVal = fc.showSaveDialog(this);
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
        }
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
            String mcFile = Assembler.assemble("current.asm");
            if(compiled) {
                init.cnt.initialize(0);
//                init.mw.clearAccessedAddresses();
                clock = 0;
            }
            if (mcFile != null) {
 //               init.initialize(mcFile);
                Clock.init();
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
