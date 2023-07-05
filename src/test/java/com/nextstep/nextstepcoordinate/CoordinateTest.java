package com.nextstep.nextstepcoordinate;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import com.nextstep.nextstepcoordinate.domain.Coordinate;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CoordinateTest {

    @Test
    @DisplayName("좌표를 생성한다.")
    void createCoordinate() {
        // given
        Coordinate coordinate = new Coordinate(10, 23);

        // when & then
        assertThat(coordinate.getX()).isEqualTo(10);
        assertThat(coordinate.getY()).isEqualTo(23);
    }


    @Test
    @DisplayName("좌표의 생성할 때 범위를 넘어서면 에외를 발생시킨다")
    void excpetionCoordinate() {
        // given & when & then
        assertThatThrownBy(() -> new Coordinate(25, 10))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("입력하신 X좌표 25는 입력값의 범위에 포함되지 않습니다.");

        // given & when & then
        assertThatThrownBy(() -> new Coordinate(14, -3))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("입력하신 Y좌표 -3는 입력값의 범위에 포함되지 않습니다.");
    }

}
