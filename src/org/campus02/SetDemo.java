package org.campus02;

import java.util.HashSet;

public class SetDemo {

    public static void main(String[] args) {

        HashSet<String> names = new HashSet<>();
        names.add("max");
        names.add("susi");
        names.add("kebab");
        names.add("max"); //man kann versuchen es hinzuzufügen aber es wird einfach vermieden

        int size = names.size(); // erwartung: 3
        System.out.println("size = " + size);

        for (String name : names){
            System.out.println("name = " + name);
            System.out.println("name = " + name.hashCode());
        }
        
        String max = new String("max");
        System.out.println("max.hashCode() = " + max.hashCode());

        names.remove(max);
        boolean contains = names.contains(max); //STRG + ALT + V -> variable erzeugen
        System.out.println("contains = " + contains);

        
        names.clear();
        System.out.println("names.size() = " + names.size());
    }
}
