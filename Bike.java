/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//Method OverRidding Example
package assignment1;

/**
 *
 * @author HP
 */
public class Bike extends Vehicle{
     void run(){
           System.out.println("Bike is running safely");
      }  
  
     public static void main(String args[]){  
           Bike bike = new Bike ();     
           bike.run();                           
     }  

}
