package domain;

import org.assertj.core.api.Assertions;
import org.assertj.core.data.Offset;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class PointTest {

    @ParameterizedTest
    @CsvSource(value = {"-1:24", "0:25", "25:0", "24:-1"}, delimiter = ':')
    @DisplayName("x와 y좌표는 0미만 24초과이면 예외가 발생한다.")
    void failCreatePoint(int x, int y) {
        Assertions.assertThatThrownBy(() -> new Point(x, y))
            .hasMessageContaining("x와 y의 좌표는 0이상 24이하여야 합니다.");
    }

    @ParameterizedTest
    @CsvSource(value = {"0:24", "24:24", "24:0", "0:0"}, delimiter = ':')
    @DisplayName("x와 y좌표는 0이상 24이하이면 정상적으로 생성된다.")
    void CreatePoint(int x, int y) {
        Assertions.assertThatCode(() -> new Point(x, y))
            .doesNotThrowAnyException();
    }

    @Test
    @DisplayName("두 포인트 간의 길이를 구한다.")
    void calculateDistanceTest() {
        Point pointA = new Point(10, 10);
        Point pointB = new Point(14, 15);

        Double result = pointA.calculateDistance(pointB);

        Assertions.assertThat(result).isEqualTo(6.403124, Offset.offset(0.000009));
    }
}