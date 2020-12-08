package com.bsuir.voznyak.model;

import java.util.Objects;

public class Nose extends HeadOrgan {

    private String shape;

    public Nose(int mass, String shape) {
        super(mass);
        this.shape = shape;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    @Override
    public String function() {
        return sniff();
    }

    @Override
    public void setMass(int mass) {
        super.setMass(mass);
    }

    @Override
    public int getMass() {
        return super.getMass();
    }

    public String sniff() {
        return "Приятный запах";
    }

    public String itch() {
        return "Приятно";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Nose)) return false;
        if (!super.equals(o)) return false;
        Nose nose = (Nose) o;
        return Objects.equals(getShape(), nose.getShape());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getShape());
    }

    @Override
    public String toString() {
        return "Nose{" +
                "shape='" + shape + '\'' +
                '}';
    }
}
