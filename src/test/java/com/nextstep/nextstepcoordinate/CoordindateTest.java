package com.nextstep.nextstepcoordinate;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CoordindateTest {

    @Test
    @DisplayName("좌표를 생성한다.")
    void createCoordinate(){
        // given
        Coordinate coordinate = new Coordinate(10, 23);

        // then
        Assertions.assertThat(coordinate.getX()).isEqualTo(10);
        Assertions.assertThat(coordinate.getY()).isEqualTo(23);
    }

}
