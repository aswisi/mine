import java.io.BufferedReader;  
import java.io.FileReader;  
import java.io.IOException;
import java.util.ArrayList;


public class CSVFileReader {
	private static ArrayList<String> dates = new ArrayList<String>();
	private static ArrayList<Float> highs = new ArrayList<Float>();
	private static ArrayList<Float> lows = new ArrayList<Float>();
	private static ArrayList<Float> close = new ArrayList<Float>();
	private static ArrayList<Integer> volumes = new ArrayList<Integer>();
	
	public static void readCSVFile(String filename){
		String line = "";  
		String splitBy = ",";  
		int count = 0;
		try{  			  
			BufferedReader br = new BufferedReader(new FileReader(filename));  
			while ((line = br.readLine()) != null){  
				String[] employee = line.split(splitBy);   
				if(count != 0){
					dates.add(employee[0]);	
					highs.add(Float.parseFloat(employee[2]));
					lows.add(Float.parseFloat(employee[3]));
					close.add(Float.parseFloat(employee[4]));
					volumes.add(Integer.parseInt(employee[6]));
				}
				else{
					count = 1;
				}
			}
			br.close();
		}   
		catch (IOException e){
			e.printStackTrace();
		}
	}
	
	public static ArrayList<String> getDate(){
		return dates;
	}
	
	public static ArrayList<Float> getHighs(){
		return highs;
	}
	
	public static ArrayList<Float> getLows(){
		return lows;
	}
	
	public static ArrayList<Float> getClose(){
		return close;
	}
	
	public static ArrayList<Integer> getVolumes(){
		return volumes;
	}
	
	
				
}
