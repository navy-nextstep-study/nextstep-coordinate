package domain;

import org.assertj.core.api.Assertions;
import org.assertj.core.data.Offset;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class LineFigureTest {

    @Test
    @DisplayName("선의 길이를 구한다.")
    void calculate() {
        Point pointA = new Point(10, 10);
        Point pointB = new Point(14, 15);

        List<Point> pointList = new ArrayList<>();
        pointList.add(pointA);
        pointList.add(pointB);

        Points points = new Points(pointList);

        LineFigure lineFigure = new LineFigure(points);
        Double result = lineFigure.calculate();

        Assertions.assertThat(result).isEqualTo(6.403124, Offset.offset(0.000009));
    }
}