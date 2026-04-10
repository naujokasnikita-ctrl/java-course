package com.bootcampexcercise.module8;
import java.util.ArrayList;
import java.util.List;
public class ListActivity {
    public static void main(String[] args) {
        // we create alist of names
        List<String> names = new ArrayList<>();
        names.add("Sergay");
        names.add("Nikolaus");
        names.add("Aleksander");
        names.add("Elisabeth");

        // we call the print method
        print(names);
    }
//print the list
    static void print(List list) {
        for (Object name : list) {
            System.out.println(name);
        }
    }
}
//Sergay
//Nikolaus
//Aleksander
//Elisabeth
