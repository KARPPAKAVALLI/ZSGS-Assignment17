package com.assignment17;

import java.util.ArrayList;
import java.util.Arrays;

public class Code1 {
    //1. Write a Java program that creates an `ArrayList` of strings.
    // Add five different fruits to the list, then retrieve and print the third fruit in the list.
    public static void main(String[] args) {
        ArrayList<String> fruits=new ArrayList<>(Arrays.asList("Apple","Banana","Kiwi","Papaya","Watermelon"));
        System.out.println(fruits.get(2));
    }
}
