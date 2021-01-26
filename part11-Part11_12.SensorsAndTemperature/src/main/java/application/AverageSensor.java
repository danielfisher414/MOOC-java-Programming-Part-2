/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author danie
 */
public class AverageSensor implements Sensor {

    private List<Sensor> sensorList;
    private List<Integer> listOfReads;

    public AverageSensor() {

        this.sensorList = new ArrayList<>();
        this.listOfReads = new ArrayList<>();
    }

    public void addSensor(Sensor toAdd) {
        this.sensorList.add(toAdd);
    }

    public boolean isOn() {
        for (Sensor value : sensorList) {
            if (value.isOn() == true) {
                return true;
            }
        }
        return false;
    }

    public void setOn() {
        for (Sensor value2 : sensorList) {
            value2.setOn();
        }
    }

    public void setOff() {
        for (Sensor value3 : sensorList) {
            value3.setOff();
        }
    }

    public int read() {
        if (isOn() == false || this.sensorList.isEmpty()) {
            throw new IllegalStateException("Either its turned off or empty");
        }
        double average = this.sensorList.stream()
                .mapToInt(i -> i.read())
                .average()
                .getAsDouble();

        int intAverage = (int) average;
        this.listOfReads.add(intAverage);
        return intAverage;
    }

    public List<Integer> readings() {

        return this.listOfReads;
    }
}
