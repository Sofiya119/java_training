package org.example.module5_Collection_Map_Generic.generic_programming.questions;

public class Question1 {
    public static void main(String[] args) {
        Question1 obj = new Question1();
        obj.printValue(10); // 10
        obj.printValue("Hello"); // Hello
        obj.printValue(15.5); // 15.5
    }

    // create generic printValue method
    public <T> void printValue(T t) {
        System.out.println(t);
    }

    public <T> T printValue2(T t) {
        return t;
    }
}
