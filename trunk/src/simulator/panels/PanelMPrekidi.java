package simulator.panels;

import java.awt.Color;
import java.awt.Graphics;
import simulator.Initializator;

public class PanelMPrekidi extends ImagePanel {
	private static final String imageName = "MPrekidi.png";

    public PanelMPrekidi(Initializator init) {
        super(init, imageName);
    }

    public void paint(Graphics g) {
        g.drawImage(image, 0, 0, null);
    }
}
