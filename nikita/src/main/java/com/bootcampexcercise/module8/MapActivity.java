package com.bootcampexcercise.module8;

import java.util.HashMap;
import java.util.Map;

    public class MapActivity {

        public static void main(String[] args) {
            //create a map
            Map<String, String> userMap = new HashMap<>();
            userMap.put("A1", "Zen");
            userMap.put("B2", "Boom");
            userMap.put("C3", "Pou");

            //print the map
            print(userMap);
        }

        //Changed to static
        static void print(Map<String, String> map) {
            //print map
            System.out.println("Map Contents:");
            for (Map.Entry<String, String> entry : map.entrySet()) {
                System.out.println("ID: " + entry.getKey() + " | Name: " + entry.getValue());
            }
        }
    }

//ID: A1 | Name: Zen
//ID: B2 | Name: Boom
//ID: C3 | Name: Pou