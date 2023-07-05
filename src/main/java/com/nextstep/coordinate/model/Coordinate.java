package com.nextstep.coordinate.model;

public class Coordinate {

    public static final int MIN_RANGE = 0;
    public static final int MAX_RANGE = 24;
    private final int value;

    public Coordinate(int value) {
        validationValue(value);
        this.value = value;
    }

    private void validationValue(int value) {
        if (MIN_RANGE > value || value > MAX_RANGE) {
            throw new IllegalArgumentException("좌표는 0 이상 24 이하의 값만 가질 수 있습니다.");
        }
    }

    public int getValue() {
        return value;
    }
}
