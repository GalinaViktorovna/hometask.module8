package com.hometask.module8;

import java.util.ArrayList;
import java.util.List;

public class Bouquet {
    private List<Flower> bouquet;

   /*
   Таких методов быть не должно!Т.к. он никогда использоваться не будет,мешает читабельности
   (анти-паттерн Лодочный якорь (Boat anchor))!

   public Bouquet() {
        this.bouquet = new ArrayList<>();
    }*/

    public Bouquet(List<Flower> bouquet) throws MinimumFlowersValidationException {
        if (bouquet.size() <= 1) {
            throw new MinimumFlowersValidationException("It's not a bouquet! You can not create bouquet!Please add more flowers!");
        } else {
            this.bouquet = bouquet;
        }
    }

    public List<Flower> getBouquet() {
        return bouquet;
    }

    public void setBouquet(List<Flower> bouquet) {
        this.bouquet = bouquet;
    }//Антипаттерн Лодочный якорь (Boat anchor)

    public void delete(Flower flower) throws Exception {
        if (this.bouquet.size() < 2) {
            throw new MinimumFlowersValidationException("You can not delete flower because your bouquet can not exist without flower!!!");
        } else {
            bouquet.remove(flower);

        }
    }//Антипаттерн Лодочный якорь (Boat anchor)

    public List<String> prepareListForTable() {
        List<String> list = new ArrayList<>();
        String[] split;
        for (Flower flower : bouquet
                ) {
            split = flower.toString().split(" ");
            for (int i = 0; i < split.length; i++) {
                list.add(split[i]);
            }

        }
        return list;
    }
}
