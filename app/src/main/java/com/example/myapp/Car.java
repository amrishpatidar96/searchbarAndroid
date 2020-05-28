package com.example.myapp;

public class Car {
    private String CarName;
    private String ImageUrl;

    public Car(String carName, String imageUrl) {
        CarName = carName;
        ImageUrl = imageUrl;
    }

    public Car() {
    }

    public String getCarName() {
        return CarName;
    }

    public void setCarName(String carName) {
        CarName = carName;
    }

    public String getImageUrl() {
        return ImageUrl;
    }

    public void setImageUrl(String imageUrl) {
        ImageUrl = imageUrl;
    }
}
