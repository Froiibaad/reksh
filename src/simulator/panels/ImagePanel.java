package simulator.panels;

import simulator.Initializator;
import simulator.elements.Mreza;
import java.awt.*;

import javax.swing.ImageIcon;
import javax.swing.JPanel;


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

	protected Color findColor(PanelSignals s, int o) {
		//System.out.println("Sada dohvatam " + s.getOutput(0));
		switch (s.getOutput(0)) {
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
