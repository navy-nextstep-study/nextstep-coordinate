package com.nextstep.coordinate.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThatCode;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CoordinateTest {

    @ParameterizedTest
    @ValueSource(ints = {0, 12, 24})
    @DisplayName("좌표값은 0부터 최대 24까지만 가질 수 있다.")
    void haveValueFrom0To24() {
        // given
        int value = 0;

        // when & then
        assertThatCode(() -> new Coordinate(value))
                .doesNotThrowAnyException();
    }

    @ParameterizedTest
    @ValueSource(ints = {-1, 25})
    @DisplayName("범위를 벗어날 경우 예외가 발생한다.")
    void occurExceptionIfOutOfBound(int value) {
        // when & then
        assertThatThrownBy(() -> new Coordinate(value))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("좌표는 0 이상 24 이하의 값만 가질 수 있습니다.");
    }
}
