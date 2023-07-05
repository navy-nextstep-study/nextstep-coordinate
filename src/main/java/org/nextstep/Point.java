package org.nextstep;

public class Point {

    private final int x;
    private final int y;

    public Point(int x, int y) {
        validatePoint(x, y);
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    private void validatePoint(int x, int y) {
        if (x < 0 || x > 24 || y < 0 || y > 24) {
            throw new IllegalArgumentException("좌표가 범위를 벗어났습니다.");
        }
    }

}
