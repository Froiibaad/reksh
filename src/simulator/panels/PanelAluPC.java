package simulator.panels;

import java.awt.*;
import simulator.Initializator;


public class PanelAluPC extends ImagePanel {
    private static final String imageName = "alu1.jpg";

    public PanelAluPC(Initializator init) {
        super(init, imageName);
    }

    public void paint(Graphics g) {
        g.drawImage(image, 0, 0, null);
        g.setColor(findColor(init.mxMBR0, 0));
        g.drawLine(283, 128, 254, 128);
        g.setColor(findColor(init.mxMBR1, 0));
        g.drawLine(283, 109, 255, 109);
        g.setColor(findColor(init.mxMBR2, 0));
        g.drawLine(284, 89, 256, 89);
        g.setColor(findColor(init.ldMBR, 0));
        g.drawLine(304, 177, 293, 177);
        g.setColor(findColor(init.MBRin, 0));
        g.drawLine(303, 189, 293, 189);
        g.setColor(findColor(init.clMBR, 0));
        g.drawLine(265, 202, 219, 202);
        g.setColor(findColor(init.mxPC, 0));
        g.drawLine(570, 35, 570, 81);
        g.drawLine(570, 81, 533, 81);
        g.drawLine(533, 81, 607, 81);
        g.setColor(findColor(init.ldPCH, 0));
        g.drawLine(654, 165, 627, 165);
        g.setColor(findColor(init.ldPCL, 0));
        g.drawLine(656, 183, 627, 183);
        g.setColor(findColor(init.incPC, 0));
        g.drawLine(655, 201, 628, 201);
        g.setColor(findColor(init.ldMAR, 0));
        g.drawLine(478, 501, 452, 501);
        g.setColor(findColor(init.incMAR, 0));
        g.drawLine(478, 519, 451, 519);
        g.setColor(findColor(init.mxMAR2, 0));
        g.drawLine(329, 314, 329, 369);
        g.drawLine(329, 369, 320, 369);
        g.drawLine(320, 369, 459, 369);
        g.setColor(findColor(init.mxMAR1, 0));
        g.drawLine(389, 314, 389, 389);
        g.drawLine(389, 389, 319, 389);
        g.drawLine(319, 389, 458, 389);
        g.setColor(findColor(init.mxMAR0, 0));
        g.drawLine(450, 315, 450, 408);
        g.drawLine(450, 408, 460, 408);
        g.drawLine(460, 408, 321, 408);
        g.setColor(findColor(init.orMbrLd, 0));
        g.drawLine(271, 184, 216, 184);

    }
}
