package simulator.panels;

import java.awt.Color;
import java.awt.Graphics;

import java_cup.Main;

import simulator.Initializator;
import simulator.MainFrame;
import simulator.upravljacka.Signali;

public class PanelOper2 extends ImagePanel {
	private static final String imageName = "Operaciona2.png";
	public MainFrame mf;
    public PanelOper2(Initializator init, MainFrame mf) {
        super(init, imageName);
        this.mf = mf;
    }

    public void paint(Graphics g) {
        g.drawImage(image, 0, 0, null);
        g.setColor(Color.GREEN);
        //IVTPin
        g.setColor(findColor(mf.Oper2, 0));
        g.drawLine(499, 53, 506, 53);
        g.drawLine(499, 54, 506, 54);
        //PCin
        g.setColor(findColor(mf.Oper2, 1));
        g.drawLine(499, 114, 506, 114);
        g.drawLine(499, 115, 506, 115);
        //IR1in
        g.setColor(findColor(mf.Oper2, 2));
        g.drawLine(499, 171, 506, 171);
        g.drawLine(499, 172, 506, 172);
        //IR2in
        g.setColor(findColor(mf.Oper2, 3));
        g.drawLine(499, 228, 506, 228);
        g.drawLine(499, 229, 506, 229);
        //IR3in
        g.setColor(findColor(mf.Oper2, 4));
        g.drawLine(499, 286, 506, 286);
        g.drawLine(499, 287, 506, 287);
        //IR4in
        g.setColor(findColor(mf.Oper2, 5));
        g.drawLine(499, 343, 506, 343);
        g.drawLine(499, 344, 506, 344);
        //MBRin
        g.setColor(findColor(mf.Oper2, 6));
        g.drawLine(499, 402, 506, 402);
        g.drawLine(499, 403, 506, 403);
        //MARmp
        g.setColor(findColor(mf.Oper2, 7));
        g.drawLine(509, 492, 519, 492);
        g.drawLine(509, 493, 519, 493);
        //MARin
        g.setColor(findColor(mf.Oper2, 9));
        g.drawLine(499, 532, 506, 532);
        g.drawLine(499, 533, 506, 533);
        //TEMP2mp
        g.setColor(findColor(mf.Oper2, 9));
        g.drawLine(509, 601, 519, 601);
        g.drawLine(509, 602, 519, 602);
        //IRRin
        g.setColor(findColor(mf.Oper2, 10));
        g.drawLine(629, 729, 636, 729);
        g.drawLine(629, 730, 636, 730);
        //IVTPM2out
        g.setColor(findColor(mf.Oper2, 11));
        g.drawLine(337, 68, 337, 75);
        g.drawLine(336, 68, 336, 75);
        //IVTPM3out
        g.setColor(findColor(mf.Oper2, 12));
        g.drawLine(337, 97, 337, 104);
        g.drawLine(336, 97, 336, 104);
        //PCM2out
        g.setColor(findColor(mf.Oper2, 13));
        g.drawLine(337, 124, 337, 131);
        g.drawLine(336, 124, 336, 131);
        //PCM3out
        g.setColor(findColor(mf.Oper2, 14));
        g.drawLine(337, 152, 337, 159);
        g.drawLine(336, 152, 336, 159);
        //IR1M2out
        g.setColor(findColor(mf.Oper2, 15));
        g.drawLine(337, 181, 337, 188);
        g.drawLine(336, 181, 336, 188);
        //IR1M3out
        g.setColor(findColor(mf.Oper2, 16));
        g.drawLine(337, 209, 337, 217);
        g.drawLine(336, 209, 336, 217);
        //IR2M2out
        g.setColor(findColor(mf.Oper2, 17));
        g.drawLine(337, 239, 337, 246);
        g.drawLine(336, 239, 336, 246);
        //IR2M3out
        g.setColor(findColor(mf.Oper2, 18));
        g.drawLine(337, 267, 337, 273);
        g.drawLine(336, 267, 336, 273);
        //IR3M2out
        g.setColor(findColor(mf.Oper2, 19));
        g.drawLine(337, 296, 337, 305);
        g.drawLine(336, 296, 336, 305);
        //IR3M3out
        g.setColor(findColor(mf.Oper2, 20));
        g.drawLine(337, 324, 337, 333);
        g.drawLine(336, 324, 336, 333);
        //IR4M2out
        g.setColor(findColor(mf.Oper2, 21));
        g.drawLine(337, 353, 337, 360);
        g.drawLine(336, 353, 336, 360);
        //IR4M3out
        g.setColor(findColor(mf.Oper2, 22));
        g.drawLine(337, 382, 337, 389);
        g.drawLine(336, 382, 336, 389);
        //MBRM2out
        g.setColor(findColor(mf.Oper2, 23));
        g.drawLine(337, 412, 337, 419);
        g.drawLine(336, 412, 336, 419);
        //MBRM3out
        g.setColor(findColor(mf.Oper2, 24));
        g.drawLine(337, 440, 337, 447);
        g.drawLine(336, 440, 336, 447);
        //MBRM1out
        g.setColor(findColor(mf.Oper2, 25));
        g.drawLine(704, 432, 704, 440);
        g.drawLine(705, 432, 705, 440);
        //MARM1out
        g.setColor(findColor(mf.Oper2, 26));
        g.drawLine(704, 559, 704, 567);
        g.drawLine(705, 559, 705, 567);
        //TEMP2M1out
        g.setColor(findColor(mf.Oper2, 27));
        g.drawLine(705, 640, 705, 648);
        g.drawLine(706, 640, 706, 648);
        //TEMP2inLOW
        g.setColor(findColor(mf.Oper2, 28));
        g.drawLine(497, 634, 506, 634);
        g.drawLine(497, 635, 506, 635);
        //TEMP2swap
        g.setColor(findColor(mf.Oper2, 29));
        g.drawLine(497, 660, 506, 660);
        g.drawLine(497, 661, 506, 661);
        //TEMPinLOW
        g.setColor(findColor(mf.Oper2, 30));
        g.drawLine(628, 679, 637, 679);
        g.drawLine(628, 680, 637, 680);
        //TEMPswap
        g.setColor(findColor(mf.Oper2, 31));
        g.drawLine(628, 701, 637, 701);
        g.drawLine(628, 702, 637, 702);     
        
       //TEMP2inLOW
        //g.drawLine(499, 634, 506, 634);

        
        /*g.setColor(Color.BLACK);
        g.setColor(findColor(init.alu, 8));
        g.drawLine(459, 319, 368, 319);
        g.drawLine(368, 319, 368, 272);
        g.drawLine(368, 272, 272, 272);
        g.setColor(findColor(mf.Oper2, 8));
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
