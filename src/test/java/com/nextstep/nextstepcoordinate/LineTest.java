package com.nextstep.nextstepcoordinate;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.data.Offset.offset;

import com.nextstep.nextstepcoordinate.domain.Coordinate;
import com.nextstep.nextstepcoordinate.domain.Line;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LineTest {

    @Test
    @DisplayName("두 점 사이의 선 거리를 계산한다.")
    void calculateLine() {
        // given
        Coordinate coordinate1 = new Coordinate(10, 10);
        Coordinate coordinate2 = new Coordinate(14, 15);
        Line line = new Line(coordinate1, coordinate2);

        // when && then
        assertThat(line.getLineLength()).isEqualTo(6.403124, offset(0.00099));
    }
}
