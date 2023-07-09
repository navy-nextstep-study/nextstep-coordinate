package coordinate.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

class LengthCoordinateCalculatorTest {

    @Test
    void 두_점_사이의_거리를_계산한다() {
        // given
        Point point1 = new Point(0, 4);
        Point point2 = new Point(4, 0);
        CoordinateCalculator calculator = new LengthCoordinateCalculator(point1, point2);

        // when
        double result = calculator.calculate();

        // then
        assertThat(result).isEqualTo(Math.sqrt(32), offset(0.00099));
    }
}
