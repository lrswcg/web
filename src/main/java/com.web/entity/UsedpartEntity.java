package com.web.entity;

import javax.persistence.*;

/**
 * Created by cnhhdn on 2016/6/25.
 */
@Entity
@Table(name = "usedpart", schema = "demo", catalog = "")
public class UsedpartEntity {
    private int id;
    private String partName;
    private String partType;
    private String repairId;
    private String partNumber;
    private String partPrice;
    private String outTime;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "partName", nullable = false, length = 255)
    public String getPartName() {
        return partName;
    }

    public void setPartName(String partName) {
        this.partName = partName;
    }

    @Basic
    @Column(name = "partType", nullable = false, length = 255)
    public String getPartType() {
        return partType;
    }

    public void setPartType(String partType) {
        this.partType = partType;
    }

    @Basic
    @Column(name = "repairId", nullable = false, length = 11)
    public String getRepairId() {
        return repairId;
    }

    public void setRepairId(String repairId) {
        this.repairId = repairId;
    }

    @Basic
    @Column(name = "partNumber", nullable = true, length = 11)
    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    @Basic
    @Column(name = "partPrice", nullable = true, length = 11)
    public String getPartPrice() {
        return partPrice;
    }

    public void setPartPrice(String partPrice) {
        this.partPrice = partPrice;
    }

    @Basic
    @Column(name = "outTime", nullable = true, length = 255)
    public String getOutTime() {
        return outTime;
    }

    public void setOutTime(String outTime) {
        this.outTime = outTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UsedpartEntity that = (UsedpartEntity) o;

        if (id != that.id) return false;
        if (partName != null ? !partName.equals(that.partName) : that.partName != null) return false;
        if (partType != null ? !partType.equals(that.partType) : that.partType != null) return false;
        if (repairId != null ? !repairId.equals(that.repairId) : that.repairId != null) return false;
        if (partNumber != null ? !partNumber.equals(that.partNumber) : that.partNumber != null) return false;
        if (partPrice != null ? !partPrice.equals(that.partPrice) : that.partPrice != null) return false;
        if (outTime != null ? !outTime.equals(that.outTime) : that.outTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (partName != null ? partName.hashCode() : 0);
        result = 31 * result + (partType != null ? partType.hashCode() : 0);
        result = 31 * result + (repairId != null ? repairId.hashCode() : 0);
        result = 31 * result + (partNumber != null ? partNumber.hashCode() : 0);
        result = 31 * result + (partPrice != null ? partPrice.hashCode() : 0);
        result = 31 * result + (outTime != null ? outTime.hashCode() : 0);
        return result;
    }
}
