package com.nextstep.nextstepcoordinate;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.data.Offset.offset;

import com.nextstep.nextstepcoordinate.domain.Coordinate;
import com.nextstep.nextstepcoordinate.domain.Line;
import com.nextstep.nextstepcoordinate.domain.Square;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SquareTest {

    @Test
    @DisplayName("사각형의 넓이를 구한다.")
    void calculateArea() {
        // given
        Coordinate coordinate1 = new Coordinate(10, 10);
        Coordinate coordinate2 = new Coordinate(22, 10);
        Coordinate coordinate3 = new Coordinate(22, 18);

        Line width = new Line(coordinate1, coordinate2);
        Line height = new Line(coordinate2, coordinate3);

        Square square = new Square(width, height);

        // when && then
        assertThat(square.getArea()).isEqualTo(96, offset(0.00099));
    }
}
