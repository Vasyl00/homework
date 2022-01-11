package homework6;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return " I am a dog, my name is "+super.getName();
    }


}
