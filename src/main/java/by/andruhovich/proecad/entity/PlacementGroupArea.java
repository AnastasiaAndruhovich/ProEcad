package by.andruhovich.proecad.entity;

import by.andruhovich.proecad.type.PlacedType;

import java.util.Objects;

public class PlacementGroupArea {
    private PlacedType placedType;
    private String componentGroupName;
    private Data data;

    public PlacementGroupArea(PlacedType placedType, String componentGroupName, Data data) {
        this.placedType = placedType;
        this.componentGroupName = componentGroupName;
        this.data = data;
    }

    public PlacedType getPlacedType() {
        return placedType;
    }

    public void setPlacedType(PlacedType placedType) {
        this.placedType = placedType;
    }

    public String getComponentGroupName() {
        return componentGroupName;
    }

    public void setComponentGroupName(String componentGroupName) {
        this.componentGroupName = componentGroupName;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PlacementGroupArea)) return false;
        PlacementGroupArea that = (PlacementGroupArea) o;
        return getPlacedType() == that.getPlacedType() &&
                Objects.equals(getComponentGroupName(), that.getComponentGroupName()) &&
                Objects.equals(getData(), that.getData());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getPlacedType(), getComponentGroupName(), getData());
    }

    @Override
    public String toString() {
        return "PlacementGroupArea{" +
                "placedType=" + placedType +
                ", componentGroupName='" + componentGroupName + '\'' +
                ", data=" + data +
                '}';
    }
}
