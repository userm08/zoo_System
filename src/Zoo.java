
package model;
import java.util.*;

public class Zoo {
    private List<Animal> animals = new ArrayList<>();
    private List<Zookeeper> zookeepers = new ArrayList<>();

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void addZookeeper(Zookeeper zookeeper) {
        zookeepers.add(zookeeper);
    }

    public List<Animal> findAnimalsOlderThan(int age) {
        List<Animal> result = new ArrayList<>();
        for (Animal a : animals) {
            if (a.getAge() > age) {
                result.add(a);
            }
        }
        return result;
    }

    public void sortAnimalsByName() {
        animals.sort(Comparator.comparing(Animal::getName));
    }

    public List<Animal> getAnimals() {
        return animals;
    }
}
