package io.junu.demo._11_primitive_obsession._02_replace_type_code_with_subclasses.direct_inheritance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void employType() {
        assertEquals("engineer", Employee.createEmployee("junwoo", "engineer").getType());
        assertEquals("manager", Employee.createEmployee("junwoo", "manager").getType());
        assertThrows(IllegalArgumentException.class, () -> Employee.createEmployee("junwoo", "wrong"));
    }
}