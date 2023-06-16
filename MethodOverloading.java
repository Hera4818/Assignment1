/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//MethodOverloading Example

package assignment1;

/**
 *
 * @author HP
 */
public class MethodOverloading {
     void sum(int a,int b)
     {  
         System.out.println(a+b);    
     }     
     void sum (double a,double b)
     {
         System.out.println(a+b);
     }
     
     public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();
        obj.sum(10.5, 11.5);
        obj.sum(10, 20);
    }
  }  

