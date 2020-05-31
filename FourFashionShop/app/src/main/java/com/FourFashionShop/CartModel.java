package com.FourFashionShop;

public class CartModel {
    private String name, totalPrice, txtSoLuong;
    private int img;


    public CartModel(String name, String totalPricae, int img, String txtSoLuong) {
        this.name = name;
        this.totalPrice = totalPricae;
        this.img = img;
        this.txtSoLuong = txtSoLuong;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getTxtSoLuong() {
        return txtSoLuong;
    }

    public void setTxtSoLuong(String txtSoLuong) {
        this.txtSoLuong = txtSoLuong;
    }
}
