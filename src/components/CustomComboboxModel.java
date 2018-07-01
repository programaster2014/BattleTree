package components;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;

public class CustomComboboxModel  extends DefaultComboBoxModel<String>{
	private static final long serialVersionUID = -7892293603409513751L;
	
	public CustomComboboxModel(ArrayList<String> list){
		super();
		populateModel(list);
	}
	
	public void populateModel(ArrayList<String> list){
		for(String name : list){
			this.addElement(name);
		}
	}
}
