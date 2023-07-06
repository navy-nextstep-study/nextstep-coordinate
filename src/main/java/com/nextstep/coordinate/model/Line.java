package com.nextstep.coordinate.model;

import java.util.List;

public class Line extends AbstractFigure {

    public Line(List<Point> points) {
        super(points);
        validationLine(points);
    }

    private void validationLine(List<Point> points) {
        if (points.get(0).getX() == points.get(1).getX() && points.get(0).getY() == points.get(1).getY()) {
            throw new IllegalArgumentException("두 점이 직선이여야 합니다.");
        }
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
