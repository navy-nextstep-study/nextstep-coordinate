package coordinate.domain;

public class TriangleCoordinateCalculator implements CoordinateCalculator {

    private Point firstPoint;
    private Point secondPoint;
    private Point thirdPoint;

    public TriangleCoordinateCalculator(Point firstPoint, Point secondPoint, Point thirdPoint) {
        this.firstPoint = firstPoint;
        this.secondPoint = secondPoint;
        this.thirdPoint = thirdPoint;
    }

    @Override
    public double calculate() {
        Point middle = firstPoint.calculateMiddle(secondPoint);
        double height = middle.calculateDistanceBetween(thirdPoint);
        double width = firstPoint.calculateDistanceBetween(secondPoint);
        return height * width / 2;
    }
}
