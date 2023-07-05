package com.nextstep.coordinate.controller;

import com.nextstep.coordinate.model.Figure;
import com.nextstep.coordinate.view.InputView;
import com.nextstep.coordinate.view.OutputView;

public class CoordinateCalculator {
    public void run() {
        Figure figure = InputView.inputCoordinates();
        OutputView.showCoordinatePlane(figure);
        OutputView.showArea(figure);
    }
}
