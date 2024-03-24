package io.junu.demo._10_data_clumps;

public class Employee {

    private String name;
    private TelephoneNumber telephone;

    public Employee(String name, TelephoneNumber telephone) {
        this.name = name;
        this.telephone = telephone;
    }

    public String getName() {
        return name;
    }

    public String personalPhoneNumber() {
        return telephone.toString();
    }
}
