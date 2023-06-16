/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment1;

/**
 *
 * @author HP
 */
public class Test_try_catch {
    public static void main(String args[]){  

try{  
	int data=50/0;  
}

catch (ArithmeticException e)
{   
	System.out.println(e);      
}  

System.out.println("rest of the code...");  	
}  

}
