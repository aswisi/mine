import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.chart.XYChart.Data;
import javafx.scene.chart.XYChart.Series;
import javafx.stage.Stage;

public class RSICalc{
	private static TreeMap<String, Float> rsiCalcs = new TreeMap<String, Float>();
	
	public static void rsiCalculation(ArrayList<String> dates, ArrayList<Float> highs, ArrayList<Float> lows, ArrayList<Float> close, int increment){
		float runningGain = 0;
		float runningLoss = 0;
		float prevAvgGain = 0;
		float prevAvgLoss = 0;
		float avgGain = 0;
		float avgLoss = 0;
		float newAvgGain = 0;
		float newAvgLoss = 0;
		int i = 0;
		float net = 0;
		float rsi = 0;
		
		for(i = 0; i < dates.size(); i++){
			if(i + 1 < dates.size()){
				net = close.get(i + 1) - close.get(i);
				if(net > 0){
					runningGain += net;
				}
				else{
					runningLoss += net;
				}
			}
			
			if(i % (increment - 1) == 0 || i == (dates.size() - 1)){
				newAvgGain = (runningGain/increment);
				newAvgLoss = Math.abs(runningLoss/increment);
				avgGain = (((prevAvgGain) * (increment - 1)) + newAvgGain) / increment;
				avgLoss = (((prevAvgLoss) * (increment - 1)) + newAvgLoss) / increment;
				prevAvgGain = newAvgGain;
				prevAvgLoss = newAvgLoss;

			    rsi = 100 - (100/(1+(avgGain/avgLoss)));
			    rsiCalcs.put(dates.get(i), rsi);
			    runningLoss = 0;
			    runningGain = 0;
			}
		}		
	}
	
	public static TreeMap<String, Float> getRsis(){
		return rsiCalcs;
	}
	

}
