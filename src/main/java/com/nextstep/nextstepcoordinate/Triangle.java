package com.nextstep.nextstepcoordinate;

public class Triangle {

    private Double area;

    public Triangle(Line a, Line b, Line c) {
        double aLength = a.getLineLength();
        double bLength = b.getLineLength();
        double cLength = c.getLineLength();
        double s = (aLength + bLength + cLength) / 2;
        this.area = Math.sqrt(s * (s - aLength) * (s - bLength) * (s - cLength));
    }

    public Double getArea() {
        return area;
    }
}
