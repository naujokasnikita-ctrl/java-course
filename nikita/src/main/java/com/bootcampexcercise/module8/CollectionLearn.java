package com.bootcampexcercise.module8;
import  java.util.*;
public class CollectionLearn {
    // We use String for the data, and Integer for the Map's "Key" (like an ID)
    ArrayList<String> List = new ArrayList<>();
    HashSet<String> Set = new HashSet<>();
    HashMap<Integer, String> Map = new HashMap<>();



    //Methods
    public void addValue(String name) {
        if (!List.contains(name)) {
            List.add(name);
        }
        Set.add(name);

        if (!Map.containsValue(name)) {

        }
    }

    //Remove
    public void removeValue(String name) {
        List.remove(name);
        Set.remove(name);
        Map.values().remove(name);
    }

    //Replace
    public void replaceValue(String oldName, String newName) {
        // First, check if the newName already exists anywhere
        if (List.contains(newName)) {
            System.out.println("ups: " + newName + " already exists");
            return;
        }

        // Replace in List
        int index = List.indexOf(oldName);
        if (index != -1) {
            List.set(index, newName);
        }

        // Replace in Set (Sets don't have 'replace', so we remove then add)
        if (Set.remove(oldName)) {
            Set.add(newName);
        }

        // Replace in Map
        for (Map.Entry<Integer, String> entry : Map.entrySet()) {
            if (entry.getValue().equals(oldName)) {
                entry.setValue(newName);
                break;
            }
        }
    }

    //print
    public void printList() {
        System.out.println("ArrayList: " + List);
    }

    public void printSet() {
        System.out.println("HashSet:   " + Set);
    }

    public void printMap() {
        System.out.println("HashMap:   " + Map);
    }

    // main method usege
    public static void main(String[] args) {
        CollectionLearn app = new CollectionLearn();

        //Add values
        String[] names = {"Nik", "Mike", "Charlie", "David", "Emma", "Alice", "Grace", "Henry", "Ivy", "Jack"};
        for (String n : names) {
            app.addValue(n);
        }

        System.out.println("Initial 10 Values");
        app.printList();
        app.printSet();
        app.printMap();

        //Adding duplicate
        app.addValue("Alice");

        //Remove 2
        app.removeValue("Charlie");
        app.removeValue("Jack");

        //Replace
        app.replaceValue("Emma", "Emily");

        System.out.println("\nAfter everything");
        app.printList();
        app.printSet();
        app.printMap();
    }
}
//Initial 10 Values
//ArrayList: [Nik, Mike, Charlie, David, Emma, Alice, Grace, Henry, Ivy, Jack]
//HashSet:   [Nik, Mike, Grace, Alice, Charlie, David, Jack, Emma, Ivy, Henry]
//HashMap:   {}
//
//After everything
//ArrayList: [Nik, Mike, David, Emily, Alice, Grace, Henry, Ivy]
//HashSet:   [Nik, Emily, Mike, Grace, Alice, David, Ivy, Henry]
//HashMap:   {}