package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ItemWindow extends JFrame implements ActionListener {
    public ItemWindow(){

    }

    @Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button1){
			this.dispose();
		} else if (e.getSource() == button2){
			this.dispose();
		} else if (e.getSource() == button3){
			this.dispose();
		} else {
			System.out.println("Error");
		}
		
	}
}
