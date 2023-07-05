package com.nextstep.coordinate.view;

import com.nextstep.coordinate.model.Figure;
import com.nextstep.coordinate.model.Point;

import java.util.Arrays;

public class OutputView {

    private static final int COORDINATE_PLANE_SIZE = 24;
    private static final char[][] coordinatePlane;

    static {
        coordinatePlane = new char[COORDINATE_PLANE_SIZE][COORDINATE_PLANE_SIZE];
        Arrays.stream(coordinatePlane)
                .forEach(row -> Arrays.fill(row, '.'));
    }

    public static void showCoordinatePlane(Figure figure) {
        markCoordinates(figure);
        showCoordinatePlane();
    }

    private static void showCoordinatePlane() {
        for (char[] row : coordinatePlane) {
            for (char point : row) {
                System.out.print(point + " ");
            }
            System.out.println();
        }
    }

    private static void markCoordinates(Figure figure) {
        for (Point point : figure.getPoints()) {
            int x = point.getX();
            int y = point.getY();
            coordinatePlane[x][y] = '*';
        }
    }

    public static void showArea(Figure figure) {
        System.out.println(figure.getAreaInfo());
    }
}
