package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CharOccurenceWithHashMap {
    public static void main(String[] args) {
       /* printTheduplicateCharacters(null);
        printTheduplicateCharacters("");
        printTheduplicateCharacters("a");
        printTheduplicateCharacters("hello");*/
        printTheduplicateCharacters("check how many duplicates here");


    }

    public static void printTheduplicateCharacters(String str) {
//        if (str == null) {
//            System.out.println("The string is null");
//            return;
//        }
//
//        if (str.isEmpty()) {
//            System.out.println("This string is empty");
//            return;
//        }
//
//        if (str.length() == 1) {
    //            System.out.println("Single Character String");
//            return;
//        }

        char[] letters = str.toCharArray();
        Map<Character, Integer> charMap = new HashMap<Character, Integer>();

        for (char l : letters) {

            if (charMap.containsKey(l)) {
            charMap.put(l, charMap.get(l)+1);
            } else {
                charMap.put(l, 1);
            }
        }
        System.out.println(charMap);
        System.out.println(charMap.entrySet());
        Set<Map.Entry<Character, Integer>> entrySet = charMap.entrySet();
        for (Map.Entry<Character, Integer> entry : entrySet){
        if(entry.getValue()>1){
           // System.out.print(entry.getKey()+" "+entry.getValue()+ "  ");
            System.out.print(entry.getKey());
        }


//        if (entry.getValue()>=1) {
//            System.out.print(entry.getKey()+""+ entry.getValue()+"  ");
//
//        }
        }

    }
}
