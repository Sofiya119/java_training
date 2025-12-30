package org.example.module4_Exception_Handling.errors;
// Program will compiled
// Program will run
// Program will break due to runtime error

public class KnowingRuntimeError {
    public static void main(String[] args) {
        System.out.println("Program started");
//        divide by zero error
        int a=10;
        System.out.println("RunTime Error");

//       accessing invalid array index
        int[] array = {1,2,3};
        System.out.println(array[5]);
        System.out.println("Program ended");
    }
}
