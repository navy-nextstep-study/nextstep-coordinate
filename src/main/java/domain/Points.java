package domain;

import java.util.Collections;
import java.util.List;

public class Points {

    private final List<Point> points;

    public Points(List<Point> points) {
        this.points = points;
    }

    public int getSize() {
        return points.size();
    }

    public List<Point> getPoints() {
        return Collections.unmodifiableList(points);
    }
}
