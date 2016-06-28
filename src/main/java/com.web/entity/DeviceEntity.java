package com.web.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by cnhhdn on 2016/6/27.
 */
@Entity
@Table(name = "device", schema = "demo", catalog = "")
public class DeviceEntity {
    private int repairId;
    private int clientId;
    private String productType;
    private String deviceBrands;
    private String deviceModel;
    private String serialNumber;
    private String missPart;
    private String faultact;
    private String faultType;
    private String outCheck;
    private String openPassword;
    private String importantInfo;
    private String hdd;
    private String ram;
    private String pcCard;
    private String acAdapter;
    private String battery;
    private String cd;
    private String floppy;
    private String other;
    private Date addTime;
    private String tampPrice;
    private String repairStatus;
    private ClientEntity clientByClientId;

    @Id
    @Column(name = "repairId", nullable = false)
    public int getRepairId() {
        return repairId;
    }

    public void setRepairId(int repairId) {
        this.repairId = repairId;
    }

    @Basic
    @Column(name = "clientId", nullable = false ,insertable = false,updatable = false)
    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    @Basic
    @Column(name = "productType", nullable = false, length = 255)
    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    @Basic
    @Column(name = "deviceBrands", nullable = true, length = 255)
    public String getDeviceBrands() {
        return deviceBrands;
    }

    public void setDeviceBrands(String deviceBrands) {
        this.deviceBrands = deviceBrands;
    }

    @Basic
    @Column(name = "deviceModel", nullable = true, length = 255)
    public String getDeviceModel() {
        return deviceModel;
    }

    public void setDeviceModel(String deviceModel) {
        this.deviceModel = deviceModel;
    }

    @Basic
    @Column(name = "serialNumber", nullable = false, length = 255)
    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Basic
    @Column(name = "missPart", nullable = true, length = 255)
    public String getMissPart() {
        return missPart;
    }

    public void setMissPart(String missPart) {
        this.missPart = missPart;
    }

    @Basic
    @Column(name = "faultact", nullable = false, length = 1000)
    public String getFaultact() {
        return faultact;
    }

    public void setFaultact(String faultact) {
        this.faultact = faultact;
    }

    @Basic
    @Column(name = "faultType", nullable = false, length = 255)
    public String getFaultType() {
        return faultType;
    }

    public void setFaultType(String faultType) {
        this.faultType = faultType;
    }

    @Basic
    @Column(name = "outCheck", nullable = true, length = 255)
    public String getOutCheck() {
        return outCheck;
    }

    public void setOutCheck(String outCheck) {
        this.outCheck = outCheck;
    }

    @Basic
    @Column(name = "openPassword", nullable = true, length = 255)
    public String getOpenPassword() {
        return openPassword;
    }

    public void setOpenPassword(String openPassword) {
        this.openPassword = openPassword;
    }

    @Basic
    @Column(name = "importantInfo", nullable = true, length = 255)
    public String getImportantInfo() {
        return importantInfo;
    }

    public void setImportantInfo(String importantInfo) {
        this.importantInfo = importantInfo;
    }

    @Basic
    @Column(name = "HDD", nullable = true, length = 255)
    public String getHdd() {
        return hdd;
    }

    public void setHdd(String hdd) {
        this.hdd = hdd;
    }

    @Basic
    @Column(name = "RAM", nullable = true, length = 255)
    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    @Basic
    @Column(name = "pcCard", nullable = true, length = 255)
    public String getPcCard() {
        return pcCard;
    }

    public void setPcCard(String pcCard) {
        this.pcCard = pcCard;
    }

    @Basic
    @Column(name = "acAdapter", nullable = true, length = 255)
    public String getAcAdapter() {
        return acAdapter;
    }

    public void setAcAdapter(String acAdapter) {
        this.acAdapter = acAdapter;
    }

    @Basic
    @Column(name = "battery", nullable = true, length = 255)
    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    @Basic
    @Column(name = "CD", nullable = true, length = 255)
    public String getCd() {
        return cd;
    }

    public void setCd(String cd) {
        this.cd = cd;
    }

    @Basic
    @Column(name = "floppy", nullable = true, length = 255)
    public String getFloppy() {
        return floppy;
    }

    public void setFloppy(String floppy) {
        this.floppy = floppy;
    }

    @Basic
    @Column(name = "other", nullable = true, length = 1000)
    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    @Basic
    @Column(name = "addTime", nullable = true)
    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    @Basic
    @Column(name = "tampPrice", nullable = true, length = 11)
    public String getTampPrice() {
        return tampPrice;
    }

