package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Menu extends JFrame implements ActionListener {
	private static JLabel title = new JLabel("Menu Principal");
	private static JPanel panel = new JPanel();
	private static JButton usersBtn = new JButton("Usuarios");
	private static JButton budgetsBtn = new JButton("Orçamentos");
	
    
    public Menu() {
        title.setFont(new Font("Arial", Font.BOLD, 20));
		title.setBounds(250, 10, 700, 30);

		panel.setBounds(0, 50, 650, 50);

		usersBtn.setSize(new Dimension(30, 20));
		usersBtn.addActionListener(this);
		budgetsBtn.setSize(new Dimension(30, 20));
		budgetsBtn.addActionListener(this);
		
	    this.setLayout(null);
		
		panel.add(usersBtn);
		panel.add(budgetsBtn);
		
		this.setTitle("Tela Principal");
		this.setSize(650, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);

		this.add(title);
		this.add(panel);
    }

	
	/** 
	 * @param e
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == usersBtn){
			this.dispose();
			UserWindow userWindow = new UserWindow();
		} else if (e.getSource() == budgetsBtn){
			this.dispose();
			BudgetWindow budgetWindow = new BudgetWindow();
		} else {
			System.out.println("Error");
		}
	}
	
    
}
