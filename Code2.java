package com.assignment17;

import java.util.ArrayList;
import java.util.Iterator;

public class Code2 {
    //2. Create a Java program that initializes an `ArrayList` of integers with the values {10, 20, 30, 40, 50}.
    // Use an iterator to iterate through the list and remove all elements greater than 30. Print the modified list.
    public static void main(String[] args) {
        ArrayList<Integer> nums=new ArrayList<>();
        for (int i = 10; i <=50 ; i+=10) {
            nums.add(i);
        }
        Iterator<Integer> i=nums.iterator();
        while (i.hasNext()){
            if(i.next()>30){
                i.remove();
            }
        }
        System.out.println("Modified List: "+nums);
    }
}
