package org.nextstep;

import org.nextstep.Point;

import java.util.List;

public class TriangleCalculator implements Calculator{
    private final List<Point> pointList;
    public TriangleCalculator(List<Point> pointList) {
        validateTriangle(pointList);
        this.pointList = pointList;
    }
    @Override
    public double calculate() {
        double distanceA = pointList.get(0).calculateDistance(pointList.get(1));
        double distanceB = pointList.get(1).calculateDistance(pointList.get(2));
        double distanceC = pointList.get(2).calculateDistance(pointList.get(0));
        double s = (distanceA + distanceB + distanceC) / 2;

        return Math.sqrt(s*(s-distanceA)*(s-distanceB)*(s-distanceC));
    }
    private void validateTriangle(List<Point> pointList) {
        checkPointSize(pointList);
        checkDistinctPoint(pointList);
        checkCollinear(pointList);
    }
    private void checkPointSize(List<Point> pointList) { //좌표가 총 3개인지 확인
        if (pointList.size() != 3) throw new IllegalStateException("좌표값이 3개가 아닙니다.");
    }

    private void checkDistinctPoint(List<Point> pointList){ //서로 다른 세 점으로 구성되었는지 확인
        long distinctCount = pointList.stream()
                .distinct()
                .count();

        if(distinctCount != 3){
            throw new IllegalStateException("삼각형이 아닙니다.");
        }
    }

    private void checkCollinear(List<Point> pointList){//세 점이 동일선상에 존재하는지 확인
        Point point1 = pointList.get(0);
        Point point2 = pointList.get(1);
        Point point3 = pointList.get(2);

        if((point2.getY() - point1.getY()) * (point3.getX() - point2.getX()) == (point3.getY() - point2.getY()) * (point2.getX() - point1.getX())){
            throw new IllegalStateException("삼각형이 아닙니다.");
        }
    }
}
