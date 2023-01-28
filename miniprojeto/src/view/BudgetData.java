package view;

import java.util.ArrayList;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import model.*;
import controller.ControllerBudget;

public class BudgetData extends JPanel implements ListSelectionListener{
    DefaultListModel<Budget> listModel;
    JList<Budget> budgetslist;
    private JScrollPane scrollPane;
    
    public BudgetData(){
        // Dados pré-selecionados
        ArrayList<Product> listProduct1 = new ArrayList<>(100);
		ArrayList<Service> listService1 = new ArrayList<>(100);
        listProduct1.add(
            new Product("Martelo", "Para construção", 54.99, 2)
        );

        ArrayList<Product> listProduct2 = new ArrayList<>(100);
		ArrayList<Service> listService2 = new ArrayList<>(100);
        listService2.add(
            new Service("Website", "Uma loja virtual", 10000.00, 60)
        );

        ArrayList<Product> listProduct3 = new ArrayList<>(100);
		ArrayList<Service> listService3 = new ArrayList<>(100);
        listProduct3.add(
            new Product("Computador", "Trabalhe e jogue", 5999.59, 1)
        );
        listService3.add(
            new Service("Reforma", "Banheiro precisa mais espaço", 15000.00, 120)
        );
        ControllerBudget controllerBudget = new ControllerBudget();
        Budget budget1 = new Budget(
            "01",
            "Orçamento1",
            listProduct1,
            listService1,
            "001",
            "Turing",
            "turing@email.com"
        );
        budget1.setTotalPrice(controllerBudget.updatePrice(listService1, listProduct1));
        
        Budget budget2 = new Budget(
            "02",
            "Orçamento2",
            listProduct2,
            listService2,
            "002",
            "Beren",
            "beren@email.com"
        );
        budget2.setTotalPrice(controllerBudget.updatePrice(listService2, listProduct2));
        
        Budget budget3 = new Budget(
            "03",
            "Orçamento3",
            listProduct3,
            listService3,
            "003",
            "Maedros",
            "maedros@email.com"
        );
        budget3.setTotalPrice(controllerBudget.updatePrice(listService3, listProduct3));

        // Painel para mostrar dados
        this.listModel = new DefaultListModel<Budget>();
        this.budgetslist = new JList<Budget>(listModel);
        this.budgetslist.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        this.scrollPane = new JScrollPane(budgetslist);

        this.listModel.addElement(budget1);
        this.listModel.addElement(budget2);
        this.listModel.addElement(budget3);

        this.setLayout(new GridLayout(1, 1));
        this.setSize(new Dimension(150, 550));
        this.setVisible(true);

        this.scrollPane.setSize(new Dimension(150, 500));
        this.budgetslist.addListSelectionListener(this);

        this.add(scrollPane);
    }

    
    /** 
     * @param e
     */
    @Override
    public void valueChanged(ListSelectionEvent e) {
        budgetslist.getSelectedValue();
    }
}
