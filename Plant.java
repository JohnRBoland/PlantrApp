package PlantrApp;
/*
 Plant.java	 
 CSIT 211 Final Project    
 Updated: 9.5.2015
 Programmer: John Boland 

 */
public class Plant {
	private String name;
	private String water;
	private String plantzone1;
	private String SoilPh;
	private String Description;
	private String SprdInch;
	private String Day2Ma;
	private String SnExp;
	
	//Temporary
	public String toString(){
		return getName() + getWater() + getSoilPh();
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWater() {
		return water;
	}
	public void setWater(String water) {
		this.water = water;
	}
	public String getPlantzone1() {
		return plantzone1;
	}
	public void setPlantzone1(String plantzone1) {
		this.plantzone1 = plantzone1;
	}
	public String getSoilPh() {
		return SoilPh;
	}
	public void setSoilPh(String soilPh) {
		SoilPh = soilPh;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getSprdInch() {
		return SprdInch;
	}
	public void setSprdInch(String sprdInch) {
		SprdInch = sprdInch;
	}
	public String getDay2Ma() {
		return Day2Ma;
	}
	public void setDay2Ma(String day2Ma) {
		Day2Ma = day2Ma;
	}
	public String getSnExp() {
		return SnExp;
	}
	public void setSnExp(String snExp) {
		SnExp = snExp;
	}
	
}
