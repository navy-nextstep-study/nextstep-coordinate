package domain;

import org.assertj.core.api.Assertions;
import org.assertj.core.data.Offset;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TriangleFigureTest {

    @Test
    @DisplayName("삼각형의 넓이를 구한다.")
    void calculate() {
        Point pointA = new Point(10, 10);
        Point pointB = new Point(14, 15);
        Point pointC = new Point(20, 8);

        List<Point> pointList = new ArrayList<>();
        pointList.add(pointA);
        pointList.add(pointB);
        pointList.add(pointC);

        Points points = new Points(pointList);

        TriangleFigure triangleFigure = new TriangleFigure(points);
        Double result = triangleFigure.calculate();

        Assertions.assertThat(result).isEqualTo(29.0, Offset.offset(0.09));
    }
}