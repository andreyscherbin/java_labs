package com.bsuir.voznyak.model;

import java.util.Objects;

public class Stomach extends BodyOrgan {

    private int capacity;

    public Stomach(int mass, int capacity) {
        super(mass);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String function() {
        digest();
        return "Успешно";
    }

    @Override
    public void setMass(int mass) {
        super.setMass(mass);
    }

    @Override
    public int getMass() {
        return super.getMass();
    }

    public boolean getFood(int food) {
        capacity += food;
        function();
        return true;
    }

    private boolean digest() {
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Stomach)) return false;
        if (!super.equals(o)) return false;
        Stomach stomach = (Stomach) o;
        return getCapacity() == stomach.getCapacity();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getCapacity());
    }

    @Override
    public String toString() {
        return "Stomach{" +
                "capacity=" + capacity +
                '}';
    }
}
