package lesson10;

import java.util.Scanner;

public class converTemper {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Введите значение для конвертирвания в различные величины температуры: ");
        int i = scanner.nextInt();

        findTemp(i);
    }

    static void findTemp (int i){
        int scaleCels = i;
        double scaleKelvina = scaleCels - 273.15;
        double scaleFareng = (scaleCels/ (5/9) + 32);




    }


}
