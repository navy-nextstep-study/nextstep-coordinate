package com.nextstep.coordinate.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

public class TriangleTest {

    @Test
    @DisplayName("삼각형의 넓이를 계산한다.")
    void getArea() {
        // given
        Point point1 = new Point(0, 0);
        Point point2 = new Point(4, 0);
        Point point3 = new Point(4, 4);
        Triangle triangle = new Triangle(List.of(point1, point2, point3));

        // when
        double result = triangle.getArea();

        // then
        assertThat(result).isEqualTo(8, offset(0.00099));
    }
}
