/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//Constructor Overloading Example

package assignment1;

/**
 *
 * @author HP
 */
public class Example {
    private int var;
    
    public Example()
    {
        this.var = 10;
    }
    
    public Example(int num)
    {
        this.var = num;
    }
            
     public int getValue()
     {
         return var;
     }
     
     public static void main (String args[]){
         Example e1 = new Example();
         Example e2 = new Example(100);
         System.out.println("Variable is :" + e1.getValue());
          System.out.println("Variable is :" + e2.getValue());
     }
}
