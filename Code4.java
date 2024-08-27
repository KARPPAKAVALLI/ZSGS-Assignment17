package com.assignment17;

import java.util.ArrayList;
import java.util.Arrays;

public class Code4 {
    //4. Write a Java program that initializes an `ArrayList` of strings with the values {"apple", "banana", "cherry"}.
    // Convert the `ArrayList` to an array, print the array, then convert the array back to an `ArrayList` and print the `ArrayList`.
    public static void main(String[] args) {
        ArrayList<String> values=new ArrayList<>();
        values.add("apple");values.add("banana");values.add("cherry");

        System.out.println("Arraylist to Array:");
        String [] arr=new String[3];
        arr=values.toArray(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println("Array to ArrayList:");
        System.out.println(Arrays.asList(arr));
    }
}
