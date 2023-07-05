package com.nextstep.nextstepcoordinate;

import static org.assertj.core.api.Assertions.assertThat;

import com.nextstep.nextstepcoordinate.domain.Coordinate;
import com.nextstep.nextstepcoordinate.domain.Coordinates;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CoordinatesTest {

    @Test
    @DisplayName("좌표를 담은 좌표 리스트를 생성한다.")
    void createCoordinates() {
        // given
        Coordinates coordinates = new Coordinates("(10,10)-(14,15)");
        Coordinate coordinate1 = new Coordinate(10, 10);
        Coordinate coordinate2 = new Coordinate(14, 15);
        List<Coordinate> coordinateList = coordinates.getCoordinates();

        // when & then
        assertThat(coordinateList.get(0)).usingRecursiveComparison().isEqualTo(coordinate1);
        assertThat(coordinateList.get(1)).usingRecursiveComparison().isEqualTo(coordinate2);
    }

}
