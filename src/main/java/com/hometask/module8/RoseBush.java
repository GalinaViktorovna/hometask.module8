package com.hometask.module8;

import java.util.List;

public class RoseBush {
    private List<Rose> roseBush;

    public List<Rose> getRoseBush() {
        return roseBush;
    } //Антипаттерн Лодочный якорь (Boat anchor)

    public void setRoseBush(List<Rose> roseBush) {
        this.roseBush = roseBush;
    }//Антипаттерн Лодочный якорь (Boat anchor)
}
