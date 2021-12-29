package homework7;

public class DogTest {
    public static void main(String[] args) {


        Yorkshire yorkshire = new Yorkshire("Spike2");
        System.out.println(yorkshire.getName() + " says " + yorkshire.speak() + " weight=" + yorkshire.avgBreedWeight());

        Labrador labrador = new Labrador("Spike3", "Black");
        System.out.println(yorkshire.getName() + " says " + labrador.speak() + " weight=" + labrador.avgBreedWeight());
    }
}
