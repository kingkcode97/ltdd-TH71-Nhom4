package com.FourFashionShop.Models;

public class AddressListModal {
    private String CustomerName, CustomerEmail, CustomerAddress;
    private int Image;

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public String getCustomerEmail() {
        return CustomerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        CustomerEmail = customerEmail;
    }

    public String getCustomerAddress() {
        return CustomerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        CustomerAddress = customerAddress;
    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }

    public AddressListModal(String customerName, String customerEmail, String customerAddress, int image) {
        CustomerName = customerName;
        CustomerEmail = customerEmail;
        CustomerAddress = customerAddress;
        Image = image;
    }
}
