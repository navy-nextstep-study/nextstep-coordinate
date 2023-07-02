package coordinate.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

class RectangleCoordinateCalculatorTest {

    @Test
    void 사각형의_넓이를_계산한다() {
        // given
        CoordinateCalculator calculator = new RectangleCoordinateCalculator(
                new Point(0, 4),
                new Point(4, 0),
                new Point(0, 0),
                new Point(4, 4));

        // when
        double result = calculator.calculate();

        // then
        assertThat(result).isEqualTo(16, offset(0.00099));
    }
}
