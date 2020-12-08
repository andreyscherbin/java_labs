package com.bsuir.voznyak.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Body {

    List<BodyOrgan> listOrgans = new ArrayList<BodyOrgan>();

    public Body(List<BodyOrgan> listOrgans) {
        this.listOrgans = listOrgans;
    }

    public List<BodyOrgan> getListOrgans() {
        return listOrgans;
    }

    public void setListOrgans(List<BodyOrgan> listOrgans) {
        this.listOrgans = listOrgans;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Body)) return false;
        Body body = (Body) o;
        return Objects.equals(getListOrgans(), body.getListOrgans());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getListOrgans());
    }

    @Override
    public String toString() {
        return "Body{" +
                "listOrgans=" + listOrgans +
                '}';
    }
}
