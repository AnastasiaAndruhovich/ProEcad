package by.andruhovich.proecad.entity.impl;

import by.andruhovich.proecad.entity.Data;
import by.andruhovich.proecad.entity.Section;
import by.andruhovich.proecad.type.OutlineOwnerType;

import java.util.ArrayList;
import java.util.Objects;

public class BoardSection extends Section {
    private float thickness;
    private ArrayList<Data> data;

    public BoardSection(String startHeader, OutlineOwnerType outlineOwnerType, String endHeader, float thickness, ArrayList<Data> data) {
        super(startHeader, outlineOwnerType, endHeader);
        this.thickness = thickness;
        this.data = data;
    }

    public float getThickness() {
        return thickness;
    }

    public void setThickness(float thickness) {
        this.thickness = thickness;
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
        if (!(o instanceof BoardSection)) return false;
        if (!super.equals(o)) return false;
        BoardSection that = (BoardSection) o;
        return Float.compare(that.getThickness(), getThickness()) == 0 &&
                Objects.equals(getData(), that.getData());
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), getThickness(), getData());
    }

    @Override
    public String toString() {
        return "BoardSection{" +
                "thickness=" + thickness +
                ", data=" + data +
                '}';
    }
}
