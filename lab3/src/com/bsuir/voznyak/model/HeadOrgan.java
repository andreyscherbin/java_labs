package com.bsuir.voznyak.model;

public abstract class HeadOrgan extends Organ {

    public HeadOrgan(int mass) {
        super(mass);
    }

    public abstract String function();

    @Override
    public void setMass(int mass) {
        super.setMass(mass);
    }

    @Override
    public int getMass() {
        return super.getMass();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
