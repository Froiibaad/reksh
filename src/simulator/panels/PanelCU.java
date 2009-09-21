package simulator.panels;

import java.awt.*;
import simulator.Initializator;


public class PanelCU extends ImagePanel {
    private static final String imageName = "CU.jpg";

    public PanelCU(Initializator init) {
        super(init, imageName);
    }

    public void paint(Graphics g) {
        g.drawImage(image, 0, 0, null);
        g.setColor(Color.BLACK);
        g.setColor(findColor(init.broper,0));
        g.drawLine(212, 308, 189, 308);
        g.setColor(findColor(init.bradr,0));
        g.drawLine(211, 335, 189, 335);
        g.setColor(findColor(init.run,0));
        g.drawLine(413, 406, 305, 406);
        g.drawLine(305, 406, 359, 406);
        g.drawLine(359, 406, 359, 451);
        g.drawLine(359, 451, 305, 451);
        g.setColor(findColor(init.branch,0));
        g.drawLine(461, 455, 447, 455);
        g.setColor(findColor(init.broper,0));
        g.drawLine(462, 469, 444, 469);
        g.setColor(findColor(init.bradr,0));
        g.drawLine(462, 482, 447, 482);
        g.setColor(findColor(init.cntBranch,0));
        g.drawLine(420, 470, 310, 470);
        g.drawLine(310, 470, 385, 470);
        g.drawLine(385, 470, 385, 425);
        g.drawLine(385, 425, 304, 425);
        g.setColor(findColor(init.cntInc,0));
        g.drawLine(277, 460, 233, 460);
        g.setColor(findColor(init.cntLd,0));
        g.drawLine(278, 415, 234, 415);
        g.setColor(findColor(init.ADDC,0));
        g.drawLine(477, 263, 509, 263);
        g.setColor(findColor(init.PSWZ,0));
        g.drawLine(477, 276, 510, 276);
        g.setColor(findColor(init.MASK,0));
        g.drawLine(477, 289, 509, 289);
        g.setColor(findColor(init.INTR,0));
        g.drawLine(477, 303, 510, 303);
        g.setColor(findColor(init.notBADCODE,0));
        g.drawLine(654, 240, 581, 240);
        g.setColor(findColor(init.L1,0));
        g.drawLine(656, 251, 581, 251);
        g.setColor(findColor(init.L2,0));
        g.drawLine(655, 262, 581, 262);
        g.setColor(findColor(init.ADRLESS,0));
        g.drawLine(656, 276, 580, 276);
        g.setColor(findColor(init.STORE,0));
        g.drawLine(655, 294, 581, 294);
        g.setColor(findColor(init.JSR,0));
        g.drawLine(656, 313, 581, 313);
        g.setColor(findColor(init.notIMM,0));
        g.drawLine(655, 327, 582, 327);
        g.setColor(findColor(init.notREGDIR,0));
        g.drawLine(655, 342, 581, 342);
    }
}
