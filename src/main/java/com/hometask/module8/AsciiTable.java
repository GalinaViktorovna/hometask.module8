package com.hometask.module8;

import java.util.Arrays;
import java.util.List;

public class AsciiTable implements Table {

    private int height;
    private int weight;
    private String[][] table;

    public AsciiTable(int height, int weight) {
        this.height = height;
        this.weight = weight;
        this.table = new String[height][weight];

    }

    @Override
    public void setHeaders(List<String> list) {
        try {
            int i = 0;
            for (int j = 0; j < this.weight; j++) {
                table[i][j] = list.get(j);
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Your list with HeadLine for table is empty or deficiency full");
        }
    }

    @Override
    public void setCell(List<String> list) {
        try {
            for (int i = 1, k = 0; i < height; i++) {
                for (int j = 0; j < weight; j++) {
                    table[i][j] = list.get(k);
                    k++;
                }
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Your list for table is empty or deficiency full");

        }
    }

    @Override
    public Object getCell(int i, int j) {
        try {
            return table[i][j];
        } catch (IndexOutOfBoundsException e) {
            System.out.println("You try to get element which does not exist!");
            throw new IndexOutOfBoundsException("You try to get element which does not exist!");
        }

    }

    @Override
    public void printRow(String[] array) {
        for (String s : array) {
            System.out.printf("%-10s", s);
            System.out.print("\t");
        }
        System.out.println();

    }

    @Override
    public void printTable() {
        for (String[] row : table) {
            printRow(row);
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return Arrays.deepToString(table);
    }
}

//То, что ниже это антипаттерн "Изобретение велосипеда", что-то писала - писала,
// все усложнила!+ антипаттерн "Ненужная сложность" (Accidental complexity)
//ТАК ДЕЛАТЬ ПЛОХО!
    /*private List<List<String>> table = new ArrayList<>();

    public List<List<String>> getTable() {
        return table;
    }

    public void setTable(List<List<String>> table) {
        this.table = table;
    }

    private void createTable() {
        List<String> list = new ArrayList<>();
        String s = String.format("%-12s%-11s%-25s%n", "Flower", "Color", "Size\n\n" +
                "------------------------------");
        list.add(s);
        table.add(list);
    }
    public void print(List<Flower> list) {
        createTable();
        List<String> temporaryList = new ArrayList<>();
        String[] split;
        String format;
        for (Flower flower : list
                ) {
            String data = flower.toString();
            split = data.split(" ");
            format = String.format("%-12s%-11s%-25s%n", split[0], split[1], split[2]);
            temporaryList.add(format);

        }
        table.add(temporaryList);
        table.forEach((List<String>innerList) ->innerList.forEach(String -> System.out.println(String)));
        for (List<String>innerList : table
                ) {
            table.forEach(innerList);
            for (String stringOfData : innerList
                    ) {
                System.out.println(stringOfData);*/










