package util;

import domain.Point;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CoordinateConverterTest {

    @ParameterizedTest
    @ValueSource(strings = {"(10,10)-(14,15)"})
    @DisplayName("입력 값을 받고 List<Point>를 반환한다.")
    void convertTest(String input) {
        List<Point> points = CoordinateConverter.convert(input);

        Assertions.assertThat(points).hasSize(2);
        Assertions.assertThat(points)
            .usingRecursiveFieldByFieldElementComparator()
            .contains(new Point(10, 10), new Point(14, 15));
    }

}