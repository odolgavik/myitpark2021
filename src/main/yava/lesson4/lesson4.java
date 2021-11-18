package lesson4;

import java.util.Scanner;

public class lesson4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число для расчета целочисленного квадратного корня: ");
        int i= scanner.nextInt();

        findSqrtRoot(i);
    }

    static void findSqrtRoot(int i) {
        if (i < 0) {
            System.out.println("Корень из отрицательного числа не существует");
            return;
        }
        int sqrt = i;
        while (i != sqrt * sqrt) {
            sqrt--;
            if (sqrt == 0) {
                System.out.println("Не найдено целочисленных корней");
                return;
            }
        }

        System.out.println("Корень числа " + i + " равен +-" + sqrt);
    }
}