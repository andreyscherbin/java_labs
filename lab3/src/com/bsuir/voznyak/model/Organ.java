package com.bsuir.voznyak.model;

public abstract class Organ {

    private int mass;

    public Organ(int mass) {
        this.mass = mass;
    }

    public abstract String function();

    public void setMass(int mass) {
        this.mass = mass;
    }

    public int getMass() {
        return mass;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Organ organ = (Organ) o;
        return mass == organ.mass;
    }

    @Override
    public int hashCode() {

        final int prime = 31;
        int result = 1;
        result = prime * result + mass;

        return result;
    }

    @Override
    public String toString() {
        return "Organ{" +
                "mass=" + mass +
                '}';
    }
}
