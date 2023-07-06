package com.nextstep.coordinate.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.assertj.core.api.Assertions.offset;

public class RectangleTest {

    @Test
    @DisplayName("네 점이 뒤틀어진 사다리꼴이나 마름모는 제외하고 직사각형만 허용한다.")
    void allowOnlyRectangle() {
        // given
        List<Point> points = new ArrayList<>();
        points.add(new Point(1, 1));
        points.add(new Point(1, 5));
        points.add(new Point(4, 1));
        points.add(new Point(4, 5));

        // when & then
        assertThatCode(() -> new Rectangle(points))
                .doesNotThrowAnyException();
    }

    @Test
    @DisplayName("직사각형이 아닌 경우 예외가 발생한다.")
    void occurExceptionIfNotRectangle() {
        // given
        List<Point> points = new ArrayList<>();
        points.add(new Point(1, 1));
        points.add(new Point(1, 2));
        points.add(new Point(4, 3));
        points.add(new Point(5, 9));

        // when & then
        assertThatThrownBy(() -> new Rectangle(points))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("네 점이 직사각형이여야 합니다.");
    }

    @Test
    @DisplayName("사각형의 넓이를 계산한다.")
    void getArea() {
        // given
        List<Point> points = new ArrayList<>();
        points.add(new Point(1, 1));
        points.add(new Point(1, 5));
        points.add(new Point(4, 1));
        points.add(new Point(4, 5));

        Rectangle rectangle = new Rectangle(points);

        // when
        double result = rectangle.getArea();

        // then
        assertThat(result).isEqualTo(12, offset(0.00099));
    }
}
