package org.nextstep.util;

import org.nextstep.domain.Point;
import org.nextstep.domain.Points;

import java.util.ArrayList;
import java.util.List;

public class PointConverter {
    public static Points convert(String inputData) {
        List<Point> points = new ArrayList<>();

        String[] splitByHyphenList = inputData.split("-");

        for (String splited : splitByHyphenList) {
            String[] coordinate = splited.replaceAll("[()]", "").split(",");
            int x = Integer.parseInt(coordinate[0]);
            int y = Integer.parseInt(coordinate[1]);
            points.add(new Point(x, y));
        }
        return new Points(points);
    }
}
