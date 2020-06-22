package com.FourFashionShop.Models;

public class NotificationModel {
    private String notificationTitle, notificationDescription;
    private int image;

    public String getNotificationTitle() {
        return notificationTitle;
    }

    public void setNotificationTitle(String notificationTitle) {
        this.notificationTitle = notificationTitle;
    }

    public String getNotificationDescription() {
        return notificationDescription;
    }

    public void setNotificationDescription(String notificationDescription) {
        this.notificationDescription = notificationDescription;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public NotificationModel(String notificationTitle, String notificationDescription, int image) {
        this.notificationTitle = notificationTitle;
        this.notificationDescription = notificationDescription;
        this.image = image;
    }
}
