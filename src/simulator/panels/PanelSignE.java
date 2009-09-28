package simulator.panels;

import java.awt.Color;
import java.awt.Graphics;

import simulator.Initializator;

public class PanelSignE extends ImagePanel {
	private static final String imageName = "SignE.png";

    public PanelSignE(Initializator init) {
        super(init, imageName);
    }

    public void paint(Graphics g) {
        g.drawImage(image, 0, 0, null);
        g.setColor(Color.GREEN);
        //M1-7-15
        //g.setColor(findColor(init.adder, 8));
        g.drawLine(461, 233, 461, 263);
        g.drawLine(462, 233, 462, 263);
        g.drawLine(478, 233, 478, 263);
        g.drawLine(479, 233, 479, 263);
        g.drawLine(495, 233, 495, 263);
        g.drawLine(496, 233, 496, 263);
        g.drawLine(511, 233, 511, 263);
        g.drawLine(512, 233, 512, 263);
        g.drawLine(528, 233, 528, 263);
        g.drawLine(529, 233, 529, 263);
        g.drawLine(545, 233, 545, 263);
        g.drawLine(546, 233, 546, 263);
        g.drawLine(562, 233, 562, 263);
        g.drawLine(563, 233, 563, 263);
        g.drawLine(578, 233, 578, 263);
        g.drawLine(579, 233, 579, 263);
        g.drawLine(595, 233, 595, 263);  
        g.drawLine(596, 233, 596, 263);   
       
        //M1-6-15
        //g.setColor(findColor(init.adder, 8));
        g.drawLine(612, 233, 612, 263);
        g.drawLine(613, 233, 613, 263);
     
        //M1-5-15
        //g.setColor(findColor(init.adder, 8));
        g.drawLine(628, 233, 628, 263);
        g.drawLine(629, 233, 629, 263);
        
        //M1-4-15
        //g.setColor(findColor(init.adder, 8));
        g.drawLine(645, 233, 645, 263);
        g.drawLine(646, 233, 646, 263);
       
        //M1-3-15
        //g.setColor(findColor(init.adder, 8));
        g.drawLine(662, 233, 662, 263);
        g.drawLine(663, 233, 663, 263);
       
        //M1-2-15
        //g.setColor(findColor(init.adder, 8));
        g.drawLine(679, 233, 679, 263);
        g.drawLine(680, 233, 680, 263);
       
        //M1-1-15
        //g.setColor(findColor(init.adder, 8));
        g.drawLine(696, 233, 696, 263);
        g.drawLine(697, 233, 697, 263);
      
        //M1-0-15
        //g.setColor(findColor(init.adder, 8));
        g.drawLine(712, 233, 712, 263);
        g.drawLine(713, 233, 713, 263);
       
        //YselM3
        //g.setColor(findColor(init.adder, 8));
        g.drawLine(185, 375, 210, 375);
        g.drawLine(184, 376, 210, 376);
        
        //YselM2
        //g.setColor(findColor(init.adder, 8));
        g.drawLine(353, 375, 378, 375);
        g.drawLine(352, 376, 378, 376);
    
        //YsignEx
        //g.setColor(findColor(init.adder, 8));
        g.drawLine(589, 377, 613, 377);

        //YselM3
        //g.setColor(findColor(init.adder, 8));
        g.drawLine(771, 376, 797, 376);
        g.drawLine(770, 377, 797, 377);
        
        
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
