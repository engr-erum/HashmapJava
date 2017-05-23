package com.company;

import java.util.*;

/**
 * Created by Erum Hannan on 5/22/2017.
 */
public class MapIterator {
    public static void main(String[] args) {
        /*Question 11
        Consider given piece of code for hashmap.
        Write code to find key 2 exists in map.If it exists print "Key exists in map" and also print value against key 2.
         If it does not exist print "Key does not exist in map".
        Hint: Use Iterator of hashmap */

        int key = 2;
        HashMap<Integer, String> hmap = new HashMap<Integer, String>();
        hmap.put(12, "Chaitanya");
        hmap.put(2, "Rahul");
        hmap.put(7, "Singh");
        hmap.put(49, "Ajeet");
        hmap.put(3, "Anuj");

        if(hmap.containsKey(key)) {
            Set set = hmap.entrySet();
            Iterator iterator = set.iterator();
            while (iterator.hasNext()) {
                Map.Entry mapEntry = (Map.Entry) iterator.next();
                if (key == Integer.valueOf(mapEntry.getKey().toString())) {
                    System.out.println("Key exist in map");
                    break;
                }
                System.out.println("set:"+set);
            }
            System.out.println("set:"+set.hashCode());
        }
        else
        {
            System.out.println("Sorry Key does not exist in map");
        }

        System.out.println("map size:"+hmap.size());
        System.out.println("remove elemt:"+hmap.remove(2));


        /*
        Question 13
        For Key A, you want to store - Apple, Aeroplane
        For Key B, you want to store - Bat, Banana
        For Key C, you want to store – Cat, Car
        Store all values in hashmap and print all keys and its values using for loop.
        Use for(Map.Entry<Integer ,String> entry:hmap.entrySet())
        */
        HashMap<String ,List<String>> hashMap = new HashMap<>();

        List<String> list1 = new ArrayList<>();
        list1.add("Apple");
        list1.add("Aeroplane");

        hashMap.put("A", list1);

        List<String> list2 = new ArrayList<>();
        list2.add("Bat");
        list2.add("Banana");

        hashMap.put("B", list2);

        List<String> list3 = new ArrayList<>();
        list3.add("Cat");
        list3.add("Car");

        hashMap.put("C", list3);

        for(Map.Entry<String,List<String>> hasMap : hashMap.entrySet())
        {
            System.out.println("Key " + hasMap.getKey());
            System.out.println("List item " + hasMap.getValue());
        }
    }
}