    public void setTampPrice(String tampPrice) {
        this.tampPrice = tampPrice;
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

        DeviceEntity that = (DeviceEntity) o;

        if (repairId != that.repairId) return false;
        if (clientId != that.clientId) return false;
        if (productType != null ? !productType.equals(that.productType) : that.productType != null) return false;
        if (deviceBrands != null ? !deviceBrands.equals(that.deviceBrands) : that.deviceBrands != null) return false;
        if (deviceModel != null ? !deviceModel.equals(that.deviceModel) : that.deviceModel != null) return false;
        if (serialNumber != null ? !serialNumber.equals(that.serialNumber) : that.serialNumber != null) return false;
        if (missPart != null ? !missPart.equals(that.missPart) : that.missPart != null) return false;
        if (faultact != null ? !faultact.equals(that.faultact) : that.faultact != null) return false;
        if (faultType != null ? !faultType.equals(that.faultType) : that.faultType != null) return false;
        if (outCheck != null ? !outCheck.equals(that.outCheck) : that.outCheck != null) return false;
        if (openPassword != null ? !openPassword.equals(that.openPassword) : that.openPassword != null) return false;
        if (importantInfo != null ? !importantInfo.equals(that.importantInfo) : that.importantInfo != null)
            return false;
        if (hdd != null ? !hdd.equals(that.hdd) : that.hdd != null) return false;
        if (ram != null ? !ram.equals(that.ram) : that.ram != null) return false;
        if (pcCard != null ? !pcCard.equals(that.pcCard) : that.pcCard != null) return false;
        if (acAdapter != null ? !acAdapter.equals(that.acAdapter) : that.acAdapter != null) return false;
        if (battery != null ? !battery.equals(that.battery) : that.battery != null) return false;
        if (cd != null ? !cd.equals(that.cd) : that.cd != null) return false;
        if (floppy != null ? !floppy.equals(that.floppy) : that.floppy != null) return false;
        if (other != null ? !other.equals(that.other) : that.other != null) return false;
        if (addTime != null ? !addTime.equals(that.addTime) : that.addTime != null) return false;
        if (tampPrice != null ? !tampPrice.equals(that.tampPrice) : that.tampPrice != null) return false;
        if (repairStatus != null ? !repairStatus.equals(that.repairStatus) : that.repairStatus != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = repairId;
        result = 31 * result + clientId;
        result = 31 * result + (productType != null ? productType.hashCode() : 0);
        result = 31 * result + (deviceBrands != null ? deviceBrands.hashCode() : 0);
        result = 31 * result + (deviceModel != null ? deviceModel.hashCode() : 0);
        result = 31 * result + (serialNumber != null ? serialNumber.hashCode() : 0);
        result = 31 * result + (missPart != null ? missPart.hashCode() : 0);
        result = 31 * result + (faultact != null ? faultact.hashCode() : 0);
        result = 31 * result + (faultType != null ? faultType.hashCode() : 0);
        result = 31 * result + (outCheck != null ? outCheck.hashCode() : 0);
        result = 31 * result + (openPassword != null ? openPassword.hashCode() : 0);
        result = 31 * result + (importantInfo != null ? importantInfo.hashCode() : 0);
        result = 31 * result + (hdd != null ? hdd.hashCode() : 0);
        result = 31 * result + (ram != null ? ram.hashCode() : 0);
        result = 31 * result + (pcCard != null ? pcCard.hashCode() : 0);
        result = 31 * result + (acAdapter != null ? acAdapter.hashCode() : 0);
        result = 31 * result + (battery != null ? battery.hashCode() : 0);
        result = 31 * result + (cd != null ? cd.hashCode() : 0);
        result = 31 * result + (floppy != null ? floppy.hashCode() : 0);
        result = 31 * result + (other != null ? other.hashCode() : 0);
        result = 31 * result + (addTime != null ? addTime.hashCode() : 0);
        result = 31 * result + (tampPrice != null ? tampPrice.hashCode() : 0);
        result = 31 * result + (repairStatus != null ? repairStatus.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "clientId", referencedColumnName = "clientId", nullable = false)
    public ClientEntity getClientByClientId() {
        return clientByClientId;
    }

    public void setClientByClientId(ClientEntity clientByClientId) {
        this.clientByClientId = clientByClientId;
    }

    @Override
    public String toString() {
        return "DeviceEntity{" +
                "repairId=" + repairId +
                ", clientId=" + clientId +
                ", productType='" + productType + '\'' +
                ", deviceBrands='" + deviceBrands + '\'' +
                ", deviceModel='" + deviceModel + '\'' +
                ", serialNumber='" + serialNumber + '\'' +
                ", missPart='" + missPart + '\'' +
                ", faultact='" + faultact + '\'' +
                ", faultType='" + faultType + '\'' +
                ", outCheck='" + outCheck + '\'' +
                ", openPassword='" + openPassword + '\'' +
                ", importantInfo='" + importantInfo + '\'' +
                ", hdd='" + hdd + '\'' +
                ", ram='" + ram + '\'' +
                ", pcCard='" + pcCard + '\'' +
                ", acAdapter='" + acAdapter + '\'' +
                ", battery='" + battery + '\'' +
                ", cd='" + cd + '\'' +
                ", floppy='" + floppy + '\'' +
                ", other='" + other + '\'' +
                ", addTime=" + addTime +
                ", tampPrice='" + tampPrice + '\'' +
                ", repairStatus='" + repairStatus + '\'' +
                '}';
    }
}
