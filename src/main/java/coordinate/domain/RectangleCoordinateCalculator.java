package coordinate.domain;

public class RectangleCoordinateCalculator implements CoordinateCalculator {

    private Point firstPoint;
    private Point secondPoint;
    private Point thirdPoint;
    private Point fourthPoint;

    public RectangleCoordinateCalculator(Point firstPoint, Point secondPoint, Point thirdPoint, Point fourthPoint) {
        this.firstPoint = firstPoint;
        this.secondPoint = secondPoint;
        this.thirdPoint = thirdPoint;
        this.fourthPoint = fourthPoint;
    }

    @Override
    public double calculate() {
        double width = firstPoint.calculateDistanceBetween(thirdPoint);
        double height = firstPoint.calculateDistanceBetween(fourthPoint);
        return width * height;
    }
}
