package io.junu.demo._06_mutable_data._01_split_variable;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    @Test
    void updateGeometryData() {
        Rectangle rectangle = new Rectangle();
        rectangle.updateGeometry(10, 20);
        assertEquals(60d, rectangle.getPerimeter());
        assertEquals(200d, rectangle.getArea());
    }
}