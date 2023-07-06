package com.nextstep.coordinate.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class TriangleTest {

    @Test
    @DisplayName("세 점은 삼각형을 이룬다.")
    void makeTriangle() {
        // given
        List<Point> points = new ArrayList<>();
        points.add(new Point(1, 1));
        points.add(new Point(1, 5));
        points.add(new Point(4, 1));

        // when & then
        assertThatCode(() -> new Triangle(points))
                .doesNotThrowAnyException();
    }

    @Test
    @DisplayName("삼각형이 아닌 경우 예외가 발생한다.")
    void occurExceptionIfNotTriangle() {
        // given
        List<Point> points = new ArrayList<>();
        points.add(new Point(1, 1));
        points.add(new Point(2, 2));
        points.add(new Point(3, 3));

        // when & then
        assertThatThrownBy(() -> new Triangle(points))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("세 점이 삼각형이여야 합니다.");
    }

    @Test
    @DisplayName("삼각형의 넓이를 계산한다.")
    void getArea() {
        // given
        Point point1 = new Point(1, 1);
        Point point2 = new Point(5, 1);
        Point point3 = new Point(5, 5);
        Triangle triangle = new Triangle(List.of(point1, point2, point3));

        // when
        double result = triangle.getArea();

        // then
        assertThat(result).isEqualTo(8, offset(0.00099));
    }
}
