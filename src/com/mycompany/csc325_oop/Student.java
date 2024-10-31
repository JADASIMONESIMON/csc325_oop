/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop;
/**
 *
 * @author MoaathAlrajab
 */
public abstract class Student extends Human{
    private double gpa;
    public Student(String name, short age, double gpa) {
        super(name, age);
        this.gpa= gpa;
    }

    // getter for GPA
    public double getGpa() {
        return gpa;
    }

    // Setter for GPA
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    // ToDo 1: Make this class a child of Human



    // ToDo 2: Fix the resulting errors

    // ToDo 3: Add a field for GPA and create a setter and a getter

    // ToDo 4: Add comments to your code
}
