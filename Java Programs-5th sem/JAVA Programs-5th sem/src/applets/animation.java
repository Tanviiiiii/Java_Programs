package applets;

import java.awt.*;
import java.applet.*;

public class animation extends Applet {
	Image pic;

	public void init() {
		pic = getImage(getDocumentBase(), "1.jpg");
	}

	public void paint(Graphics grp) {
		for (int i = 50; i < 600; i++) {
			grp.drawImage(pic, i, 30, this);
			try {
				Thread.sleep(0);
			} catch (Exception e) {
			}
		}
	}
}

