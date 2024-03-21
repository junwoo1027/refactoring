package io.junu.demo._06_mutable_data._02_separate_query_from_modifier;

import java.util.List;

public class Criminal {

    public void alertForMiscreant(List<Person> peoples) {
        if(!findMiscreant(peoples).isBlank())
            setOffAlarms();
    }

    public String findMiscreant(List<Person> peoples) {
        for (Person p : peoples) {
            if (p.getName().equals("Don")) {
                return "Don";
            }

            if (p.getName().equals("John")) {
                return "John";
            }
        }

        return "";
    }

    private void setOffAlarms() {
        System.out.println("set off alarm");
    }
}
