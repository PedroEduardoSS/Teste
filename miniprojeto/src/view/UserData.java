package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import model.*;
import control.*;

public class UserData extends JPanel implements ListSelectionListener{
    private static JLabel viewData = new JLabel("Resultados");
    DefaultListModel<Object> listModel;
    JList<Object> userslist;
    private JScrollPane scrollPane;

    public UserData(){
        this.listModel = new DefaultListModel<Object>();
        this.userslist = new JList<Object>(listModel);
        this.userslist.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        this.scrollPane = new JScrollPane(userslist);
        this.setLayout(new GridLayout(2, 1));
        this.setSize(new Dimension(150, 550));
        this.setVisible(true);

        this.scrollPane.setSize(new Dimension(150, 500));
        this.userslist.addListSelectionListener(this);

        this.add(viewData);
        this.add(scrollPane);
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        /*int idx = userslist.getSelectedIndex();

        if(idx != -1){
            JOptionPane.showMessageDialog(scrollPane,
            userslist.getSelectedValue(),
            "Info do Usuário",
            JOptionPane.INFORMATION_MESSAGE);
        }*/
        
    }
}
