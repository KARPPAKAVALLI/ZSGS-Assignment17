package com.assignment17;

import java.util.ArrayList;
import java.util.Arrays;

public class Code3 {
    //3. Write a Java program that creates an `ArrayList` of characters.
    // Add ten different characters to the list.
    // Write a method that takes a character as an argument and returns the index of the character in the list.
    // If the character is not found, return -1.
    public static int getIndex(ArrayList<Character> characters,char ch){
        if(characters.contains(ch))
            return characters.indexOf(ch);
        else
            return -1;
    }

    public static void main(String[] args) {
        ArrayList<Character> characters=new ArrayList<>(Arrays.asList('!','@','a','*','$','^','1','A','[','}'));
        System.out.println("Index of @ = "+getIndex(characters,'@'));
        System.out.println("Index of % = "+getIndex(characters,'%'));
    }
}
