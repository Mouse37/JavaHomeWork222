package com.pb.ribakova.hw2;

import java.util.Scanner;

public class trainee {
    public static void main(String[] args) {
        System.out.print("Введите любое целое число от 1 до 100: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        if (number == 1) System.out.println("Все хорошо");
        else if (number == 2) System.out.println(" Все норм");
        else System.out.println("Плохо");
    }
}