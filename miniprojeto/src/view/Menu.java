package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Menu extends JFrame implements ActionListener {
	private static JLabel title = new JLabel("Menu Principal");
	private static JPanel panel = new JPanel();
	private static JButton button1 = new JButton("Usuarios");
	private static JButton button2 = new JButton("Orçamentos");
	private static JButton button3 = new JButton("Itens");
    
    public Menu() {
        title.setFont(new Font("Arial", Font.BOLD, 20));
		title.setBounds(410, 10, 750, 30);

		//panel.setPreferredSize(new Dimension(900, 25));
		panel.setBounds(100, 50, 750, 50);

		button1.setBounds(10, 100, 150, 20);
		button1.addActionListener(this);
		button2.setBounds(200, 100, 150, 20);
		button2.addActionListener(this);
		button3.setBounds(400, 100, 150, 20);
		button3.addActionListener(this);
		
	    this.setLayout(null);
		
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		
		this.setTitle("Tela Principal");
		this.setSize(1000, 700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);

		this.add(title);
		this.add(panel);
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button1){
			this.dispose();
		} else if (e.getSource() == button2){
			this.dispose();
		} else if (e.getSource() == button3){
			this.dispose();
		} else {
			System.out.println("Error");
		}
		
	}
	
    
}
