package org.example.module5.list.linkedList.questions;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;

public class Question6 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>(Arrays.asList("Java", "Python", "Java", "C++", "Java", "Python", "JavaScript", "Python", "Ruby"));

        System.out.println("Original LinkedList:");
        Question1.printLL(ll);

        ListIterator<String> leftItr = ll.listIterator(); // itr is at head node
        ListIterator<String> rightItr = ll.listIterator(ll.size());

        String target = "Java";
        boolean firstRemoved = false;
        boolean lastRemoved = false;

        while(leftItr.nextIndex() <= rightItr.previousIndex() && (!firstRemoved || !lastRemoved)) {

            if(!firstRemoved && leftItr.hasNext()) {
                String val = leftItr.next();
                if(val.equals(target)){
                    leftItr.remove();
                    firstRemoved = true;
                }
            }

            if(!lastRemoved && rightItr.hasPrevious()){
                String val = rightItr.previous();
                if(val.equals(target)) {
                    rightItr.remove();
                    lastRemoved = true;
                }
            }
        }

        System.out.println("After remove first and last elements of linked list:");
        Question1.printLL(ll);
    }
}
