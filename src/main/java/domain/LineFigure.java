package domain;

import java.util.List;

public class LineFigure implements Figure {

    private final Points points;

    public LineFigure(Points points) {
        this.points = points;
    }

    @Override
    public Double calculate() {
        List<Point> pointList = points.getPoints();
        Point point1 = pointList.get(0);
        Point point2 = pointList.get(1);

        return point1.calculateDistance(point2);
    }

    @Override
    public String getResult() {
        Double result = calculate();
        return "두 점 사이 거리는 " + result;
    }
}
