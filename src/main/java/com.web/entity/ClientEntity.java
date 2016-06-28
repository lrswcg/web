package com.web.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.Collection;
import java.util.List;

/**
 * Created by cnhhdn on 2016/6/27.
 */
@Entity
@Table(name = "client", schema = "demo", catalog = "")
public class ClientEntity {
    private Integer clientId;
    private String idCard;
    private Date addTime;
    private String imgUrl;
    private String clientType;
    private String workPlace;
    private String phoneNumber;
    private String telephoneNumber;
    private String address;
    private String postCode;
    private String contact;
    private String email;
    private Integer repairId;
    private List<DeviceEntity> devicesByClientId;

    @Id
    @Column(name = "clientId", nullable = false)
    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }



    @Basic
    @Column(name = "idCard", nullable = false, length = 18)
    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
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
    @Column(name = "imgUrl", nullable = true, length = 255)
    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    @Basic
    @Column(name = "clientType", nullable = true, length = 255)
    public String getClientType() {
        return clientType;
    }

    public void setClientType(String clientType) {
        this.clientType = clientType;
    }

    @Basic
    @Column(name = "workPlace", nullable = true, length = 255)
    public String getWorkPlace() {
        return workPlace;
    }

    public void setWorkPlace(String workPlace) {
        this.workPlace = workPlace;
    }

    @Basic
    @Column(name = "phoneNumber", nullable = true, length = 11)
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Basic
    @Column(name = "telephoneNumber", nullable = true, length = 11)
    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    @Basic
    @Column(name = "address", nullable = true, length = 255)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "postCode", nullable = true, length = 11)
    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    @Basic
    @Column(name = "contact", nullable = true, length = 255)
    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    @Basic
    @Column(name = "email", nullable = true, length = 255)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "repairId", nullable = true)
    public Integer getRepairId() {
        return repairId;
    }

    public void setRepairId(Integer repairId) {
        this.repairId = repairId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ClientEntity that = (ClientEntity) o;

        if (clientId != that.clientId) return false;
        if (idCard != null ? !idCard.equals(that.idCard) : that.idCard != null) return false;
        if (addTime != null ? !addTime.equals(that.addTime) : that.addTime != null) return false;
        if (imgUrl != null ? !imgUrl.equals(that.imgUrl) : that.imgUrl != null) return false;
        if (clientType != null ? !clientType.equals(that.clientType) : that.clientType != null) return false;
        if (workPlace != null ? !workPlace.equals(that.workPlace) : that.workPlace != null) return false;
        if (phoneNumber != null ? !phoneNumber.equals(that.phoneNumber) : that.phoneNumber != null) return false;
        if (telephoneNumber != null ? !telephoneNumber.equals(that.telephoneNumber) : that.telephoneNumber != null)
            return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (postCode != null ? !postCode.equals(that.postCode) : that.postCode != null) return false;
        if (contact != null ? !contact.equals(that.contact) : that.contact != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (repairId != null ? !repairId.equals(that.repairId) : that.repairId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = clientId;
        result = 31 * result + (idCard != null ? idCard.hashCode() : 0);
        result = 31 * result + (addTime != null ? addTime.hashCode() : 0);
        result = 31 * result + (imgUrl != null ? imgUrl.hashCode() : 0);
        result = 31 * result + (clientType != null ? clientType.hashCode() : 0);
        result = 31 * result + (workPlace != null ? workPlace.hashCode() : 0);
        result = 31 * result + (phoneNumber != null ? phoneNumber.hashCode() : 0);
        result = 31 * result + (telephoneNumber != null ? telephoneNumber.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (postCode != null ? postCode.hashCode() : 0);
        result = 31 * result + (contact != null ? contact.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (repairId != null ? repairId.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "clientByClientId",fetch = FetchType.EAGER)
    public List<DeviceEntity> getDevicesByClientId() {
        return devicesByClientId;
    }

    public void setDevicesByClientId(List<DeviceEntity> devicesByClientId) {
        this.devicesByClientId = devicesByClientId;
    }

    @Override
    public String toString() {
        return "ClientEntity{" +
                "clientId=" + clientId +
                ", idCard='" + idCard + '\'' +
                ", addTime=" + addTime +
                ", imgUrl='" + imgUrl + '\'' +
                ", clientType='" + clientType + '\'' +
                ", workPlace='" + workPlace + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", telephoneNumber='" + telephoneNumber + '\'' +
                ", address='" + address + '\'' +
                ", postCode='" + postCode + '\'' +
                ", contact='" + contact + '\'' +
                ", email='" + email + '\'' +
                ", repairId=" + repairId +
                '}';
    }
}
