import java.awt.AlphaComposite;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

class Window extends JFrame {	
	JFrame frame;
	Draw draw;
	Window() {
		frame = new JFrame("Ray Tracing");
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		frame.setUndecorated(true);
		frame.setVisible(true);
		
		draw = new Draw();
		frame.add(draw);
	}
	void update() {
		draw.repaint();
	}
}

class Draw extends JPanel {
	public Draw() {
		
	}
	public void paint(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		g2.setPaint(new Color(0,0,0));
		g2.fillRect(0, 0, Main.width*Main.res, Main.height*Main.res);
		for(int x = 0; x<Main.width; x++) {
			for(int y = 0; y<Main.height; y++) {
				g2.setPaint(Main.screen[x][y]);
				g2.fillRect(0, 0, Main.width*Main.res, Main.height*Main.res);
			}
		}
	}
}