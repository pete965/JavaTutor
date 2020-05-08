package com.company;

import com.company.Week7_Pre_Tutorial.Student;

import java.util.Scanner;


public class CommentBasic {
    int month = 1+1;
    public static void main(String[] args) {
        Student student = new Student("Evelyn",18);
        student.setAge(22);
        CommentBasic commentBasic = new CommentBasic();
//        commentBasic.Max(1,1);
//        commentBasic.increaseOne(20);
        commentBasic.tellYouTheSeason(1);
    }
    /**
     * @param num1 The first Integer number compared
     * @param num2 The second Integer number compared
     * @return The bigger one in two numbers
     */
    public int Max(int num1,int num2){
        boolean bool1 = true;
        boolean bool2 = false;
        if (num1==num2){
            System.out.println("Num1 equals Num2");
            System.out.println("This method has been used");
            System.out.println("Hello");
        }
        return 0;
    }

    public boolean checkMyHealthSituation(double height,int weight){
//        if (height>1.7){
//            if (weight>50){
//                return true;
//            }else {
//                return false;
//            }
//        }else {
//            if (weight>50){
//                return false;
//            }else {
//                return false;
//            }
//        }
        if (height>1.7&&weight>50){
            return true;
        }else {
            return false;
        }
    }

    public String tellYouTheSeason(int month){
        int age =1;
        if (month<=3){
            String name = "bob";
            name = "Kevin";
            return "Spring";
        }else if (month<7){
            return "Summer";
        }else if (month<10){
            return "Autumn";
        }else {
            month++;
            return "Winter";
        }
//        switch (month){
//            case 1:
//                System.out.println("Spring");
//                return "Spring";
//            case 9:
//                System.out.println("Autumn");
//                return "Autumn";
//            default:
//                System.out.println("Other season");
//                return "Other season";
//        }
    }

    public void increaseOne(int num1){
//        System.out.println("The value of number++ is:"+num1++);
//        System.out.println("Now the value of number is:"+num1);
//        num1++;
//        上述写法等价于：先使用num1的当前值；使用过后，将它的值加一。
        System.out.println("The value of ++number is:"+(++num1));
        System.out.println("Now the value of number is:"+num1);
//        ++num1;
//        上述写法等价于：先把他的值加一，然后再使用.
    }

    public double divideTwo(){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        return 0.0;
    }
}
