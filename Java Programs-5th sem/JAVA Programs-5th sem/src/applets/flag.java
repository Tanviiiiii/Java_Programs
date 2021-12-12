package applets;

import java.awt.*;
import java.applet.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;

public class flag extends Applet implements Runnable {
	int c = 0;
	Thread t;

	public void init() {
		t = new Thread(this);
	}

	public void start() {
		t.start();
	}

	public void run() {
		while (true) {
			c = (c + 1) % 70;
			repaint();
			try {
				Thread.sleep(20);
			} catch (Exception ex) {
				System.out.println(ex);
			}
		}
	}

	public void paint(Graphics g) {
		Graphics2D gd = (Graphics2D) g;
		gd.fillRect(120, 250, 160, 10);
		gd.drawRect(140, 240, 120, 10);
		gd.fillRect(160, 230, 80, 10);
		gd.fillRect(195, 20, 10, 210);
		GeneralPath p1 = new GeneralPath();
		GeneralPath p2 = new GeneralPath();
		GeneralPath p3 = new GeneralPath();
		p1.moveTo(205, 30);
		p1.curveTo(205 + c, -30, 235 + c, 60, 290, 30);
		p1.lineTo(290, 50);
		p1.curveTo(235 + c, 80, 205 + c, -10, 205, 50);
		p1.lineTo(205, 70);
		gd.setColor(Color.ORANGE);
		gd.fill(p1);
		p2.moveTo(205, 50);
		p2.curveTo(205 + c, -10, 235 + c, 80, 290, 50);
		p2.lineTo(290, 70);
		p2.curveTo(235 + c, 100, 205 + c, 10, 205, 70);
		p2.lineTo(205, 50);
		gd.setColor(Color.WHITE);
		gd.fill(p2);
		p3.moveTo(205, 70);
		p3.curveTo(205 + c, 10, 235 + c, 100, 290, 70);
		p3.lineTo(290, 90);
		p3.curveTo(235 + c, 120, 205 + c, 30, 205, 90);
		p3.lineTo(205, 70);
		gd.setColor(Color.GREEN);
		gd.fill(p3);

	}
}
