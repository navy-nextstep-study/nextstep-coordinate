import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.nextstep.domain.LineCalculator;
import org.nextstep.domain.Point;
import org.nextstep.domain.Points;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

public class LineCalculatorTest {
    @Test
    @DisplayName("두 점 사이의 거리를 계산한다.")
    void Calculate_Line_Length() {
        Point point1 = new Point(12, 3);
        Point point2 = new Point(3, 0);

        Points points = new Points(Arrays.asList(point1, point2));

        LineCalculator lineCalculator = new LineCalculator(points);
        double lengthExpect = lineCalculator.calculate();

        assertThat(lengthExpect).isEqualTo(Math.sqrt(90), offset(0.00099));
    }
}
