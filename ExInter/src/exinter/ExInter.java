/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exinter;
interface Statinter{
    //statinter(){System.out.println("Constructer!");
    default void show(){
        System.out.println("Default Method!");
    }
    static void display(){
        System.out.println("Displaying Static method!");
    }
    void run();
}
public class ExInter implements Statinter {
    public void run(){System.out.println("abstract method");}
   public static void main(String[] args){
       Statinter.display();
       ExInter st=new ExInter();
        st.show();
   }
    
}
