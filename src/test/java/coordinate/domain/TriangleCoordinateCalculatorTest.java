package coordinate.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

class TriangleCoordinateCalculatorTest {

    @Test
    void 삼각형의_넓이를_계산한다() {
        // given
        CoordinateCalculator calculator = new TriangleCoordinateCalculator(
                new Point(0, 0),
                new Point(4, 0),
                new Point(2, 2));

        // when
        double result = calculator.calculate();

        // then
        assertThat(result).isEqualTo(4, offset(0.00099));
    }
}
