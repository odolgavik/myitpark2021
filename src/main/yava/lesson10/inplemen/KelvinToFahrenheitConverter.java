package lesson10.inplemen;

import lesson10.Convertable;
import lesson10.TemperaturValue;

public class KelvinToFahrenheitConverter implements Convertable {
    @Override
    public double convert(TemperaturValue value) {
        return (value.getValue() - CelsToKelvConverter.KONSTANTA) * FahrenheitToCelsiusConverter.KOEFFICIENT
                + FahrenheitToCelsiusConverter.DELTA;
    }
}
