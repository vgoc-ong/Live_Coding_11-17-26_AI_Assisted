/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javawithai2.pkg0;

import java.util.Scanner;

/**
 *
 * @author GOC-ONG_CPE113
 */
public class Javawithai20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
      System.out.println("Enter total || Whole number ||");
      int total = input.nextInt();
      
      System.out.println("Enter count || Whole number ||");
      int count = input.nextInt();
      
      System.out.println("Average: " + computeAverage(total, count));
        
        input.close();
    }
    public static double computeAverage(int total , int count){
        if (count <= 0){
            return 0.0;
        }
        return (double) total / count;
    }
}

// Explain in Your Own words:
// 1.Why does the method need the world double (or a cast) in the return?
// ANSWER: Using (double) in the method help convert the program allows you to
// use the decimal math so you can keep the (.5) in the final answer

// 2. What would go wrong without the count <= 0 guard?
// ANSWER: If there is no count <=o in the proram, dividing by 0 breaks the math
// and returns a non value. It will  corrupt the result.