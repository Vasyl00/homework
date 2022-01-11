package homework7;

public class Labrador extends Dog {
    private String color; //black, yellow, or chocolate?
    private int breedWeight = 75;

    public Labrador(String name, String color) {
        super(name);
        this.color = color;
    }


    public String speak() {
        return "WOOF";
    }

    @Override
    public int avgBreedWeight() {
        return breedWeight;
    }
}
