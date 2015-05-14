package PlantrApp;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;


public class PlantrDriver {
	private static PlantrPane win;

	public static void main(String[] args){
		
//Build plant list from text file
	String fileLocation = "/Users/johnboland/Documents/workspace/Practice programs/src/funPrograms/newcopy.txt";	
	List<Plant> plantList = new ArrayList<Plant>();
	PlnLstConst i = new PlnLstConst();
	
	try {
		plantList = i.PlantConstructor(fileLocation);
		setWin(new PlantrPane(plantList));
	} catch (FileNotFoundException e) {
		System.out.print("FileNotFound");
		e.printStackTrace();
	}
//Done Build


	
	
	}

	public static PlantrPane getWin() {
		return win;
	}

	public static void setWin(PlantrPane win) {
		PlantrDriver.win = win;
	}
}
