package car.domain;

public class K5 implements Car {

    private final static String NAME = "K5";
    private final static double DISTANCE_PER_LITER = 13;

    private double tripDistance;

    public K5(double tripDistance) {
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
