/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//Methodoverloading Example

package assignment1;

/**
 *
 * @author HP
 */
public class MethodOverloading1 {
    
    void sum(int a,int b)
     {  
         System.out.println(a+b);    
     }     

    void sum(int a,int b,int c)
     {
         System.out.println(a+b+c);
     }    


public static void main(String[] args)
  {
      MethodOverloading1 obj = new MethodOverloading1();  
      obj.sum(10, 20, 30);
      obj.sum(20,20);  
    
  }  

}
