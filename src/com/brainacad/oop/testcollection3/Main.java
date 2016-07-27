package com.brainacad.oop.testcollection3;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<String> list = new LinkedList<>();
        List<String> aList = new ArrayList<>();

        System.out.println("********** print LinkedList **********");
        for (int i = 0; i < 10; i++) {
            list.add("num_" + i);
            aList.add("num_" + i);
        }

        Iterator<String> stringIterator = list.iterator();
        while (stringIterator.hasNext()) {
            System.out.println(stringIterator.next());
        }
        System.out.println();

        System.out.println("********** print ArrayList **********");
        Iterator<String> stringIterator1 = aList.iterator();
        while (stringIterator1.hasNext()) {
            System.out.println(stringIterator1.next());
        }

        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()) {

            aList.add(listIterator.next());

        }

        System.out.println("********** insert one list into the other  **********");
        Iterator<String> stringIterator2 = aList.iterator();
        while (stringIterator2.hasNext()) {
            System.out.println(stringIterator2.next());
        }

        for (int i = aList.size() - 1; i >= 0; i--) {
            list.add(aList.get(i));
        }

        System.out.println("********** insert the end of the list  **********");
        printElements(list);
    }

    public static void printElements(List<String> list){

        Iterator<String> stringIterator3 = list.iterator();
        while (stringIterator3.hasNext()) {
            System.out.println(stringIterator3.next());
        }

    }
}
