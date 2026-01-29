package org.example.module5_Collection_Map_Generic.generic_programming.generic_class;

import java.util.ArrayList;

public class Example1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        Hello<Integer> obj = new Hello();
        obj.myVariable = 10;
        Hello<String> obj2 = new Hello();
        obj2.myVariable = "Hello Generics";
    }
}
class Hello<T> {
    public T myVariable;
}