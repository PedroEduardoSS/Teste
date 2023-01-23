package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import model.*;
import control.*;

public class UserForm extends JPanel{
    JLabel title = new JLabel("Dados");
    JLabel idLabel = new JLabel("ID: ");
    JLabel nameLabel = new JLabel("Nome: ");
    JLabel emailLabel = new JLabel("Email: ");

    JTextField idTextField = new JTextField();
    JTextField nameTextField = new JTextField();
    JTextField emailTextField = new JTextField();

    public UserForm(){
        this.setLayout(new GridLayout(3, 2));
        this.setSize(new Dimension(500, 550));
        this.setVisible(true);

        idLabel.setFont(new Font("Arial", Font.CENTER_BASELINE, 20));
        nameLabel.setFont(new Font("Arial", Font.CENTER_BASELINE, 20));
        emailLabel.setFont(new Font("Arial", Font.CENTER_BASELINE, 20));

        idTextField.setPreferredSize(new Dimension(200, 20));
        nameTextField.setPreferredSize(new Dimension(200, 20));
        emailTextField.setPreferredSize(new Dimension(200, 20));

        this.add(idLabel);
        this.add(idTextField);
        this.add(nameLabel);
        this.add(nameTextField);
        this.add(emailLabel);
        this.add(emailTextField);
    }

}
