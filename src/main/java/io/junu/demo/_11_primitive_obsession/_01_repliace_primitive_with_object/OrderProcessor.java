package io.junu.demo._11_primitive_obsession._01_repliace_primitive_with_object;

import java.util.List;

public class OrderProcessor {

    public long numberOfHighPriorityOrders(List<Order> orders) {
        return orders.stream()
                .filter(o -> o.getPriority().higherThanOther(new Priority("normal")))
                .count();
    }
}
