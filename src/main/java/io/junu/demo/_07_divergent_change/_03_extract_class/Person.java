package io.junu.demo._07_divergent_change._03_extract_class;

public class Person {

    private final TelephoneNumber telephoneNumber;
    private String name;

    public Person(TelephoneNumber telephoneNumber, String name) {
        this.telephoneNumber = telephoneNumber;
        this.name = name;
    }

    public String name() {
        return name;
    }

    public TelephoneNumber getTelephoneNumber() {
        return telephoneNumber;
    }

    public String telephoneNumber() {
        return this.telephoneNumber.toString();
    }
}
