package simulator.panels;

import java.awt.*;
import simulator.Initializator;


public class PanelAluSig extends ImagePanel {
    private static final String imageName = "alu2.jpg";

    public PanelAluSig(Initializator init) {
        super(init, imageName);
    }

    public void paint(Graphics g) {
        g.drawImage(image, 0, 0, null);
        g.setColor(findColor(init.alu, 7));
        g.drawLine(43, 59, 350, 59);
        g.setColor(findColor(init.alu, 7));
        g.drawLine(42, 106, 90, 106);
        g.setColor(findColor(init.alu, 6));
        g.drawLine(42, 129, 98, 129);
        g.setColor(findColor(init.alu, 5));
        g.drawLine(43, 154, 101, 154);
        g.setColor(findColor(init.alu, 4));
        g.drawLine(42, 176, 105, 176);
        g.setColor(findColor(init.alu, 3));
        g.drawLine(43, 200, 104, 200);
        g.setColor(findColor(init.alu, 2));
        g.drawLine(43, 223, 103, 223);
        g.setColor(findColor(init.alu, 1));
        g.drawLine(42, 247, 97, 247);
        g.setColor(findColor(init.alu, 0));
        g.drawLine(43, 270, 89, 270);
        g.setColor(findColor(init.ADD, 0));
        g.drawLine(42, 317, 89, 317);
        g.setColor(findColor(init.alu, 8));
        g.drawLine(42, 342, 90, 342);
        g.setColor(findColor(init.ADD, 0));
        g.drawLine(42, 365, 90, 365);
        g.setColor(findColor(init.X, 7));
        g.drawLine(42, 388, 89, 388);
        g.setColor(findColor(init.Y, 7));
        g.drawLine(42, 412, 89, 412);
        g.setColor(findColor(init.IV14, 0));
        g.drawLine(42, 436, 89, 436);
        g.setColor(findColor(init.ADD, 0));
        g.drawLine(43, 484, 90, 484);
        g.setColor(findColor(init.IV22, 0));
        g.drawLine(42, 507, 90, 507);
        g.setColor(findColor(init.IV23, 0));
        g.drawLine(43, 530, 91, 530);
        g.setColor(findColor(init.alu, 7));
        g.drawLine(42, 554, 90, 554);
        g.setColor(findColor(init.IZ, 0));
        g.drawLine(223, 185, 350, 185);
        g.setColor(findColor(init.IC, 0));
        g.drawLine(119, 332, 350, 332);
        g.setColor(findColor(init.IV1, 0));
        g.drawLine(162, 398, 232, 398);
        g.drawLine(232, 398, 232, 437);
        g.drawLine(232, 437, 256, 437);
        g.setColor(findColor(init.IV2, 0));
        g.drawLine(162, 520, 232, 520);
        g.drawLine(232, 520, 232, 484);
        g.drawLine(232, 484, 256, 484);
        g.setColor(findColor(init.IV, 0));
        g.drawLine(312, 460, 350, 460);
        g.setColor(findColor(init.ADD, 0));
        g.drawLine(539, 49, 562, 49);
        g.setColor(findColor(init.ALUop, 0));
        g.drawLine(539, 64, 563, 64);
        g.setColor(findColor(init.add1, 0));
        g.drawLine(590,57,628,57);
        g.setColor(findColor(init.ALUadd, 0));
        g.drawLine(539, 105, 628, 105);
        g.setColor(findColor(init.add, 0));
        g.drawLine(686, 82, 751, 82);
        g.setColor(findColor(init.XOR, 0));
        g.drawLine(539, 167, 562, 167);
        g.setColor(findColor(init.ALUop, 0));
        g.drawLine(539, 186, 562, 186);
        g.setColor(findColor(init.xor, 0));
        g.drawLine(590, 175, 751, 175);
        g.setColor(findColor(init.LSR, 0));
        g.drawLine(539, 226, 562, 226);
        g.setColor(findColor(init.ALUop, 0));
        g.drawLine(539, 245, 562, 245);
        g.setColor(findColor(init.lsr, 0));
        g.drawLine(590, 234, 752, 234);
        g.setColor(findColor(init.ALUshl, 0));
        g.drawLine(541, 294, 751, 294);
        g.setColor(findColor(init.LOAD, 0));
        g.drawLine(539, 344, 562, 344);
        g.setColor(findColor(init.ALUop, 0));
        g.drawLine(539, 359, 562, 359);
        g.setColor(findColor(init.trans, 0));
        g.drawLine(591, 352, 752, 352);
    }
}
