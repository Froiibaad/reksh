package simulator.panels;

import java.awt.*;
import simulator.Initializator;


public class PanelPrekid1 extends ImagePanel {
    private static final String imageName = "prekid1.jpg";

    public PanelPrekid1(Initializator init) {
        super(init, imageName);
    }

    public void paint(Graphics g) {
        g.drawImage(image, 0, 0, null);
        g.setColor(findColor(init.PSWT, 0));
        g.drawLine(147, 28, 164, 28);
        g.setColor(findColor(init.intaTRAP, 0));
        g.drawLine(146, 65, 165, 65);
        g.setColor(findColor(init.IRQ3, 0));
        g.drawLine(145, 94, 163, 94);
        g.setColor(findColor(init.intaIRQ, 3));
        g.drawLine(144, 131, 162, 131);
        g.setColor(findColor(init.IRQ2, 0));
        g.drawLine(145, 164, 163, 164);
        g.setColor(findColor(init.intaIRQ, 2));
        g.drawLine(147, 205, 163, 205);
        g.setColor(findColor(init.IRQ1, 0));
        g.drawLine(145, 239, 163, 239);
        g.setColor(findColor(init.intaIRQ, 1));
        g.drawLine(145, 279, 163, 279);
        g.setColor(findColor(init.trap, 0));
        g.drawLine(209, 22, 651, 22);
        g.drawLine(651, 22, 651, 391);
        g.drawLine(651, 391, 695, 391);
        g.setColor(findColor(init.ffIRQ3, 0));
        g.drawLine(209, 95, 255, 95);
        g.drawLine(255, 95, 255, 102);
        g.setColor(findColor(init.imr3, 0));
        g.drawLine(383, 120, 341, 120);
        g.drawLine(341, 120, 341, 96);
        g.drawLine(341, 96, 263, 96);
        g.drawLine(263, 96, 263, 102);
        g.setColor(findColor(init.irqImr3, 0));
        g.drawLine(258, 120, 258, 285);
        g.drawLine(258, 285, 285, 285);
        g.drawLine(285, 285, 285, 285);
        g.setColor(findColor(init.irqImr3, 0));
        g.drawLine(259, 274, 371, 274);
        g.drawLine(371, 274, 371, 288);
        g.drawLine(371, 288, 496, 288);
        g.drawLine(496, 288, 496, 308);
        g.setColor(findColor(init.ffIRQ2, 0));
        g.drawLine(208, 161, 292, 161);
        g.drawLine(292, 161, 292, 170);
        g.setColor(findColor(init.imr2, 0));
        g.drawLine(383, 180, 341, 180);
        g.drawLine(341, 180, 341, 156);
        g.drawLine(341, 156, 301, 156);
        g.drawLine(301, 156, 301, 170);
        g.setColor(findColor(init.irqImr2, 0));
        g.drawLine(296, 188, 296, 282);
        g.drawLine(296, 282, 306, 282);
        g.drawLine(306, 282, 306, 293);
        g.drawLine(306, 293, 306, 283);
        g.drawLine(306, 283, 351, 283);
        g.drawLine(351, 283, 351, 297);
        g.drawLine(351, 297, 509, 297);
        g.drawLine(509, 297, 509, 309);
        g.setColor(findColor(init.ffIRQ1, 0));
        g.drawLine(208, 235, 314, 235);
        g.drawLine(314, 235, 314, 244);
        g.setColor(findColor(init.imr1, 0));
        g.drawLine(382, 238, 322, 238);
        g.drawLine(322, 238, 322, 238);
        g.setColor(findColor(init.irqImr1, 0));
        g.drawLine(320, 263, 320, 291);
        g.drawLine(320, 291, 320, 262);
        g.drawLine(320, 262, 362, 262);
        g.drawLine(362, 262, 362, 283);
        g.drawLine(362, 283, 526, 283);
        g.drawLine(526, 283, 526, 309);
        g.setColor(findColor(init.PSWL0, 0));
        g.drawLine(356, 332, 370, 332);
        g.setColor(findColor(init.PSWL1, 0));
        g.drawLine(356, 318, 370, 318);
        g.setColor(findColor(init.cmp, 0));
        g.drawLine(400, 343, 400, 343);
        g.drawLine(400, 343, 320, 343);
        g.drawLine(320, 343, 320, 354);
        g.setColor(findColor(init.afterImr, 0));
        g.drawLine(304, 324, 304, 353);
        g.setColor(findColor(init.PSWI, 0));
        g.drawLine(264, 344, 289, 344);
        g.drawLine(289, 344, 289, 353);
        g.setColor(findColor(init.irq, 0));
        g.drawLine(305, 377, 305, 407);
        g.drawLine(305, 407, 696, 407);
        g.setColor(findColor(init.INM, 0));
        g.drawLine(144, 388, 163, 388);
        g.setColor(findColor(init.intaINM, 0));
        g.drawLine(145, 428, 162, 428);
        g.setColor(findColor(init.inm, 0));
        g.drawLine(208, 392, 252, 392);
        g.drawLine(252, 392, 252, 437);
        g.drawLine(252, 437, 695, 437);
        g.setColor(findColor(init.setCINTR, 0));
        g.drawLine(146, 478, 164, 478);
        g.setColor(findColor(init.intaCODE, 0));
        g.drawLine(144, 517, 163, 517);
        g.setColor(findColor(init.setAINTR, 0));
        g.drawLine(145, 551, 163, 551);
        g.setColor(findColor(init.intaADR, 0));
        g.drawLine(145, 590, 164, 590);
        g.setColor(findColor(init.cintr, 0));
        g.drawLine(208, 481, 223, 481);
        g.drawLine(223, 481, 223, 516);
        g.drawLine(223, 516, 262, 516);
        g.setColor(findColor(init.aintr, 0));
        g.drawLine(208, 555, 231, 555);
        g.drawLine(231, 555, 231, 546);
        g.drawLine(231, 546, 261, 546);
        g.setColor(findColor(init.inn, 0));
        g.drawLine(291, 532, 303, 532);
        g.drawLine(303, 532, 303, 451);
        g.drawLine(303, 451, 695, 451);

    }
}
