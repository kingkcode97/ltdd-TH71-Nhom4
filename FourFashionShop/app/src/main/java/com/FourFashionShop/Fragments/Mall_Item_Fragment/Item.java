package com.FourFashionShop.Fragments.Mall_Item_Fragment;

public class Item {
    private String Title1, Title2;
    private String Category;
    private String Description;
    private int Thumbnail;

    public Item() {
    }

    public Item(String title1, String title2, String category, String description, int thumbnail) {
        Title1 = title1;
        Title2 = title2;
        Category = category;
        Description = description;
        Thumbnail = thumbnail;
    }

    public String getTitle1() {
        return Title1;
    }

    public String getTitle2() {
        return Title2;
    }

    public String getCategory() {
        return Category;
    }

    public String getDescription() {
        return Description;
    }

    public int getThumbnail() {
        return Thumbnail;
    }

    public void setTitle1(String title1) {
        Title1 = title1;
    }

    public void setTitle2(String title2) {
        Title2 = title2;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setThumbnail(int thumbnail) {
        Thumbnail = thumbnail;
    }
}
