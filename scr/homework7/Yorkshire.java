package homework7;

public class Yorkshire extends Dog {
    private int breedWeight = 76;

    public Yorkshire(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public String speak() {
        return "woof";
    }

    @Override
    public int avgBreedWeight() {
        return breedWeight;
    }
}
