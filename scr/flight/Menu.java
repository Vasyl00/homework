package flight;

public enum Menu {
    SOUP(0, "soup", 10),
    VEGETABLES(1, "vegetables", 20),
    MEAT(2, "meat", 30),
    DESSERT(3, "dessert", 40);

    private final int var;
    private final String description;
    private final int price;

    Menu(int var, String description, int price) {
        this.var = var;
        this.description = description;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "var=" + var +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }

    public int getVar() {
        return var;
    }

    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return price;
    }

}
