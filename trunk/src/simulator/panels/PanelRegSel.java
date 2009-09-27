package simulator.panels;

import java.awt.Color;
import java.awt.Graphics;

import simulator.Initializator;

public class PanelRegSel extends ImagePanel {
	private static final String imageName = "REGSel.png";

    public PanelRegSel(Initializator init) {
        super(init, imageName);
    }

    public void paint(Graphics g) {
        g.drawImage(image, 0, 0, null);
        //1
        g.setColor(Color.RED);
        g.drawLine(699, 181, 699, 209);
        
        //AXsel
        g.setColor(Color.GREEN);
        //g.setColor(findColor(init.alu, 37));
        g.drawLine(832, 236, 910, 236);
        
        //BXsel
        g.setColor(Color.GREEN);
        //g.setColor(findColor(init.alu, 37));
        g.drawLine(832, 289, 910, 289);
        
        //CXsel
        g.setColor(Color.GREEN);
        //g.setColor(findColor(init.alu, 37));
        g.drawLine(832, 344, 910, 344);
        
        //DXsel
        g.setColor(Color.GREEN);
        //g.setColor(findColor(init.alu, 37));
        g.drawLine(832, 396, 910, 396);
      
        //SPsel
        g.setColor(Color.GREEN);
        //g.setColor(findColor(init.alu, 37));
        g.drawLine(832, 449, 910, 449);
     
        //BPsel
        g.setColor(Color.GREEN);
        //g.setColor(findColor(init.alu, 37));
        g.drawLine(832, 502, 910, 502);
     
        //SIsel
        g.setColor(Color.GREEN);
        //g.setColor(findColor(init.alu, 37));
        g.drawLine(832, 555, 910, 555);
     
        //DIsel
        g.setColor(Color.GREEN);
        //g.setColor(findColor(init.alu, 37));
        g.drawLine(832, 608, 910, 608);
      
        //regsel2
        g.setColor(Color.GREEN);
        //g.setColor(findColor(init.alu, 37));
        g.drawLine(301, 542, 301, 583);
        
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
