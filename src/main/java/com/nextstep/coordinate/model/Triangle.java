package com.nextstep.coordinate.model;

import java.util.List;

import static java.lang.Math.*;

public class Triangle extends AbstractFigure {

    public Triangle(List<Point> points) {
        super(points);
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
