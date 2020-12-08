package com.bsuir.voznyak.model;

import java.util.Objects;

public class Mouth extends HeadOrgan {

    private int size;
    private Stomach stomach;

    public void setStomach(Stomach stomach) {
        this.stomach = stomach;
    }

    public Stomach getStomach() {
        return stomach;
    }

    public Mouth(int mass, int size) {
        super(mass);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String function() {
        eat();
        passFood(10);
        return getInfoAboutTaste();
    }

    @Override
    public void setMass(int mass) {
        super.setMass(mass);
    }

    @Override
    public int getMass() {
        return super.getMass();
    }

    public boolean eat() {
        return true;
    }

    public boolean talk() {
        return true;
    }

    private String getInfoAboutTaste() {
        return "Вкусно";
    }

    private boolean passFood(int food) {
        stomach.getFood(food);
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Mouth)) return false;
        if (!super.equals(o)) return false;
        Mouth mouth = (Mouth) o;
        return getSize() == mouth.getSize() &&
                Objects.equals(getStomach(), mouth.getStomach());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getSize(), getStomach());
    }

    @Override
    public String toString() {
        return "Mouth{" +
                "size=" + size +
                ", stomach=" + stomach +
                '}';
    }
}
