package PlantrApp;


import java.awt.Color;
import java.awt.Component;

import javax.swing.JTextArea;
import javax.swing.JPanel;


public class PlantResult{
	private JTextArea Name;


	private JTextArea SunEx;
	private JTextArea Soil;
	private JTextArea h2o;
	private JTextArea D2Mat;
	private JTextArea sprd;
	private JTextArea desc;



	PlantResult(Plant plnt){
		
		JPanel Console2 = new JPanel();
		

		Console2.setLayout(null);
		Console2.add(Name);
		Console2.add(Soil);
		Name = new JTextArea("Name: "+ plnt.getName());		
		Name.setBounds(6, 5, 186, 16);
		Soil = new JTextArea("Soil: "+ plnt.getSoilPh());
		Soil.setBounds(6, 26, 185, 16);
		h2o = new JTextArea("Water: "+ plnt.getWater());
		h2o.setBounds(6, 68, 186, 16);
		D2Mat = new JTextArea("Days to Maturity: " + plnt.getDay2Ma());
		D2Mat.setBounds(6, 89, 185, 16);
		sprd = new JTextArea("Seed Spread: " + plnt.getSprdInch());		
		sprd.setBounds(6, 110, 186, 16);
			
		desc = new JTextArea("Description: " + plnt.getDescription());
		desc.setBounds(6, 131, 186, 55);
		desc.setBackground(Color.lightGray);
		SunEx = new JTextArea("Sun Exposure:  " + plnt.getSnExp());
		SunEx.setBounds(6, 47, 186, 16);
		Console2.add(SunEx);
		Console2.add(h2o);
		Console2.add(D2Mat);
		Console2.add(sprd);
		Console2.add(desc);
		Console2.setVisible(true);
	}


	public JTextArea getName() {
		return Name;
	}



	public void setName(JTextArea name) {
		Name = name;
	}



	public JTextArea getSunEx() {
		return SunEx;
	}



	public void setSunEx(JTextArea sunEx) {
		SunEx = sunEx;
	}



	public JTextArea getSoil() {
		return Soil;
	}



	public void setSoil(JTextArea soil) {
		Soil = soil;
	}



	public JTextArea getH2o() {
		return h2o;
	}



	public void setH2o(JTextArea h2o) {
		this.h2o = h2o;
	}



	public JTextArea getD2Mat() {
		return D2Mat;
	}



	public void setD2Mat(JTextArea d2Mat) {
		D2Mat = d2Mat;
	}



	public JTextArea getSprd() {
		return sprd;
	}



	public void setSprd(JTextArea sprd) {
		this.sprd = sprd;
	}



	public JTextArea getDesc() {
		return desc;
	}



	public void setDesc(JTextArea desc) {
		this.desc = desc;
	}


}

