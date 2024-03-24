package io.junu.demo._11_primitive_obsession._01_repliace_primitive_with_object;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OrderProcessorTest {

    @Test
    void numberOfHighPriorityOrders() {
        OrderProcessor orderProcessor = new OrderProcessor();
        List<Order> orders = List.of(
                new Order(new Priority("low")),
                new Order(new Priority("normal")),
                new Order(new Priority("high")),
                new Order(new Priority("rush")));

        long highPriorityOrders = orderProcessor.numberOfHighPriorityOrders(orders);
        assertEquals(2, highPriorityOrders);
    }
}