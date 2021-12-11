package lesson10.inplemen;

import lesson10.Convertable;
import lesson10.TemperaturValue;

import static lesson10.inplemen.CelsToKelvConverter.KONSTANTA;

public class KelvToCelsConverter implements Convertable {

    @Override
    public double convert(TemperaturValue value) {
        return value.getValue() - KONSTANTA;
    }
}
