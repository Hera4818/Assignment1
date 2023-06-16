/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment1;

/**
 *
 * @author HP
 */
public class Test_try_catch1 {
    public static void main(String args []){
    int x = 10;
    int y = 10;
    try
    {
     int num= x/y;
     System.out.println("next-statement: Inside try block");
    }
    catch (Exception ex)
    {
     System.out.println("Exception");  
    }
    System.out.println("next-statement: Outside of try-catch");

    }
}