package main;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.util.ArrayList;
import java.util.Set;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

import components.Constraints;
import components.CustomComboboxModel;

public class Gui {

	private DatabaseHandler handler;
	
	public void createGui(DatabaseHandler handler) {
		this.handler = handler;
		
		JFrame main = new JFrame("Battle Tree");
		main.setSize(950, 700);
		
		JPanel panel = new JPanel();
		
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.insets = new Insets(10,10,10,10);
		
		JComboBox<String> TrainerBox = new JComboBox<String>();
		TrainerBox.setModel(new CustomComboboxModel(handler.getTrainerNames()));
		panel.add(TrainerBox, Constraints.TrainerBox);
		
		main.add(panel);
		main.setVisible(true);
	}
	
}
