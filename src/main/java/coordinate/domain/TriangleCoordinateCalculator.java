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
        double a = firstPoint.calculateDistanceBetween(secondPoint);
        double b = secondPoint.calculateDistanceBetween(thirdPoint);
        double c = thirdPoint.calculateDistanceBetween(firstPoint);
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s- b) * (s- c));
    }
}
