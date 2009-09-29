package simulator.panels;

import java.awt.Color;
import java.awt.Graphics;

import simulator.Initializator;

public class PanelAdrRutine extends ImagePanel {
	private static final String imageName = "AdrRutine.png";

    public PanelAdrRutine(Initializator init) {
        super(init, imageName);
    }

    public void paint(Graphics g) {
        g.drawImage(image, 0, 0, null);
    }
}
