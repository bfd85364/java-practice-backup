/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package countingalphabet;
public class CountingAlphabet {
    public static void main(String[] alphabet){
char[] charArray = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
                   //0 , 1,  2,  3,  4,  5 , 6 , 7,  8,  9,  10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25//   
        int index = 13; 

        if(index == 13) {
            System.out.println((charArray[index]));
            System.out.println(" this is the First half of the alphabet");
        } 
        else {
            System.out.println("this is the second half of the alphabet");
    }
    }
}