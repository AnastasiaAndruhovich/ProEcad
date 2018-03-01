package by.andruhovich.proecad.entity;

import by.andruhovich.proecad.type.PlacedType;

import java.util.Objects;

public class Routing {
    private PlacedType placedType;
    private Data data;

    public Routing(PlacedType placedType, Data data) {
        this.placedType = placedType;
        this.data = data;
    }

    public PlacedType getPlacedType() {
        return placedType;
    }

    public void setPlacedType(PlacedType placedType) {
        this.placedType = placedType;
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
        if (!(o instanceof Routing)) return false;
        Routing routing = (Routing) o;
        return getPlacedType() == routing.getPlacedType() &&
                Objects.equals(getData(), routing.getData());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getPlacedType(), getData());
    }

    @Override
    public String toString() {
        return "Routing{" +
                "placedType=" + placedType +
                ", data=" + data +
                '}';
    }
}
