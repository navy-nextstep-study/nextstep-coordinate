package factory;

import domain.*;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


class FigureFactoryTest {

    static FigureFactory figureFactory;

    @BeforeAll
    static void setUp() {
        figureFactory = new FigureFactory();
    }

    @Test
    @DisplayName("선을 생성한다.")
    void createLineTest() {
        Point pointA = new Point(0, 10);
        Point pointB = new Point(5, 12);

        List<Point> pointList = new ArrayList<>();
        pointList.add(pointA);
        pointList.add(pointB);

        Points points = new Points(pointList);

        Figure lineFigure = figureFactory.createFigure(points);
        Assertions.assertThat(lineFigure).isExactlyInstanceOf(LineFigure.class);
    }

    @Test
    @DisplayName("삼각형을 생성한다.")
    void createTriangleTest() {
        Point pointA = new Point(0, 10);
        Point pointB = new Point(5, 12);
        Point pointC = new Point(4, 17);

        List<Point> pointList = new ArrayList<>();
        pointList.add(pointA);
        pointList.add(pointB);
        pointList.add(pointC);

        Points points = new Points(pointList);

        Figure triangleFigure = figureFactory.createFigure(points);
        Assertions.assertThat(triangleFigure).isExactlyInstanceOf(TriangleFigure.class);
    }

    @Test
    @DisplayName("사각형을 생성한다.")
    void createSquareTest() {
        Point pointA = new Point(0, 10);
        Point pointB = new Point(5, 12);
        Point pointC = new Point(4, 17);
        Point pointD = new Point(10, 15);

        List<Point> pointList = new ArrayList<>();
        pointList.add(pointA);
        pointList.add(pointB);
        pointList.add(pointC);
        pointList.add(pointD);

        Points points = new Points(pointList);

        Figure sqaureFigure = figureFactory.createFigure(points);
        Assertions.assertThat(sqaureFigure).isExactlyInstanceOf(SquareFigure.class);
    }
}