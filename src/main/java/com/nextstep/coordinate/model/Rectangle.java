package com.nextstep.coordinate.model;

import java.util.List;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class Rectangle extends AbstractFigure {

    public Rectangle(List<Point> points) {
        super(points);
        validationRectangle(points);
    }

    private void validationRectangle(List<Point> points) {
        double distance1 = points.get(0).calculateDistance(points.get(1));
        double distance2 = points.get(2).calculateDistance(points.get(3));
        double distance3 = points.get(0).calculateDistance(points.get(2));
        double distance4 = points.get(1).calculateDistance(points.get(3));

        if (distance1 != distance2 || distance3 != distance4) {
            throw new IllegalArgumentException("네 점이 직사각형이여야 합니다.");
        }
    }

    @Override
    public double getArea() {
        double distance1 = getPoints().get(0).calculateDistance(getPoints().get(1));
        double distance2 = getPoints().get(0).calculateDistance(getPoints().get(2));
        double distance3 = getPoints().get(0).calculateDistance(getPoints().get(3));

        double width = getWidth(distance1, distance2, distance3);
        double height = getHeight(distance1, distance2, distance3);

        return width * height;
    }

    @Override
    public String getAreaInfo() {
        return "사각형 넓이는 " + getArea();
    }

    private double getWidth(double distance1, double distance2, double distance3) {
        return min(min(distance1, distance2), distance3);
    }

    private double getHeight(double distance1, double distance2, double distance3) {
        double min_distance1 = min(distance1, distance2);
        double min_distance2 = min(distance1, distance3);
        return max(min_distance1, min_distance2);
    }
}
