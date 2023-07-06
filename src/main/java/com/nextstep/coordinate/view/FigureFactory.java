package com.nextstep.coordinate.view;

import com.nextstep.coordinate.model.*;

import java.util.List;

public class FigureFactory {

    public static final int LINE_LENGTH = 2;
    public static final int TRIANGLE_LENGTH = 3;
    public static final int RECTANGLE_LENGTH = 4;

    public static Figure from(List<Point> points) {
        if (points.size() == LINE_LENGTH) {
            return new Line(points);
        }
        if (points.size() == TRIANGLE_LENGTH) {
            return new Triangle(points);
        }
        if (points.size() == RECTANGLE_LENGTH) {
            return new Rectangle(points);
        }
        throw new IllegalArgumentException("좌표를 다시 입력해주세요.");
    }
}
