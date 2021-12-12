package applets;

import java.awt.*;
import java.applet.*;

public class ball extends Applet implements Runnable {
	int X = 0, Y = 0, Xinc = 2, Yinc = 1;
	int ball_width = 100, ball_height = 100, aw, ah;
	Thread t;

	public void init() {
		aw = getSize().width;
		ah = getSize().height;
		t = new Thread(this);
	}

	public void start() {
		t.start();
	}

	public void run() {
		while (true) {
			X = X + Xinc;
			Y = Y + Yinc;
			repaint();
			try {
				Thread.sleep(10);
			} catch (Exception ex) {
				System.out.println(ex);
			}
			if ((X + ball_width) >= aw || X <= 0) {
				Xinc = Xinc * (-1);
			}
			if ((Y + ball_height) >= ah || Y <= 0) {
				Yinc = Yinc * (-1);
			}
		}

	}

	public void paint(Graphics g) {
		g.setColor(Color.pink);
		g.fillOval(X, Y, ball_width, ball_height);
	}
}