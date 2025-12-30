import model.Animal; // Нужно добавить этот импорт
import model.Lion;
import model.Zoo;    // И этот импорт

public class Main {
    public static void main(String[] args) {
        // Теперь Main знает, что такое Zoo
        Zoo zoo = new Zoo();

        // Теперь Main знает, что такое Animal
        Animal lion1 = new Lion("Simba", 5);
        Animal lion2 = new Lion("Leo", 8);

        zoo.addAnimal(lion1);
        zoo.addAnimal(lion2);

        zoo.sortAnimalsByName();

        for (Animal animal : zoo.getAnimals()) {
            System.out.println(animal);
            System.out.println(animal.makeSound());
        }

        System.out.println("Older than 6:");
        System.out.println(zoo.findAnimalsOlderThan(6));
    }
}