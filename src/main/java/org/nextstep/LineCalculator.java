package org.nextstep;

import jdk.jfr.Category;

public class LineCalculator implements Calculator{
    private final Point point1;
    private final Point point2;

    public LineCalculator(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }
    @Override
    public double calculate() {
        return point1.calculateDistance(point2);
    }
}
