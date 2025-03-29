/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.excepexample;
public class ExcepEXample {
    public static void main(String[] args) {
       try{
           int num[]={1,2,3};
           System.out.println(num[10]);
       }
       catch(Exception e){
           System.out.println("Something went wrong!");
       }
    }
}
