package com.nextstep.nextstepcoordinate;

public class Square {

    private double area;

    public Square(Line width, Line height) {
        area = width.getLineLength() * height.getLineLength();
    }

    public double getArea() {
        return area;
    }
}
