package simulator.panels;

import java.awt.Color;
import simulator.Initializator;
import java.awt.Graphics;

public class PanelSynch1 extends ImagePanel {
    private static final String imageName = "sync12.jpg";

    public PanelSynch1(Initializator init) {
        super(init, imageName);
    }

    public void paint(Graphics g) {
        g.drawImage(image, 0, 0, null);
        g.setColor(findColor(init.cond0Master, 0));
        g.drawLine(39, 202, 54, 202);
        g.setColor(findColor(init.masterCyc, 1));
        g.drawLine(40, 212, 56, 212);
        g.setColor(findColor(init.masterCyc, 2));
        g.drawLine(41, 221, 54, 221);
        g.setColor(findColor(init.busout, 0));
        g.drawLine(85, 211, 177, 211);
        g.drawLine(177, 211, 122, 211);
        g.drawLine(122, 211, 122, 249);
        g.drawLine(122, 249, 133, 249);
        g.drawLine(133, 249, 122, 249);
        g.drawLine(122, 249, 122, 295);
        g.drawLine(122, 295, 134, 295);
        g.setColor(findColor(init.RD, 0));
        g.drawLine(41, 265, 133, 265);
        g.setColor(findColor(init.WR, 0));
        g.drawLine(45, 310, 133, 310);
        g.setColor(findColor(init.RDbusout, 0));
        g.drawLine(165, 257, 177, 257);
        g.setColor(findColor(init.WRbusout, 0));
        g.drawLine(164, 303, 177, 303);
        g.setColor(findColor(init.ACKBUS, 0));
        g.drawLine(297, 184, 297, 212);
        g.drawLine(297, 212, 334, 212);
        g.drawLine(334, 212, 297, 212);
        g.drawLine(297, 212, 297, 288);
        g.drawLine(297, 288, 329, 288);
        g.setColor(findColor(init.masterCyc, 1));
        g.drawLine(322, 228, 333, 228);
        g.setColor(findColor(init.masterCyc, 1));
        g.drawLine(326, 304, 337, 304);
        g.setColor(findColor(init.sAck, 0));
        g.drawLine(366, 220, 402, 220);
        g.setColor(findColor(init.rAck, 0));
        g.drawLine(370, 294, 401, 294);
        g.setColor(findColor(init.ack, 0));
        g.drawLine(483, 221, 510, 221);
        g.setColor(findColor(init.cycEndMaster, 0));
        g.drawLine(79, 370, 90, 370);
        g.setColor(findColor(init.cycEndMaster, 0));
        g.drawLine(76, 420, 88, 420);
        g.setColor(findColor(init.cycEndMaster, 0));
        g.drawLine(78, 478, 90, 478);
        g.setColor(findColor(init.ack, 0));
        g.drawLine(77, 381, 84, 381);
        g.setColor(findColor(init.ack, 0));
        g.drawLine(74, 429, 82, 429);
        g.setColor(findColor(init.ack, 0));
        g.drawLine(79, 486, 90, 486);
        g.setColor(findColor(init.RD, 0));
        g.drawLine(79, 389, 90, 389);
        g.setColor(findColor(init.WR, 0));
        g.drawLine(78, 438, 89, 438);
        g.setColor(findColor(init.WR, 0));
        g.drawLine(79, 494, 90, 494);
        g.setColor(findColor(init.rdRepeat, 0));
        g.drawLine(124, 382, 136, 382);
        g.setColor(findColor(init.wrRepeat, 0));
        g.drawLine(121, 429, 134, 429);
        g.setColor(findColor(init.wrDone, 0));
        g.drawLine(123, 486, 135, 486);
        g.setColor(findColor(init.cond0Master, 0));
        g.drawLine(304, 376, 318, 376);
        g.setColor(findColor(init.masterCyc, 1));
        g.drawLine(306, 384, 320, 384);
        g.setColor(findColor(init.masterCyc, 2));
        g.drawLine(305, 393, 318, 393);
        g.setColor(findColor(init.busout, 0));
        g.drawLine(349, 383, 440, 383);
        g.drawLine(440, 383, 387, 383);
        g.drawLine(387, 383, 387, 421);
        g.drawLine(387, 421, 396, 421);
        g.drawLine(396, 421, 386, 421);
        g.drawLine(386, 421, 386, 467);
        g.drawLine(386, 467, 397, 467);
        g.setColor(findColor(init.RD, 0));
        g.drawLine(305, 439, 396, 439);
        g.setColor(findColor(init.WR, 0));
        g.drawLine(309, 484, 397, 484);
        g.setColor(findColor(init.RDbusout, 0));
        g.drawLine(429, 429, 442, 429);
        g.setColor(findColor(init.WRbusout, 0));
        g.drawLine(429, 475, 442, 475);
        g.setColor(findColor(init.masterCyc, 1));
        g.drawLine(574, 241, 638, 241);
        g.setColor(findColor(init.masterCyc, 1));
        g.drawLine(574, 301, 638, 301);
        g.setColor(findColor(init.RDbusout, 0));
        g.drawLine(655, 248, 655, 276);
        g.setColor(findColor(init.WRbusout, 0));
        g.drawLine(655, 308, 655, 335);
        g.setColor(findColor(init.rdDone, 0));
        g.drawLine(590, 400, 605, 400);
        g.setColor(findColor(init.wrDone, 0));
        g.drawLine(590, 417, 604, 417);
        g.setColor(findColor(init.sRun, 0));
        g.drawLine(635, 409, 672, 409);
        g.setColor(findColor(init.run, 0));
        g.drawLine(753, 408, 780, 408);
        g.setColor(findColor(init.read, 0));
        g.drawLine(590, 473, 603, 473);
        g.setColor(findColor(init.write, 0));
        g.drawLine(590, 483, 605, 483);
        g.setColor(findColor(init.halt, 0));
        g.drawLine(591, 494, 604, 494);
        g.setColor(findColor(init.FCin, 0));
        g.drawLine(167, 126, 199, 126);
        g.setColor(findColor(init.rRun, 0));
        g.drawLine(635, 484, 672, 484);

    }

}
