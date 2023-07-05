package org.nextstep;

public class LineCalculator {
    private final Point point1;
    private final Point point2;

    public LineCalculator(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }
    public double calculate() {
        return point1.calculateDistance(point2);
    }
}
