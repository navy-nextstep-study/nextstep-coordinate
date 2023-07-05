package org.nextstep.domain;

public enum ShapeType {
    LINE(2),
    TRIANGLE(3),
    RECTANGLE(4);

    private final int count;
    ShapeType(int count) {
        this.count = count;
    }
    public int getCount(){
        return count;
    }
}
