package com.nextstep.nextstepcoordinate.domain;

import java.util.ArrayList;
import java.util.List;

public class Coordinates {

    private List<Coordinate> coordinates = new ArrayList<>();

    public Coordinates(String inputCoordinates) {
        parseCoordinates(inputCoordinates);
        this.coordinates = coordinates;
    }

    private void parseCoordinates(String inputCoordinates) {
        String[] splitedCoordinates = inputCoordinates.split("-");

        for (int i = 0; i < splitedCoordinates.length; i++) {
            String[] splitedCoordinate = splitedCoordinates[i].replaceAll("[()]", "").split(",");
            Coordinate coordinate = new Coordinate(Integer.parseInt(splitedCoordinate[0]), Integer.parseInt(splitedCoordinate[1]));
            coordinates.add(coordinate);
        }
    }

    public List<Coordinate> getCoordinates() {
        return coordinates;
    }
}
