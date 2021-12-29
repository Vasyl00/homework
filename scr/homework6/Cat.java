package homework6;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return " I am a cat, my name is "+super.getName();
    }
}
