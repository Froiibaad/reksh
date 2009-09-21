package simulator.panels;

import java.awt.*;
import simulator.Initializator;


public class PanelPrekid2 extends ImagePanel {
    private static final String imageName = "prekid2.jpg";

    public PanelPrekid2(Initializator init) {
        super(init, imageName);
    }

    public void paint(Graphics g) {
        g.drawImage(image, 0, 0, null);
        g.setColor(findColor(init.intaIRQ, 1));
        g.drawLine(272, 140, 333, 140);
        g.setColor(findColor(init.intaIRQ, 2));
        g.drawLine(273, 122, 332, 122);
        g.setColor(findColor(init.intaIRQ, 3));
        g.drawLine(273, 106, 333, 106);
        g.setColor(findColor(init.andIntaIRQ, 0));
        g.drawLine(382, 215, 198, 215);
        g.drawLine(198, 215, 198, 167);
        g.setColor(findColor(init.inta, 0));
        g.drawLine(798, 201, 415, 201);
        g.setColor(findColor(init.trap, 0));
        g.drawLine(3, 282, 125, 282);
        g.setColor(findColor(init.irq, 0));
        g.drawLine(3, 305, 125, 305);
        g.setColor(findColor(init.inm, 0));
        g.drawLine(3, 327, 125, 327);
        g.setColor(findColor(init.inn, 0));
        g.drawLine(4, 350, 125, 350);
        g.setColor(findColor(init.interrupts, 0));
        g.drawLine(391, 276, 567, 276);
        g.drawLine(567, 276, 516, 276);
        g.drawLine(516, 276, 516, 485);
        g.drawLine(516, 485, 383, 485);
        g.setColor(findColor(init.interrupts, 1));
        g.drawLine(391, 298, 572, 298);
        g.drawLine(572, 298, 432, 298);
        g.drawLine(432, 298, 432, 226);
        g.drawLine(432, 226, 414, 226);
        g.setColor(findColor(init.interrupts, 2));
        g.drawLine(390, 322, 573, 322);
        g.drawLine(573, 322, 433, 322);
        g.drawLine(433, 322, 433, 384);
        g.drawLine(433, 384, 382, 384);
        g.setColor(findColor(init.interrupts, 3));
        g.drawLine(390, 344, 565, 344);
        g.drawLine(565, 344, 466, 344);
        g.drawLine(466, 344, 466, 433);
        g.drawLine(466, 433, 381, 433);
        g.setColor(findColor(init.INTR, 0));
        g.drawLine(627, 310, 796, 310);
        g.setColor(findColor(init.inta, 0));
        g.drawLine(796, 410, 381, 410);
        g.setColor(findColor(init.inta, 0));
        g.drawLine(795, 460, 382, 460);
        g.setColor(findColor(init.inta, 0));
        g.drawLine(795, 510, 382, 510);
        g.setColor(findColor(init.intaINM, 0));
        g.drawLine(349, 398, 266, 398);
        g.setColor(findColor(init.intaINN, 0));
        g.drawLine(348, 449, 173, 449);
        g.drawLine(173, 449, 173, 428);
        g.drawLine(173, 428, 137, 428);
        g.drawLine(137, 428, 173, 428);
        g.drawLine(173, 428, 173, 470);
        g.drawLine(173, 470, 137, 470);
        g.setColor(findColor(init.intaTRAP, 0));
        g.drawLine(350, 497, 269, 497);
        g.setColor(findColor(init.cintr, 0));
        g.drawLine(171, 401, 137, 401);
        g.setColor(findColor(init.aintr, 0));
        g.drawLine(172, 497, 137, 497);
        g.setColor(findColor(init.intaCODE, 0));
        g.drawLine(104, 413, 2, 413);
        g.setColor(findColor(init.intaADR, 0));
        g.drawLine(106, 486, 2, 486);

    }
}
