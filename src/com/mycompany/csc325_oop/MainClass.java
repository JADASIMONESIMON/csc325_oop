/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.csc325_oop;
/**
 *
 * @author MoaathAlrajab
 */
import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {
        // Creating instances of Freshman and Senior with proper constructors and GPA settings

        com.mycompany.csc325_oop.Freshman freshman = new com.mycompany.csc325_oop.Freshman("James", 18, 12);  // name, age, credits
        Senior senior = new Senior("John", 22, 90);         // name, age, credits

        // Scanner for GPA input
        Scanner scanner = new Scanner(System.in);

        // Setting GPA for Freshman
        System.out.print("Enter GPA for " + freshman.getName() + ": ");
        double freshmanGpa = scanner.nextDouble();
        freshman.setGpa(freshmanGpa);

        // Setting GPA for Senior
        System.out.print("Enter GPA for " + senior.getName() + ": ");
        double seniorGpa = scanner.nextDouble();
        senior.setGpa(seniorGpa);

        // Print out details of each student
        System.out.println(freshman);
        System.out.println(senior);

        scanner.close();  // Close scanner resource
    }
}

// Student class with GPA and credits


// Freshman class extending Student


// Senior class extending Student with minimum credits requirement

// Assume Human is a simple base class with name and age


