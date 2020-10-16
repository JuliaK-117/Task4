package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int x = 100;
	int percent = x/100;
	int a;

        System.out.print("Введите любое целое число: ");

	Scanner scan = new Scanner(System.in);
	a = scan.nextInt();

        System.out.println("Определим близость введенного числа к заданному.");

        if (a <= 100 + (percent * 10) && a >= 100 - (percent * 10)) {
            System.out.println("Введенное число находится близко к заданному (в диапазоне 10%).");
        } else
            System.out.println("Введенное число не находится близко к заданному.");
    }
}
