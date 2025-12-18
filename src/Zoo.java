public class Zoo {
    private String zooName;
    private int animalCount;

    public Zoo(String zooName, int animalCount) {
        this.zooName = zooName;
        this.animalCount = animalCount;
    }

    public String getZooName() {
        return zooName;
    }

    public int getAnimalCount() {
        return animalCount;
    }

    public void setAnimalCount(int animalCount) {
        this.animalCount = animalCount;
    }

    @Override
    public String toString() {
        return "Zoo{name='" + zooName + "', animalCount=" + animalCount + "}";
    }
}
