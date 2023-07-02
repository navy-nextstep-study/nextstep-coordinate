package car.domain;

public class RentCompany {

    private Cars cars;

    public RentCompany(Cars cars) {
        this.cars = cars;
    }

    public static RentCompany create() {
        return new RentCompany(new Cars());
    }

    public String generateReport() {
        return cars.toString();
    }

    public void addCar(Car car) {
        cars.addCar(car);
    }
}
