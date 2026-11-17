/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problem2.ai;

import java.util.Scanner;

/**
 *
 * @author GOC-ONG_CPE113
 */
public class Problem2Ai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        System.out.print("Pila ka grado imong ibutang kol?");
        int size = input.nextInt();
        int[] Grades = new int[size];


        for (int i = 0; i < size; i++) {
            System.out.print("Grado nimo kol" + (i + 1) + ": ");
            Grades[i] = input.nextInt();
        }


        System.out.print("ang passing score kay: ");
        int Mark = input.nextInt();


        int userLoop = countPassing(Grades, Mark);
        int userRec = countPassingRecursive(Grades, Mark, 0);
        System.out.println(" Loop: " + userLoop + " | Recursive: " + userRec + " | Match? " + (userLoop == userRec));


        input.close(); 
    }
  public static int countPassing(int[] grades, int passingMark) {
        int count = 0;


        for (int i = 0; i < grades.length; i++) {
            if (grades[i] >= passingMark) {
                count++;
            }
        }


        return count;
    }


    public static int countPassingRecursive(int[] grades, int passingMark, int index) {
        if (index >= grades.length) {
            return 0;
        }


        int currentPass = (grades[index] >= passingMark) ? 1 : 0;
        return currentPass + countPassingRecursive(grades, passingMark, index + 1);
    }
}

// QUESTIONS:
// 1. The use of it is to move to the next grade, which is neccesary so it reaches the end of the array

// 2. If theres no base case, the method never stops at the end of the array and crashes.