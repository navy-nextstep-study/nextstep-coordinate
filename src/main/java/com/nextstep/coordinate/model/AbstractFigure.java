package com.nextstep.coordinate.model;

import java.util.List;

public abstract class AbstractFigure implements Figure {

    private final List<Point> points;

    public AbstractFigure(List<Point> points) {
        this.points = points;
    }

    @Override
    public List<Point> getPoints() {
        return points;
    }
}
