package com.beiwosi.guangzhou.modal.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "evaluate", schema = "guangzhou", catalog = "")
public class EvaluateEntity {
    private int id;
    private Integer goodsId;
    private Integer orderid;
    private String openid;
    private String username;
    private String avatarUrl;
    private String desc;
    private String shopGrade;
    private String senderGrade;
    private Long createTime;
    private int isDelete;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "goods_id")
    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    @Basic
    @Column(name = "orderid")
    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    @Basic
    @Column(name = "openid")
    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
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
    @Column(name = "avatarUrl")
    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    @Basic
    @Column(name = "desc")
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Basic
    @Column(name = "shop_grade")
    public String getShopGrade() {
        return shopGrade;
    }

    public void setShopGrade(String shopGrade) {
        this.shopGrade = shopGrade;
    }

    @Basic
    @Column(name = "sender_grade")
    public String getSenderGrade() {
        return senderGrade;
    }

    public void setSenderGrade(String senderGrade) {
        this.senderGrade = senderGrade;
    }

    @Basic
    @Column(name = "create_time")
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "is_delete")
    public int getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(int isDelete) {
        this.isDelete = isDelete;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EvaluateEntity that = (EvaluateEntity) o;
        return id == that.id &&
                isDelete == that.isDelete &&
                Objects.equals(goodsId, that.goodsId) &&
                Objects.equals(orderid, that.orderid) &&
                Objects.equals(openid, that.openid) &&
                Objects.equals(username, that.username) &&
                Objects.equals(avatarUrl, that.avatarUrl) &&
                Objects.equals(desc, that.desc) &&
                Objects.equals(shopGrade, that.shopGrade) &&
                Objects.equals(senderGrade, that.senderGrade) &&
                Objects.equals(createTime, that.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, goodsId, orderid, openid, username, avatarUrl, desc, shopGrade, senderGrade, createTime, isDelete);
    }
}
