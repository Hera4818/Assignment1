/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment1;

/**
 *
 * @author HP
 */
public class Car extends Vehicle1 {
     public Car() {
        super(100);
        System.out.println("Car is created");
    }

    public void display() {
        System.out.println("\nVehicle Speed = " + super.speed);
        System.out.println("Car Speed = " + super.speed);
    }

    public static void main(String[] args) {
        Car c1 = new Car();
        c1.display();
    }

}
