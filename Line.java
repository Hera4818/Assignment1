/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment1;

/**
 *
 * @author HP
 */
public class Line implements Drawing {
    public void draw()
    {
        System.out.println("I am drawing a Line");
    }
    public static void main(String[]args)
    {
        Line l = new Line();
        l.draw();
    }
}
