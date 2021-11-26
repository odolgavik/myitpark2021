package lesson6;

import java.util.Scanner;
/* Заполните массив (длина запрашивается у пользователя через консоль)
 * случайными числами, используя метод Math.random(), который возвращает
 * значение в промежутке [0, 1]. Реализуйте 3 метода, расчитывающих
 * минимальное, максимальное и среднее значения среди заполненных
 * значений массива.
 */

public class MaxMinAvg {
    private static Object i;

    public static void main(String[] args) {
        System.out.println("Укажите длинну массива. Длина массива должна быть целым числом:");
        int array1 = getArray1();
        int[] array = fillArray(array1);
        int min = getmin(array);
        System.out.println("Min значение " + min);
        int max = getMax(array);
        System.out.println("Max значение " + max);
        double average= getaverage(array);
        System.out.println("Среднее значение " + average);

    }

    private static double getaverage(int[] array) {
        double average = 0;
        for (int i = 0; i < array.length; i++) {
            average += array[i] / array.length;
        }
            return average;
    }

    private static int getMax(int[] array) {
        int max = array[0];
        for (int value : array) {
            max = Math.max(max, value);
            //if (max < value) { первый способ, при мат.функции прото сравниваем две величины - это проще
            //  max = value;
        }
        return max;
    }

    private static int getmin(int[] array) {
        int min = array[array.length - 1];
        if (array.length > 1) {
            for (int i = array.length - 2; i >= 0; i--) {
                int value = array[i];
                if (value < min) {
                    min = value;
                }
            }
        }
        return min;
    }

    private static int[] fillArray(int array1) {
        int[] value = new int[array1];
        for (int i = 0; i < array1; i++) {
            value[(int) i] = Math.round((float) Math.random() * 1000);
        }
        return value;
    }

    private static int getArray1() {
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNext()) {
            System.out.println("Длина массива может быть только целое число");
            scanner.next();
        }
        int length = scanner.nextInt();
        if (length <= 0) {
            System.out.println("Длина массива не может быть отрицательной. Введите еще раз целое число.");
            return getArray1();
        }
        return length;
    }
}
