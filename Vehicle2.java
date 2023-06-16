/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//Abstract Example

package assignment1;

/**
 *
 * @author HP
 */
public abstract class Vehicle2 {
     public Vehicle2()
    {
        System.out.println("Vehicle is Created.");
    }
    
    public abstract void move();
    
    public void carry()
    {
        System.out.println("All Vehicle carry loads");
    }

}
