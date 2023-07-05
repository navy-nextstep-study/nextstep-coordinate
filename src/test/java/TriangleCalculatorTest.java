import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.nextstep.Point;
import org.nextstep.TriangleCalculator;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class TriangleCalculatorTest {
    /**
     * 삼각형의 성립 조건
     * 1. 세 점이 모두 다른 위치에 있는가(중복되는 점이 없어야 한다.)
     * 2. 세 점이 일직선상에 위치하지 않는가
     */
    @Test
    @DisplayName("주어진 세 점은 삼각형의 성립조건을 만족해야 한다." +
            "1. 세 점이 모두 다른 위치에 있는가(중복되는 점이 없어야 한다.) - 실패")
    void CheckValidTriangle_ExceptionThrown() {
        Point point1 = new Point(10, 10);
        Point point2 = new Point(10, 10);
        Point point3 = new Point(22, 18);

        List<Point> pointList = Arrays.asList(point1, point2, point3);
        assertThatThrownBy(() -> new TriangleCalculator(pointList))
                .isInstanceOf(IllegalStateException.class)
                .hasMessage("삼각형이 아닙니다.");
    }

    @Test
    @DisplayName("주어진 세 점은 삼각형의 성립조건을 만족해야 한다." +
            "2. 세 점이 일직선상에 위치하지 않는가 - 실패")
    void CheckValidTriangle_ExceptionThrown2() {
        Point point1 = new Point(10, 10);
        Point point2 = new Point(10, 12);
        Point point3 = new Point(10, 18);

        List<Point> pointList = Arrays.asList(point1, point2, point3);
        assertThatThrownBy(() -> new TriangleCalculator(pointList))
                .isInstanceOf(IllegalStateException.class)
                .hasMessage("삼각형이 아닙니다.");
    }

    @Test
    @DisplayName("삼각형의 면적을 계산한다.")
    void Calculate_Triangle_Area(){
        Point point1 = new Point(10, 10);
        Point point2 = new Point(14 , 15);
        Point point3 = new Point(20, 8);

        List<Point> pointList = Arrays.asList(point1, point2, point3);
        TriangleCalculator triangleCalculator = new TriangleCalculator(pointList);

        double areaExpect = triangleCalculator.calculate();

        assertThat(areaExpect).isEqualTo(29,offset(0.00099));
    }

}
