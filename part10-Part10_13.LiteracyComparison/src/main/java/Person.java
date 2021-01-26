/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author danie
 */
public class Person implements Comparable<Person>{

    private String country;
    private String gender;
    private int year;
    private double literacyPercent;

    public Person(String country, String gender, int year, double literacyPercent) {
        this.country = country;
        this.gender = gender;
        this.year = year;
        this.literacyPercent = literacyPercent;
    }

    public Double getLiteracyPercent() {
        return this.literacyPercent;
    }
   public int compareTo(Person person){
   if(this.literacyPercent == person.literacyPercent){
   return 0;
   }else if(this.literacyPercent < person.literacyPercent){
   return -1;
   }
   return 1;
   }
   
    public String toString() {
        return this.country + " (" + this.year + "), " + this.gender + ", " + literacyPercent;
    }

}
