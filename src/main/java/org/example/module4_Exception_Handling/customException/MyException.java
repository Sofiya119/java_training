package org.example.module4_Exception_Handling.customException;

public class MyException extends RuntimeException{
    MyException(String msg) {
        super(msg);
    }
}
