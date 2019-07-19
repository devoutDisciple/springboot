package com.beiwosi.guangzhou.modal.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "collection", schema = "guangzhou", catalog = "")
public class CollectionEntity {
    private int id;
    private Integer goodsId;
    private String openid;
    private String createTime;
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
    @Column(name = "goods_id")
    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
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
    @Column(name = "create_time")
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
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
        CollectionEntity that = (CollectionEntity) o;
        return id == that.id &&
                Objects.equals(goodsId, that.goodsId) &&
                Objects.equals(openid, that.openid) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(isDelete, that.isDelete);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, goodsId, openid, createTime, isDelete);
    }
}
