package balextranit;

import java.util.Random;

public class PassengerSource {
    private Company company;
    private Random random;

    public PassengerSource(Company company) {
        this.company = company;
        this.random = new Random();
    }

    public boolean requestPickup() {
        int x1 = random.nextInt(101);
        int y1 = random.nextInt(101);
        int x2 = random.nextInt(101);
        int y2 = random.nextInt(101);

        Location pickup = new Location(x1, y1);
        Location destination = new Location(x2, y2);
        Passenger passenger = new Passenger(pickup, destination);

        return company.scheduleVehicle(passenger);
    }
}
