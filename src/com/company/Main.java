package com.company;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        ArrayList<City> arrayList = new ArrayList<>();
        arrayList.add(new City(23, "Bishkek"));
        arrayList.add(new City(78, "Chui"));
        arrayList.add(new City(-23, "Batken"));
        arrayList.add(new City(217, "Talas"));
        arrayList.add(new City(45, "Naryn"));
        arrayList.add(new City(-23, "Osh"));

        Set<City> set = new TreeSet<>(arrayList);
        Set<City> set1 = new TreeSet<>(arrayList);

        for (City city : set) {
            if (city.getCode() % 2 == 1) {
                set1.add(city);
                System.out.println(city);
            }
        }
        System.out.println();
        for (City city : set1) {
            if (city.getCode() % 2 == 0) {
                set.add(city);
                System.out.println(city);
            }
        }
    }}