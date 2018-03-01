package by.andruhovich.proecad.entity;

import by.andruhovich.proecad.type.OutlineOwnerType;
import by.andruhovich.proecad.type.PlacedType;

import java.util.Objects;

public class PlacementKeepout extends Section {
    private PlacedType placedType;
    private float keepoutHeight;
    private Data data;

    public PlacementKeepout(String startHeader, OutlineOwnerType outlineOwnerType, String endHeader, PlacedType placedType, float keepoutHeight, Data data) {
        super(startHeader, outlineOwnerType, endHeader);
        this.placedType = placedType;
        this.keepoutHeight = keepoutHeight;
        this.data = data;
    }

    public PlacedType getPlacedType() {
        return placedType;
    }

    public void setPlacedType(PlacedType placedType) {
        this.placedType = placedType;
    }

    public float getKeepoutHeight() {
        return keepoutHeight;
    }

    public void setKeepoutHeight(float keepoutHeight) {
        this.keepoutHeight = keepoutHeight;
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
        if (!(o instanceof PlacementKeepout)) return false;
        if (!super.equals(o)) return false;
        PlacementKeepout that = (PlacementKeepout) o;
        return Float.compare(that.getKeepoutHeight(), getKeepoutHeight()) == 0 &&
                getPlacedType() == that.getPlacedType() &&
                Objects.equals(getData(), that.getData());
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), getPlacedType(), getKeepoutHeight(), getData());
    }

    @Override
    public String toString() {
        return "PlacementKeepout{" +
                "placedType=" + placedType +
                ", keepoutHeight=" + keepoutHeight +
                ", data=" + data +
                '}';
    }
}
