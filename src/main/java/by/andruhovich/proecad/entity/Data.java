package by.andruhovich.proecad.entity;

import java.util.Objects;

public class Data {
    private int loopLabel;
    Coordinate coordinate;
    float degree;

    public Data(int loopLabel, Coordinate coordinate, float degree) {
        this.loopLabel = loopLabel;
        this.coordinate = coordinate;
        this.degree = degree;
    }

    public int getLoopLabel() {
        return loopLabel;
    }

    public void setLoopLabel(int loopLabel) {
        this.loopLabel = loopLabel;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(Coordinate coordinate) {
        this.coordinate = coordinate;
    }

    public float getDegree() {
        return degree;
    }

    public void setDegree(float degree) {
        this.degree = degree;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Data)) return false;
        Data data = (Data) o;
        return getLoopLabel() == data.getLoopLabel() &&
                Float.compare(data.getDegree(), getDegree()) == 0 &&
                Objects.equals(getCoordinate(), data.getCoordinate());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getLoopLabel(), getCoordinate(), getDegree());
    }

    @Override
    public String toString() {
        return "Data{" +
                "loopLabel=" + loopLabel +
                ", coordinate=" + coordinate +
                ", degree=" + degree +
                '}';
    }
}
