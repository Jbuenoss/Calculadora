package calculadora;

import javax.swing.*;
import java.awt.*;

public class Calculadora extends JFrame {

	public Calculadora() throws Exception {
		super("Calculadora");
		UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(350, 350);
		setLocation(400, 200);

		setLayout(new BorderLayout());
		TextPanel textPanel = new TextPanel();
		add(BorderLayout.NORTH, textPanel);

		JPanel digitsPanel = new JPanel();
		digitsPanel.setLayout(new BorderLayout());
		add(BorderLayout.CENTER, digitsPanel);

		digitsPanel.add(BorderLayout.CENTER, new NumbersPanel(textPanel.getTxtNumber()));
		digitsPanel.add(BorderLayout.EAST, new OperationsPanel(textPanel.getTxtNumber()));

		setVisible(true);
	}

	public static void main(String[] args) throws Exception {
		new Calculadora();
	}

}