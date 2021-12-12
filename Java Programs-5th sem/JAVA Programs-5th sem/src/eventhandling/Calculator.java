package eventhandling;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame {

	JPanel[] pa = new JPanel[2];
	JTextField tb = new JTextField("0");
	JButton[] bt = new JButton[20];

	public Calculator() {
		super("Calculator");
		setSize(360, 400);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		addPanels();
		setVisible(true);
	}

	private void addPanels() {
		setLayout(null);
		for (int i = 0; i < 2; i++) {
			pa[i] = new JPanel();
			add(pa[i]);
			pa[i].setBackground(Color.black);
		}
		pa[0].setBounds(20, 10, 310, 50);
		pa[1].setBounds(20, 80, 310, 270);
		addBox();
		addButtons();
	}

	private void addBox() {
		pa[0].setLayout(new BorderLayout());
		pa[0].add(tb);
		tb.setFont(new Font("arial", 1, 20));
		tb.setHorizontalAlignment(JTextField.RIGHT);
		tb.setEditable(false);
		tb.setBackground(Color.white);
		tb.setBorder(BorderFactory.createLineBorder(Color.black, 1));
	}

	private void addButtons() {
		pa[1].setLayout(new GridLayout(5, 4, 7, 7));
		String[] str = { "Back", "CE", "C", "%", "7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-", "0", ".",
				"=", "+" };
		Font fo = new Font("arial", 0, 20);
		Insets ins = new Insets(0, 0, 0, 0);
		CalListener listener = new CalListener();
		for (int i = 0; i < 20; i++) {
			bt[i] = new JButton(str[i]);
			bt[i].addActionListener(listener);
			bt[i].setFont(fo);
			bt[i].setMargin(ins);
			bt[i].setForeground(Color.blue);
			if (i == 3 || i == 7 || i == 11 || i == 15 || i == 18 || i == 19)
				bt[i].setForeground(Color.red);
			pa[1].add(bt[i]);
		}
	}

	class CalListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			JButton bb = (JButton) e.getSource();
			String str = bb.getText();
			if (str.equals("1") || str.equals("2") || str.equals("3") || str.equals("4") || str.equals("5")
					|| str.equals("6") || str.equals("7") || str.equals("8") || str.equals("9") || str.equals("0"))
				tb.setText(str);
		}

	}

	public static void main(String[] args) {
		JFrame.setDefaultLookAndFeelDecorated(true);
		new Calculator();
	}

}
