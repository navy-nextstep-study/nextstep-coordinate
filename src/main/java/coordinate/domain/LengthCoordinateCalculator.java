package coordinate.domain;

public class LengthCoordinateCalculator implements CoordinateCalculator {

    private Point firstPoint;
    private Point secondPoint;

    public LengthCoordinateCalculator(Point firstPoint, Point secondPoint) {
        this.firstPoint = firstPoint;
        this.secondPoint = secondPoint;
    }

    @Override
    public double calculate() {
        return firstPoint.calculateDistanceBetween(secondPoint);
    }
}
