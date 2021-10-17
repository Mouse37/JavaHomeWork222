package com.pb.ribakova.hw2;
import java.util.Scanner;

public class Interval {
    public static void main(String args[]){
    System.out.print("Введите любое целое число от 1 до 100: ");
    Scanner scan = new Scanner(System.in);
    int number = scan.nextInt();
        if (number>=0 && number<=14)
            System.out.println ("Число в промежутке  [0 -14], равно: " + number);
        else if ((number>=15 && number<=35))
            System.out.println ("Число в промежутке  [15 -35], равно: " + number);
        else if ((number>=36 && number<=50))
            System.out.println ("Число в промежутке  [36 -50], равно: " + number);
        else if ((number >= 51 && number <= 100))
            System.out.println("Число в промежутке  [51 -100], равно: " + number);
        else {
            System.out.println("Введеное число не входит в диапазон. Попробуйте еще раз");
        }
}
}