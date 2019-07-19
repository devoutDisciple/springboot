package com.beiwosi.guangzhou.modal.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "order", schema = "guangzhou", catalog = "")
@IdClass(OrderEntityPK.class)
public class OrderEntity {
    private int id;
    private String openid;
    private String orderList;
    private String desc;
    private Integer totalPrice;
    private Integer discountPrice;
    private Long orderTime;
    private String status;
    private Integer isDelete;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    @Column(name = "order_list")
    public String getOrderList() {
        return orderList;
    }

    public void setOrderList(String orderList) {
        this.orderList = orderList;
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
    @Column(name = "total_price")
    public Integer getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Integer totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Basic
    @Column(name = "discount_price")
    public Integer getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(Integer discountPrice) {
        this.discountPrice = discountPrice;
    }

    @Basic
    @Column(name = "order_time")
    public Long getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Long orderTime) {
        this.orderTime = orderTime;
    }

    @Id
    @Column(name = "status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "is_delete")
    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderEntity that = (OrderEntity) o;
        return id == that.id &&
                Objects.equals(openid, that.openid) &&
                Objects.equals(orderList, that.orderList) &&
                Objects.equals(desc, that.desc) &&
                Objects.equals(totalPrice, that.totalPrice) &&
                Objects.equals(discountPrice, that.discountPrice) &&
                Objects.equals(orderTime, that.orderTime) &&
                Objects.equals(status, that.status) &&
                Objects.equals(isDelete, that.isDelete);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, openid, orderList, desc, totalPrice, discountPrice, orderTime, status, isDelete);
    }
}
