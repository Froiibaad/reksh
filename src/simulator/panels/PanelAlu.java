package simulator.panels;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import simulator.Initializator;
import sun.java2d.loops.DrawLine;


public class PanelAlu extends ImagePanel {
    private static final String imageName = "alu.png";
    public PanelAlu(Initializator init) {
        super(init, imageName);
        this.setLayout(new GridBagLayout());
    }

    public void paint(Graphics g) {
        g.drawImage(image, 0, 0, null);
        
        //ALUop
        g.setColor(Color.GREEN);
        //g.setColor(findColor(init.alu, 37));
        g.drawLine(95, 144, 118, 144);
        g.drawLine(118, 144, 118, 520);
        g.drawLine(118, 520, 140, 520);
        g.drawLine(118, 223, 137, 223);
        g.drawLine(118, 272, 140, 272);
        g.drawLine(118, 332, 140, 332);
        g.drawLine(118, 374, 140, 374);
        g.drawLine(118, 445, 142, 445);
        
        //ALUtransY
        g.setColor(Color.GREEN);
        //g.setColor(findColor(init.alu, 37));
        g.drawLine(95, 180, 114, 180);
        g.drawArc(114, 175, 9, 9, 0, 180);
        g.drawLine(123, 180, 199, 180);
        g.drawLine(199, 180, 199, 201);
        g.drawLine(199, 201, 228, 201);
        
        //insMOVS
        g.setColor(Color.GREEN);
        //g.setColor(findColor(init.alu, 37));
        g.drawLine(95, 208, 114, 208);
        g.drawArc(114, 204, 9, 9, 0, 180);
        g.drawLine(123, 208, 137, 208);
        
        //insMOVS*ALUop
        g.setColor(Color.GREEN);
        //g.setColor(findColor(init.alu, 37));
        g.drawLine(169, 216, 228, 216);
        
        //insMOVS*ALUop+ALUtransY
        g.setColor(Color.GREEN);
        //g.setColor(findColor(init.alu, 37));
        g.drawLine(257, 208, 316, 208);
        g.drawLine(317, 208, 317, 233);
        g.drawLine(317, 233, 327, 233);
        
        //ALUadd
        g.setColor(Color.GREEN);
        //g.setColor(findColor(init.alu, 37));
        g.drawLine(99, 253, 114, 253);
        g.drawArc(114, 248, 9, 9, 0, 180);
        g.drawLine(123, 253, 201, 253);
        g.drawLine(201, 253, 201, 265);
        g.drawLine(201, 265, 231, 265);
        
        //insADD
        g.setColor(Color.GREEN);
        //g.setColor(findColor(init.alu, 37));
        g.drawLine(98, 287, 114, 287);
        g.drawArc(114, 282, 9, 9, 0, 180);
        g.drawLine(123, 287, 140, 287);
        g.drawLine(844, 466, 867, 466);
        
        //insADD*ALUop
        g.setColor(Color.GREEN);
        //g.setColor(findColor(init.alu, 37));
        g.drawLine(171, 280, 232, 280);
        
        //insADD*ALUop + ALUadd
        g.setColor(Color.GREEN);
        //g.setColor(findColor(init.alu, 37));
        g.drawLine(259, 272, 336, 272);
        
        //insARS
        g.setColor(Color.GREEN);
        //g.setColor(findColor(init.alu, 37));
        g.drawLine(99, 359, 114, 359);
        g.drawArc(114, 354, 9, 9, 0, 180);
        g.drawLine(123, 359, 140, 359);
        
        //insARS*ALUop
        g.setColor(Color.GREEN);
        //g.setColor(findColor(init.alu, 37));
        g.drawLine(171, 366, 356, 366);
        
        //insAND
        g.setColor(Color.GREEN);
        //g.setColor(findColor(init.alu, 37));
        g.drawLine(98, 317, 114, 317);
        g.drawArc(114, 312, 9, 9, 0, 180);
        g.drawLine(123, 317, 140, 317);
        
        //insAND*ALUop
        g.setColor(Color.GREEN);
        //g.setColor(findColor(init.alu, 37));
        g.drawLine(171, 324, 347, 324);
        
        //ALUincX
        g.setColor(Color.GREEN);
        //g.setColor(findColor(init.alu, 37));
        g.drawLine(98, 399, 114, 399);
        g.drawArc(114, 394, 9, 9, 0, 180);
        g.drawLine(123, 399, 363, 399);
        
       //ALUincX
        g.setColor(Color.GREEN);
        //g.setColor(findColor(init.alu, 37));
        g.drawLine(98, 430, 114, 430);
        g.drawArc(114, 425, 9, 9, 0, 180);
        g.drawLine(123, 430, 195, 430);
        g.drawLine(195, 430, 195, 438);
        g.drawLine(195, 438, 221, 438);
        
        //insINC
        g.setColor(Color.GREEN);
        //g.setColor(findColor(init.alu, 37));
        g.drawLine(99, 460, 114, 460);
        g.drawArc(114, 455, 9, 9, 0, 180);
        g.drawLine(123, 460, 142, 460);
        g.drawLine(844, 491, 867, 491);
        
        
        //insINC*ALUop
        g.setColor(Color.GREEN);
        //g.setColor(findColor(init.alu, 37));
        g.drawLine(174, 453, 221, 453);
        
       //insINC*ALUop+ALUincY
        g.setColor(Color.GREEN);
        //g.setColor(findColor(init.alu, 37));
        g.drawLine(250, 445, 372, 445);
        
        //ALUincX
        g.setColor(Color.GREEN);
        //g.setColor(findColor(init.alu, 37));
        g.drawLine(101, 485, 114, 485);
        g.drawArc(114, 480, 9, 9, 0, 180);
        g.drawLine(123, 485, 381, 485);
        
        //ALUdecY
        g.setColor(Color.GREEN);
        //g.setColor(findColor(init.alu, 37));
        g.drawLine(99, 512, 114, 512);
        g.drawArc(114, 507, 9, 9, 0, 180);
        g.drawLine(123, 512, 216, 512);
        
        //insDEC
        g.setColor(Color.GREEN);
        //g.setColor(findColor(init.alu, 37));
        g.drawLine(99, 535, 140, 535);
        g.drawLine(844, 516, 867, 516);
                
       //insDEC*ALUop
        g.setColor(Color.GREEN);
        //g.setColor(findColor(init.alu, 37));
        g.drawLine(172, 527, 217, 527);
        
       //insDEC*ALUop + ALUdecY
        g.setColor(Color.GREEN);
        //g.setColor(findColor(init.alu, 37));
        g.drawLine(246, 520, 389, 520);
        
       //ALUtransX
        g.setColor(Color.GREEN);
        //g.setColor(findColor(init.alu, 37));
        g.drawLine(99, 556, 396, 556);
        
       //out16
        g.setColor(Color.GREEN);
        //g.setColor(findColor(init.alu, 37));
        g.drawLine(729, 417, 867, 417);
        
        //out15
        g.setColor(Color.GREEN);
        //g.setColor(findColor(init.alu, 37));
        g.drawLine(751, 442, 751, 614);
        g.drawLine(751, 442, 867,442);
        
        //ALUM2out
        g.setColor(Color.GREEN);
        //g.setColor(findColor(init.alu, 37));
        g.drawLine(834, 622, 834, 631);
        
        //ALUM2out
        g.setColor(Color.GREEN);
        //g.setColor(findColor(init.alu, 37));
        g.drawLine(838, 708, 838, 717);
        
        //ALUmp
        g.setColor(Color.GREEN);
        //g.setColor(findColor(init.alu, 37));
        g.drawLine(327, 142, 337, 142);
        
       //Yin
        g.setColor(Color.GREEN);
        //g.setColor(findColor(init.alu, 37));
        g.drawLine(757, 142, 767, 142);
        
        g.drawString("00", 543, 632);
      
        
        //g.drawArc(114, 175, 9, 9, 0, 180);
        //g.drawArc(100, 100, 40, 40, 0, 180);
        //g.drawLine(100, 100, 200, 100);
        //g.drawLine(100, 100, 100, 200);
        /*g.setColor(Color.BLACK);
        g.setColor(findColor(init.alu, 8));
        g.drawLine(459, 319, 368, 319);
        g.drawLine(368, 319, 368, 272);
        g.drawLine(368, 272, 272, 272);
        g.setColor(findColor(init.adder, 8));
        g.drawLine(146, 268, 10, 268);
        g.drawLine(10, 268, 10, 401);
        g.drawLine(10, 401, 55, 401);
        g.setColor(findColor(init.ADDC, 0));
        g.drawLine(230, 430, 249, 430);
        g.drawLine(249, 430, 249, 537);
        g.drawLine(249, 537, 10, 537);
        g.drawLine(10, 537, 10, 429);
        g.drawLine(10, 429, 55, 429);
        g.setColor(findColor(init.muxADDC, 0));
        g.drawLine(125, 418, 150, 418);
        g.drawLine(150, 418, 150, 438);
        g.drawLine(150, 438, 169, 438);
        g.setColor(findColor(init.mxADD, 0));
        g.drawLine(213, 120, 213, 158);
        g.drawLine(213, 158, 146, 158);
        g.drawLine(146, 158, 275, 158);
        g.setColor(findColor(init.ldADDC, 0));
        g.drawLine(90, 458, 90, 439);
        g.setColor(findColor(init.ldZL, 0));
        g.drawLine(638, 387, 628, 387);
        g.setColor(findColor(init.add, 0));
        g.drawLine(733, 239, 717, 239);
        g.setColor(findColor(init.xor, 0));
        g.drawLine(732, 259, 717, 259);
        g.setColor(findColor(init.lsr, 0));
        g.drawLine(732, 279, 717, 279);
        g.setColor(findColor(init.shl, 0));
        g.drawLine(732, 299, 717, 299);
        g.setColor(findColor(init.trans, 0));
        g.drawLine(733, 319, 717, 319);
        g.setColor(findColor(init.ldZH, 0));
        g.drawLine(263, 337, 249, 337);
        g.setColor(findColor(init.mxX1, 0));
        g.drawLine(543, 128, 528, 128);
        g.setColor(findColor(init.mxX0, 0));
        g.drawLine(544, 140, 526, 140);
        g.setColor(findColor(init.mxY1, 0));
        g.drawLine(725, 128, 707, 128);
        g.setColor(findColor(init.mxY0, 0));
        g.drawLine(724, 140, 706, 140);
        g.setColor(findColor(init.ldX, 0));
        g.drawLine(544, 190, 528, 190);
        g.setColor(findColor(init.ldY, 0));
        g.drawLine(723, 190, 707, 190);*/
    }
}
