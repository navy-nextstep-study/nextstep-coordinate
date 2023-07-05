package domain;

import java.util.List;

public class LineFigure implements Figure {

    private final Points points;

    public LineFigure(Points points) {
        this.points = points;
    }

    @Override
    public Double calculate() {
        return null;
    }
}
