package simulator.panels;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JLabel;

import simulator.Initializator;
import sun.java2d.loops.DrawLine;
import simulator.MainFrame;


public class PanelAlu extends ImagePanel {
    private static final String imageName = "alu.png";   
    public MainFrame mf;
    public PanelAlu(Initializator init, MainFrame mf) {
        super(init, imageName);
        this.mf = mf;
        //this.setLayout(new GridBagLayout());
    }

    public void paint(Graphics g) {
        g.drawImage(image, 0, 0, null);
        
        //ALUop
        g.setColor(Color.GREEN);
        g.setColor(findColor(init.alu, 37));
        g.drawLine(95, 144, 118, 144);
        g.drawLine(95, 145, 118, 145);
        g.drawLine(118, 144, 118, 520);
        g.drawLine(119, 144, 119, 520);
        g.drawLine(118, 520, 140, 520);
        g.drawLine(118, 521, 140, 521);
        g.drawLine(118, 223, 137, 223);
        g.drawLine(118, 224, 137, 224);
        g.drawLine(118, 272, 140, 272);
        g.drawLine(118, 273, 140, 273);
        g.drawLine(118, 332, 140, 332);
        g.drawLine(118, 333, 140, 333);
        g.drawLine(118, 374, 140, 374);
        g.drawLine(118, 375, 140, 375);
        g.drawLine(118, 445, 142, 445);
        g.drawLine(118, 446, 142, 446);
        
        //ALUtransY
        g.setColor(Color.GREEN);
        //g.setColor(findColor(init.alu, 37));
        g.drawLine(95, 180, 114, 180);
        g.drawLine(95, 181, 114, 181);
        g.drawArc(114, 175, 9, 9, 0, 180);
        g.drawArc(114, 176, 9, 9, 0, 180);
        g.drawLine(123, 180, 199, 180);
        g.drawLine(123, 181, 199, 181);
        g.drawLine(199, 180, 199, 201);
        g.drawLine(200, 180, 200, 201);
        g.drawLine(199, 201, 228, 201);
        g.drawLine(199, 202, 228, 202);
        
        //insMOVS
        g.setColor(Color.GREEN);
        //g.setColor(findColor(init.alu, 37));
        g.drawLine(95, 208, 114, 208);
        g.drawLine(95, 209, 114, 209);
        g.drawArc(114, 204, 9, 9, 0, 180);
        g.drawArc(114, 205, 9, 9, 0, 180);
        g.drawLine(123, 208, 137, 208);
        g.drawLine(123, 209, 137, 209);
        
        //insMOVS*ALUop
        g.setColor(Color.GREEN);
        //g.setColor(findColor(init.alu, 37));
        g.drawLine(169, 215, 228, 215);
        g.drawLine(169, 216, 228, 216);
        
        //insMOVS*ALUop+ALUtransY
        g.setColor(Color.GREEN);
        //g.setColor(findColor(init.alu, 37));
        g.drawLine(257, 208, 316, 208);
        g.drawLine(257, 209, 316, 209);
        g.drawLine(317, 208, 317, 233);
        g.drawLine(318, 208, 318, 233);
        g.drawLine(317, 233, 327, 233);
        g.drawLine(317, 234, 327, 234);
        
        //ALUadd
        g.setColor(Color.GREEN);
        //g.setColor(findColor(init.alu, 37));
        g.drawLine(99, 252, 114, 252);
        g.drawLine(99, 253, 114, 253);
        g.drawArc(114, 247, 9, 9, 0, 180);
        g.drawArc(114, 248, 9, 9, 0, 180);
        g.drawLine(123, 252, 201, 252);
        g.drawLine(123, 253, 201, 253);
        g.drawLine(201, 253, 201, 265);
        g.drawLine(202, 253, 202, 265);
        g.drawLine(201, 265, 231, 265);
        g.drawLine(201, 266, 231, 266);
        
        //insADD
        g.setColor(Color.GREEN);
        //g.setColor(findColor(init.alu, 37));
        g.drawLine(98, 287, 114, 287);
        g.drawLine(98, 288, 114, 288);
        g.drawArc(114, 282, 9, 9, 0, 180);
        g.drawArc(114, 283, 9, 9, 0, 180);
        g.drawLine(123, 287, 140, 287);
        g.drawLine(123, 288, 140, 288);
        g.drawLine(844, 466, 867, 466);
        g.drawLine(844, 467, 867, 467);
        
        //insADD*ALUop
        g.setColor(Color.GREEN);
        //g.setColor(findColor(init.alu, 37));
        g.drawLine(171, 279, 232, 279);
        g.drawLine(171, 280, 232, 280);
        
        //insADD*ALUop + ALUadd
        g.setColor(Color.GREEN);
        //g.setColor(findColor(init.alu, 37));
        g.drawLine(259, 272, 336, 272);
        g.drawLine(259, 273, 336, 273);
        
        //insAND
        g.setColor(Color.GREEN);
        //g.setColor(findColor(init.alu, 37));
        g.drawLine(98, 317, 114, 317);
        g.drawLine(98, 318, 114, 318);
        g.drawArc(114, 312, 9, 9, 0, 180);
        g.drawArc(114, 313, 9, 9, 0, 180);
        g.drawLine(123, 317, 140, 317);
        g.drawLine(123, 318, 140, 318);
        
        //insAND*ALUop
        g.setColor(Color.GREEN);
        //g.setColor(findColor(init.alu, 37));
        g.drawLine(171, 324, 347, 324);
        g.drawLine(171, 325, 347, 325);
        
        //insARS
        g.setColor(Color.GREEN);
        //g.setColor(findColor(init.alu, 37));
        g.drawLine(99, 359, 114, 359);
        g.drawLine(99, 360, 114, 360);
        g.drawArc(114, 354, 9, 9, 0, 180);
        g.drawArc(114, 355, 9, 9, 0, 180);
        g.drawLine(123, 359, 140, 359);
        g.drawLine(123, 360, 140, 360);
        
        //insARS*ALUop
        g.setColor(Color.GREEN);
        //g.setColor(findColor(init.alu, 37));
        g.drawLine(171, 366, 356, 366);
        g.drawLine(171, 367, 356, 367);

        //ALUincX
        g.setColor(Color.GREEN);
        //g.setColor(findColor(init.alu, 37));
        g.drawLine(98, 399, 114, 399);
        g.drawLine(98, 400, 114, 400);
        g.drawArc(114, 394, 9, 9, 0, 180);
        g.drawArc(114, 395, 9, 9, 0, 180);
        g.drawLine(123, 399, 363, 399);
        g.drawLine(123, 400, 363, 400);
        
       //ALUincY
        g.setColor(Color.GREEN);
        //g.setColor(findColor(init.alu, 37));
        g.drawLine(98, 430, 114, 430);
        g.drawLine(98, 431, 114, 431);
        g.drawArc(114, 425, 9, 9, 0, 180);
        g.drawArc(114, 426, 9, 9, 0, 180);
        g.drawLine(123, 430, 195, 430);
        g.drawLine(123, 431, 195, 431);
        g.drawLine(195, 430, 195, 438);
        g.drawLine(196, 430, 196, 438);
        g.drawLine(195, 438, 221, 438);
        g.drawLine(195, 439, 221, 439);
        
        //insINC
        g.setColor(Color.GREEN);
        //g.setColor(findColor(init.alu, 37));
        g.drawLine(99, 460, 114, 460);
        g.drawLine(99, 461, 114, 461);
        g.drawArc(114, 455, 9, 9, 0, 180);
        g.drawArc(114, 456, 9, 9, 0, 180);
        g.drawLine(123, 460, 142, 460);
        g.drawLine(123, 461, 142, 461);
        g.drawLine(844, 491, 867, 491);
        g.drawLine(844, 492, 867, 492);
        
        
        //insINC*ALUop
        g.setColor(Color.GREEN);
        //g.setColor(findColor(init.alu, 37));
        g.drawLine(174, 452, 221, 452);
        g.drawLine(174, 453, 221, 453);
        
       //insINC*ALUop+ALUincY
        g.setColor(Color.GREEN);
        //g.setColor(findColor(init.alu, 37));
        g.drawLine(250, 445, 372, 445);
        g.drawLine(250, 446, 372, 446);
        
        //ALUdecX
        g.setColor(Color.GREEN);
        //g.setColor(findColor(init.alu, 37));
        g.drawLine(101, 484, 114, 484);
        g.drawLine(101, 485, 114, 485);
        g.drawArc(114, 479, 9, 9, 0, 180);
        g.drawArc(114, 480, 9, 9, 0, 180);
        g.drawLine(123, 484, 381, 484);
        g.drawLine(123, 485, 381, 485);
        
        //ALUdecY
        g.setColor(Color.GREEN);
        //g.setColor(findColor(init.alu, 37));
        g.drawLine(99, 512, 114, 512);
        g.drawLine(99, 513, 114, 513);
        g.drawArc(114, 507, 9, 9, 0, 180);
        g.drawArc(114, 508, 9, 9, 0, 180);
        g.drawLine(123, 512, 216, 512);
        g.drawLine(123, 513, 216, 513);
        
        //insDEC
        g.setColor(Color.GREEN);
        //g.setColor(findColor(init.alu, 37));
        g.drawLine(99, 534, 140, 534);
        g.drawLine(99, 535, 140, 535);
        g.drawLine(844, 516, 867, 516);
        g.drawLine(844, 517, 867, 517);
                
       //insDEC*ALUop
        g.setColor(Color.GREEN);
        //g.setColor(findColor(init.alu, 37));
        g.drawLine(172, 526, 217, 526);
        g.drawLine(172, 527, 217, 527);
        
       //insDEC*ALUop + ALUdecY
        g.setColor(Color.GREEN);
        //g.setColor(findColor(init.alu, 37));
        g.drawLine(246, 520, 389, 520);
        g.drawLine(246, 521, 389, 521);
        
       //ALUtransX
        g.setColor(Color.GREEN);
        //g.setColor(findColor(init.alu, 37));
        g.drawLine(99, 556, 396, 556);
        g.drawLine(99, 557, 396, 557);
        
       //out16
        g.setColor(Color.GREEN);
        //g.setColor(findColor(init.alu, 37));
        g.drawLine(729, 416, 867, 416);
        g.drawLine(729, 417, 867, 417);
        
        //out15
        g.setColor(Color.GREEN);
        //g.setColor(findColor(init.alu, 37));
        g.drawLine(751, 442, 751, 614);
        g.drawLine(752, 442, 752, 614);
        g.drawLine(751, 441, 867,441);
        g.drawLine(751, 442, 867,442);
        
        //ALUM2out
        g.setColor(Color.GREEN);
        //g.setColor(findColor(init.alu, 37));
        g.drawLine(834, 622, 834, 631);
        g.drawLine(835, 622, 835, 631);
        
        //ALUM2out
        g.setColor(Color.GREEN);
        //g.setColor(findColor(init.alu, 37));
        g.drawLine(838, 708, 838, 717);
        g.drawLine(839, 708, 839, 717);
        
        //ALUmp
        g.setColor(Color.GREEN);
        //g.setColor(findColor(init.alu, 37));
        g.drawLine(327, 142, 337, 142);
        g.drawLine(327, 143, 337, 143);
        
       //Yin
        g.setColor(Color.GREEN);
        //g.setColor(findColor(init.alu, 37));
        g.drawLine(757, 142, 767, 142);
        g.drawLine(757, 143, 767, 143);
        
        g.setFont(new Font("Arial", Font.PLAIN, 30));
        
        g.drawString("0000", 517, 645);      
        
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
