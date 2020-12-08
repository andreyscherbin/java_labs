package com.bsuir.voznyak.model;

import java.util.Objects;

public class Brain extends HeadOrgan {

    private int efficiency;

    public Brain(int mass, int efficiency) {
        super(mass);
        this.efficiency = efficiency;
    }

    public int getEfficiency() {
        return efficiency;
    }

    public void setEfficiency(int efficiency) {
        this.efficiency = efficiency;
    }

    @Override
    public String function() {
        return "";
    }

    @Override
    public void setMass(int mass) {
        super.setMass(mass);
    }

    @Override
    public int getMass() {
        return super.getMass();
    }

    public String controlOrgan(Organ organ) {

        return organ.function();

    }

    public boolean acceptDataFromOrgans() {
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Brain)) return false;
        if (!super.equals(o)) return false;
        Brain brain = (Brain) o;
        return getEfficiency() == brain.getEfficiency();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getEfficiency());
    }

    @Override
    public String toString() {
        return "Brain{" +
                "efficiency=" + efficiency +
                '}';
    }
}
