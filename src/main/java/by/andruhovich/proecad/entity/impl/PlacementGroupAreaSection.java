package by.andruhovich.proecad.entity.impl;

import by.andruhovich.proecad.entity.PlacementGroupArea;
import by.andruhovich.proecad.entity.Section;
import by.andruhovich.proecad.type.OutlineOwnerType;

import java.util.ArrayList;
import java.util.Objects;

public class PlacementGroupAreaSection extends Section {
    private ArrayList<PlacementGroupArea> data;

    public PlacementGroupAreaSection(String startHeader, OutlineOwnerType outlineOwnerType, String endHeader, ArrayList<PlacementGroupArea> data) {
        super(startHeader, outlineOwnerType, endHeader);
        this.data = data;
    }

    public ArrayList<PlacementGroupArea> getData() {
        return data;
    }

    public void setData(ArrayList<PlacementGroupArea> data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PlacementGroupAreaSection)) return false;
        if (!super.equals(o)) return false;
        PlacementGroupAreaSection that = (PlacementGroupAreaSection) o;
        return Objects.equals(getData(), that.getData());
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), getData());
    }

    @Override
    public String toString() {
        return "PlacementGroupAreaSection{" +
                "data=" + data +
                '}';
    }
}
