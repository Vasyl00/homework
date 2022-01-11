package flight;

public enum Drinks {
    YES(0, "yes", 20),
    NO(1, "no", 10);

    public int getVar() {
        return var;
    }

    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return price;
    }

    Drinks(int var, String description, int price) {
        this.var = var;
        this.description = description;
        this.price = price;
    }

    private final int var;
    private final String description;
    private final int price;
}
