package lesson10;

import java.util.Scanner;

public class ConverTemperaturStarter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Этот конвертер помогает переводить значения в различные величины температуры. ");
        System.out.println("Введите значение для конвертации:  ");
        while (!scanner.hasNextDouble()) {
            String inputValue = scanner.next();
            System.out.println("Вы ввели " + inputValue + " Для ввода необходимо использовать только числовые величины");
        }
        double value = scanner.nextDouble();
        System.out.println("Введите, пожалуйста, исходную шкалу измерений из следующих вариантов - C, K, F:");
        String temperatureScale = scanner.next();
        System.out.println("Введите, пожалуйста, шкалу измерений, в которую будет переводено ранее введеное значение (возможные варианты - C, K, F):");
        String destinationTemperatureScale = scanner.next();

        System.out.printf("Результат: %.2f\n", Convertable.convert(value,
                TemperatureMeasurementScale.of(temperatureScale),
                TemperatureMeasurementScale.of(destinationTemperatureScale)));


    }
}
