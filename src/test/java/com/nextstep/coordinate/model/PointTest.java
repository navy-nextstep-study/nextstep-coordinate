package com.nextstep.coordinate.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.*;

public class PointTest {

    @Test
    @DisplayName("X, Y 좌표를 갖는다.")
    void hasXAndYCoordinates() {
        // given
        Coordinate x = new Coordinate(1);
        Coordinate y = new Coordinate(1);

        // when & then
        assertThatCode(() -> new Point(x, y))
                .doesNotThrowAnyException();
    }

    @ParameterizedTest
    @CsvSource(value = {"1, 1.414", "2, 2.828"})
    @DisplayName("점과 점의 거리를 계산한다.")
    void calculateDistance(int value, double expected) {
        // given
        Point point1 = new Point(new Coordinate(0), new Coordinate(0));
        Point point2 = new Point(new Coordinate(value), new Coordinate(value));

        // when
        double result = point1.calculateDistance(point2);

        // then
        assertThat(result).isEqualTo(expected, offset(0.00099));
    }
}
