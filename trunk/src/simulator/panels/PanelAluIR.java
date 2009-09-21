package simulator.panels;

import simulator.Initializator;
import java.awt.Graphics;

public class PanelAluIR extends ImagePanel {
    private static final String imageName = "aluir.jpg";

    public PanelAluIR(Initializator init) {
        super(init, imageName);
    }

    public void paint(Graphics g) {
        g.drawImage(image, 0, 0, null);
        g.setColor(findColor(init.ldIR1, 0));
        g.drawLine(275, 80, 246, 80);
        g.setColor(findColor(init.ldIR2, 0));
        g.drawLine(489, 79, 458, 79);
        g.setColor(findColor(init.ldIR3, 0));
        g.drawLine(710, 79, 679, 79);
        g.setColor(findColor(init.mxB1, 0));
        g.drawLine(320, 232, 291, 232);
        g.setColor(findColor(init.mxB0, 0));
        g.drawLine(320, 249, 289, 249);
        g.setColor(findColor(init.ldB, 0));
        g.drawLine(320, 296, 289, 296);
        g.setColor(findColor(init.ldA, 0));
        g.drawLine(170, 265, 140, 265);
        g.setColor(findColor(init.incSP, 0));
        g.drawLine(730, 218, 699, 218);
        g.setColor(findColor(init.decSP, 0));
        g.drawLine(730, 235, 699, 235);
        g.setColor(findColor(init.REGin, 0));
        g.drawLine(61, 389, 77, 389);
        g.drawLine(77, 389, 77, 397);
        g.drawLine(77, 397, 91, 397);
        g.setColor(findColor(init.REGin, 0));
        g.drawLine(250, 389, 266, 389);
        g.drawLine(266, 389, 266, 398);
        g.drawLine(266, 398, 282, 398);
        g.setColor(findColor(init.REGin, 0));
        g.drawLine(432, 390, 448, 390);
        g.drawLine(448, 390, 448, 397);
        g.drawLine(448, 397, 464, 397);
        g.setColor(findColor(init.REGin, 0));
        g.drawLine(622, 390, 638, 390);
        g.drawLine(638, 390, 638, 398);
        g.drawLine(638, 398, 654, 398);
        g.setColor(findColor(init.notIR11, 0));
        g.drawLine(60, 406, 93, 406);
        g.setColor(findColor(init.notIR11, 0));
        g.drawLine(250, 405, 281, 405);
        g.setColor(findColor(init.IR1, 1));
        g.drawLine(432, 405, 463, 405);
        g.setColor(findColor(init.IR1, 1));
        g.drawLine(623, 405, 653, 405);
        g.setColor(findColor(init.notIR10, 0));
        g.drawLine(61, 420, 78, 420);
        g.drawLine(78, 420, 78, 413);
        g.drawLine(78, 413, 91, 413);
        g.setColor(findColor(init.IR1, 0));
        g.drawLine(250, 420, 267, 420);
        g.drawLine(267, 420, 267, 413);
        g.drawLine(267, 413, 283, 413);
        g.setColor(findColor(init.notIR10, 0));
        g.drawLine(432, 421, 447, 421);
        g.drawLine(447, 421, 447, 413);
        g.drawLine(447, 413, 463, 413);
        g.setColor(findColor(init.IR1, 0));
        g.drawLine(622, 419, 639, 419);
        g.drawLine(639, 419, 639, 413);
        g.drawLine(639, 413, 652, 413);
        g.setColor(findColor(init.andLdR0, 0));
        g.drawLine(118, 406, 140, 406);
        g.setColor(findColor(init.andLdR1, 0));
        g.drawLine(308, 407, 329, 407);
        g.setColor(findColor(init.andLdR2, 0));
        g.drawLine(489, 405, 511, 405);
        g.setColor(findColor(init.andLdR3, 0));
        g.drawLine(680, 405, 701, 405);
        g.setColor(findColor(init.IR1, 0));
        g.drawLine(520, 555, 489, 555);
        g.setColor(findColor(init.IR1, 1));
        g.drawLine(520, 540, 489, 540);

    }

}
