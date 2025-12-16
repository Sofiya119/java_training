package org.example.module2.control_flow;

public class break_continue_ex {
    public static void main(String[] args) {
        for(int i=0; i<=4; i++) {
            if(i<2) continue;
            System.out.println("Iteration: " + i);
            if(i==3) break;
        }
    }
}
