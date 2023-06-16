/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment1;

/**
 *
 * @author HP
 */
public class Test_Fainally_Block {
    public static void main(String[] args) {
        try 
        {
            int data = 25/5;
            System.out.println(data);
        } 
        catch (NullPointerException e)
        {
            System.out.println(e); 
        }
        finally
        {
            System.out.println("Finally Block Alwats Executed");
        }
    }
}
