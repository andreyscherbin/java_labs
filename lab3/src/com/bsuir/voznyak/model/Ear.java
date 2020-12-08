package com.bsuir.voznyak.model;

import java.util.Objects;

public class Ear extends HeadOrgan {

    private boolean isPiercing;

    public Ear(int mass, boolean isPiercing) {
        super(mass);
        this.isPiercing = isPiercing;
    }

    public boolean isPiercing() {
        return isPiercing;
    }

    public void setPiercing(boolean piercing) {
        isPiercing = piercing;
    }

    @Override
    public String function() {
        return hear();
    }

    @Override
    public void setMass(int mass) {
        super.setMass(mass);
    }

    @Override
    public int getMass() {
        return super.getMass();
    }

    public String hear() {
        return "Шум";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ear)) return false;
        if (!super.equals(o)) return false;
        Ear ear = (Ear) o;
        return isPiercing() == ear.isPiercing();

    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), isPiercing());
    }

    @Override
    public String toString() {
        return "Ear{" +
                "isPiercing=" + isPiercing +
                '}';
    }
}
