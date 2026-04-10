package com.bootcampexcercise.module8;
import java.util.*;

public class CollectionLearn {
    public ArrayList<String> list = new ArrayList<>();
    public HashSet<String> set = new HashSet<>();
    public HashMap<Integer, String> map = new HashMap<>();

    // ADD METHODS
    public boolean addToList(String val) {
        if (list.contains(val)) return false;
        return list.add(val);
    }

    public boolean addToSet(String val) {
        return set.add(val); // Returns false if duplicate
    }

    public boolean addToMap(int key, String val) {
        if (map.containsKey(key)) return false;
        map.put(key, val);
        return true;
    }

    // REPLACE METHODS
    public boolean replaceInList(String oldVal, String newVal) {
        if (list.contains(newVal)) return false;
        int index = list.indexOf(oldVal);
        if (index == -1) return false;
        list.set(index, newVal);
        return true;
    }

    // PRINT METHODS
    public void printAll() {
        System.out.println("List: " + list);
        System.out.println("Set:  " + set);
        System.out.println("Map:  " + map);
    }
}


