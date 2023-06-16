/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//Throw Example

package assignment1;

/**
 *
 * @author HP
 */
public class TestThrow {
    static void validate(int age)
    {
        if(age<18)
            throw new ArithmeticException("Not Valid");
        else 
            System.out.println("Welcome to Vote");
    }
    public static void main (String args[])
    {
        validate(13);
        System.out.println("Rest of the Code");
    }
}
