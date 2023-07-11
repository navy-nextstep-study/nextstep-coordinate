package org.nextstep.domain;

import java.util.List;

public class LineCalculator implements Calculator {
    private final Points points;

    public LineCalculator(Points points) {
        validateLine(points);
        this.points = points;
    }

    private void validateLine(Points points) {
        checkPointSize(points);

        List<Point> pointList = points.getPoints();
        if (pointList.get(0).getX() == pointList.get(1).getX() && pointList.get(0).getY() == pointList.get(1).getY()) {
            new IllegalStateException("선이 아닙니다.");
        }
    }

    private void checkPointSize(Points points) {
        if (points.getSize() != 2) throw new IllegalStateException("좌표값이 2개가 아닙니다.");
    }

    @Override
    public double calculate() {
        Point point1 = points.getPoints().get(0);
        Point point2 = points.getPoints().get(1);

        return point1.calculateDistance(point2);
    }
}
