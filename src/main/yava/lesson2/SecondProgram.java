package lesson2;

public class SecondProgram {

    public static void main(String[] args) {

        long summa = summa(1,5);
        System.out.println("Сумма чисел 1 и 5 =" + summa);

        long twonumber = divizion(6,6);
        System.out.println(twonumber);

        long nextsumma = algebra(3);
        System.out.println(nextsumma);

        long next = subtraction(38,46);
        System.out.println("Разница возраста " + next);

        long every = degree(5,10);
        System.out.println("Число 5 умножить на 10 равно " + every);
    }

    /**
     * Метод будет производить арифметические действия
     * @param arg1 искомое число 1
     * @param arg2 искомое число 2
     * @return результат арифметических действий с искомыми числами
     */

    public static long summa(int arg1, int arg2) {
        int result = arg1 + arg2;
        return result;
    }


    public static long subtraction(int arg1, int arg2) {
        return arg1 - arg2;

    }
    public static long degree(int arg1, int arg2) {
       return arg1*arg2;

    }
    public static long divizion(int arg1, int arg2) {
        return arg1/arg2;
    }
    public static long algebra(int arg1) {
        return arg1*2+7;
    }
}



