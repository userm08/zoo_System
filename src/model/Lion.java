package model;

public class Lion extends Animal {

    public Lion(int id, String name, int age, int zooId) {
        super(id, name, "Lion", age, zooId);
    }

    @Override
    public String makeSound() {
        return "Roar";
    }
}
