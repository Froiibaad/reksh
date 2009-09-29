package simulator.panels;

import java.awt.Color;
import java.awt.Graphics;

import simulator.Initializator;

public class PanelKomb extends ImagePanel {
	private static final String imageName = "Komb.png";

    public PanelKomb(Initializator init) {
        super(init, imageName);
    }

    public void paint(Graphics g) {
        g.drawImage(image, 0, 0, null);
        
        //ADD
        g.setColor(Color.GREEN);
        //g.setColor(findColor(init.alu, 37));
        g.drawLine(105, 321, 135, 321);
        g.drawLine(105, 322, 135, 322);
        g.drawLine(416, 522, 440, 522);
        g.drawLine(416, 523, 440, 523);
        
        //DEC
        g.setColor(Color.GREEN);
        //g.setColor(findColor(init.alu, 37));
        g.drawLine(306, 232, 330, 232);
        g.drawLine(306, 231, 330, 231);
        g.drawLine(416, 713, 440, 713);
        g.drawLine(416, 714, 440, 714);
        
        //INC
        g.setColor(Color.GREEN);
        //g.setColor(findColor(init.alu, 37));
        g.drawLine(105, 359, 136, 359);
        g.drawLine(105, 360, 136, 360);
        g.drawLine(416, 605, 440, 605);
        g.drawLine(416, 606, 440, 606);
        
        //C16
        g.setColor(Color.GREEN);
        //g.setColor(findColor(init.alu, 37));
        g.drawLine(306, 192, 314, 192);
        g.drawLine(306, 193, 314, 193);
        g.drawLine(306, 302, 330, 302);
        g.drawLine(306, 303, 330, 303);
        
      //X15
        g.setColor(Color.GREEN);
        //g.setColor(findColor(init.alu, 37));
        g.drawLine(105, 411, 130, 411);
        g.drawLine(105, 412, 130, 412);
        g.drawLine(105, 508, 114, 508);
        g.drawLine(105, 509, 114, 509);
        
      //Y15
        g.setColor(Color.GREEN);
        //g.setColor(findColor(init.alu, 37));
        g.drawLine(105, 430, 130, 430);
        g.drawLine(105, 431, 130, 431);
        g.drawLine(105, 528, 114, 528);
        g.drawLine(105, 529, 114, 529);
        g.drawLine(416, 624, 425, 624);
        g.drawLine(416, 625, 425, 625);
        g.drawLine(416, 732, 440, 732);
        g.drawLine(416, 733, 440, 733);
        
      //F15
        g.setColor(Color.GREEN);
        //g.setColor(findColor(init.alu, 37));
        g.drawLine(726, 17, 907, 17);
        g.drawLine(726, 18, 907, 18);
        g.drawLine(726, 354, 751, 354);
        g.drawLine(726, 355, 751, 355);
        g.drawLine(105, 451, 114, 451);
        g.drawLine(105, 452, 114, 452);
        g.drawLine(105, 548, 130, 548);
        g.drawLine(105, 549, 130, 549);
        g.drawLine(416, 645, 440, 645);
        g.drawLine(416, 646, 440, 646);
        g.drawLine(416, 752, 425, 752);
        g.drawLine(416, 753, 425, 753);
        
        //F0
        g.setColor(Color.GREEN);
        //g.setColor(findColor(init.alu, 37));
        g.drawLine(726, 63, 751, 63);
        g.drawLine(726, 64, 751, 64);

        //F1
        g.setColor(Color.GREEN);
        //g.setColor(findColor(init.alu, 37));
        g.drawLine(726, 82, 751, 82);
        g.drawLine(726, 83, 751, 83);

        //F2
        g.setColor(Color.GREEN);
        //g.setColor(findColor(init.alu, 37));
        g.drawLine(726, 101, 751, 101);
        g.drawLine(726, 102, 751, 102);

        //F3
        g.setColor(Color.GREEN);
        //g.setColor(findColor(init.alu, 37));
        g.drawLine(726, 121, 751, 121);
        g.drawLine(726, 122, 751, 122);

        //F4
        g.setColor(Color.GREEN);
        //g.setColor(findColor(init.alu, 37));
        g.drawLine(726, 140, 751, 140);
        g.drawLine(726, 141, 751, 141);
        

        //F5
        g.setColor(Color.GREEN);
        //g.setColor(findColor(init.alu, 37));
        g.drawLine(726, 159, 751, 159);
        g.drawLine(726, 160, 751, 160);
        

        //F6
        g.setColor(Color.GREEN);
        //g.setColor(findColor(init.alu, 37));
        g.drawLine(726, 179, 751, 179);
        g.drawLine(726, 180, 751, 180);

        //F7
        g.setColor(Color.GREEN);
        //g.setColor(findColor(init.alu, 37));
        g.drawLine(726, 198, 756, 198);
        g.drawLine(726, 199, 756, 199);
        

        //F8
        g.setColor(Color.GREEN);
        //g.setColor(findColor(init.alu, 37));
        g.drawLine(726, 218, 760, 218);
        g.drawLine(726, 219, 760, 219);
        
        //F9
        g.setColor(Color.GREEN);
        //g.setColor(findColor(init.alu, 37));
        g.drawLine(726, 237, 757, 237);
        g.drawLine(726, 238, 757, 238);

        //F10
        g.setColor(Color.GREEN);
        //g.setColor(findColor(init.alu, 37));
        g.drawLine(726, 256, 751, 256);
        g.drawLine(726, 257, 751, 257);

        //F11
        g.setColor(Color.GREEN);
        //g.setColor(findColor(init.alu, 37));
        g.drawLine(726, 275, 751, 275);
        g.drawLine(726, 276, 751, 276);

        //F12
        g.setColor(Color.GREEN);
        //g.setColor(findColor(init.alu, 37));
        g.drawLine(726, 295, 751, 295);
        g.drawLine(726, 296, 751, 296);

        //F13
        g.setColor(Color.GREEN);
        //g.setColor(findColor(init.alu, 37));
        g.drawLine(726, 315, 751, 315);
        g.drawLine(726, 316, 751, 316);

        //F14
        g.setColor(Color.GREEN);
        //g.setColor(findColor(init.alu, 37));
        g.drawLine(726, 334, 751, 334);
        g.drawLine(726, 335, 751, 335);
        
        //C16*DEC
        g.setColor(Color.GREEN);
        //g.setColor(findColor(init.alu, 37));
        g.drawLine(426, 210, 466, 210);
        g.drawLine(426, 211, 466, 211);
        g.drawLine(466, 211, 466, 244);
        g.drawLine(467, 211, 467, 244);
        g.drawLine(466, 244, 524, 244);
        g.drawLine(466, 245, 524, 245);
        
        //ADD+INC
        g.setColor(Color.GREEN);
        //g.setColor(findColor(init.alu, 37));
        g.drawLine(210, 340, 330, 340);
        g.drawLine(210, 341, 330, 341);
       
        //C16*(ADD+INC)
        g.setColor(Color.GREEN);
        //g.setColor(findColor(init.alu, 37));
        g.drawLine(426, 321, 461, 321);
        g.drawLine(426, 322, 461, 322);
        g.drawLine(461, 283, 461, 321);
        g.drawLine(462, 283, 462, 321);
        g.drawLine(461, 282, 524, 282);
        g.drawLine(461, 283, 524, 283);
        
        //ALUC
        g.setColor(Color.GREEN);
        //g.setColor(findColor(init.alu, 37));
        g.drawLine(599, 262, 662, 262);
        g.drawLine(599, 263, 662, 263);
        g.drawLine(662, 263, 662, 405);
        g.drawLine(663, 263, 663, 405);
        g.drawLine(662, 405, 907, 405);
        g.drawLine(662, 406, 907, 406);
        
        //ALUZ
        g.setColor(Color.GREEN);
        //g.setColor(findColor(init.alu, 37));
        g.drawLine(847, 218, 907, 218);     
        g.drawLine(847, 219, 907, 219);
        
        //X15*Y15*!F15
        g.setColor(Color.GREEN);
        //g.setColor(findColor(init.alu, 37));
        g.drawLine(211, 430, 241, 430);
        g.drawLine(211, 431, 241, 431);
        g.drawLine(241, 431, 241, 463);
        g.drawLine(242, 431, 242, 463);
        g.drawLine(241, 463, 278, 463);
        g.drawLine(241, 464, 278, 464);
        
        //!X15*!Y15*F15
        g.setColor(Color.GREEN);
        //g.setColor(findColor(init.alu, 37));
        g.drawLine(211, 528, 241, 528);
        g.drawLine(211, 529, 241, 529);
        g.drawLine(241, 503, 241, 528);
        g.drawLine(242, 503, 242, 528);
        g.drawLine(241, 502, 278, 502);
        g.drawLine(241, 503, 278, 503);
        
        //!X15*!Y15*F15+X15*Y15*!F15
        g.setColor(Color.GREEN);
        //g.setColor(findColor(init.alu, 37));
        g.drawLine(353, 482, 440, 482);
        g.drawLine(353, 483, 440, 483);
        
        //(!X15*!Y15*F15+X15*Y15*!F15)*ADD
        g.setColor(Color.GREEN);
        //g.setColor(findColor(init.alu, 37));
        g.drawLine(521, 502, 584, 502);
        g.drawLine(521, 503, 584, 503);
        g.drawLine(584, 503, 584, 606);
        g.drawLine(585, 503, 585, 606);
        g.drawLine(584, 605, 647, 605);
        g.drawLine(584, 606, 647, 606);
        
        //INC*!Y15*F15
        g.setColor(Color.GREEN);
        //g.setColor(findColor(init.alu, 37));
        g.drawLine(521, 624, 650, 624);
        g.drawLine(521, 625, 650, 625);
        
        //DEC*Y15*!F15
        g.setColor(Color.GREEN);
        //g.setColor(findColor(init.alu, 37));
        g.drawLine(521, 732, 568, 732);
        g.drawLine(521, 733, 568, 733);
        g.drawLine(568, 645, 568, 733);
        g.drawLine(569, 645, 569, 733);
        g.drawLine(568, 645, 647, 645);
        g.drawLine(568, 646, 647, 646);
        
        //ALUV
        g.setColor(Color.GREEN);
        //g.setColor(findColor(init.alu, 37));
        g.drawLine(721, 625, 905, 625);
        g.drawLine(721, 626, 905, 626);
        
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
