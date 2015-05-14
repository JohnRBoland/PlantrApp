package PlantrApp;
/*
 Plant.java	 
 CSIT 211 Final Project    
 Updated: 8.5.2015
 Programmer: John Boland 

 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class PlnLstConst{
	
	public Scanner LineParser;
	public Scanner FileScan;
	String tmpStr;
	String newPlant;
	int i = 0; 	//row counter
	int j = 0;	//column counter
	
	
	public List<Plant> PlantConstructor(String fileLocation) throws FileNotFoundException{
		FileScan = new Scanner (new File(fileLocation));
		List<Plant> plantList = new ArrayList<Plant>();

		//plantList can now be filled with plant objects

		while (FileScan.hasNext())
		{
		newPlant = FileScan.nextLine();
		LineParser = new Scanner(newPlant);
		LineParser.useDelimiter("/");

		//input line of data			
		//New 	
		while(LineParser.hasNext()){	
			Plant plnt	= new Plant();						 
			tmpStr = LineParser.next();
			plnt.setName(tmpStr);
		
			tmpStr = LineParser.next();
			plnt.setPlantzone1(tmpStr);
			
			tmpStr = LineParser.next();
			plnt.setSnExp(tmpStr);
			
			tmpStr = LineParser.next();
			plnt.setSprdInch(tmpStr);
			
			tmpStr = LineParser.next();
			plnt.setDay2Ma(tmpStr);
			
			tmpStr = LineParser.next();
			plnt.setSoilPh(tmpStr);
			
			tmpStr = LineParser.next();
			plnt.setWater(tmpStr);
			
			tmpStr = LineParser.next();
			plnt.setDescription(tmpStr);
							
			plantList.add(plnt);			
			}
		}
		
		return plantList;
	}
	
	
	
}
