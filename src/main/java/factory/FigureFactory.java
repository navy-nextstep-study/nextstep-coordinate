package factory;

import domain.*;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class FigureFactory implements FigureCreator {

    private static final Map<Integer, Function<Points, Figure>> figureStorage = new HashMap<>();

    static {
        figureStorage.put(2, LineFigure::new);
        figureStorage.put(3, TriangleFigure::new);
        figureStorage.put(4, SquareFigure::new);
    }

    @Override
    public Figure createFigure(Points points) {
        Function<Points, Figure> figureCreateFunction = figureStorage.get(points.getSize());
        return figureCreateFunction.apply(points);
    }
}
