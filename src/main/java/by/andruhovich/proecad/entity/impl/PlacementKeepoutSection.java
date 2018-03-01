package by.andruhovich.proecad.entity.impl;

import by.andruhovich.proecad.entity.PlacementKeepout;
import by.andruhovich.proecad.entity.Section;
import by.andruhovich.proecad.type.OutlineOwnerType;

import java.util.ArrayList;
import java.util.Objects;

public class PlacementKeepoutSection extends Section {
    private ArrayList<PlacementKeepout> data;

    public PlacementKeepoutSection(String startHeader, OutlineOwnerType outlineOwnerType, String endHeader, ArrayList<PlacementKeepout> data) {
        super(startHeader, outlineOwnerType, endHeader);
        this.data = data;
    }

    public ArrayList<PlacementKeepout> getData() {
        return data;
    }

    public void setData(ArrayList<PlacementKeepout> data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PlacementKeepoutSection)) return false;
        if (!super.equals(o)) return false;
        PlacementKeepoutSection that = (PlacementKeepoutSection) o;
        return Objects.equals(getData(), that.getData());
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), getData());
    }

    @Override
    public String toString() {
        return "PlacementKeepoutSection{" +
                "data=" + data +
                '}';
    }
}

