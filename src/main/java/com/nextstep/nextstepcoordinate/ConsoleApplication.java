package com.nextstep.nextstepcoordinate;

import com.nextstep.nextstepcoordinate.Console.InputView;
import com.nextstep.nextstepcoordinate.Console.OutputView;
import com.nextstep.nextstepcoordinate.domain.Coordinate;
import com.nextstep.nextstepcoordinate.domain.Coordinates;
import com.nextstep.nextstepcoordinate.domain.Line;
import com.nextstep.nextstepcoordinate.domain.Square;
import com.nextstep.nextstepcoordinate.domain.Triangle;
import java.util.List;

public class ConsoleApplication {

    private static final int LINE = 2;
    private static final int TRIANGLE = 3;
    private static final int SQUARE = 4;

    public void run() {
        OutputView.setCoordinateGuide();
        Coordinates coordinates = new Coordinates(InputView.input());
        List<Coordinate> coordinatesList = coordinates.getCoordinates();

        if (coordinatesList.size() == LINE) {
            OutputView.coordinatePlace(coordinatesList);
            Line line = new Line(coordinatesList.get(0), coordinatesList.get(1));

            OutputView.lineLengthGuide(line.getLineLength());
        }

        if (coordinatesList.size() == TRIANGLE) {
            OutputView.coordinatePlace(coordinatesList);
            Line a = new Line(coordinatesList.get(0), coordinatesList.get(1));
            Line b = new Line(coordinatesList.get(1), coordinatesList.get(2));
            Line c = new Line(coordinatesList.get(0), coordinatesList.get(2));

            Triangle triangle = new Triangle(a, b, c);

            OutputView.triangleAreaGuide(triangle.getArea());
        }

        if (coordinatesList.size() == SQUARE) {
            OutputView.coordinatePlace(coordinatesList);
            Line width = new Line(coordinatesList.get(0), coordinatesList.get(1));
            Line height = new Line(coordinatesList.get(1), coordinatesList.get(2));

            Square square = new Square(width, height);

            OutputView.squareAreaGuide(square.getArea());
        }
    }
}
