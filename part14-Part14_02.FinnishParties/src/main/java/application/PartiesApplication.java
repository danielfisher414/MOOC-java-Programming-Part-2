package application;

import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.Axis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class PartiesApplication extends Application {

    private Map<String, Map<Integer, Double>> values;

    public PartiesApplication() {
        this.values = readData("partiesdata.tsv");
    }

    public void start(Stage stage) {
        ArrayList<Integer> years = new ArrayList<>();
        NumberAxis xAxis = new NumberAxis(1968, 2008, 4);
        NumberAxis yAxis = new NumberAxis(0, 30, 5);

        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);

// go through the parties and add them to the chart
        values.keySet().stream().forEach(party -> {
            // a different data set for every party
            XYChart.Series data = new XYChart.Series();
            data.setName(party);

            // add the party's support numbers to the data set
            values.get(party).entrySet().stream().forEach(pair -> {
                data.getData().add(new XYChart.Data(pair.getKey(), pair.getValue()));
            });

            // and add the data set to the chart
            lineChart.getData().add(data);
        });
       lineChart.setTitle("Relative support of the parties");
        Scene scene = new Scene(lineChart);
        stage.setScene(scene);
        stage.show();
    }

    Map<String, Map<Integer, Double>> readData(String fileName) {
        Map<String, Map<Integer, Double>> values = new HashMap<>();
      

        List<String> partyList = new ArrayList<>();
        List<Integer> yearList = new ArrayList<>();
        List<Double> valueList = new ArrayList<>();

        int insideCount = 0;
        int innerCount = 0;

        try (Scanner scanner = new Scanner(Paths.get(fileName))) {

            while (scanner.hasNextLine()) {
                String row = scanner.nextLine();
                String[] pieces = row.split("\t");
                //selection of parties
                for (int count = 0; count < pieces.length; count++) {
//                    System.out.println("count: " + count + " " + pieces[count]);
                    //adding the years to the yearList
                    if (innerCount > 0 && innerCount <= 11) {
                        yearList.add(Integer.valueOf(pieces[count]));
                    } //adding my parties to the party list
                    else if (count == 0 && innerCount > 0) {
                        partyList.add(pieces[count]);
                    } else if (innerCount > 12 && count > 0 && count <= 11) {
                        if(!pieces[count].equals("-")){
                           
                        valueList.add(Double.valueOf(pieces[count]));
                        }else if(pieces[count].equals("-")){
                        valueList.add(null);
                        }
                    }
                    
                    innerCount++;
                }
//                System.out.println(yearList);
//                System.out.println(partyList);
//                System.out.println(valueList);
            }
            //adding my arraylist into the hashmap
            //yearList forloop then valueList
           
            for (int i = 0; i < partyList.size(); i++) {
                  Map<Integer, Double> yearNValue = new HashMap<>();
                for (int i2 = 0; i2 < yearList.size(); i2++) {
                      
                    
                        yearNValue.put(yearList.get(i2), valueList.get(insideCount));
//                        System.out.println(yearNValue);
                       
                    
                    insideCount++;
                }
//                System.out.println(partyList.get(i)+">"+ yearNValue);
                values.put(partyList.get(i), yearNValue);
                System.out.println(values);
            }
//            System.out.println(values);
//            System.out.println(yearNValue);
//            System.out.println(valueList);
        } catch (Exception e) {
            System.out.println("error " + e.getMessage());
        }

        return values;
    }

    public static void main(String[] args) {
        launch(PartiesApplication.class);
//        System.out.println("Hello world!");
    }

}
