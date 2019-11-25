package de.htw.Outfittery.entities;

public class Clothing {

    private String nameOfArticle;
    private String brand;
    private String size;
    private String color;
    private String gender;

    public Clothing(String nameOfArticle, String brand, String size, String color, String gender){
        this.nameOfArticle = nameOfArticle;
        this.brand = brand;
        this.size = size;
        this.color = color;
        this.gender = gender;
    }

    public String getNameOfArticle() {
        return nameOfArticle;
    }

    public void setNameOfArticle(String nameOfArticle) {
        this.nameOfArticle = nameOfArticle;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

}
