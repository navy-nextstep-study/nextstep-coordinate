package com.nextstep.nextstepcoordinate;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.data.Offset.offset;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TriangleTest {

    @Test
    @DisplayName("삼각형의 넓이를 구한다.")
    void calculateArea() {
        // given
        Coordinate coordinate1 = new Coordinate(10, 10);
        Coordinate coordinate2 = new Coordinate(14, 15);
        Coordinate coordinate3 = new Coordinate(20, 8);

        Line a = new Line(coordinate1, coordinate2);
        Line b = new Line(coordinate2, coordinate3);
        Line c = new Line(coordinate1, coordinate3);

        Triangle triangle = new Triangle(a, b, c);

        // when && then
        assertThat(triangle.getArea()).isEqualTo(29, offset(0.00099));
    }
}
