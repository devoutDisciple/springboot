package com.beiwosi.guangzhou.modal.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "account", schema = "guangzhou")
public class AccountEntity {
    private int id;
    private String username;
    private String password;
    private int shopid;
    private Integer role;
    private String isDelete;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "shopid")
    public int getShopid() {
        return shopid;
    }

    public void setShopid(int shopid) {
        this.shopid = shopid;
    }

    @Basic
    @Column(name = "role")
    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    @Basic
    @Column(name = "is_delete")
    public String getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccountEntity that = (AccountEntity) o;
        return id == that.id &&
                shopid == that.shopid &&
                Objects.equals(username, that.username) &&
                Objects.equals(password, that.password) &&
                Objects.equals(role, that.role) &&
                Objects.equals(isDelete, that.isDelete);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, password, shopid, role, isDelete);
    }
}
