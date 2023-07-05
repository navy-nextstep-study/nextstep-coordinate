package domain;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SquareFigure implements Figure {

    private final Points points;

    public SquareFigure(Points points) {
        this.points = points;
    }

    @Override
    public Double calculate() {
        if (!isRectangle()) {
            throw new IllegalArgumentException("직사각형이 아닙니다.");
        }
        return getArea();
    }

    @Override
    public String getResult() {
        return "사각형 넓이는 " + calculate();
    }

    private Double getArea() {
        List<Point> pointList = points.getPoints();
        Point pointA = pointList.get(0);
        Point pointB = pointList.get(1);
        Point pointC = pointList.get(2);
        Point pointD = pointList.get(3);

        List<Double> pointLengthList = new ArrayList<>(List.of(
            pointA.calculateDistance(pointB),
            pointA.calculateDistance(pointC),
            pointA.calculateDistance(pointD),
            pointB.calculateDistance(pointC),
            pointB.calculateDistance(pointD),
            pointC.calculateDistance(pointD)));

        pointLengthList.sort(Comparator.naturalOrder());

        return pointLengthList.get(0) * pointLengthList.get(2);
    }


    private boolean isRectangle() {
        List<Point> pointList = points.getPoints();
        Point pointA = pointList.get(0);
        Point pointB = pointList.get(1);
        Point pointC = pointList.get(2);
        Point pointD = pointList.get(3);

        List<Double> pointLengthList = new ArrayList<>(List.of(
            pointA.calculateDistance(pointB),
            pointA.calculateDistance(pointC),
            pointA.calculateDistance(pointD),
            pointB.calculateDistance(pointC),
            pointB.calculateDistance(pointD),
            pointC.calculateDistance(pointD)));

        pointLengthList.sort(Comparator.naturalOrder());

        return pointLengthList.get(0).equals(pointLengthList.get(1))
            && pointLengthList.get(2).equals(pointLengthList.get(3))
            && pointLengthList.get(4).equals(pointLengthList.get(5))
            && pointLengthList.get(2) < pointLengthList.get(4);
    }
}
