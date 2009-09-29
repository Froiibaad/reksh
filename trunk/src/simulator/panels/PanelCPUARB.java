package simulator.panels;

import java.awt.*;
import simulator.MainFrame;

import simulator.Initializator;


public class PanelCPUARB extends ImagePanel {
    private static final String imageName = "CPUArb.png";
    public MainFrame mf;

    public PanelCPUARB(Initializator init, MainFrame mf) {
        super(init, imageName);
        this.mf = mf;
    }

    public void paint(Graphics g) {
        g.drawImage(image, 0, 0, null);
        
        //BUSYBUS
        g.setColor(Color.GREEN);
        g.setColor(findColor(mf.CPUArb, 0));
        g.drawLine(49, 224, 1021, 224);
        g.drawLine(49, 225, 1021, 225);
        g.drawLine(325, 275, 325, 226);
        g.drawLine(326, 275, 326, 226);
        g.drawLine(789, 226, 789, 404);
        g.drawLine(790, 226, 790, 404);
        g.drawLine(789, 403, 828, 403);
        g.drawLine(789, 404, 828, 404);  
        
        //BGRQ
        g.setColor(Color.GREEN);
        g.setColor(findColor(mf.CPUArb, 1));
        g.drawLine(65, 362, 104, 362);
        g.drawLine(65, 363, 104, 363);
   
        //run
        g.setColor(Color.GREEN);
        g.setColor(findColor(mf.CPUArb, 2));
        g.drawLine(65, 476, 104, 476);
        g.drawLine(65, 477, 104, 477);
        
        //Q
        g.setColor(Color.GREEN);
        g.setColor(findColor(mf.CPUArb, 3));
        g.drawLine(229, 362, 326, 362);
        g.drawLine(229, 363, 326, 363);
        g.drawLine(325, 305, 325, 363);
        g.drawLine(326, 305, 326, 363);
        
        //CPUBUSBUSYout
        g.setColor(Color.GREEN);
        g.setColor(findColor(mf.CPUArb, 4));
        g.drawLine(337, 294, 352, 294);
        g.drawLine(338, 295, 352, 295);
        
        
        //read
        g.setColor(Color.GREEN);
        g.setColor(findColor(mf.CPUArb, 5));
        g.drawLine(463, 415, 482, 415);
        g.drawLine(463, 416, 483, 416);
        
        //write
        g.setColor(Color.GREEN);
        g.setColor(findColor(mf.CPUArb, 6));
        g.drawLine(463, 439, 483, 439);
        g.drawLine(463, 440, 482, 440);
        
        //read+write
        g.setColor(Color.GREEN);
        g.setColor(findColor(mf.CPUArb, 7));
        g.drawLine(529, 427, 597, 427);
        g.drawLine(529, 428, 597, 428);
        
        //DQ
        g.setColor(Color.GREEN);
        g.setColor(findColor(mf.CPUArb, 8));
        g.drawLine(721, 427, 838, 427);
        g.drawLine(721, 428, 838, 428);
 
        //BR
        g.setColor(Color.GREEN);
        g.setColor(findColor(mf.CPUArb, 9));
        g.drawLine(903, 415, 978, 415);
        g.drawLine(903, 416, 978, 416);
        
        /*g.setColor(Color.BLACK);
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
