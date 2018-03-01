package by.andruhovich.proecad.entity;

import by.andruhovich.proecad.type.OutlineOwnerType;

import java.util.Objects;

public abstract class Section {
    private String startHeader;
    private OutlineOwnerType outlineOwnerType;
    private String endHeader;

    public Section(String startHeader, OutlineOwnerType outlineOwnerType, String endHeader) {
        this.startHeader = startHeader;
        this.outlineOwnerType = outlineOwnerType;
        this.endHeader = endHeader;
    }

    public String getStartHeader() {
        return startHeader;
    }

    public void setStartHeader(String startHeader) {
        this.startHeader = startHeader;
    }

    public OutlineOwnerType getOutlineOwnerType() {
        return outlineOwnerType;
    }

    public void setOutlineOwnerType(OutlineOwnerType outlineOwnerType) {
        this.outlineOwnerType = outlineOwnerType;
    }

    public String getEndHeader() {
        return endHeader;
    }

    public void setEndHeader(String endHeader) {
        this.endHeader = endHeader;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Section)) return false;
        Section section = (Section) o;
        return Objects.equals(getStartHeader(), section.getStartHeader()) &&
                getOutlineOwnerType() == section.getOutlineOwnerType() &&
                Objects.equals(getEndHeader(), section.getEndHeader());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getStartHeader(), getOutlineOwnerType(), getEndHeader());
    }

    @Override
    public String toString() {
        return "Section{" +
                "startHeader='" + startHeader + '\'' +
                ", outlineOwnerType=" + outlineOwnerType +
                ", endHeader='" + endHeader + '\'' +
                '}';
    }
}
