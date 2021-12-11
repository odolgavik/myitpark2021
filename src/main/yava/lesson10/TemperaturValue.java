package lesson10;

public class TemperaturValue {
    private final double value;
    private final TemperatureMeasurementScale measurementScale;

    public TemperaturValue(double value, TemperatureMeasurementScale measurementScale) {
        this.value = value;
        this.measurementScale = measurementScale;
    }

    public double getValue() {
        return value;
    }

    public TemperatureMeasurementScale getMeasurementScale() {
        return measurementScale;
    }
}
