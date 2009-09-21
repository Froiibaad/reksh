package simulator.panels;

import java.awt.*;
import simulator.Initializator;


public class PanelPrekid3 extends ImagePanel {
    private static final String imageName = "prekid3.jpg";

    public PanelPrekid3(Initializator init) {
        super(init, imageName);
    }

    public void paint(Graphics g) {
        g.drawImage(image, 0, 0, null);
        g.setColor(findColor(init.intaTRAP, 0));
        g.drawLine(65, 254, 106, 254);
        g.setColor(findColor(init.intaINM, 0));
        g.drawLine(65, 225, 106, 225);
        g.setColor(findColor(init.intaADR, 0));
        g.drawLine(65, 199, 107, 199);
        g.setColor(findColor(init.intaCODE, 0));
        g.drawLine(66, 171, 106, 171);
        g.setColor(findColor(init.intaIRQ, 1));
        g.drawLine(64, 116, 106, 116);
        g.setColor(findColor(init.intaIRQ, 2));
        g.drawLine(64, 88, 106, 88);
        g.setColor(findColor(init.intaIRQ, 3));
        g.drawLine(64, 61, 107, 61);
        g.setColor(findColor(init.MASK, 0));
        g.drawLine(730, 199, 797, 199);
        g.setColor(findColor(init.IL1, 0));
        g.drawLine(729, 314, 796, 314);
        g.setColor(findColor(init.IL0, 0));
        g.drawLine(728, 435, 796, 435);
        g.setColor(findColor(init.intaIRQ, 3));
        g.drawLine(399, 312, 446, 312);
        g.setColor(findColor(init.intaIRQ, 2));
        g.drawLine(399, 329, 448, 329);
        g.setColor(findColor(init.intaIRQ, 1));
        g.drawLine(398, 347, 448, 347);
        g.setColor(findColor(init.prior, 2));
        g.drawLine(503, 300, 503, 199);
        g.drawLine(503, 199, 663, 199);
        g.setColor(findColor(init.prior, 1));
        g.drawLine(546, 329, 595, 329);
        g.drawLine(595, 329, 595, 311);
        g.drawLine(595, 311, 662, 311);
        g.setColor(findColor(init.prior, 0));
        g.drawLine(545, 347, 594, 347);
        g.drawLine(594, 347, 594, 436);
        g.drawLine(594, 436, 661, 436);
        g.setColor(findColor(init.ldL1L0, 0));
        g.drawLine(636, 533, 636, 256);
        g.drawLine(636, 256, 663, 256);
        g.setColor(findColor(init.ldL1L0, 0));
        g.drawLine(637, 492, 660, 492);
        g.setColor(findColor(init.ldL1L0, 0));
        g.drawLine(636, 367, 662, 367);

    }
}
