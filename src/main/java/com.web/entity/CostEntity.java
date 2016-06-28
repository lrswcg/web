package com.web.entity;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by cnhhdn on 2016/6/26.
 */
@Entity
@Table(name = "cost", schema = "demo", catalog = "")
public class CostEntity {
    private int id;
    private String repairId;
    private int repairCost;
    private int partCost;
    private String warranty;
    private String notice;
    private Date calTime;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    @Column(name = "repairCost", nullable = false)
    public int getRepairCost() {
        return repairCost;
    }

    public void setRepairCost(int repairCost) {
        this.repairCost = repairCost;
    }

    @Basic
    @Column(name = "partCost;", nullable = false)
    public int getPartCost() {
        return partCost;
    }

    public void setPartCost(int partCost) {
        this.partCost = partCost;
    }

    @Basic
    @Column(name = "warranty", nullable = true, length = 255)
    public String getWarranty() {
        return warranty;
    }

    public void setWarranty(String warranty) {
        this.warranty = warranty;
    }

    @Basic
    @Column(name = "notice", nullable = true, length = 255)
    public String getNotice() {
        return notice;
    }

    public void setNotice(String notice) {
        this.notice = notice;
    }

    @Basic
    @Column(name = "calTime", nullable = true)
    public Date getCalTime() {
        return calTime;
    }

    public void setCalTime(Date calTime) {
        this.calTime = calTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CostEntity that = (CostEntity) o;

        if (id != that.id) return false;
        if (repairCost != that.repairCost) return false;
        if (partCost != that.partCost) return false;
        if (repairId != null ? !repairId.equals(that.repairId) : that.repairId != null) return false;
        if (warranty != null ? !warranty.equals(that.warranty) : that.warranty != null) return false;
        if (notice != null ? !notice.equals(that.notice) : that.notice != null) return false;
        if (calTime != null ? !calTime.equals(that.calTime) : that.calTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (repairId != null ? repairId.hashCode() : 0);
        result = 31 * result + repairCost;
        result = 31 * result + partCost;
        result = 31 * result + (warranty != null ? warranty.hashCode() : 0);
        result = 31 * result + (notice != null ? notice.hashCode() : 0);
        result = 31 * result + (calTime != null ? calTime.hashCode() : 0);
        return result;
    }
}
