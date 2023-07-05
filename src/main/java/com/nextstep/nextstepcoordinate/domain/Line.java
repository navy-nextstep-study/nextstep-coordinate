package com.nextstep.nextstepcoordinate.domain;

public class Line {

    private double lineLength;

    public Line(Coordinate coordinate1, Coordinate coordinate2) {
        this.lineLength = Math.sqrt(Math.pow((coordinate1.getX() - coordinate2.getX()), 2) + Math.pow((coordinate1.getY()) - coordinate2.getY(), 2));
    }

    public double getLineLength() {
        return lineLength;
    }
}
