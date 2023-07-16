package domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class SquareFigureTest {

    @Test
    @DisplayName("직사각형이 아니면 예외가 발생한다.")
    void notRectangleException() {
        Point pointA = new Point(10, 10);
        Point pointB = new Point(22, 10);
        Point pointC = new Point(22, 18);
        Point pointD = new Point(10, 17);

        List<Point> pointList = new ArrayList<>();
        pointList.add(pointA);
        pointList.add(pointB);
        pointList.add(pointC);
        pointList.add(pointD);

        Points points = new Points(pointList);
        SquareFigure squareFigure = new SquareFigure(points);

        Assertions.assertThatThrownBy(squareFigure::calculate)
            .hasMessageContaining("직사각형이 아닙니다.");
    }

    @Test
    @DisplayName("사각형의 넓이를 구한다.")
    void calculate() {
        Point pointA = new Point(10, 10);
        Point pointB = new Point(22, 10);
        Point pointC = new Point(22, 18);
        Point pointD = new Point(10, 18);

        List<Point> pointList = new ArrayList<>();
        pointList.add(pointA);
        pointList.add(pointB);
        pointList.add(pointC);
        pointList.add(pointD);

        Points points = new Points(pointList);
        SquareFigure squareFigure = new SquareFigure(points);
        Double result = squareFigure.calculate();

        Assertions.assertThat(result).isEqualTo(96);
    }
}