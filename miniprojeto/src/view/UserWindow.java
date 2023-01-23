package view;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;
import model.*;
import control.*;

public class UserWindow extends JFrame implements ActionListener{
	private static JLabel title = new JLabel("Usuarios");
	private ControllerUser ctrlUser = new ControllerUser();
	private JPanel panelTop = new JPanel();
	private JPanel panelMiddle = new JPanel();
	private JPanel panelBottom = new JPanel();
	private UserForm userForm = new UserForm();
	private UserData userData = new UserData();
	private static JButton createBtn = new JButton("Criar");
	private static JButton readBtn = new JButton("Ler");
	private static JButton updateBtn = new JButton("Atualizar");
	private static JButton deleteBtn = new JButton("Deletar");

	private static JButton backBtn = new JButton("<-");

    public UserWindow(){
		this.setLayout(new GridLayout(3, 1));

		this.setTitle("Usuarios");
		this.setSize(650, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);

		this.panelTop.setSize(650, 30);
		this.panelTop.add(backBtn);
		this.panelTop.add(title);

		this.panelMiddle.setSize(650, 340);
		this.panelMiddle.setLayout(new GridLayout(1,2));
		this.panelMiddle.add(userForm);
		this.panelMiddle.add(userData);
		
		this.panelBottom.setSize(650, 30);
		this.panelBottom.setLayout(new FlowLayout());
		this.panelBottom.add(createBtn);
		this.panelBottom.add(readBtn);
		this.panelBottom.add(updateBtn);
		this.panelBottom.add(deleteBtn);
		
		createBtn.setBounds(10, 100, 45, 25);
		createBtn.addActionListener(this);
		readBtn.setBounds(10, 150, 45, 25);
		readBtn.addActionListener(this);
		updateBtn.setBounds(10, 200, 45, 25);
		updateBtn.addActionListener(this);
		deleteBtn.setBounds(10, 250, 45, 25);
		deleteBtn.addActionListener(this);
		backBtn.setBounds(1, 1, 25, 20);
		backBtn.addActionListener(this);

		this.add(panelTop);
		this.add(panelMiddle);
		this.add(panelBottom);
    }

    @Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == createBtn){
			this.userData.listModel.addElement(ctrlUser.createUser(
			this.userForm.idTextField.getText(),
			this.userForm.nameTextField.getText(),
			this.userForm.emailTextField.getText()
			));
		} else if (e.getSource() == readBtn){
			ctrlUser.readUser(this.userForm.idTextField.getText());
			int idx = this.userData.userslist.getSelectedIndex();

			if(idx != -1){
				JOptionPane.showMessageDialog(null,
				this.userData.userslist.getSelectedValue(),
				"Info do Usuário",
				JOptionPane.INFORMATION_MESSAGE);
			}
		} else if (e.getSource() == updateBtn){
			int idx2 = this.userData.userslist.getSelectedIndex();

			if(idx2 != -1){
				this.userData.listModel.setElementAt(
				new User(
				this.userForm.idTextField.getText(),
				this.userForm.nameTextField.getText(),
				this.userForm.emailTextField.getText()), idx2);
			}
		} else if (e.getSource() == deleteBtn){
			this.ctrlUser.deleteUser(this.userForm.idTextField.getText());
			int idx3 = this.userData.userslist.getSelectedIndex();

			if (idx3 != -1){
				this.userData.listModel.remove(idx3);
			}
		} else if (e.getSource() == backBtn){
			this.dispose();
			Menu menuWindow = new Menu();
		} else {
			System.out.println("Error");
		}
	}
}
