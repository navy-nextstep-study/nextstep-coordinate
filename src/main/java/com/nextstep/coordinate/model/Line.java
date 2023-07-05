package com.nextstep.coordinate.model;

public class Line {

    private final Point point1;
    private final Point point2;

    public Line(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    public double getArea() {
        return point1.calculateDistance(point2);
    }
}
