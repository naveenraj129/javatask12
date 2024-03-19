package org.example;

import java.util.ArrayList;

public class RemoveElements {
    public static void main(String[] args){


        ArrayList<String> a = new ArrayList();
        a.add("banana");
        a.add("apple");
        a.add("orange");
        a.add("watermelon");
        for(String str: a) {
            System.out.println(str);
        }
        a.clear();
    }
}
