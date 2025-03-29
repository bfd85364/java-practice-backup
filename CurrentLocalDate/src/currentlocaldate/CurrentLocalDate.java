/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package currentlocaldate;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
public class CurrentLocalDate {
    public static void main(String[]args) {
        DateTimeFormatter cld= DateTimeFormatter.ofPattern("yyyy/MM/dd/HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
           System.out.println(cld.format(now));
        
    }
    
}
