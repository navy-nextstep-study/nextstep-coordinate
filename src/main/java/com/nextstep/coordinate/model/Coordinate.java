package com.nextstep.coordinate.model;

public class Coordinate {

    private final int value;

    public Coordinate(int value) {
        validationValue(value);
        this.value = value;
    }

    private void validationValue(int value) {
        if (0 > value || value > 24) {
            throw new IllegalArgumentException("좌표는 0 이상 24 이하의 값만 가질 수 있습니다.");
        }
    }

    public int getValue() {
        return value;
    }
}
