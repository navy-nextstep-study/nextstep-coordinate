package org.nextstep.domain;

import org.nextstep.domain.Calculator;
import org.nextstep.domain.Point;
import org.nextstep.domain.Points;

import java.util.List;

public class TriangleCalculator implements Calculator {
    private final Points points;

    public TriangleCalculator(Points points) {
        validateTriangle(points);
        this.points = points;
    }

    @Override
    public double calculate() {
        List<Point> pointList = points.getPoints();
        double distanceA = pointList.get(0).calculateDistance(pointList.get(1));
        double distanceB = pointList.get(1).calculateDistance(pointList.get(2));
        double distanceC = pointList.get(2).calculateDistance(pointList.get(0));
        double s = (distanceA + distanceB + distanceC) / 2;

        return Math.sqrt(s * (s - distanceA) * (s - distanceB) * (s - distanceC));
    }

    private void validateTriangle(Points points) {
        checkPointSize(points);
        checkDistinctPoint(points);
        checkCollinear(points);
    }

    private void checkPointSize(Points points) { //좌표가 총 3개인지 확인
        if (points.getSize() != 3) throw new IllegalStateException("좌표값이 3개가 아닙니다.");
    }

    private void checkDistinctPoint(Points points) { //서로 다른 세 점으로 구성되었는지 확인
        long distinctCount = points.getPoints()
                .stream()
                .distinct()
                .count();

        if (distinctCount != 3) {
            throw new IllegalStateException("삼각형이 아닙니다.");
        }
    }

    private void checkCollinear(Points points) {//세 점이 동일선상에 존재하는지 확인
        Point point1 = points.getPoints().get(0);
        Point point2 = points.getPoints().get(1);
        Point point3 = points.getPoints().get(2);

        if ((point2.getY() - point1.getY()) * (point3.getX() - point2.getX()) == (point3.getY() - point2.getY()) * (point2.getX() - point1.getX())) {
            throw new IllegalStateException("삼각형이 아닙니다.");
        }
    }
}
