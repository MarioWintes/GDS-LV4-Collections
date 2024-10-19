package org.campus02;

import java.util.ArrayList;

public class ListDemo {

    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<>();

        //hinzufügen von Elementen
        stringList.add("Hallo");
        stringList.add("Max");
        stringList.add("Musti");

        int size = stringList.size();
        System.out.println("size = " + size);

        stringList.add("new elem");

        size = stringList.size();
        System.out.println("size = " + size);

        //Zugriff auf Elemente
        String firstElement = stringList.get(0); // index 0; zugriff auf erstes Element
        System.out.println("firstElement = " + firstElement);
        String secondElement = stringList.get(1);
        System.out.println("secondElement = " + secondElement);

        // iteration: for schleife
        for (int i = 0; i < stringList.size(); i++){
            String element = stringList.get(i);
            System.out.println("element = " + element);
        }
        System.out.println();

        // iteration: for-each
        for(String element : stringList){
            System.out.println("element = " + element);
        }
        System.out.println();

        //element entfernen
        stringList.remove("Max");
        for (String element : stringList){
            System.out.println("element = " + element);
        }
        String removedElement = stringList.remove(0);
        System.out.println("removedElement = " + removedElement);

        boolean containsMusti = stringList.contains("Musti");
        System.out.println("containsMusti = " + containsMusti);

        boolean containsMax = stringList.contains("Max");
        System.out.println("containsMax = " + containsMax);

        stringList.add("Max");
        containsMax = stringList.contains("Max");
        System.out.println("containsMax = " + containsMax);
    }
}
