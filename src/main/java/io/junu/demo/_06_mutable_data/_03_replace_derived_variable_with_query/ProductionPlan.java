package io.junu.demo._06_mutable_data._03_replace_derived_variable_with_query;

import java.util.ArrayList;
import java.util.List;

public class ProductionPlan {

    private List<Double> adjustments = new ArrayList<>();

    public void applyAdjustment(double adjustment) {
        this.adjustments.add(adjustment);
    }

    public double getProduction() {
        return this.adjustments.stream().reduce(0d, Double::sum);
    }
}
