package com.web.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by cnhhdn on 2016/6/25.
 */
@Entity
@Table(name = "storepart", schema = "demo", catalog = "")
public class StorepartEntity {
    private int id;
    private String partName;
    private String partType;
    private String partNumber;
    private String partPrice;
    private Date inTime;
    private String deadLine;
    private String storeStatus;

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
    @Column(name = "inTime", nullable = true)
    public Date getInTime() {
        return inTime;
    }

    public void setInTime(Date inTime) {
        this.inTime = inTime;
    }

    @Basic
    @Column(name = "deadLine", nullable = true, length = 11)
    public String getDeadLine() {
        return deadLine;
    }

    public void setDeadLine(String deadLine) {
        this.deadLine = deadLine;
    }

    @Basic
    @Column(name = "storeStatus", nullable = true, length = 11)
    public String getStoreStatus() {
        return storeStatus;
    }

    public void setStoreStatus(String storeStatus) {
        this.storeStatus = storeStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StorepartEntity that = (StorepartEntity) o;

        if (id != that.id) return false;
        if (partName != null ? !partName.equals(that.partName) : that.partName != null) return false;
        if (partType != null ? !partType.equals(that.partType) : that.partType != null) return false;
        if (partNumber != null ? !partNumber.equals(that.partNumber) : that.partNumber != null) return false;
        if (partPrice != null ? !partPrice.equals(that.partPrice) : that.partPrice != null) return false;
        if (inTime != null ? !inTime.equals(that.inTime) : that.inTime != null) return false;
        if (deadLine != null ? !deadLine.equals(that.deadLine) : that.deadLine != null) return false;
        if (storeStatus != null ? !storeStatus.equals(that.storeStatus) : that.storeStatus != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (partName != null ? partName.hashCode() : 0);
        result = 31 * result + (partType != null ? partType.hashCode() : 0);
        result = 31 * result + (partNumber != null ? partNumber.hashCode() : 0);
        result = 31 * result + (partPrice != null ? partPrice.hashCode() : 0);
        result = 31 * result + (inTime != null ? inTime.hashCode() : 0);
        result = 31 * result + (deadLine != null ? deadLine.hashCode() : 0);
        result = 31 * result + (storeStatus != null ? storeStatus.hashCode() : 0);
        return result;
    }
}
