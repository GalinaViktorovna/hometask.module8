package com.hometask.module8;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Runner {

    public static void main(String[] args) throws Exception {

        Rose rose = new Rose("Red", "100");
        Chamomile chamomile = new Chamomile("Blue", "98");
        Tulip tulip = new Tulip("Green", "37");
        Aster aster = new Aster("Pink", "67");

        List<Flower> flowersForBouquet = new ArrayList<>();
        flowersForBouquet.add(rose);
        flowersForBouquet.add(chamomile);
        flowersForBouquet.add(tulip);
        flowersForBouquet.add(aster);

        Bouquet bouquetOfFlower = new Bouquet(flowersForBouquet);

        List<String> headLine = new ArrayList<>();
        headLine.add("FLOWER");
        headLine.add("SIZE");
        headLine.add("COLOR");
        AsciiTable asciiTable = new AsciiTable(5, 3);
        asciiTable.setHeaders(headLine);
        asciiTable.setCell(bouquetOfFlower.prepareListForTable());
        asciiTable.printTable();


        FlowerComparator flowerComparator = new FlowerComparator();
        TreeSet<Flower> sortFlower = new TreeSet<Flower>(flowerComparator);
        for (Flower flower : bouquetOfFlower.getBouquet()
                ) {
            sortFlower.add(flower);

        }
        for (Flower flower : sortFlower
                ) {
            System.out.println(flower);

        }


    }
}
