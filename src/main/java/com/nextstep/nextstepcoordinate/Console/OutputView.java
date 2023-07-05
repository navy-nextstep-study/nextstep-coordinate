package com.nextstep.nextstepcoordinate.Console;

import com.nextstep.nextstepcoordinate.Coordinate;
import java.util.List;

public class OutputView {

    public static void setCoordinateGuide() {
        System.out.println("좌표를 입력해주세요.");
    }

    public static void lineLengthGuide(Double lineLength) {
        System.out.println("두 점 사이의 거리는 " + lineLength);
    }

    public static void squareAreaGuide(Double area) {
        System.out.println("사각형의 넓이는 " + area);
    }

    public static void triangleAreaGuide(Double area) {
        System.out.println("삼각형의 넓이는 " + area);
    }

    public static void coordinatePlace(List<Coordinate> coordinateList) {
        int width = 24;
        int height = 24;

        char[][] map = new char[24][24];

        initMap(width, height, map);
        checkMap(coordinateList, map);
        coordinateMap(width, height, map);
    }

    private static void checkMap(List<Coordinate> coordinateList, char[][] map) {
        for (Coordinate coordinate : coordinateList) {
            map[coordinate.getY() - 1][coordinate.getX() - 1] = '*';
        }
    }

    private static void initMap(int width, int height, char[][] map) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                map[i][j] = '.';
            }
        }
    }

    private static void coordinateMap(int width, int height, char[][] map) {
        for (int i = height - 1; i >= 0; i--) {
            for (int j = 0; j < width; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }
}
