package com.nextstep.coordinate.model;

import java.util.List;

public class Line {

    private final List<Point> points;

    public Line(List<Point> points) {
        this.points = points;
    }

    public double getArea() {
        return points.get(0).calculateDistance(points.get(1));
    }
}
