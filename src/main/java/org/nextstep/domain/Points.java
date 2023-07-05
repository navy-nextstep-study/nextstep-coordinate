package org.nextstep.domain;

import org.nextstep.domain.Point;

import java.util.Collections;
import java.util.List;

public class Points {
    private final List<Point> pointList;

    public Points(List<Point> pointList) {
        this.pointList = pointList;
    }

    public List<Point> getPoints(){
        return Collections.unmodifiableList(pointList);
    }

    public int getSize(){
        return pointList.size();
    }
}
