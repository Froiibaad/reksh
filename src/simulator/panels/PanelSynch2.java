package simulator.panels;

import java.awt.Color;
import simulator.Initializator;
import java.awt.Graphics;

public class PanelSynch2 extends ImagePanel {
    private static final String imageName = "sync20.jpg";

    public PanelSynch2(Initializator init) {
        super(init, imageName);
    }

    public void paint(Graphics g) {
        g.drawImage(image, 0, 0, null);
        g.setColor(findColor(init.cmpHIT, 1));
        g.drawLine(152, 239, 152, 266);
        g.setColor(findColor(init.cond0Slave, 0));
        g.drawLine(610, 370, 723, 370);
        g.setColor(findColor(init.cond0Slave, 0));
        g.drawLine(612, 414, 726, 414);
        g.setColor(findColor(init.HIT, 0));
        g.drawLine(770, 102, 756, 102);
        g.setColor(findColor(init.HIT, 0));
        // g.drawLine(HIT, 0, 772, 134);
        g.drawLine(772, 134, 756, 134);
        g.setColor(findColor(init.HIT, 0));
        g.drawLine(774, 178, 757, 178);
        g.setColor(findColor(init.HIT, 0));
        g.drawLine(771, 255, 757, 255);
        g.setColor(findColor(init.slaveCyc, 0));
        g.drawLine(757, 112, 774, 112);
        g.setColor(findColor(init.DAin, 0));
        g.drawLine(757, 124, 772, 124);
        g.setColor(findColor(init.slaveCyc, 1));
        g.drawLine(757, 146, 772, 146);
        g.setColor(findColor(init.DAin, 0));
        g.drawLine(764, 157, 775, 157);
        g.setColor(findColor(init.slaveCyc, 2));
        g.drawLine(757, 195, 771, 195);
        g.setColor(findColor(init.slaveCyc, 3));
        g.drawLine(757, 273, 772, 273);
        g.setColor(findColor(init.cond0Slave, 0));
        g.drawLine(723, 116, 634, 116);
        g.drawLine(634, 116, 634, 209);
        g.drawLine(634, 209, 598, 209);
        g.setColor(findColor(init.cond1Slave, 0));
        g.drawLine(722, 146, 649, 146);
        g.drawLine(649, 146, 649, 219);
        g.drawLine(649, 219, 598, 219);
        g.setColor(findColor(init.cond2Slave, 0));
        g.drawLine(722, 187, 696, 187);
        g.drawLine(696, 187, 696, 224);
        g.drawLine(696, 224, 597, 224);
        g.setColor(findColor(init.cycEndSlave, 0));
        g.drawLine(722, 265, 696, 265);
        g.drawLine(696, 265, 696, 233);
        g.drawLine(696, 233, 601, 233);
        g.setColor(findColor(init.slaveInc, 0));
        g.drawLine(568, 219, 554, 219);
        g.setColor(findColor(init.slaveCyc, 0));
        g.drawLine(400, 258, 400, 285);
        g.setColor(findColor(init.slaveCyc, 1));
        g.drawLine(421, 258, 421, 286);
        g.setColor(findColor(init.slaveCyc, 2));
        g.drawLine(444, 258, 444, 286);
        g.setColor(findColor(init.slaveCyc, 3));
        g.drawLine(467, 257, 467, 286);
        g.setColor(findColor(init.slaveInc, 0));
        g.drawLine(505, 85, 488, 85);
        g.setColor(findColor(init.slaveCyc, 1));
        g.drawLine(69, 330, 94, 330);
        g.setColor(findColor(init.DAin, 0));
        g.drawLine(158, 518, 193, 518);
        g.setColor(findColor(init.FCbusout, 0));
        g.drawLine(112, 337, 112, 353);
        g.setColor(findColor(init.ACKbusout, 0));
        g.drawLine(112, 421, 112, 436);
        g.setColor(findColor(init.cond0Slave, 0));
        g.drawLine(344, 396, 359, 396);
        g.setColor(findColor(init.slaveCyc, 1));
        g.drawLine(345, 407, 361, 407);
        g.setColor(findColor(init.slaveCyc, 2));
        g.drawLine(345, 415, 357, 415);
        g.setColor(findColor(init.ackbusBuff, 0));
        g.drawLine(129, 414, 194, 414);
        g.setColor(findColor(init.FCbusout, 0));
        g.drawLine(390, 408, 443, 408);
        g.setColor(findColor(init.ACKbusout, 0));
        g.drawLine(349, 464, 393, 464);

    }
}
