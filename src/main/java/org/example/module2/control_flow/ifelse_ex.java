package org.example.module2.control_flow;

public class ifelse_ex {
    public static void main(String[] args) {
        int a = 30;
        int b = 20;

        String result = "";

        // if-else block
        if (a > b) {
            result = "a is greater than b";
        } else {
            result = "b is greater than a";
        }

        System.out.println(result);
    }
}
