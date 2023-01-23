package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import model.*;
import control.*;

public class BudgetData extends JPanel implements ListSelectionListener{
    private static JLabel viewData = new JLabel("Resultados");
    DefaultListModel<Object> listModel;
    JList<Object> budgetslist;
    private JScrollPane scrollPane;
    
    public BudgetData(){
        this.listModel = new DefaultListModel<Object>();
        this.budgetslist = new JList<Object>(listModel);
        this.budgetslist.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        this.scrollPane = new JScrollPane(budgetslist);
        this.setLayout(new GridLayout(2, 1));
        this.setSize(new Dimension(150, 550));
        this.setVisible(true);

        this.scrollPane.setSize(new Dimension(150, 500));
        this.budgetslist.addListSelectionListener(this);

        this.add(viewData);
        this.add(scrollPane);
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        // TODO Auto-generated method stub
        
    }
}
