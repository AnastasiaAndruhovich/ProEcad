package by.andruhovich.proecad.entity.impl;

import by.andruhovich.proecad.entity.OtherOutline;
import by.andruhovich.proecad.entity.Section;
import by.andruhovich.proecad.type.OutlineOwnerType;

import java.util.ArrayList;
import java.util.Objects;

public class OtherOutlineSection extends Section {
    private ArrayList<OtherOutline> data;

    public OtherOutlineSection(String startHeader, OutlineOwnerType outlineOwnerType, String endHeader, ArrayList<OtherOutline> data) {
        super(startHeader, outlineOwnerType, endHeader);
        this.data = data;
    }

    public ArrayList<OtherOutline> getData() {
        return data;
    }

    public void setData(ArrayList<OtherOutline> data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OtherOutlineSection)) return false;
        if (!super.equals(o)) return false;
        OtherOutlineSection that = (OtherOutlineSection) o;
        return Objects.equals(getData(), that.getData());
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), getData());
    }

    @Override
    public String toString() {
        return "OtherOutlineSection{" +
                "data=" + data +
                '}';
    }
}
