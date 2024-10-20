package org.campus02;

import java.util.ArrayList;
import java.util.HashMap;

public class ZutatenIndex {

    public static void main(String[] args) {
        //Key -> Zutat (String)
        //Value -> Liste von Seiten (List<Int>)

        HashMap<String, ArrayList<Integer>> zutatenIndex = new HashMap<>();
        ArrayList<Integer> mehlSeiten = new ArrayList<>();
        mehlSeiten.add(2);
        mehlSeiten.add(1230);
        mehlSeiten.add(8);
        mehlSeiten.add(8);
        mehlSeiten.add(10); // Initialisierung!!

        zutatenIndex.put("mehl", mehlSeiten);

        ArrayList<Integer> mehlSeitenVonMap = zutatenIndex.get("mehl");
        System.out.println("mehlSeitenVonMap = " + mehlSeitenVonMap);

        //hinzufügen an jeder Stelle von Code
        mehlSeitenVonMap.add(6);
        System.out.println("mehlSeitenVonMap = " + mehlSeitenVonMap);



        zutatenIndex.put("zucker", new ArrayList<>());
        ArrayList<Integer> zuckerSeiten = zutatenIndex.get("zucker");
        zuckerSeiten.add(8);

        System.out.println("zuckerSeiten = " + zuckerSeiten);

        ArrayList<Integer> zuckerSeitenVonMap = zutatenIndex.get("zucker");
        zuckerSeitenVonMap.add(123);
        zuckerSeitenVonMap.add(11);
        zuckerSeitenVonMap.add(1111);

        System.out.println("zuckerSeitenVonMap = " + zuckerSeitenVonMap);
        System.out.println("zuckerSeiten = " + zuckerSeiten);
    }
}
