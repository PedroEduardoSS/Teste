package view;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import model.*;

public class UserData extends JPanel implements ListSelectionListener{
    DefaultListModel<User> listModel;
    JList<User> userslist;
    private JScrollPane scrollPane;

    public UserData(){
        // Dados pré-selecionado
        User user1 = new User("001", "Turing", "turing@email.com");
        User user2 = new User("002", "Beren", "beren@email.com");
        User user3 = new User("003", "Maedros", "maedros@email.com");

        // Painel para mostrar os dados
        this.listModel = new DefaultListModel<User>();
        this.userslist = new JList<User>(listModel);
        this.userslist.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        this.listModel.addElement(user1);
        this.listModel.addElement(user2);
        this.listModel.addElement(user3);
        
        this.scrollPane = new JScrollPane(userslist);
        this.setLayout(new GridLayout(1, 1));
        this.setSize(new Dimension(150, 550));
        this.setVisible(true);

        this.scrollPane.setSize(new Dimension(150, 500));
        this.userslist.addListSelectionListener(this);

        this.add(scrollPane);
    }

    
    /** 
     * @param e
     */
    @Override
    public void valueChanged(ListSelectionEvent e) {
        userslist.getSelectedValue();
    }
}
