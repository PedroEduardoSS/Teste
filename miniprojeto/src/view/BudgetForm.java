package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import model.*;
import control.*;

public class BudgetForm extends JPanel{
    JLabel title = new JLabel("Dados");
    JLabel idLabel = new JLabel("ID: ");
    JLabel titleLabel = new JLabel("Titulo: ");
    JLabel idUserLabel = new JLabel("Id Usuario: ");
    JLabel nameUserLabel = new JLabel("Nome Usuario: ");
    JLabel emailUserLabel = new JLabel("Email Usuario: ");
    
    JTextField idTextField = new JTextField();
    JTextField titleTextField = new JTextField();
    JTextField idUserTextField = new JTextField();
    JTextField nameUserTextField = new JTextField();
    JTextField emailUserTextField = new JTextField();
    
    JLabel categoryLabel = new JLabel("Categoria: ");
    JLabel nameItemLabel = new JLabel("Nome: ");
    JLabel infoLabel = new JLabel("Informações: ");
    JLabel priceLabel = new JLabel("Preço: ");
    JLabel qtdOrDLineLabel = new JLabel("Quantidade | prazo: ");

    JComboBox categBox;
    JTextField nameItemTextField = new JTextField();
    JTextField infoTextField = new JTextField();
    JTextField priceTextField = new JTextField();
    JTextField qtdOrDLineTextField = new JTextField();

    
    public BudgetForm(){
        this.setLayout(new GridLayout(10, 2));
        this.setSize(new Dimension(200, 550));
        this.setVisible(true);

        idLabel.setFont(new Font("Arial", Font.CENTER_BASELINE, 15));
        titleLabel.setFont(new Font("Arial", Font.CENTER_BASELINE, 15));
        idUserLabel.setFont(new Font("Arial", Font.CENTER_BASELINE, 15));
        nameUserLabel.setFont(new Font("Arial", Font.CENTER_BASELINE, 15));
        emailUserLabel.setFont(new Font("Arial", Font.CENTER_BASELINE, 15));
        
        categoryLabel.setFont(new Font("Arial", Font.CENTER_BASELINE, 15));
        nameItemLabel.setFont(new Font("Arial", Font.CENTER_BASELINE, 15));
        infoLabel.setFont(new Font("Arial", Font.CENTER_BASELINE, 15));
        priceLabel.setFont(new Font("Arial", Font.CENTER_BASELINE, 15));
        qtdOrDLineLabel.setFont(new Font("Arial", Font.CENTER_BASELINE, 15));

        idTextField.setPreferredSize(new Dimension(200, 20));
        titleTextField.setPreferredSize(new Dimension(200, 20));
        idUserTextField.setPreferredSize(new Dimension(200, 20));
        nameUserTextField.setPreferredSize(new Dimension(200, 20));
        emailUserTextField.setPreferredSize(new Dimension(200, 20));

        String[] categories = {"--", "Serviço","Produto"};
        categBox = new JComboBox<>(categories);
        categBox.setPreferredSize(new Dimension(200, 20));
        nameItemTextField.setPreferredSize(new Dimension(200, 20));
        infoTextField.setPreferredSize(new Dimension(200, 20));
        priceTextField.setPreferredSize(new Dimension(200, 20));
        qtdOrDLineTextField.setPreferredSize(new Dimension(200, 20));

        this.add(idLabel);
        this.add(idTextField);
        this.add(titleLabel);
        this.add(titleTextField);
        this.add(idUserLabel);
        this.add(idUserTextField);
        this.add(nameUserLabel);
        this.add(nameUserTextField);
        this.add(emailUserLabel);
        this.add(emailUserTextField);
        this.add(categoryLabel);
        this.add(categBox);
        this.add(nameItemLabel);
        this.add(nameItemTextField);
        this.add(infoLabel);
        this.add(infoTextField);
        this.add(priceLabel);
        this.add(priceTextField);
        this.add(qtdOrDLineLabel);
        this.add(qtdOrDLineTextField);
    }
}
