/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package employee;
   class Employee{
    int empid;
    String name;
    Employee(int eid,String n){
        empid=eid;
        name=n;
}
    public void showData(){
     System.out.println("Empid=" +empid+ "" + "Emp Name"+name);
}
   }
  public class EmpExample {
        public static void main(String[]args){
           Employee[] obj=new Employee[2];
           obj[0]=new Employee(100,"ABC");
           obj[1]=new Employee(200,"XYX");
           System.out.println("Employee object 1&2");
           obj[0].showData();
           obj[1].showData();
        }
    
    }

