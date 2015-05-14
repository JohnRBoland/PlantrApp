package PlantrApp;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JFrame;
import java.awt.Component;
import java.awt.Color;
import java.util.List;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class PlantrPane{
private JTextArea Prompt;
private JTextArea txtEnterPlantName;

PlantrPane(final List<Plant> plantList){

				
				final JFrame frame = new JFrame();
				frame.setSize(400,400);
				JPanel Console = new JPanel();
				

				Prompt = new JTextArea(" \"Plantr\" as an apllication \nprovides plant information \n parsed from a text file for \neasily accessed information.");
				Prompt.setBackground(Color.LIGHT_GRAY);
				Prompt.setLineWrap(true);
				Prompt.setBounds(6, 6, 185, 102);
				
				Console.setLayout(null);
				Console.add(Prompt);

				Console.setVisible(true);
				frame.setContentPane(Console);
				
				txtEnterPlantName = new JTextArea();
				txtEnterPlantName.setText("Enter Plant Name");			
				txtEnterPlantName.setBounds(6, 120, 186, 30);
				Console.add(txtEnterPlantName);
				txtEnterPlantName.setColumns(10);
				
				final JButton btnSearchPlantr = new JButton("Search Plantr");
				
				btnSearchPlantr.addActionListener(new ActionListener()
					{						
					public void actionPerformed(ActionEvent event) 
						{
						if (event.getSource() == btnSearchPlantr)
							{
							String textcheck=txtEnterPlantName.getText().toLowerCase();
							for(Plant plant : plantList)
							{
								if(plant.getName().toLowerCase().charAt(0) ==  textcheck.charAt(0))
									{
									if(plant.getName().toLowerCase().contains(textcheck.toLowerCase())){
									frame.add(result(plant));}
									frame.setVisible(true);
									}
								
							}
								
							}
						}
					});
				
				
				btnSearchPlantr.setBounds(30, 160, 130, 35);
				Console.add(btnSearchPlantr);
				
				frame.setVisible(true);
}
//End of Plantr Pane

Component result(Plant plant){
	JPanel panel = new JPanel();
	panel.setBounds(206, 6, 188, 366);




	JLabel name = new JLabel();
			name.setText("Name: "+ plant.getName());
			name.setBounds(206, 8, 188, 266);
			panel.add(name);
	JLabel water = new JLabel();
			water.setText("Water: "+ plant.getWater());
			panel.add(water);
	JLabel soil = new JLabel();
			soil.setText("Soil: "+ plant.getSoilPh());
			panel.add(soil);
	JLabel d2mature = new JLabel();			
			d2mature.setText("Days to Mature: "+ plant.getDay2Ma());
			panel.add(d2mature);
	JLabel spread = new JLabel();	
			spread.setText("Seed Spread: "+ plant.getSprdInch());
			panel.add(spread);
	JLabel sun = new JLabel();
			sun.setText("Sun exposure: "+ plant.getSnExp());
			panel.add(sun);
	JLabel desc = new JLabel();
			desc.setText("Description: "+ plant.getDescription());
			panel.add(desc);
				
				
	panel.setVisible(true);
	return panel;				
		
				
		}
	}

