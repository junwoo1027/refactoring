package io.junu.demo._04_long_parameter_list._03_remove_flag_argument;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ShipmentTest {

    @Test
    void deliveryTest() {
        LocalDate placeOn = LocalDate.of(2024, 03, 21);
        Order orderFromWA = new Order(placeOn, "WA");

        Shipment shipment = new Shipment();
        assertEquals(placeOn.plusDays(1), shipment.rushDeliveryDate(orderFromWA));
        assertEquals(placeOn.plusDays(2), shipment.regularDeliveryDate(orderFromWA));
    }
}