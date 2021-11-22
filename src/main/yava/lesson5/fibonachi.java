package lesson5;

import java.util.Scanner;

public class fibonachi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число для вывода числа Фибоначчи: ");
        int fib = scanner.nextInt();

        inputNumberFib(fib);
    }

    static void inputNumberFib(int n) {
        int n0 = 0;
        int n1 = 1;
        for (int i = 2; i <= n; i++) {
            int n2 = n0 + n1;
            n0 = n1;
            n1 = n2;
        }
        System.out.println("Число Фибоначчи с порядковым номером " + n + " равен " + n1);
    }
}