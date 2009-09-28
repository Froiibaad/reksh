package simulator.panels;

import java.awt.*;
import simulator.Initializator;

public class PanelOper1 extends ImagePanel {
	private static final String imageName = "Operaciona1.png";

    public PanelOper1(Initializator init) {
        super(init, imageName);
    }

    public void paint(Graphics g) {
        g.drawImage(image, 0, 0, null);
        //M1M2out
        g.setColor(Color.GREEN);
        g.drawLine(201, 32, 201, 41);
        //M1M3out
        g.setColor(Color.GREEN);
        g.drawLine(202, 79, 202, 88);
        //M2M1out
        g.setColor(Color.GREEN);
        g.drawLine(838, 75, 838, 85);
        //M3M1out
        g.setColor(Color.GREEN);
        g.drawLine(838, 122, 838, 132);
        //ALUmp
        g.setColor(Color.GREEN);
        g.drawLine(452, 388, 464, 388);
        //Yin
        g.setColor(Color.GREEN);
        g.drawLine(638, 387, 651, 387);
        //REGin
        g.setColor(Color.GREEN);
        g.drawLine(643, 156, 655, 156);
        //REGBUSsel
        g.setColor(Color.GREEN);
        g.drawLine(581, 150, 581, 161);
        //ALUM2out
        g.setColor(Color.GREEN);
        g.drawLine(299, 476, 299, 485);
        //ALUM3out
        g.setColor(Color.GREEN);
        g.drawLine(299, 528, 299, 538);
        //PSWin
        g.setColor(Color.GREEN);
        g.drawLine(491, 651, 502, 651);
        //PSWM2out
        g.setColor(Color.GREEN);
        g.drawLine(297, 665, 297, 675);
        //PSWM3out
        g.setColor(Color.GREEN);
        g.drawLine(297, 700, 297, 710);
        
        
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