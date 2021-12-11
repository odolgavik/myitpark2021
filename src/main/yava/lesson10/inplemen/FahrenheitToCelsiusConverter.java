package lesson10.inplemen;

import lesson10.Convertable;
import lesson10.TemperaturValue;

public class FahrenheitToCelsiusConverter implements Convertable {

    public static final int DELTA = 32;

    public static final double KOEFFICIENT = 1.8; // 9 / 5

    @Override
    public double convert(TemperaturValue value) {
        return (value.getValue() - DELTA) / KOEFFICIENT;
    }
}
