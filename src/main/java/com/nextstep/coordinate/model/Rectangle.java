package com.nextstep.coordinate.model;

import java.util.List;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class Rectangle {

    private final List<Point> points;

    public Rectangle(List<Point> points) {
        validationRectangle(points);
        this.points = points;
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

    public double getArea() {
        double distance1 = points.get(0).calculateDistance(points.get(1));
        double distance2 = points.get(0).calculateDistance(points.get(2));
        double distance3 = points.get(0).calculateDistance(points.get(3));

        double width = getWidth(distance1, distance2, distance3);
        double height = getHeight(distance1, distance2, distance3);

        return width * height;
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
