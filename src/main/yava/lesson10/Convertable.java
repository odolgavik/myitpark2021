package lesson10;

import lesson10.inplemen.CelsToKelvConverter;
import lesson10.inplemen.IdentityConverter;
import lesson10.inplemen.KelvToCelsConverter;
import lesson10.inplemen.FahrenheitToKelvinConverter;
import lesson10.inplemen.KelvinToFahrenheitConverter;
import lesson10.inplemen.FahrenheitToCelsiusConverter;
import lesson10.inplemen.CelsiusToFahrenheitConverter;

public interface Convertable {
    double convert(TemperaturValue value);

    static double convert(TemperaturValue value, TemperatureMeasurementScale toScale) {
        switch (toScale) {
            case CELSIUS -> {
                switch (value.getMeasurementScale()) {
                    case CELSIUS -> {
                        return new IdentityConverter().convert(value);
                    }
                    case KELVIN -> {
                        return new KelvToCelsConverter().convert(value);
                    }
                    case FAHRENHEIT -> {
                        return new FahrenheitToCelsiusConverter().convert(value);
                    }
                }
            }
            case KELVIN -> {
                switch (value.getMeasurementScale()) {
                    case KELVIN -> {
                        return new IdentityConverter().convert(value);
                    }
                    case CELSIUS -> {
                        return new CelsToKelvConverter().convert(value);
                    }
                    case FAHRENHEIT -> {
                        return new FahrenheitToKelvinConverter().convert(value);
                    }
                }
            }
            case FAHRENHEIT -> {
                switch (value.getMeasurementScale()) {
                    case CELSIUS -> {
                        return new CelsiusToFahrenheitConverter().convert(value);
                    }
                    case FAHRENHEIT -> {
                        return new IdentityConverter().convert(value);
                    }
                    case KELVIN -> {
                        return new KelvinToFahrenheitConverter().convert(value);
                    }
                }
            }
        }
        throw new IllegalStateException("В данный код мы не должны попасть");
    }

        static double convert(double value, TemperatureMeasurementScale fromSystem, TemperatureMeasurementScale toSystem) {
            return Convertable.convert(new TemperaturValue(value, fromSystem), toSystem);
                    }
                }