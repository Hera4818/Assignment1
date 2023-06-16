/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment1;

/**
 *
 * @author HP
 */
public class Test_Multiple_Catch_Block {
    public static void main(String args[]){
    
    int a[]=new int[2];
    
        try
        {
            System.out.println("Access Element Three" + a[3]);
        }
        catch(ArithmeticException e){
            System.out.println("Arithmatic Exception");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array Index Out Of Bounds Exception");
        }
        catch(NullPointerException e)
        {
            System.out.println("Null Pointer Exception");
        }
    }
    
}
