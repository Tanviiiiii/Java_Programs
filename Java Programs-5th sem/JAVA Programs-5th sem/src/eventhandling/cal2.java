package eventhandling;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

class calc2 extends Frame {
	calc2() {
		JFrame f = new JFrame("Calculator");
		JLabel l1 = new JLabel("Enter value");
		JLabel l2 = new JLabel("Enter 2nd value");
		JLabel l3 = new JLabel("Result");
		JTextField t1 = new JTextField();
		JTextField t2 = new JTextField();
		JTextField t3 = new JTextField();
		JButton a = new JButton("+");
		JButton b = new JButton("-");
		JButton c = new JButton("*");
		JButton d = new JButton("/");
		JButton e = new JButton("=");
		JButton g = new JButton("clear");
		f.add(l1);
		f.add(t1);
		f.add(l2);
		f.add(t2);
		f.add(l3);
		f.add(t3);
		f.setLayout(new GridLayout(6, 2));
		f.add(a);
		f.add(b);
		f.add(c);
		f.add(d);
		f.add(e);
		f.add(g);
		f.setVisible(true);
		f.setSize(300, 300);
		addWindowListener(new WindowListener() {
			@Override
			public void windowOpened(WindowEvent e) {
			}

			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}

			@Override
			public void windowClosed(WindowEvent e) {
			}

			@Override
			public void windowIconified(WindowEvent e) {
			}

			@Override
			public void windowDeiconified(WindowEvent e) {
			}

			@Override
			public void windowActivated(WindowEvent e) {
			}

			@Override
			public void windowDeactivated(WindowEvent e) {
			}
		});
	}
}

public class cal2 {
	public static void main(String[] args) {
		cal2 x = new cal2();
	}
}
