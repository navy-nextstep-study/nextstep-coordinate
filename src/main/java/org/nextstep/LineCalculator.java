package org.nextstep;

public class LineCalculator {
    private final Point point1;
    private final Point point2;
    public LineCalculator(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }
    public double calculate() {
        int x1 = point1.getX();
        int x2 = point2.getX();
        int y1 = point1.getY();
        int y2 = point2.getY();
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }
}
