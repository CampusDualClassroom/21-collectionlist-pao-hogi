package com.campusdual.classroom;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Exercise {

    public static List<String> createArrayList() {
        List<String> customList = new ArrayList<>();

        customList.add("GKFFD");
        customList.add("TNANA");
        customList.add("MPMSL");
        customList.add("PSWME");
        customList.add("LZMLF");
        customList.add("JYEBV");
        customList.add("YELNT");
        customList.add("JSNKR");
        customList.add("JFESF");
        customList.add("TMJLL");

        return customList;
    }

    public static boolean addElementToList(List<String> customList, String element) {
        return customList.add(element);
    }

    public static void printElementsAndIndex(List<String> customList) {
        for (int i = 0; i < customList.size(); i++){
            System.out.println("Indice " + i + ": " + customList.get(i));
        }
    }

    public static void main(String[] args) {
        List<String> myList = createArrayList();

        boolean added = addElementToList(myList, "AAAAA");
                System.out.println("Elemento añadido correctamente: " + added);
        System.out.println("===============");

        printElementsAndIndex(myList);
    }


}
