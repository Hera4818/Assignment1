/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment1;

/**
 *
 * @author HP
 */
public class CseTeacher extends Teacher{
     String mainSubject = "CSE";

     public static void main(String[] args){
	CseTeacher obj = new CseTeacher();
	System.out.println(obj.uniName);
	System.out.println(obj.designation);
	System.out.println(obj.mainSubject);
	obj.job();
   }

}
