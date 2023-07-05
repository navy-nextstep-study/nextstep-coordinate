package com.nextstep.nextstepcoordinate.domain;

import java.text.MessageFormat;

public class Coordinate {

    private final static int COORDINATE_MAX = 24;
    private final static int COORDINATE_MIN = 0;

    private int x;
    private int y;

    public Coordinate(int x, int y) {
        validateCoordinateRange(x, y);
        this.x = x;
        this.y = y;
    }

    private void validateCoordinateRange(int x, int y) {
        if (COORDINATE_MIN > x || x > COORDINATE_MAX) {
            throw new IllegalArgumentException(MessageFormat.format("입력하신 X좌표 {0}는 입력값의 범위에 포함되지 않습니다.", x));
        }

        if (COORDINATE_MIN > y || y > COORDINATE_MAX) {
            throw new IllegalArgumentException(MessageFormat.format("입력하신 Y좌표 {0}는 입력값의 범위에 포함되지 않습니다.", y));
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
