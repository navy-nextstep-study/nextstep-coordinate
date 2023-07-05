package com.nextstep.coordinate.model;

import static java.lang.Math.*;

public class Point {

    private final Coordinate x;
    private final Coordinate y;

    public Point(int x, int y) {
        this.x = new Coordinate(x);
        this.y = new Coordinate(y);
    }

    public int getX() {
        return x.getValue();
    }

    public int getY() {
        return y.getValue();
    }

    public double calculateDistance(Point point) {
        return sqrt(getPow(this.x.getValue(), point.x.getValue()) + getPow(this.y.getValue(), point.y.getValue()));
    }

    private double getPow(int value1, int value2) {
        return pow(value1 - value2, 2);
    }
}
