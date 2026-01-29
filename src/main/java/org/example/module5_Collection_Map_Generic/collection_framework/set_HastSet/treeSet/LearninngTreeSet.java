package org.example.module5_Collection_Map_Generic.collection_framework.set_HastSet.treeSet;

import java.util.TreeSet;

public class LearninngTreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> mySet = new TreeSet<>();

        mySet.add(5);
        mySet.add(7);
        mySet.add(1);
        mySet.add(0);
        mySet.add(3);
        System.out.println("TreeSet after adding elements: " + mySet);

    }
}
