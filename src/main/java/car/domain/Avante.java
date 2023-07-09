package car.domain;

public class Avante implements Car {

    private final static String NAME = "Avante";
    private final static double DISTANCE_PER_LITER = 15;

    private double tripDistance;

    public Avante(double tripDistance) {
        this.tripDistance = tripDistance;
    }

    @Override
    public double getDistancePerLiter() {
        return DISTANCE_PER_LITER;
    }

    @Override
    public double getTripDistance() {
        return tripDistance;
    }

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public String toString() {
        return String.format("%s : %d리터", NAME, (int) getChargeQuantity());
    }
}
