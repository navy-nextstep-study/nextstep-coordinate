package com.nextstep.coordinate.model;

import java.util.List;

public class Line extends AbstractFigure {

    public Line(List<Point> points) {
        super(points);
    }

    @Override
    public double getArea() {
        return getPoints().get(0).calculateDistance(getPoints().get(1));
    }

    @Override
    public String getAreaInfo() {
        return "두 점 사이 거리는 " + getArea();
    }
}
