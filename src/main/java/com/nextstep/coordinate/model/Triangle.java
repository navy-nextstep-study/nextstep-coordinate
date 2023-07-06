package com.nextstep.coordinate.model;

import java.util.List;

import static java.lang.Math.*;

public class Triangle extends AbstractFigure {

    private static final double INF = Double.MAX_VALUE;

    public Triangle(List<Point> points) {
        super(points);
        validationTriangle(points);
    }

    private void validationTriangle(List<Point> points) {
        double slope1 = getSlope(points.get(0), points.get(1));
        double slope2 = getSlope(points.get(0), points.get(2));

        if (slope1 == slope2) {
            throw new IllegalArgumentException("세 점이 삼각형이여야 합니다.");
        }
    }

    private static double getSlope(Point point1, Point point2) {
        if (point1.getX() - point2.getX() == 0) {
            return INF;
        }
        return (double) (point1.getY() - point2.getY()) / (point1.getX() - point2.getX());
    }

    @Override
    public double getArea() {
        double a = getPoints().get(0).calculateDistance(getPoints().get(1));
        double b = getPoints().get(0).calculateDistance(getPoints().get(2));
        double c = getPoints().get(1).calculateDistance(getPoints().get(2));

        return sqrt((a + b + c) * (a * -1 + b + c) * (a + b * -1 + c) * (a + b + c * -1)) / 4;
    }

    @Override
    public String getAreaInfo() {
        return "삼각형 넓이는 " + getArea();
    }
}
