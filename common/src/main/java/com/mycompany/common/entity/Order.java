package com.mycompany.common.entity;

import java.io.Serializable;

public class Order implements Serializable {
    private int id;
    private int userId;
    private String orderInfo;

    public Order(int id, int userId, String orderInfo) {
        this.id = id;
        this.userId = userId;
        this.orderInfo = orderInfo;
    }
    public Order() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getOrderInfo() {
        return orderInfo;
    }

    public void setOrderInfo(String orderInfo) {
        this.orderInfo = orderInfo;
    }
}
