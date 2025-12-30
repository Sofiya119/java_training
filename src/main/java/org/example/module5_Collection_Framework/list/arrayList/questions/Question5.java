package org.example.module5_Collection_Framework.list.arrayList.questions;

import java.util.ArrayList;
import java.util.Iterator;

public class Question5 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println("list");
        System.out.println(list);

        Iterator<Integer> it = list.iterator();

        while (it.hasNext()) {
            int num = it.next();

            if (num % 2 == 0) {
                it.remove();
            }
        }
        System.out.println("list after removing even numbers");
        System.out.println(list);
    }
}
