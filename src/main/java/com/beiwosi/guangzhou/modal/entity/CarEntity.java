package com.beiwosi.guangzhou.modal.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "car", schema = "guangzhou", catalog = "")
public class CarEntity {
    private int id;
    private String openid;
    private int shopId;
    private Integer goodsId;
    private Integer num;
    private String createTime;
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
    @Column(name = "openid")
    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    @Basic
    @Column(name = "shop_id")
    public int getShopId() {
        return shopId;
    }

    public void setShopId(int shopId) {
        this.shopId = shopId;
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
    @Column(name = "num")
    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    @Basic
    @Column(name = "create_time")
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
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
        CarEntity carEntity = (CarEntity) o;
        return id == carEntity.id &&
                shopId == carEntity.shopId &&
                isDelete == carEntity.isDelete &&
                Objects.equals(openid, carEntity.openid) &&
                Objects.equals(goodsId, carEntity.goodsId) &&
                Objects.equals(num, carEntity.num) &&
                Objects.equals(createTime, carEntity.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, openid, shopId, goodsId, num, createTime, isDelete);
    }
}
