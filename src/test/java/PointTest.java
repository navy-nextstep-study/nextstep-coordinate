import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.nextstep.domain.Point;

import static org.assertj.core.api.Assertions.*;

public class PointTest {
    @Test
    @DisplayName("좌표(x,y)를 생성할 수 있다")
    void Create_Point() {
        Point point = new Point(2, 14);

        assertThat(point.getX()).isEqualTo(2);
        assertThat(point.getY()).isEqualTo(14);
    }

    @ParameterizedTest
    @DisplayName("좌표(x,y)는 0-24 범위 내에 존재한다 - 실패")
    @CsvSource(value = {"-1,3", "-1,-1", "0,25", "25,4", "25,25"}, delimiter = ',')
    void Create_Point_ExceptionThrown(int x, int y) {
        assertThatThrownBy(() -> new Point(x, y))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("좌표가 범위를 벗어났습니다.");
    }

    @Test
    @DisplayName("두 좌표간의 범위를 계산한다.")
    void Calcualte_Distance() {
        //given
        Point point1 = new Point(2, 4);
        //when
        double result = point1.calculateDistance(new Point(4, 0));
        //then
        assertThat(result).isEqualTo(Math.sqrt(20), offset(0.00099));
    }
}
