package io.junu.demo._06_mutable_data._03_replace_derived_variable_with_query;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiscountTest {

    @Test
    void discount() {
        Discount discount = new Discount(5000);
        discount.setDiscount(3000);
        assertEquals(2000, discount.getDiscountedTotal());
    }
}