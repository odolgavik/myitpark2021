package lesson10.inplemen;

import lesson10.Convertable;
import lesson10.TemperaturValue;

public class CelsToKelvConverter implements Convertable {

    public static final double KONSTANTA = 273.15;

    @Override
    public double convert(TemperaturValue value) {
        return value.getValue() + KONSTANTA;
    }
}

