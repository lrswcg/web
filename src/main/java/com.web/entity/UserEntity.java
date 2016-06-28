package com.web.entity;

import javax.persistence.*;

/**
 * Created by cnhhdn on 2016/6/27.
 */
@Entity
@Table(name = "user", schema = "demo")
public class UserEntity {
    private String username;
    private String password;
    private String userurl;
    private String auth;
    private int id;

    @Basic
    @Column(name = "username", nullable = false, length = 255)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "password", nullable = false, length = 255)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "userurl", nullable = false, length = 255)
    public String getUserurl() {
        return userurl;
    }

    public void setUserurl(String userurl) {
        this.userurl = userurl;
    }

    @Basic
    @Column(name = "auth", nullable = false, length = 255)
    public String getAuth() {
        return auth;
    }

    public void setAuth(String auth) {
        this.auth = auth;
    }


    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserEntity)) return false;

        UserEntity that = (UserEntity) o;

        if (getId() != that.getId()) return false;
        if (getUsername() != null ? !getUsername().equals(that.getUsername()) : that.getUsername() != null)
            return false;
        if (getPassword() != null ? !getPassword().equals(that.getPassword()) : that.getPassword() != null)
            return false;
        if (getUserurl() != null ? !getUserurl().equals(that.getUserurl()) : that.getUserurl() != null) return false;
        return getAuth() != null ? getAuth().equals(that.getAuth()) : that.getAuth() == null;

    }

    @Override
    public int hashCode() {
        int result = getUsername() != null ? getUsername().hashCode() : 0;
        result = 31 * result + (getPassword() != null ? getPassword().hashCode() : 0);
        result = 31 * result + (getUserurl() != null ? getUserurl().hashCode() : 0);
        result = 31 * result + (getAuth() != null ? getAuth().hashCode() : 0);
        result = 31 * result + getId();
        return result;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", userurl='" + userurl + '\'' +
                ", auth='" + auth + '\'' +
                ", id=" + id +
                '}';
    }
}
