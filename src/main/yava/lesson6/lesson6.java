package lesson6;

    /* Заполните массив (длина запрашивается у пользователя через консоль)
     * случайными числами, используя метод Math.random(), который возвращает
     * значение в промежутке [0, 1]. Реализуйте 3 метода, расчитывающих
     * минимальное, максимальное и среднее значения среди заполненных
     * значений массива.
     */

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class lesson6 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Укажите длинну массива:");
            int array1 = scanner.nextInt();
            int n = 100;

            int[] array = new int[100];
            Random rnd = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(n+1);
            System.out.println(array[i] + " ");
        }

        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println("Min значение " + min);

        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println("Max значение " + max);

        double average = 0;
        for (int i = 0; i < array.length; i++) {
            average += array[i] / array.length;
        }
        System.out.println("Average значение " + average);
    }
}

