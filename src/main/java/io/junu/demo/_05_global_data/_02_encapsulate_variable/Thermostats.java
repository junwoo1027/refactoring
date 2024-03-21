package io.junu.demo._05_global_data._02_encapsulate_variable;

public class Thermostats {

    private static Integer targetTemperature = 70;

    private static Boolean heating = true;

    private static Boolean cooling = false;

    private static Boolean readInFahrenheit = true;

    public static Integer getTargetTemperature() {
        return targetTemperature;
    }

    public static Boolean getHeating() {
        return heating;
    }

    public static Boolean getCooling() {
        return cooling;
    }

    public static Boolean getReadInFahrenheit() {
        return readInFahrenheit;
    }

    public static void updateTargetTemperature(int targetTemperature) {
        Thermostats.targetTemperature = targetTemperature;
    }

    public static void updateReadInFahrenheit(boolean readInFahrenheit) {
        Thermostats.readInFahrenheit = readInFahrenheit;
    }
}
