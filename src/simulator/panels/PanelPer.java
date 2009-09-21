package simulator.panels;

import java.awt.Color;
import simulator.Initializator;
import java.awt.Graphics;

public class PanelPer extends ImagePanel {
    private static final String imageName = "per.jpg";

    public PanelPer(Initializator init) {
        super(init, imageName);
    }

    public void paint(Graphics g) {
        g.drawImage(image, 0, 0, null);
        g.setColor(findColor(init.BUSYBUS, 0));
        g.drawLine(29, 100, 771, 100);
        g.setColor(findColor(init.BUSYBUS, 0));
        g.drawLine(68, 100, 68, 186);
        g.drawLine(68, 186, 92, 186);
        g.setColor(findColor(init.BUSYBUS, 0));
        g.drawLine(274, 100, 274, 179);
        g.drawLine(274, 179, 297, 179);
        g.setColor(findColor(init.BUSYBUS, 0));
        g.drawLine(479, 101, 479, 180);
        g.drawLine(479, 180, 503, 180);
        g.setColor(findColor(init.arbDecoder, 1));
        g.drawLine(360, 534, 360, 572);
        g.drawLine(360, 572, 191, 572);
        g.drawLine(191, 572, 191, 210);
        g.setColor(findColor(init.arbDecoder, 2));
        g.drawLine(383, 534, 383, 573);
        g.drawLine(383, 573, 455, 573);
        g.drawLine(455, 573, 455, 226);
        g.drawLine(455, 226, 424, 226);
        g.drawLine(424, 226, 424, 211);
        g.setColor(findColor(init.arbDecoder, 3));
        g.drawLine(406, 535, 406, 557);
        g.drawLine(406, 557, 613, 557);
        g.drawLine(613, 557, 613, 211);
        g.setColor(findColor(init.BREQ1, 0));
        g.drawLine(139, 211, 139, 266);
        g.drawLine(139, 266, 353, 266);
        g.drawLine(353, 266, 353, 305);
        g.setColor(findColor(init.BREQ2, 0));
        g.drawLine(376, 211, 376, 304);
        g.setColor(findColor(init.BREQ3, 0));
        g.drawLine(582, 211, 582, 265);
        g.drawLine(582, 265, 401, 265);
        g.drawLine(401, 265, 401, 304);

    }

}
