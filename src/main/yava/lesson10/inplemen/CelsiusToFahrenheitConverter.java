package lesson10.inplemen;

import lesson10.Convertable;
import lesson10.TemperaturValue;

import static lesson10.inplemen.FahrenheitToCelsiusConverter.DELTA;
import static lesson10.inplemen.FahrenheitToCelsiusConverter.KOEFFICIENT;

public class CelsiusToFahrenheitConverter implements Convertable {
    @Override
    public double convert(TemperaturValue value) {
        return value.getValue() * KOEFFICIENT + DELTA;
    }
}
