package org.campus02;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DictionaryMap {
    public static void main(String[] args) {
        //K -> String (deutscher Begriff)
        //V -> String (englischer Begriff)

        HashMap<String,String> deToEnDict = new HashMap<>();
        deToEnDict.put("katze", "cat");
        deToEnDict.put("hund", "dawg");
        deToEnDict.put("hunde", "dawgs");
        deToEnDict.put("löwe", "lion");

        //Zugriff (Carsten Stahl) -> über Schlüssel
        String hundInEn = deToEnDict.get("hund");
        System.out.println("hundInEn = " + hundInEn);

        //iterieren über keyset

        Set<String> keys = deToEnDict.keySet();
        for (String k : keys){
            String wordInEnglisch = deToEnDict.get(k);
            System.out.println(k + ": " + wordInEnglisch);
        }

        System.out.println();

        for (Map.Entry<String, String> entry : deToEnDict.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        
        }
    }


