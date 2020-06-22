package com.FourFashionShop.Models;

public class OrderModel {
    private String productName, OrderId, OrderDate;
    private int image;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getOrderId() {
        return OrderId;
    }

    public void setOrderId(String orderId) {
        OrderId = orderId;
    }

    public String getOrderDate() {
        return OrderDate;
    }

    public void setOrderDate(String orderDate) {
        OrderDate = orderDate;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public OrderModel(String productName, String orderId, String orderDate, int image) {
        this.productName = productName;
        OrderId = orderId;
        OrderDate = orderDate;
        this.image = image;
    }
}
