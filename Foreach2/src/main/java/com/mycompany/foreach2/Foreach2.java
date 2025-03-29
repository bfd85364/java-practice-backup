/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.foreach2;
import java.util.List;
import java.util.ArrayList;

public class Foreach2 {
    public static void main(String[] args) {
       List<String> gamesList = new ArrayList<String>();
       gamesList.add("Half-life3");
       gamesList.add("Minecraft");
       gamesList.add("Lobotomy corperation 2");
       gamesList.add("Teamfortress2");
       System.out.println("******lterating******");
       gamesList.forEach(System.out::println);
       //gamesList.forEach(games->System.out.println(games))//
    }
}
