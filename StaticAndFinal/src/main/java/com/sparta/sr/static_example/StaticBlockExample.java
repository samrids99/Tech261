package com.sparta.sr.static_example;

import java.util.ArrayList;

public class StaticBlockExample {

    private static ArrayList<String> names = new ArrayList<>();

    static {  // block which is run once when a class is loaded
      names.add("sam");
      names.add("carl");
    }

    public static void main(String[] args) {
        System.out.println(names);
    }

}
