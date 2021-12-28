package flight;

public class Baggage {
    private int amount;
    private int customFee;


    public Baggage(int amount, int customFee) {
        this.amount = amount;
        this.customFee = customFee;
    }

    public int getCustomFee() {
        return customFee;
    }
}
