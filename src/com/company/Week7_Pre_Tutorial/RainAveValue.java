package com.company.Week7_Pre_Tutorial;

import java.util.Scanner;

public class RainAveValue {
    public void printAveRain(double[] rain){
        double total = 0;
        for (int i=0;i<12;i++){
            total+=rain[i];
        }
        System.out.println("The average annual rainfall is: "+String.format("%.2f",total));
    }
}