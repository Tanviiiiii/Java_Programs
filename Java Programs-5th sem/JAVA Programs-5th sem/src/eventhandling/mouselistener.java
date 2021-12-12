package eventhandling;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class mouselistener extends JFrame {
	JLabel la = new JLabel("some text was there");

	public mouselistener() {
		super("Event Handling");
		setSize(400, 400);
		setLocationRelativeTo(null);
		setResizable(false);
		setLayout(null);
		la.setBounds(80, 80, 300, 30);
		add(la);

		la.addMouseListener(new LabelListener());
		setVisible(true);
	}

	class LabelListener implements MouseListener {
		Font oldFont;

		public void mouseEntered(MouseEvent e) {
			la.setForeground(Color.red);
			oldFont = la.getFont();
			la.setFont(new Font("arial", 0, 18));
		}

		public void mouseExited(MouseEvent e) {
			la.setForeground(Color.black);
			la.setFont(oldFont);
		}

		public void mouseClicked(MouseEvent arg0) {
		}

		public void mousePressed(MouseEvent arg0) {
		}

		public void mouseReleased(MouseEvent arg0) {
		}

	}

	public static void main(String[] args) {
		new mouselistener();

	}

}
