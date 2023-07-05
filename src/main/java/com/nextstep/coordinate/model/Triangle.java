package com.nextstep.coordinate.model;

import java.util.List;

import static java.lang.Math.*;

public class Triangle {

    private final List<Point> points;

    public Triangle(List<Point> points) {
        this.points = points;
    }

    public double getArea() {
        double a = points.get(0).calculateDistance(points.get(1));
        double b = points.get(0).calculateDistance(points.get(2));
        double c = points.get(1).calculateDistance(points.get(2));

        return sqrt((a + b + c) * (a * -1 + b + c) * (a + b * -1 + c) * (a + b + c * -1)) / 4;
    }
}
