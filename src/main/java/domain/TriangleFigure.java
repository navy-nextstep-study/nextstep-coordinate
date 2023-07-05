package domain;

import java.util.List;

public class TriangleFigure implements Figure {

    private final Points points;

    public TriangleFigure(Points points) {
        this.points = points;
    }

    @Override
    public Double calculate() {
        List<Point> pointList = points.getPoints();
        Point pointA = pointList.get(0);
        Point pointB = pointList.get(1);
        Point pointC = pointList.get(2);

        return calculateHeron(pointA, pointB, pointC);
    }

    private Double calculateHeron(Point a, Point b, Point c) {
        Double aLength = a.calculateDistance(b);
        Double bLength = b.calculateDistance(c);
        Double cLength = c.calculateDistance(a);

        Double s = (aLength + bLength + cLength) / 2;
        return Math.sqrt(s * (s - aLength) * (s - bLength) * (s - cLength));
    }
}
