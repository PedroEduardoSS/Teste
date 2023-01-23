package view;

import java.util.ArrayList;
import java.util.Collections;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import model.*;
import control.*;

public class BudgetWindow extends JFrame implements ActionListener {
	private ControllerBudget ctrlBudget = new ControllerBudget();
	private JPanel panelMiddle = new JPanel();
	private JPanel panelBottom = new JPanel();
	private static JButton createBtn = new JButton("Criar");
	private static JButton readBtn = new JButton("Ler");
	private static JButton updateBtn = new JButton("Atualizar");
	private static JButton deleteBtn = new JButton("Deletar");
	private static JButton addItemBtn = new JButton("Adi. Item");
	private static JButton searchBtn = new JButton("Procurar");
	private BudgetForm budgetForm = new BudgetForm();
	private BudgetData budgetData = new BudgetData();

	private static JButton backBtn = new JButton("<-");

	ArrayList<Service> listTempService = new ArrayList<>(100);
	ArrayList<Product> listTempProduct = new ArrayList<>(100);

    public BudgetWindow(){
		this.setLayout(new GridLayout(2, 1));

		this.setTitle("Orçamentos");
		this.setSize(650, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);

		this.panelMiddle.setSize(650, 340);
		this.panelMiddle.setLayout(new GridLayout(1,2));
		this.panelMiddle.add(budgetForm);
		this.panelMiddle.add(budgetData);
		
		this.panelBottom.setSize(650, 30);
		this.panelBottom.setLayout(new FlowLayout());
		this.panelBottom.add(backBtn);
		this.panelBottom.add(createBtn);
		this.panelBottom.add(readBtn);
		this.panelBottom.add(updateBtn);
		this.panelBottom.add(deleteBtn);
		this.panelBottom.add(addItemBtn);
		this.panelBottom.add(searchBtn);
		
		createBtn.setBounds(10, 100, 45, 25);
		createBtn.addActionListener(this);
		readBtn.setBounds(10, 150, 45, 25);
		readBtn.addActionListener(this);
		updateBtn.setBounds(10, 200, 45, 25);
		updateBtn.addActionListener(this);
		deleteBtn.setBounds(10, 250, 45, 25);
		deleteBtn.addActionListener(this);
		addItemBtn.setBounds(10, 250, 45, 25);
		addItemBtn.addActionListener(this);
		searchBtn.setBounds(10, 250, 45, 25);
		searchBtn.addActionListener(this);
		backBtn.setBounds(1, 1, 25, 20);
		backBtn.addActionListener(this);

		this.add(panelMiddle);
		this.add(panelBottom);
    }

    @Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == createBtn){
			ArrayList<Product> listProduct = new ArrayList<>();
			ArrayList<Service> listService = new ArrayList<>();
			this.budgetData.listModel.addElement(ctrlBudget.createBudget(
			this.budgetForm.idTextField.getText(),
			this.budgetForm.titleTextField.getText(),
			listProduct,
			listService,
			this.budgetForm.idUserTextField.getText(),
			this.budgetForm.nameUserTextField.getText(),
			this.budgetForm.emailUserTextField.getText()
			));
		} else if (e.getSource() == readBtn){
			ctrlBudget.readBudget(this.budgetForm.idTextField.getText());
			int idx = this.budgetData.budgetslist.getSelectedIndex();

			if(idx != -1){
				JOptionPane.showMessageDialog(null,
				this.budgetData.budgetslist.getSelectedValue(),
				"Info do Orçamento",
				JOptionPane.INFORMATION_MESSAGE);
			}
		} else if (e.getSource() == updateBtn){
			int idx2 = this.budgetData.budgetslist.getSelectedIndex();
			ArrayList<Product> listProduct = new ArrayList<>();
			ArrayList<Service> listService = new ArrayList<>();

			if(idx2 != -1){
				this.budgetData.listModel.setElementAt(
				new Budget(
					this.budgetForm.idTextField.getText(),
					this.budgetForm.titleTextField.getText(),
					listProduct,
					listService,
					this.budgetForm.idUserTextField.getText(),
					this.budgetForm.nameUserTextField.getText(),
					this.budgetForm.emailUserTextField.getText()), idx2);
			}
		} else if (e.getSource() == deleteBtn){
			this.ctrlBudget.deleteBudget(this.budgetForm.idTextField.getText());
			int idx3 = this.budgetData.budgetslist.getSelectedIndex();

			if (idx3 != -1){
				this.budgetData.listModel.remove(idx3);
			}
		} else if (e.getSource() == addItemBtn){
			int idx4 = this.budgetData.budgetslist.getSelectedIndex();

			if(idx4 != -1){
				if (this.budgetForm.categBox.getSelectedItem() == "Serviço"){
					listTempService.add(new Service(
						this.budgetForm.nameItemTextField.getText(),
						this.budgetForm.infoTextField.getText(),
						Double.valueOf(this.budgetForm.priceTextField.getText()),
						Integer.valueOf(this.budgetForm.qtdOrDLineTextField.getText())));

				} else if (this.budgetForm.categBox.getSelectedItem() == "Produto") {
					listTempProduct.add(new Product(
						this.budgetForm.nameItemTextField.getText(),
						this.budgetForm.infoTextField.getText(),
						Double.valueOf(this.budgetForm.priceTextField.getText()),
						Integer.valueOf(this.budgetForm.qtdOrDLineTextField.getText())
					));
				} else {
					JOptionPane.showMessageDialog(null,
					"Selecione uma categoria",
					"Categoria",
					JOptionPane.WARNING_MESSAGE);
				}
				this.budgetData.listModel.setElementAt(
				new Budget(
					this.budgetForm.idTextField.getText(),
					this.budgetForm.titleTextField.getText(),
					listTempProduct,
					listTempService,
					this.budgetForm.idUserTextField.getText(),
					this.budgetForm.nameUserTextField.getText(),
					this.budgetForm.emailUserTextField.getText()), idx4);
			}
		} else if (e.getSource() == searchBtn){
			int id = Integer.valueOf(this.budgetForm.idUserTextField.getText());
			
			JOptionPane.showMessageDialog(null,
				this.budgetData.listModel.getElementAt(id),
				"Info do Orçamento",
				JOptionPane.INFORMATION_MESSAGE);
			
			System.out.println();
		} else if (e.getSource() == backBtn){
			this.dispose();
			Menu menuWindow = new Menu();
		} else {
			System.out.println("Error");
		}
	}
}
