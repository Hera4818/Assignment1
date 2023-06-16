/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


package assignment1;

/**
 *
 * @author HP
 */
public class MyClass
{
    int a =50;
    static int b = 100;
    
    public void method1()
    {
        int n = 90;
        System.out.println(n);
         System.out.println(a);
          System.out.println(b);
    }
    
    public void method2()
    {
     //System.out.println(n);
      System.out.println(a);
       System.out.println(b);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyClass obj = new MyClass();
        obj.method1();
        obj.method2();
    }
    
}
