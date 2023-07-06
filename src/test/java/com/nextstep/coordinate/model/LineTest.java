package com.nextstep.coordinate.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class LineTest {

    @Test
    @DisplayName("두 점은 직선을 이룬다.")
    void makeLine() {
        // given
        List<Point> points = new ArrayList<>();
        points.add(new Point(1, 1));
        points.add(new Point(2, 5));

        // when & then
        assertThatCode(() -> new Line(points))
                .doesNotThrowAnyException();
    }

    @Test
    @DisplayName("직선이 아닌 경우 예외가 발생한다.")
    void occurExceptionIfNotLine() {
        // given
        List<Point> points = new ArrayList<>();
        points.add(new Point(1, 1));
        points.add(new Point(1, 1));

        // when & then
        assertThatThrownBy(() -> new Line(points))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("두 점이 직선이여야 합니다.");
    }

    @ParameterizedTest
    @CsvSource(value = {"1, 1.414", "2, 2.828"})
    @DisplayName("직선의 길이를 계산한다.")
    void getArea(int value, double expected) {
        // given
        Point point1 = new Point(0, 0);
        Point point2 = new Point(value, value);
        Line line = new Line(List.of(point1, point2));

        // when
        double result = line.getArea();

        // then
        assertThat(result).isEqualTo(expected, offset(0.00099));
    }
}
