package io.junu.demo._10_data_clumps;

public class TelephoneNumber {
    String areCode;
    String number;

    public TelephoneNumber() {
    }

    public String getAreCode() {
        return areCode;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return this.areCode + "-" + this.number;
    }
}