package org.nextstep;

import java.util.Comparator;
import java.util.List;

public class RectangleCalculator {
    private final List<Point> pointList;

    public RectangleCalculator(List<Point> pointList) {
        validateRectangle(pointList);
        this.pointList = pointList;
    }

    public double calculate() {
        pointList.sort(Comparator.comparing(Point::getX)); //x 좌표 기준으로 오름차순 정렬
        Point leftPoint = pointList.get(0);
        Point rightPoint = pointList.get(2);
        double width = leftPoint.calculateDistance(rightPoint);

        pointList.sort(Comparator.comparing(Point::getY)); //y 좌표 기준으로 오름차순 정렬
        leftPoint = pointList.get(0);
        rightPoint = pointList.get(2);
        double height = leftPoint.calculateDistance(rightPoint);

        return width * height;
    }

    private void validateRectangle(List<Point> pointList) {
        checkPointSize(pointList);

        long distinctXCount = pointList.stream()
                .map(Point::getX)
                .distinct()
                .count();
        long distinctYCount = pointList.stream()
                .map(Point::getY)
                .distinct()
                .count();

        if (distinctXCount != 2 || distinctYCount != 2) {
            throw new IllegalStateException("직사각형이 아닙니다.");
        }
    }

    private void checkPointSize(List<Point> pointList) {
        if (pointList.size() != 4) throw new IllegalStateException("좌표값이 4개가 아닙니다.");
    }
}
