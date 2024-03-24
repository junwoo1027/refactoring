package io.junu.demo._11_primitive_obsession._02_replace_type_code_with_subclasses.indirect_inheritance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void employeeType() {
        assertEquals("Engineer", new FullTimeEmployee("junwoo", "engineer").capitalizedType());
        assertEquals("Manager", new PartTimeEmployee("junwoo", "manager").capitalizedType());
        assertThrows(IllegalArgumentException.class, () -> new PartTimeEmployee("junwoo", "wrong type"));
    }
}