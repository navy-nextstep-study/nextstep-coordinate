package com.nextstep.coordinate.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

public class LineTest {

    @ParameterizedTest
    @CsvSource(value = {"1, 1.414", "2, 2.828"})
    @DisplayName("직선의 길이를 계산한다.")
    void test(int value, double expected) {
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
