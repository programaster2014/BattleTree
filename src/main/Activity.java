package main;


public class Activity {
	
	
	public static void main(String[] args) {
		DatabaseHandler dbHandler = new DatabaseHandler();
		dbHandler.initialize();
		
		Gui gui = new Gui();
		gui.createGui(dbHandler);
	}
	
}
