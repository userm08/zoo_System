public class Main {
    public static void main(String[] args) {


        Animal a1 = new Animal("Leo", "Lion", 5);
        Animal a2 = new Animal("Max", "Tiger", 3);

        Zookeeper zookeeper = new Zookeeper("John", 7);
        Zoo zoo = new Zoo("City Zoo", 2);

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(zookeeper);
        System.out.println(zoo);

        if (a1.getAge() > a2.getAge()) {
            System.out.println(a1.getName() + " is older than " + a2.getName());
        } else {
            System.out.println(a2.getName() + " is older than " + a1.getName());
        }
    }
}
