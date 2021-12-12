package eventhandling;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class button extends JFrame {
	JPanel pa = new JPanel();
	JButton bt1 = new JButton("RED");
	JButton bt2 = new JButton("GREEN");
	JButton bt3 = new JButton("YELLOW");

	public button() {
		super("Button");
		setSize(400, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(3);
		setResizable(false);

		add(pa);
		pa.add(bt1);
		pa.add(bt2);
		pa.add(bt3);

		bt1.addActionListener(new RedListener());
		bt2.addActionListener(new GreenListener());
		bt3.addActionListener(new YellowListener());
		setVisible(true);
	}

	class RedListener implements ActionListener {
		public void actionPerformed(ActionEvent evt) {
			pa.setBackground(Color.red);
		}
	}

	class GreenListener implements ActionListener {
		public void actionPerformed(ActionEvent evt) {
			pa.setBackground(Color.green);
		}
	}

	class YellowListener implements ActionListener {
		public void actionPerformed(ActionEvent evt) {
			pa.setBackground(Color.yellow);
		}
	}

	public static void main(String[] args) {
		new button();

	}

}
