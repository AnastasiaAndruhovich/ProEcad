package by.andruhovich.proecad.entity;

import by.andruhovich.proecad.type.PlacedType;

import java.util.Objects;

public class OtherOutline {
    private String outlineIdentifier;
    private float extrudeThickness;
    private PlacedType placedType;
    private Data data;

    public OtherOutline(String outlineIdentifier, float extrudeThickness, PlacedType placedType, Data data) {
        this.outlineIdentifier = outlineIdentifier;
        this.extrudeThickness = extrudeThickness;
        this.placedType = placedType;
        this.data = data;
    }

    public String getOutlineIdentifier() {
        return outlineIdentifier;
    }

    public void setOutlineIdentifier(String outlineIdentifier) {
        this.outlineIdentifier = outlineIdentifier;
    }

    public float getExtrudeThickness() {
        return extrudeThickness;
    }

    public void setExtrudeThickness(float extrudeThickness) {
        this.extrudeThickness = extrudeThickness;
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
        if (!(o instanceof OtherOutline)) return false;
        OtherOutline that = (OtherOutline) o;
        return Float.compare(that.getExtrudeThickness(), getExtrudeThickness()) == 0 &&
                Objects.equals(getOutlineIdentifier(), that.getOutlineIdentifier()) &&
                getPlacedType() == that.getPlacedType() &&
                Objects.equals(getData(), that.getData());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getOutlineIdentifier(), getExtrudeThickness(), getPlacedType(), getData());
    }

    @Override
    public String toString() {
        return "OtherOutline{" +
                "outlineIdentifier='" + outlineIdentifier + '\'' +
                ", extrudeThickness=" + extrudeThickness +
                ", placedType=" + placedType +
                ", data=" + data +
                '}';
    }
}
