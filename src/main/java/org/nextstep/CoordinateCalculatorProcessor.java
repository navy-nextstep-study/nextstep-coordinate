package org.nextstep;

import org.nextstep.domain.*;
import org.nextstep.util.PointConverter;
import org.nextstep.view.Input;
import org.nextstep.view.Output;

public class CoordinateCalculatorProcessor {
    public void run() {
        Output.printIntroMessage();
        String data = Input.inputCoordinate();
        Points points = PointConverter.convert(data);

        if (points.getSize() == ShapeType.LINE.getCount()) {
            LineCalculator lineCalculator = new LineCalculator(points);
            Output.printResult(ShapeType.LINE, lineCalculator.calculate());
        }
        if (points.getSize() == ShapeType.TRIANGLE.getCount()) {
            TriangleCalculator triangleCalculator = new TriangleCalculator(points);
            Output.printResult(ShapeType.TRIANGLE, triangleCalculator.calculate());
        }
        if (points.getSize() == ShapeType.RECTANGLE.getCount()) {
            RectangleCalculator rectangleCalculator = new RectangleCalculator(points);
            Output.printResult(ShapeType.RECTANGLE, rectangleCalculator.calculate());
        }
    }
}
