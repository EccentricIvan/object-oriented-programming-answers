package balextranit;

public class Vehicle {
    private boolean available;
    
    private int seatCount;
    private Passenger currentPassenger;

    public Vehicle(int seatCount) {
        this.seatCount = seatCount;
        this.available = true;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public int getSeatCount() {
        return seatCount;
    }

    public void setCurrentPassenger(Passenger p) {
        this.currentPassenger = p;
    }
}
