package lesson12;

import lesson12.exception.MyArrayDataException;
import lesson12.exception.MyArraySizeException;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Matrix {

    public static final int ROWS = 4;

    public static final int COLUMNS = 4;

    private static final List<String> SYMBOLS = List.of("Q", "-5", "1", "2", "-7", "38", "46", "13", "21");

    private List<List<String>> values;

    public Matrix(int n, int m) {
        if (n != ROWS || m != COLUMNS) {
            throw new MyArraySizeException(n, m, "Произошла ошибка во время инициализации матрицы");
        }
        this.values = new ArrayList<>(n);
        fillUp(n, m);
    }

    public void fillUp(int n, int m) {
        for (int i = 0; i < n; i++) {
            List<String> lines = new ArrayList<>(m);
            this.values.add(lines);
            for (int j = 0; j < m; j++) {
                int randomIndex = new Random().nextInt(SYMBOLS.size());
                lines.add(SYMBOLS.get(randomIndex));
            }
        }
    }

    public int sum() {
        int result = 0;
        for (int i = 0; i < this.values.size(); i++) {
            List<String> row = this.values.get(i);
            for (int j = 0; j < row.size(); j++) {
                String value = row.get(j);
                if (!value.matches("^(-*(\\d)+)$")) {
                    throw new MyArrayDataException(i + 1, j + 1, "Некорректное значение элемента матрицы");
                }
                result += Integer.parseInt(value);
            }
        }
        return result;
    }

    public void print() {
        for (List<String> lines : this.values) {
            System.out.println(lines);
        }
    }
}
