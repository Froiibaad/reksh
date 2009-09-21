package simulator.panels;

import java.awt.*;
import simulator.Initializator;


public class PanelARB extends ImagePanel {
    private static final String imageName = "ARB.jpg";

    public PanelARB(Initializator init) {
        super(init, imageName);
    }

    public void paint(Graphics g) {
        g.drawImage(image, 0, 0, null);
        g.setColor(Color.BLACK);
        g.setColor(findColor(init.busyAdapter, 0));
        g.drawLine(283, 123, 283, 327);
        g.setColor(findColor(init.REQ, 0));
        g.drawLine(51, 180, 395, 180);
      /*  g.setColor(findColor(init.BCLK, 0));
        g.drawLine(348, 41, 348, 508);
        g.drawLine(348, 508, 394, 508);
        g.drawLine(394, 508, 349, 508);
        g.drawLine(349, 508, 349, 228);
        g.drawLine(349, 228, 395, 228);*/
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
        g.drawLine(553, 460, 553, 548);
/*        g.setColor(findColor(init.jedan, 0));
        g.drawLine(535, 555, 543, 555);*/
    }
}
