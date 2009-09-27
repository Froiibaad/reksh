package simulator.panels;

import java.awt.Color;
import java.awt.Graphics;

import simulator.Initializator;

public class PanelARB extends ImagePanel {
	private static final String imageName = "Arbitrator.png";

    public PanelARB(Initializator init) {
        super(init, imageName);
    }

    public void paint(Graphics g) {
        g.drawImage(image, 0, 0, null);
        
        //0
        g.setColor(Color.GREEN);
        //g.setColor(findColor(init.alu, 37));
        g.drawLine(346, 167, 346, 216);
        g.drawLine(347, 167, 347, 216);
        g.drawLine(348, 167, 348, 216);
        
        //0m
        g.setColor(Color.GREEN);
        //g.setColor(findColor(init.alu, 37));
        g.drawLine(399, 346, 399, 419);
        g.drawLine(400, 346, 400, 419);
        g.drawLine(401, 346, 401, 419);
        
        //1m
        g.setColor(Color.GREEN);
        //g.setColor(findColor(init.alu, 37));
        g.drawLine(526, 346, 526, 419);
        g.drawLine(527, 346, 527, 419);
        g.drawLine(528, 346, 528, 419);
   
        //2m
        g.setColor(Color.GREEN);
        //g.setColor(findColor(init.alu, 37));
        g.drawLine(640, 346, 640, 419);
        g.drawLine(641, 346, 641, 419);
        g.drawLine(642, 346, 642, 419);
        
        //0l
        g.setColor(Color.GREEN);
        //g.setColor(findColor(init.alu, 37));
        g.drawLine(346, 548, 346, 598);
        g.drawLine(347, 548, 347, 598);
        g.drawLine(348, 548, 348, 598);
        
        //E
        g.setColor(Color.RED);
        g.drawLine(179, 247, 209, 247);
        g.drawLine(179, 248, 209, 248);
        g.drawLine(179, 249, 209, 249);
      
        //W
        g.setColor(Color.GREEN);
        //g.setColor(findColor(init.alu, 37));
        g.drawLine(179, 308, 209, 308);
        g.drawLine(179, 309, 209, 309);
        g.drawLine(179, 310, 209, 310);
        g.drawLine(179, 450, 209, 450);
        g.drawLine(179, 451, 209, 451);
        g.drawLine(179, 452, 209, 452);
        g.drawLine(179, 308, 179, 452);
        g.drawLine(180, 308, 180, 452);
        g.drawLine(181, 308, 181, 452);
        
        
        /*g.setColor(Color.BLACK);
         * 
        g.setColor(findColor(init.busyAdapter, 0));
        g.drawLine(283, 123, 283, 327);
        g.setColor(findColor(init.REQ, 0));
        g.drawLine(51, 180, 395, 180);
        g.setColor(findColor(init.BCLK, 0));
        g.drawLine(348, 41, 348, 508);
        g.drawLine(348, 508, 394, 508);
        g.drawLine(394, 508, 349, 508);
        g.drawLine(349, 508, 349, 228);
        g.drawLine(349, 228, 395, 228);
        g.setColor(findColor(init.BREQ, 0));
        g.drawLine(498, 180, 746, 180);
        g.drawLine(746, 180, 554, 180);
        g.drawLine(554, 180, 554, 302);
        g.drawLine(554, 302, 292, 302);
        g.drawLine(292, 302, 292, 325);
        g.setColor(findColor(init.BGR, 0));
        g.drawLine(749, 311, 302, 311);
        g.drawLine(302, 311, 302, 327);
        g.setColor(findColor(init.arbAnd, 0));
        g.drawLine(292, 350, 292, 461);
        g.drawLine(292, 461, 395, 461);
        g.drawLine(395, 461, 256, 461);
        g.drawLine(256, 461, 256, 275);
        g.drawLine(256, 275, 395, 275);
        g.setColor(findColor(init.FCin, 0));
        g.drawLine(349, 554, 395, 554);
        g.setColor(findColor(init.GR, 0));
        g.drawLine(498, 460, 629, 460);
        g.drawLine(629, 460, 553, 460);
        g.drawLine(553, 460, 553, 548);*/
/*        g.setColor(findColor(init.jedan, 0));
        g.drawLine(535, 555, 543, 555);*/
    }
}
