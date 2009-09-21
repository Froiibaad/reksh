package simulator.panels;

import java.awt.Color;
import simulator.Initializator;
import java.awt.Graphics;


public class PanelSynch extends ImagePanel {
    private static final String imageName = "sync11.jpg";

    public PanelSynch(Initializator init) {
        super(init, imageName);
    }

    public void paint(Graphics g) {
        g.drawImage(image, 0, 0, null);
        g.setColor(findColor(init.read, 0));
        g.drawLine(72, 67, 85, 67);
        g.setColor(findColor(init.rdRepeat, 0));
        g.drawLine(72, 82, 85, 82);
        g.setColor(findColor(init.cycEndMaster, 0));
        g.drawLine(203, 150, 230, 150);
        g.setColor(findColor(init.sStartRead, 0));
        g.drawLine(115, 76, 230, 76);
        g.setColor(findColor(init.startRead, 0));
        g.drawLine(312, 75, 388, 75);
        g.setColor(findColor(init.GR, 0));
        g.drawLine(202, 193, 379, 193);
        g.drawLine(379, 193, 379, 91);
        g.drawLine(379, 91, 387, 91);
        g.setColor(findColor(init.RD, 0));
        g.drawLine(422, 83, 432, 83);
        g.setColor(findColor(init.RD, 0));
        g.drawLine(476, 159, 490, 159);
        g.setColor(findColor(init.WR, 0));
        g.drawLine(475, 175, 488, 175);
        g.setColor(findColor(init.RW, 0));
        g.drawLine(519, 167, 533, 167);
        g.setColor(findColor(init.write, 0));
        g.drawLine(61, 266, 75, 266);
        g.setColor(findColor(init.wrRepeat, 0));
        g.drawLine(61, 281, 73, 281);
        g.setColor(findColor(init.sStartWrite, 0));
        g.drawLine(104, 274, 220, 274);
        g.setColor(findColor(init.startWrite, 0));
        g.drawLine(300, 273,
                   378, 273);
        g.setColor(findColor(init.cycEndMaster, 0));
        g.drawLine(193, 348, 219, 348);
        g.setColor(findColor(init.GR, 0));
        g.drawLine(191, 390, 368, 390);
        g.drawLine(368, 390, 368, 291);
        g.drawLine(368, 291, 378, 291);
        g.setColor(findColor(init.WR, 0));
        g.drawLine(411, 281, 430, 281);
        g.setColor(findColor(init.RD, 0));
        g.drawLine(741, 101, 769, 101);
        g.setColor(findColor(init.masterCyc, 0));
        g.drawLine(655, 247, 655, 273);
        g.setColor(findColor(init.masterCyc, 1));
        g.drawLine(676, 247, 676, 273);
        g.setColor(findColor(init.masterCyc, 2));
        g.drawLine(699, 247, 699, 273);
        g.setColor(findColor(init.masterCyc, 3));
        g.drawLine(720, 246, 720, 273);
        g.setColor(findColor(init.RW, 0));
        g.drawLine(657, 334, 674, 334);
        g.setColor(findColor(init.RW, 0));
        g.drawLine(674, 381, 691, 381);
        g.setColor(findColor(init.RW, 0));
        g.drawLine(685, 444, 699, 444);
        g.setColor(findColor(init.RW, 0));
        g.drawLine(683, 444, 697, 444);
        g.setColor(findColor(init.RW, 0));
        g.drawLine(681, 521, 695, 521);
        g.setColor(findColor(init.FCin, 0));
        g.drawLine(674, 409
                   , 689, 409);
        g.setColor(findColor(init.FCin, 0));
        g.drawLine(690, 472, 705, 472);
        g.setColor(findColor(init.masterCyc, 0));
        g.drawLine(658, 350, 671, 350);
        g.setColor(findColor(init.masterCyc, 1));
        g.drawLine(673, 396, 691, 396);
        g.setColor(findColor(init.masterCyc, 2));
        g.drawLine(683, 456, 697, 456);
        g.setColor(findColor(init.masterCyc, 3));
        g.drawLine(682, 535, 695, 535);
        g.setColor(findColor(init.cond0Master, 0));
        g.drawLine(624, 341, 552, 341);
        g.drawLine(552, 341, 552, 453);
        g.drawLine(552, 453, 519, 453);
        g.setColor(findColor(init.cond1Master, 0));
        g.drawLine(640, 394, 579, 394);
        g.drawLine(579, 394, 579, 461);
        g.drawLine(579, 461, 516, 461);
        g.setColor(findColor(init.cond2Master, 0));
        g.drawLine(652, 456, 618, 456);
        g.drawLine(618, 456, 618, 471);
        g.drawLine(618, 471, 515, 471);
        g.setColor(findColor(init.cycEndMaster, 0));
        g.drawLine(648, 525, 642, 525);
        g.drawLine(642, 525, 642, 486);
        g.drawLine(642, 486, 517, 486);
        g.setColor(findColor(init.masterInc, 0));
        g.drawLine(488, 471, 448, 471);
    }
}
