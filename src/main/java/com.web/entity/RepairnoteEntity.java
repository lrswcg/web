package com.web.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by cnhhdn on 2016/6/25.
 */
@Entity
@Table(name = "repairnote", schema = "demo", catalog = "")
public class RepairnoteEntity {
    private int id;
    private String repairId;
    private String repairMan;
    private String checkNote;
    private String repairNote;
    private Date checkTime;
    private String workLoad;
    private String usedDevice;
    private String repairStatus;

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
    @Column(name = "repairMan", nullable = true, length = 255)
    public String getRepairMan() {
        return repairMan;
    }

    public void setRepairMan(String repairMan) {
        this.repairMan = repairMan;
    }

    @Basic
    @Column(name = "checkNote", nullable = true, length = 255)
    public String getCheckNote() {
        return checkNote;
    }

    public void setCheckNote(String checkNote) {
        this.checkNote = checkNote;
    }

    @Basic
    @Column(name = "repairNote", nullable = true, length = 255)
    public String getRepairNote() {
        return repairNote;
    }

    public void setRepairNote(String repairNote) {
        this.repairNote = repairNote;
    }

    @Basic
    @Column(name = "checkTime", nullable = true)
    public Date getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(Date checkTime) {
        this.checkTime = checkTime;
    }

    @Basic
    @Column(name = "workLoad", nullable = true, length = 255)
    public String getWorkLoad() {
        return workLoad;
    }

    public void setWorkLoad(String workLoad) {
        this.workLoad = workLoad;
    }

    @Basic
    @Column(name = "usedDevice", nullable = true, length = 255)
    public String getUsedDevice() {
        return usedDevice;
    }

    public void setUsedDevice(String usedDevice) {
        this.usedDevice = usedDevice;
    }

    @Basic
    @Column(name = "repairStatus", nullable = false, length = 255)
    public String getRepairStatus() {
        return repairStatus;
    }

    public void setRepairStatus(String repairStatus) {
        this.repairStatus = repairStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RepairnoteEntity that = (RepairnoteEntity) o;

        if (id != that.id) return false;
        if (repairId != null ? !repairId.equals(that.repairId) : that.repairId != null) return false;
        if (repairMan != null ? !repairMan.equals(that.repairMan) : that.repairMan != null) return false;
        if (checkNote != null ? !checkNote.equals(that.checkNote) : that.checkNote != null) return false;
        if (repairNote != null ? !repairNote.equals(that.repairNote) : that.repairNote != null) return false;
        if (checkTime != null ? !checkTime.equals(that.checkTime) : that.checkTime != null) return false;
        if (workLoad != null ? !workLoad.equals(that.workLoad) : that.workLoad != null) return false;
        if (usedDevice != null ? !usedDevice.equals(that.usedDevice) : that.usedDevice != null) return false;
        if (repairStatus != null ? !repairStatus.equals(that.repairStatus) : that.repairStatus != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (repairId != null ? repairId.hashCode() : 0);
        result = 31 * result + (repairMan != null ? repairMan.hashCode() : 0);
        result = 31 * result + (checkNote != null ? checkNote.hashCode() : 0);
        result = 31 * result + (repairNote != null ? repairNote.hashCode() : 0);
        result = 31 * result + (checkTime != null ? checkTime.hashCode() : 0);
        result = 31 * result + (workLoad != null ? workLoad.hashCode() : 0);
        result = 31 * result + (usedDevice != null ? usedDevice.hashCode() : 0);
        result = 31 * result + (repairStatus != null ? repairStatus.hashCode() : 0);
        return result;
    }
}
