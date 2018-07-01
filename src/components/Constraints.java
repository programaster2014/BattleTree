package components;

import java.awt.GridBagConstraints;
import java.awt.Insets;

public class Constraints {
	public static final Insets insets;
	public static final GridBagConstraints TrainerBox;
	
	static {
		insets = new Insets(0,0,10,10);
		
		TrainerBox = new GridBagConstraints();
			TrainerBox.gridx = 0;
			TrainerBox.gridy = 0;
			TrainerBox.gridwidth = 2;
			TrainerBox.fill = GridBagConstraints.BOTH;
			TrainerBox.weightx = 0.0;
			TrainerBox.insets = insets;
	}
}
