package lesson10.inplemen;

import lesson10.Convertable;
import lesson10.TemperaturValue;

public class FahrenheitToKelvinConverter implements Convertable {
    @Override
    public double convert(TemperaturValue value) {
        return (value.getValue() - FahrenheitToCelsiusConverter.DELTA) / FahrenheitToCelsiusConverter.KOEFFICIENT + CelsToKelvConverter.KONSTANTA;
    }
}
