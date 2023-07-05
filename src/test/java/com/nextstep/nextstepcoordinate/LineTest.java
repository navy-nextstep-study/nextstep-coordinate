package com.nextstep.nextstepcoordinate;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LineTest {

    @Test
    @DisplayName("두 점 사이의 선 거리를 계산한다.")
    void calculateLine(){
        Coordinate coordinate1 = new Coordinate(10, 20);
        Coordinate coordinate2 = new Coordinate(4, 10);

        Line line = new Line(coordinate1, coordinate2);

        System.out.println(line.getLineLength());
    }
}
