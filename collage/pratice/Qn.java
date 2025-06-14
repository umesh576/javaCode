// Create a class Student with attributes name, rollNumber, and marks. Write a program to create and display the details of 3 students.

import java.util.Scanner;
public class Qn{
    static public void main(String[] args){
        String name;
        int rollNo;
        int marks;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
       name =  sc.nextLine();
        System.out.print("Enter your RollNo: ");
        rollNo=sc.nextInt();
        System.out.print("Enter your Marks: ");
        marks=sc.nextInt();
        System.out.println("Name: " + name + " RollNo: "+ rollNo + " Marks: " + marks);
    }
}