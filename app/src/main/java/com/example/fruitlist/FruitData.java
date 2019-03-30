package com.example.fruitlist;

import java.util.ArrayList;

public class FruitData {

    public static String[][] data = new String[][]{
            {"Pepaya", "Vitamin C dan Provitamin A", "https://infobuah.com/wp-content/uploads/2018/08/Pepaya.jpg"},
            {"Pisang", "Vitamin A, B1, B2 dan C", "https://infobuah.com/wp-content/uploads/2018/11/Pisang-ambon.jpg"},
            {"Mangga", "Vitamin A, E dan C", "https://doktersehat.com/wp-content/uploads/2018/05/doktersehat-buah-mangga-1024.jpg"},
            {"Strawberry", "Provitamin A, vitamin B1, B dan C", "https://doktersehat.com/wp-content/uploads/2012/01/Anna-Peaches.jpg"},
            {"Apel", "Vitamin A, B dan C", "https://infobuah.com/wp-content/uploads/2018/11/Buah-Apel.jpg"},
            {"Jeruk", "Vitamin A, B1, B2 dan C", "https://infobuah.com/wp-content/uploads/2018/08/Buah-Jeruk-Sunkist.jpg"},
            {"Semangka", "Vitamin C dan provitamin A", "https://infobuah.com/wp-content/uploads/2018/11/Buah-Semangka-compressed.jpg"}
    };

    public static ArrayList<Fruit> getListData(){
        Fruit fruit = null;
        ArrayList<Fruit> list = new ArrayList<>();
        for (String[] aData : data) {
            fruit = new Fruit();
            fruit.setName(aData[0]);
            fruit.setComposition(aData[1]);
            fruit.setPhoto(aData[2]);

            list.add(fruit);
        }

        return list;
    }
}
