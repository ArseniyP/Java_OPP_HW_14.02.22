package com.phoenix;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Таблица умножения на 3");
        for(int i = 1 ; i <= 10 ; i++) {
            System.out.printf("3 * %d = %d\n", i, 3*i);
        }

        Scanner in = new Scanner(System.in);
        int num = 0;
        int sum = 0;
        do {
            System.out.print("Введите любое положительное целое число: ");
            if(in.hasNextInt())
                num = in.nextInt();
            in.nextLine();
        } while (num == 0);
        for(int i = 1 ; i <= num ; i++)
            sum += i;
        System.out.println("Сумма чисел от 1 до " + num + "(включительно) " +
                "равна " + sum);
    }
}
