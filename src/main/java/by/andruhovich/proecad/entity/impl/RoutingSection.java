package by.andruhovich.proecad.entity.impl;

import by.andruhovich.proecad.entity.Routing;
import by.andruhovich.proecad.entity.Section;
import by.andruhovich.proecad.type.OutlineOwnerType;

import java.util.ArrayList;
import java.util.Objects;

public class RoutingSection extends Section {
    private ArrayList<Routing> data;

    public RoutingSection(String startHeader, OutlineOwnerType outlineOwnerType, String endHeader, ArrayList<Routing> data) {
        super(startHeader, outlineOwnerType, endHeader);
        this.data = data;
    }

    public ArrayList<Routing> getData() {
        return data;
    }

    public void setData(ArrayList<Routing> data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RoutingSection)) return false;
        if (!super.equals(o)) return false;
        RoutingSection that = (RoutingSection) o;
        return Objects.equals(getData(), that.getData());
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), getData());
    }

    @Override
    public String toString() {
        return "RoutingSection{" +
                "data=" + data +
                '}';
    }
}
