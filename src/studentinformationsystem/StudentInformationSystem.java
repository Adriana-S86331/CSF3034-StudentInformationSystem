/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentinformationsystem;

/*******************************************************************************
 * Author: Nur Adriana Amni Binti Mohd Nazi
 * Program Name: StudentInformationSystem.java
 * Description: To apply the complete Git + Github + NetBeans workflow to a small Java project
 * Date: 27 October 2026
 * Modified Date: None
 * Version: 1.0
 ******************************************************************************/
public class StudentInformationSystem { //class named StudentInformationSystem
    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        String name = "Nur Adriana Amni Binti Mohd Nazi"; //declaring variable name with String data type
        String studentID = "S86331"; //declaring variable studentID with String data type
        
        //finalizing input
        int mark1 = 40;
        int mark2 = 45;
        //calculating total mark of both finalize input
        int total = mark1 + mark2;
        
        //to print an output and display each entered input and calculated value
        System.out.println("Student Name: " + name);
        System.out.println("Student ID: " + studentID);
        System.out.println("Mark 1: " + mark1);
        System.out.println("Mark 2: " + mark2);
        System.out.println("Total Mark: " + total);
        
        //selection condition happening
        if (total >= 80) { // value 80 included
            System.out.println("Result: Excellent");
        } else if (total >= 50) { //value 50 included and not over value 80
            System.out.println("Result: Good");
        } else { //output value lower than 50
            System.out.println("Result: Needs Improvement");        
        }
        // add this line at the bottom
        System.out.println("Semester: Semester 1");
    }
}