package domain;

public class Point {

    private final int MIN_RANGE_VALUE = 0;
    private final int MAX_RANGE_VALUE = 24;

    private final int x;
    private final int y;

    public Point(int x, int y) {
        validatePointRange(x, y);
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    private void validatePointRange(int x, int y) {
        if (axisOutOfRange(x) || axisOutOfRange(y)) {
            throw new IllegalArgumentException("x와 y의 좌표는 0이상 24이하여야 합니다.");
        }
    }

    private boolean axisOutOfRange(int axis) {
        if (axis < MIN_RANGE_VALUE || axis > MAX_RANGE_VALUE) {
            return true;
        }
        return false;
    }
}
