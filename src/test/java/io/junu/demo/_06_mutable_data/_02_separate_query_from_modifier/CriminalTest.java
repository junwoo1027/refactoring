package io.junu.demo._06_mutable_data._02_separate_query_from_modifier;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CriminalTest {

    @Test
    void alertForMiscreant() {
        Criminal criminal = new Criminal();
        String found = criminal.findMiscreant(List.of(new Person("junwoo"), new Person("Don")));
        assertEquals("Don", found);

        found = criminal.findMiscreant(List.of(new Person("junwoo"), new Person("John")));
        assertEquals("John", found);

        found = criminal.findMiscreant(List.of(new Person("junwoo"), new Person("kim")));
        assertEquals("", found);
    }
}