package com.hometask.module8;

abstract public class Flower {

    private String color;
    private String size;

    public Flower(String color, String size) {
        this.color = color;
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }//Антипаттерн Лодочный якорь (Boat anchor)

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }//Антипаттерн Лодочный якорь (Boat anchor)

    public String getType() {
        return getClass().toString();
    }

    @Override
    public String toString() {
        return getType() + " " + getSize() + " " + getColor();
    }
}
