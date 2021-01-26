/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author danie
 */
public class Person {

   private String name;
  private String message;
  
    
    public Person(String name, String message ) {

        this.name = name;
        this.message = message;
        
    }

    public String toString() {

        return name + "\n  " + message;

    }
   
}
