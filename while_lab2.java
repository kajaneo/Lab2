package com.company;
import java.util.Scanner;
public class while_lab2{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int n;
        if (in.hasNextInt()) {
            n = in.nextInt();
            if (n<0||n>15) {
                System.out.println("Ошибка ввода.");
            }
            else {
                int result = 1;
                int i = n;
                while (i>0) {
                    result *=i;
                    i--;
                }
                System.out.println("Результат: " + result );
            }
        }
        else {
            System.out.println("Ошибка ввода.");
        }
    }
}