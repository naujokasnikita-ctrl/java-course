package com.bootcampexcercise.module8;

import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;

public class HashSetActivity {

    public static void main(String[] args) {
        //Create HashSet of 10
        HashSet<String> names = new HashSet<>();
        names.add("Disha");
        names.add("Sanders");
        names.add("Clevlend");
        names.add("Mike");
        names.add("Tyson");
        names.add("Alice");
        names.add("David");
        names.add("Willy");
        names.add("Ilmars");
        names.add("Beverly");

        System.out.println("Original HashSet:");
        printSet(names);

        //Add duplicate
        names.add("Mike");
        names.add("Tyson");
        System.out.println("\nAfter adding duplicates:");
        printSet(names);

        //Remove 2
        names.remove("Beverly");
        names.remove("David");
        System.out.println("\nAfter removing 2:");
        printSet(names);

        //Find Disha
        List<String> nameList = new ArrayList<>(names);
        int index = nameList.indexOf("Disha");
        if (index != -1) {
            System.out.println("\nDisha in HashSet is in the new list: " + index);
        } else {
            System.out.println("\nDisha not found ");
        }
    }

    static void printSet(HashSet<String> set) {
        for (String name : set) {
            System.out.println(name);
        }
    }
}

//Original HashSet:
//Mike
//Clevlend
//Tyson
//Alice
//Disha
//David
//Sanders
//Willy
//Ilmars
//Beverly
//
//After adding duplicates:
//Mike
//Clevlend
//Tyson
//Alice
//Disha
//David
//Sanders
//Willy
//Ilmars
//Beverly
//
//After removing 2:
//Mike
//Clevlend
//Tyson
//Alice
//Disha
//Sanders
//Willy
//Ilmars
//
//Disha in HashSet is in the new list: 4