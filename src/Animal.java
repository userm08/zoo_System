package model;

public class Animal {

    protected int id;
    protected String name;
    protected String species;
    protected int age;
    protected int zooId;

    public Animal(int id, String name, String species, int age, int zooId) {
        this.id = id;
        this.name = name;
        this.species = species;
        this.age = age;
        this.zooId = zooId;
    }

    public String getName() {
        return name;
    }

    public String makeSound() {
        return "Animal sound";
    }
}
