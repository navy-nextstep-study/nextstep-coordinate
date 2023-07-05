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

        double xLength = Math.pow(point1.getX() - point2.getX(), 2);
        double yLength = Math.pow(point1.getY() - point2.getY(), 2);

        return Math.sqrt(xLength + yLength);
    }
}
