/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//Method Example

package assignment1;

/**
 *
 * @author HP
 */
public class Student1 {
    private String id;
    private String name;
    private double cgpa;
    
    public void insert_Record(String id,String name,double cgpa)
    {
        this.id = id;
        this.name = name;
        this.cgpa=cgpa;
    }
    public void display_Record()
    {
        System.out.println("Name :"+name); 
        System.out.println("ID :"+id);
        System.out.println("CGPA :"+cgpa);
    }
    
    public static void main (String []args){
        Student1 st1 = new Student1();
        st1.insert_Record("4818", "Hera", 3.6);
        st1.display_Record();
    }
            
}
