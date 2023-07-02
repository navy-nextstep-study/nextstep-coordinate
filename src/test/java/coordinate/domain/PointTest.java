package coordinate.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.*;

class PointTest {

    @ParameterizedTest
    @ValueSource(ints = {-1, 25})
    void 범위에_맞지_않는_좌표는_예외가_발생한다(double y) {
        // given & when & then
        assertThatThrownBy(() -> new Point(0, y))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("허용 가능한 좌표 범위를 초과했습니다.");
    }
    
    @Test
    void 두_점_사이의_거리를_계산한다() {
        // given
        Point point = new Point(0, 4);

        // when
        double result = point.calculateDistanceBetween(new Point(4, 0));

        // then
        assertThat(result).isEqualTo(Math.sqrt(32), offset(0.00099));
    }

    @Test
    void 두_점_사이의_중간값을_계산한다() {
        // given
        Point point = new Point(0, 4);

        // when
        Point result = point.calculateMiddle(new Point(4, 0));

        // then
        assertThat(result.getX()).isEqualTo(2);
        assertThat(result.getY()).isEqualTo(2);
    }
}
