package com.nextstep.nextstepcoordinate;

import com.nextstep.nextstepcoordinate.Console.Coordinates;
import com.nextstep.nextstepcoordinate.Console.InputView;
import com.nextstep.nextstepcoordinate.Console.OutputView;
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
        }

        if (coordinatesList.size() == SQUARE) {
            OutputView.coordinatePlace(coordinatesList);
        }
    }
}
