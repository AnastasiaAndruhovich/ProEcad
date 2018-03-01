package by.andruhovich.proecad.entity.impl;

import by.andruhovich.proecad.entity.Data;
import by.andruhovich.proecad.entity.Section;
import by.andruhovich.proecad.type.OutlineOwnerType;

import java.util.ArrayList;
import java.util.Objects;

public class ViaKeepoutSection extends Section {
    private ArrayList<Data> data;

    public ViaKeepoutSection(String startHeader, OutlineOwnerType outlineOwnerType, String endHeader, ArrayList<Data> data) {
        super(startHeader, outlineOwnerType, endHeader);
        this.data = data;
    }

    public ArrayList<Data> getData() {
        return data;
    }

    public void setData(ArrayList<Data> data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ViaKeepoutSection)) return false;
        if (!super.equals(o)) return false;
        ViaKeepoutSection that = (ViaKeepoutSection) o;
        return Objects.equals(getData(), that.getData());
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), getData());
    }

    @Override
    public String toString() {
        return "ViaKeepoutSection{" +
                "data=" + data +
                '}';
    }
}
