package org.nextstep;

import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

public class RectangleCalculator implements Calculator {
    private final Points points;

    public RectangleCalculator(Points points) {
        validateRectangle(points);
        this.points = points;
    }

    @Override
    public double calculate() {
        List<Point> pointList = points.getPoints();

        // x 좌표의 최소/최대값 구하기
        int minX = pointList.stream().mapToInt(Point::getX).min().orElseThrow(NoSuchElementException::new);
        int maxX = pointList.stream().mapToInt(Point::getX).max().orElseThrow(NoSuchElementException::new);

        // y 좌표의 최소/최대값 구하기
        int minY = pointList.stream().mapToInt(Point::getY).min().orElseThrow(NoSuchElementException::new);
        int maxY = pointList.stream().mapToInt(Point::getY).max().orElseThrow(NoSuchElementException::new);

        double width = maxX - minX;
        double height = maxY - minY;

        return width * height;
    }

    private void validateRectangle(Points points) {
        checkPointSize(points);

        long distinctXCount = points.getPoints()
                .stream()
                .map(Point::getX)
                .distinct()
                .count();
        long distinctYCount = points.getPoints()
                .stream()
                .map(Point::getY)
                .distinct()
                .count();

        if (distinctXCount != 2 || distinctYCount != 2) {
            throw new IllegalStateException("직사각형이 아닙니다.");
        }
    }

    private void checkPointSize(Points points) {
        if (points.getSize() != 4) throw new IllegalStateException("좌표값이 4개가 아닙니다.");
    }
}
