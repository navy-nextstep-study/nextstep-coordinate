package presentation;

import domain.Figure;
import domain.Point;
import domain.Points;
import factory.FigureFactory;
import util.CoordinateConverter;
import view.InputView;
import view.OutputView;

import java.util.List;

public class CoordinateController implements Runnable {

    private final InputView inputView;
    private final OutputView outputView;

    public CoordinateController() {
        this.inputView = InputView.getInstance();
        this.outputView = OutputView.getInstance();
    }

    @Override
    public void run() {
        outputView.displayInputCoordinateMsg();
        List<Point> pointList;
        while(true) {
            String inputCoordinate = inputView.inputCoordinate();
            try {
                pointList = CoordinateConverter.convert(inputCoordinate);
                break;
            } catch (IllegalArgumentException e) {
                outputView.displayErrorMsg(e.getMessage());
                outputView.displayInputCoordinateMsg();
            }
        }
        Points points = new Points(pointList);
        FigureFactory figureFactory = new FigureFactory();

        Figure figure = figureFactory.createFigure(points);
        outputView.displayResult(figure);
    }
}
