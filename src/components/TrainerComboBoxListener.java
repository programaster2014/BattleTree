package components;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;

import main.DatabaseHandler;

public class TrainerComboBoxListener implements ItemListener{

	DatabaseHandler handler;
	JComboBox<String> pokemonlist;
	
	public TrainerComboBoxListener(DatabaseHandler handler, JComboBox<String> pokemon) {
		this.handler = handler;
		this.pokemonlist = pokemon;
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		
	}

}
