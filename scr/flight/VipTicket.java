package flight;

public class VipTicket extends Ticket {
    private final Meal meal;
    private final Baggage baggage;


    public VipTicket(int sitNumber, FlightInfo flightInfo, Passenger passenger, Meal meal, Baggage baggage) {
        super(sitNumber, flightInfo, passenger);
        this.meal = meal;
        this.baggage = baggage;

    }

    @Override
    public String toString() {
        return "VipTicket{" +
                "meal=" + meal +
                ", baggage=" + baggage +
                ", sitNumber=" + getSitNumber() +
                ", flightInfo=" + flightInfo +
                ", passenger=" + passenger +
                '}';
    }

    public int getCost() {
        return super.getCost() + meal.getPrice() + baggage.getCustomFee();
    }
}
