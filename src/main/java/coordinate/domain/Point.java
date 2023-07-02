package coordinate.domain;

public class Point {

    private final double x;
    private final double y;


    public Point(double x, double y) {
        validatePoint(x, y);
        this.x = x;
        this.y = y;
    }

    private void validatePoint(double x, double y) {
        if (x < 0 || y < 0 || x > 24 || y > 24) {
            throw new IllegalArgumentException("허용 가능한 좌표 범위를 초과했습니다.");
        }
    }

    public double calculateDistanceBetween(Point point) {
        return Math.sqrt(Math.pow(x - point.getX(), 2) + Math.pow(y - point.getY(), 2));
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
