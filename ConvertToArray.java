package org.example;

import java.util.ArrayList;

public class ConvertToArray {

        public static void main(String[] args){


            ArrayList<String> a = new ArrayList();
            a.add("banana");
            a.add("apple");
            a.add("orange");
            a.add("watermelon");
       String Arr[] = a.toArray(new String[0]);
            for(String str: Arr) {
                System.out.println(str);
            }

        }
    }


