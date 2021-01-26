package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class ShanghaiApplication extends Application {

    @Override
    public void start(Stage stage) {
        //creating my Axis
        NumberAxis xAxis = new NumberAxis(2007, 2017, 4);
        NumberAxis yAxis = new NumberAxis();
        //setting labels
        xAxis.setLabel("Ranking");
        yAxis.setLabel("Year");
        //creating my lineChart
        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("University of Helskinki, Shanghai ranking");

        //creating a data set that will be addded to the line chart
        XYChart.Series data = new XYChart.Series();
       
        // and single points into the data set
        data.getData().add(new XYChart.Data(2007, 73));
        data.getData().add(new XYChart.Data(2008, 68));
        data.getData().add(new XYChart.Data(2009, 72));
        data.getData().add(new XYChart.Data(2010, 72));
        data.getData().add(new XYChart.Data(2011, 74));
        data.getData().add(new XYChart.Data(2012, 73));
        data.getData().add(new XYChart.Data(2013, 76));
        data.getData().add(new XYChart.Data(2014, 73));
        data.getData().add(new XYChart.Data(2015, 67));
        data.getData().add(new XYChart.Data(2016, 56));
        data.getData().add(new XYChart.Data(2017, 56));
        //adding my data to the line chart
        lineChart.getData().add(data);
        //adding my linechart to the scene
        Scene scene = new Scene(lineChart, 640, 480);
        stage.setScene(scene);
        
        stage.show();
    }

    public static void main(String[] args) {
        launch(ShanghaiApplication.class);
        System.out.println("Hello world!");
    }

}
