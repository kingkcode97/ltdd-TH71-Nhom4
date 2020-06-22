package com.FourFashionShop.Models;

public class CouponModel {
    private String couponTitle, couponDescription, couponRule, dateFrom, dateTo;
    private int image;

    public String getCouponTitle() {
        return couponTitle;
    }

    public void setCouponTitle(String couponTitle) {
        this.couponTitle = couponTitle;
    }

    public String getCouponDescription() {
        return couponDescription;
    }

    public void setCouponDescription(String couponDescription) {
        this.couponDescription = couponDescription;
    }

    public String getCouponRule() {
        return couponRule;
    }

    public void setCouponRule(String couponRule) {
        this.couponRule = couponRule;
    }

    public String getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(String dateFrom) {
        this.dateFrom = dateFrom;
    }

    public String getDateTo() {
        return dateTo;
    }

    public void setDateTo(String dateTo) {
        this.dateTo = dateTo;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public CouponModel(String couponTitle, String couponDescription, String couponRule, String dateFrom, String dateTo, int image) {
        this.couponTitle = couponTitle;
        this.couponDescription = couponDescription;
        this.couponRule = couponRule;
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
        this.image = image;
    }
}
