package lesson10;

public enum TemperatureMeasurementScale {
    CELSIUS("C"), KELVIN( "K"), FAHRENHEIT("F");

    private final String shortName;

    TemperatureMeasurementScale(String shortName) {
        this.shortName = shortName;
    }

    public static TemperatureMeasurementScale of(String input) {
        for (TemperatureMeasurementScale measurementScale : values()) {
            if (measurementScale.shortName.equalsIgnoreCase(input)) {
                return measurementScale;
            }
        }
        return CELSIUS;
    }
}
