package com.nextstep.coordinate.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

public class PointTest {

    @ParameterizedTest
    @CsvSource(value = {"1, 1.414", "2, 2.828"})
    @DisplayName("점과 점의 거리를 계산한다.")
    void calculateDistance(int value, double expected) {
        // given
        Point point1 = new Point(0, 0);
        Point point2 = new Point(value, value);

        // when
        double result = point1.calculateDistance(point2);

        // then
        assertThat(result).isEqualTo(expected, offset(0.00099));
    }
}
