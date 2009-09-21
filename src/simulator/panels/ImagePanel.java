package simulator.panels;

import javax.swing.*;
import java.awt.*;
import simulator.Initializator;
import simulator.elements.Mreza;


public class ImagePanel extends JPanel {
    private static final String folderName = "images\\";
    protected Initializator init;
    protected Image image;

    public ImagePanel(Initializator init, String imageName) {
        ImageIcon ic = new ImageIcon(folderName + imageName);
        image = ic.getImage();
        this.init = init;
    }

    protected Color findColor(Mreza m, int o) {
        switch (m.getOutput(o).getValue()) {
        case 0:
            return Color.BLUE;
        case 1:
            return Color.RED;
        case -1:
            return Color.BLACK;
        }
        return Color.DARK_GRAY;
    }

}
