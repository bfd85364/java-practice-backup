/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package foreachloop;
import java.util.List;
import java.util.ArrayList;
import java.util.Vector;
public class Foreachloop {
    public static void main(String[] args) {
       List<Integer> numbers = new Vector <Integer>();
       numbers.add(1);
       numbers.add(4);
       numbers.add(7);
       System.out.println("Original Numbers:" + numbers);
       numbers.replaceAll(num -> num+1);
       System.out.println("Modified Values" + numbers);
    }
    
}
