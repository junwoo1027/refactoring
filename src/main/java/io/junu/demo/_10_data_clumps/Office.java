package io.junu.demo._10_data_clumps;

public class Office {

    private String location;
    private TelephoneNumber telephone;


    public Office(String location, TelephoneNumber telephone) {
        this.location = location;
        this.telephone = telephone;
    }

    public String officePhoneNumber() {
        return telephone.toString();
    }
}
