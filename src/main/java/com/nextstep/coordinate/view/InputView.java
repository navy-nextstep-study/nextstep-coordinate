package com.nextstep.coordinate.view;

import com.nextstep.coordinate.model.Figure;
import com.nextstep.coordinate.model.Point;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputView {

    private static final String INPUT_COORDINATE = "좌표를 입력하세요.";
    private static final Scanner SCANNER = new Scanner(System.in);

    public static Figure inputCoordinates() {
        System.out.println(INPUT_COORDINATE);
        return inputCoordinates(SCANNER.nextLine());
    }

    private static Figure inputCoordinates(String coordinates) {
        try {
            List<Point> points = parseCoordinates(coordinates);
            return FigureFactory.from(points);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            return inputCoordinates();
        }
    }

    private static List<Point> parseCoordinates(String coordinates) {
        List<Point> points = new ArrayList<>();
        String[] pairs = coordinates.split("-");
        for (String pair : pairs) {
            String[] values = pair.substring(1, pair.length() - 1).split(",");
            int x = Integer.parseInt(values[0]);
            int y = Integer.parseInt(values[1]);
            points.add(new Point(x, y));
        }
        return points;
    }
}
