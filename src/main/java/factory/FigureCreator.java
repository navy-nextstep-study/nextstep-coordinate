package factory;

import domain.Figure;
import domain.Points;

public interface FigureCreator {

    Figure createFigure(Points points);
}
