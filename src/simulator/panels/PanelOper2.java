package simulator.panels;

import java.awt.Color;
import java.awt.Graphics;

import simulator.Initializator;

public class PanelOper2 extends ImagePanel {
	private static final String imageName = "Operaciona2.png";

    public PanelOper2(Initializator init) {
        super(init, imageName);
    }

    public void paint(Graphics g) {
        g.drawImage(image, 0, 0, null);
        g.setColor(Color.GREEN);
        //IVTPin
        g.drawLine(499, 53, 506, 53);
        //PCin
        g.drawLine(499, 114, 506, 114);
        //IR1in
        g.drawLine(499, 171, 506, 171);
        //IR2in
        g.drawLine(499, 228, 506, 228);
        //IR3in
        g.drawLine(499, 286, 506, 286);
        //IR4in
        g.drawLine(499, 343, 506, 343);
        //MBRin
        g.drawLine(499, 402, 506, 402);
        //MARmp
        g.drawLine(509, 492, 519, 492);
        //MARin
        g.drawLine(499, 532, 506, 532);
        //TEMP2mp
        g.drawLine(509, 601, 519, 601);
        //IRRin
        g.drawLine(629, 729, 636, 729);
        //IVTPM2out
        g.drawLine(337, 68, 337, 75);
        //IVTPM3out
        g.drawLine(337, 97, 337, 104);
        //PCM2out
        g.drawLine(337, 124, 337, 131);
        //PCM3out
        g.drawLine(337, 152, 337, 159);
        //IR1M2out
        g.drawLine(337, 181, 337, 188);
        //IR1M3out
        g.drawLine(337, 209, 337, 217);
        //IR2M2out
        g.drawLine(337, 239, 337, 246);
        //IR2M3out
        g.drawLine(337, 267, 337, 273);
        //IR4M2out
        g.drawLine(337, 353, 337, 360);
        //IR4M3out
        g.drawLine(337, 382, 337, 389);
        //MBRM2out
        g.drawLine(337, 412, 337, 419);
        //MBRM3out
        g.drawLine(337, 440, 337, 447);
        //MBRM1out
        g.drawLine(704, 432, 704, 440);
        //MARM1out
        g.drawLine(704, 559, 704, 567);
        //TEMP2M1out
        g.drawLine(705, 640, 705, 648);
        
       //TEMP2inLOW
        //g.drawLine(499, 634, 506, 634);

        
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
