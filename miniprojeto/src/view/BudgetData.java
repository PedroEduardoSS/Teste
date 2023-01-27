package view;

import java.util.ArrayList;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import model.*;

public class BudgetData extends JPanel implements ListSelectionListener{
    DefaultListModel<Budget> listModel;
    JList<Budget> budgetslist;
    private JScrollPane scrollPane;
    
    public BudgetData(){
        // Dados pré-selecionados
        ArrayList<Product> listProduct1 = new ArrayList<>(100);
		ArrayList<Service> listService1 = new ArrayList<>(100);

        ArrayList<Product> listProduct2 = new ArrayList<>(100);
		ArrayList<Service> listService2 = new ArrayList<>(100);

        ArrayList<Product> listProduct3 = new ArrayList<>(100);
		ArrayList<Service> listService3 = new ArrayList<>(100);
        
        Budget budget1 = new Budget(
            "01",
            "Orçamento1",
            listProduct1,
            listService1,
            "001",
            "Turing",
            "turing@email.com"
        );
        Budget budget2 = new Budget(
            "02",
            "Orçamento2",
            listProduct2,
            listService2,
            "002",
            "Beren",
            "beren@email.com"
        );
        Budget budget3 = new Budget(
            "03",
            "Orçamento3",
            listProduct3,
            listService3,
            "003",
            "Maedros",
            "maedros@email.com"
        );

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
