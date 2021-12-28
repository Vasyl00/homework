package flight;

public class Passenger {

    private final String name;
    private final String lastName;
    private final long passport;


    public String getLastName() {
        return lastName;
    }

    public long getPassport() {
        return passport;
    }

    public String getName() {
        return name;
    }

    public Passenger(String name, String lastName, long passport) {
        this.name = name;
        this.lastName = lastName;
        this.passport = passport;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", passport=" + passport +
                '}';
    }
}
