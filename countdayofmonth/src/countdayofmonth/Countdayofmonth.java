/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package countdayofmonth;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.time.LocalDate;
public class Countdayofmonth{
    public static void main(String[] args) {
       
       String months[] = { "January", "February", "March", "April",   
                           "May", "June", "July", "August",   
                           "September", "October", "November", "December" };
       LocalDate initial = LocalDate.of(2024,3,31);
       LocalDate start = initial.withDayOfMonth(1);
        LocalDate end = initial.withDayOfMonth(initial.getMonth().length(initial.isLeapYear()));
       
       GregorianCalendar obj = new GregorianCalendar(2024, 2, 19); //month-1
        System.out.println("Today's date = " 
                         + obj.get(Calendar.YEAR) + "\n"
                         + months[obj.get(Calendar.MONTH)] + ", "
                            + obj.get(Calendar.DAY_OF_MONTH) + " ");
        System.out.println(start);
        System.out.println(end);
        
    
    }
    
}
