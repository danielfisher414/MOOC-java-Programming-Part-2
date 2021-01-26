/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author danie
 */
public class Student extends Person {

    private int credits;

    public Student(String name, String message) {
        super(name, message);

        this.credits = credits = 0;

    }

    public int credits() {

        return this.credits;

    }

    public void study() {
        this.credits++;

    }

    public String toString() {
//        String creditString = Integer.toString(this.credits);

        return super.toString() + "\n  Study credits " + this.credits;
    }
}
