/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Random;
import java.lang.Math;

/**
 *
 * @author danie
 */
public class TemperatureSensor implements Sensor {

    private Random rand;
    private boolean sensor;

    public TemperatureSensor() {
        rand = new Random();
        this.sensor = false;
    }

    public boolean isOn() {
        return this.sensor;
    }

    public void setOn() {
        this.sensor = true;
    }

    public void setOff() {
        this.sensor = false;
    }

    public int read() {
        if (this.sensor == true) {
            int min = -30;
            int max = 30;
            int random = rand.nextInt((max - min) + 1) + min;
            return random;
        }else if(this.sensor == false){
        throw new IllegalStateException("The sensor is turned off");
        }
       return 0; 
    }
}
