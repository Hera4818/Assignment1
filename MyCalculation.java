/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment1;

/**
 *
 * @author HP
 */
public class MyCalculation extends Calculation{
   public void multiplication(int x, int y) 
   {
      z = x * y;
      System.out.println("The product :"+z);
   }
   public void division(int x, int y) {
      z = x / y;
      System.out.println("The Division :"+z);
   }
	
   public static void main(String[] args) {
      int a = 20, b = 10;
      MyCalculation demo = new MyCalculation();
      demo.addition(a, b);
      demo.subtraction(a, b);
      demo.multiplication(a, b);
      demo.division (a, b);
   }
 
}
