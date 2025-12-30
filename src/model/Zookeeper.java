package model;

import java.util.Objects;

public class Zookeeper {
    private String name;
    private int experienceYears;

    public Zookeeper(String name, int experienceYears) {
        this.name = name;
        this.experienceYears = experienceYears;
    }

    public String getName() {
        return name;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    @Override
    public String toString() {
        return "Zookeeper{name='" + name + "', experienceYears=" + experienceYears + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Zookeeper)) return false;
        Zookeeper that = (Zookeeper) o;
        return experienceYears == that.experienceYears &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, experienceYears);
    }
}
