/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//Abstract Class Example

package assignment1;

/**
 *
 * @author HP
 */
public class Car1 extends Vehicle2 {
    public void move()
    {
        System.out.println("Car moves faster.");
    }
    
    public static void main(String[] args) {
        Car1 c1 = new Car1();
     c1.move();
     c1.carry();
    }    

}
