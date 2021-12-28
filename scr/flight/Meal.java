package flight;

public class Meal {
    private Menu menu;
    private Drinks drinks;


    public Meal(Menu menu, Drinks drinks) {
        this.menu = menu;
        this.drinks = drinks;
    }

    public Menu getMenu() {
        return menu;
    }

    public Drinks getDrinks() {
        return drinks;
    }
    public int getPrice() {
        return drinks.getPrice()+ menu.getPrice();

    }

    @Override
    public String toString() {
        return "Meal{" +
                "menu=" + menu +
                ", drinks=" + drinks +
                '}';
    }
}
