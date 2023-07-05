package util;

import domain.Point;

import java.util.ArrayList;
import java.util.List;

public class CoordinateConverter {
    public static List<Point> convert(String inputCoordinate) {
        List<Point> points = new ArrayList<>();
        String[] splitCoordinates = inputCoordinate.split("-");

        for (String coordinate : splitCoordinates) {
            String replaceCoordinate = coordinate.replaceAll("[()]", "");
            String[] splitPoint = replaceCoordinate.split(",");
            int x = Integer.parseInt(splitPoint[0]);
            int y = Integer.parseInt(splitPoint[1]);

            points.add(new Point(x, y));
        }

        return points;
    }
}
