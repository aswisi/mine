import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class LineChartCreator extends Application{
	@Override public void start(Stage stage) {
     
        File[] files = new File("src/data").listFiles();
        for (File file : files) {
        	stage.setTitle("RSI calculation");
        	//defining the axes
            final CategoryAxis xAxis = new CategoryAxis();
            final NumberAxis yAxis = new NumberAxis();
            xAxis.setLabel("Date");
            //creating the chart
            final LineChart<String,Number> lineChart = new LineChart<String,Number>(xAxis,yAxis);
            
            //getting stock information
            CSVFileReader.readCSVFile("src/data/" + file.getName());
            RSICalc.rsiCalculation(CSVFileReader.getDate(), CSVFileReader.getHighs(), CSVFileReader.getLows(), CSVFileReader.getClose(), 14);
            TreeMap<String, Float> rsiCalcs = new TreeMap<String, Float>();
            rsiCalcs = RSICalc.getRsis();
            
            
            lineChart.setTitle("RSI for: " + file.getName().substring(0, file.getName().length() - 4) + " from: " + rsiCalcs.firstKey() + " to: " + rsiCalcs.lastKey());
            //defining a series
            XYChart.Series series = new XYChart.Series();
            XYChart.Series high = new XYChart.Series();
            XYChart.Series low = new XYChart.Series();
            series.setName(file.getName().substring(0, file.getName().length() - 4));
            //populating the series with data
            int i = 1;
            for (Map.Entry mapElement : rsiCalcs.entrySet()) {
            	series.getData().add(new XYChart.Data(mapElement.getKey(), mapElement.getValue()));
            	high.getData().add(new XYChart.Data(mapElement.getKey(), 70));
            	low.getData().add(new XYChart.Data(mapElement.getKey(), 30));
            	i+=1;
            }
    		
            
            Scene scene  = new Scene(lineChart,800,600);
            lineChart.getData().addAll(series, high, low);
           
            stage.setScene(scene);
            stage.show();
        }
        
        
    }
 
    public static void main(String[] args) {
        launch(args);
    }
}
