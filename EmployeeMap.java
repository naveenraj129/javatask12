package org.example;

import java.util.*;

public class EmployeeMap {

    public static void main(String[] args){
        TreeMap<Integer, String > a = new TreeMap<>();

        a.put(4 , "aura");
        a.put(2 , "evan");
        a.put(3, "lenin");
        a.put(1, "naveen");
        List<String> names = new ArrayList<>(a.values());
        Collections.sort(names);

        for (String name : names) {
            System.out.println(name);
        }

    }
}
