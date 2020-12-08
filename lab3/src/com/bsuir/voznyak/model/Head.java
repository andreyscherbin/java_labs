package com.bsuir.voznyak.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Head {

    List<HeadOrgan> listOrgans = new ArrayList<HeadOrgan>();

    public Head(List<HeadOrgan> listOrgans) {
        this.listOrgans = listOrgans;
    }

    public List<HeadOrgan> getListOrgans() {
        return listOrgans;
    }

    public void setListOrgans(List<HeadOrgan> listOrgans) {
        this.listOrgans = listOrgans;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Head head = (Head) o;
        return Objects.equals(listOrgans, head.listOrgans);
    }

    @Override
    public int hashCode() {
        return Objects.hash(listOrgans);
    }

    @Override
    public String toString() {
        return "Head{" +
                "listOrgans=" + listOrgans +
                '}';
    }
}
