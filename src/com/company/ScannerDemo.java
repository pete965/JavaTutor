package com.company;

//Step1:import the class
import com.company.Week7_Pre_Tutorial.Student;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        //Step2:create the object
        Scanner newScanner = new Scanner(System.in);
        int age = 0;
        //Step3:invoke the method
        age = newScanner.nextInt();
        String name = "";
        name = newScanner.next();

        Student student = new Student(name,age);

//        student.setAge(21);

        System.out.println("The age of this student is:"+student.getAge());
        System.out.println(student.getName());

    }
}
