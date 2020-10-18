/*
 * Ashley Connolley
 * AD300 - F20 5204
 * Assignment 1
 * 
 * A program that accepts 10 integers from the user for an ArrayList,
 * removes duplicate integers, stores in a new ArrayList,
 * sorts the ArrayList in ascending order, displays the maximum and minimum integers,
 * and shuffles the ArrayList.
 */

package com.mycompany.ashleyconnolleyta1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        //Create scanner for user input
        Scanner input = new Scanner(System.in);
        
        //Create ArrayList where user inputs 10 integers
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter ten integers: ");
        for (int i = 0; i < 10; i++) {
            list.add(input.nextInt());
        }
        
        //Invoke removeDuplicate method
        removeDuplicate(list);
        
        //Display non-duplicate integers
        System.out.print("The distinct integers are ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        
        //Seperate distinct integers line from sorted Arraylist line
        System.out.println(" ");
        
        //Sort ArrayList in ascending order
        Collections.sort(list);
        System.out.println("Sorted in ascending " + list);
        
        //Display maximum integer in the ArrayList
        System.out.println("Maximum element in a list " + Collections.max(list));
        
        //Display minimum integer in the ArrayList
        System.out.println("Minimal element in a list " + Collections.min(list));
        
        //Shuffle elements in ArrayList and display
        Collections.shuffle(list);
        System.out.println("Random shuffle for elements in the list " + list);
    }
    
    public static void removeDuplicate(ArrayList<Integer> list) {
        //Create a second ArrayList to store non-duplicate integers
        ArrayList<Integer> tempList = new ArrayList<>();
        
        //Remove duplicates from ArrayList
        for (int i = 0; i < list.size(); i++) {
            if (!tempList.contains(list.get(i))) {
                tempList.add(list.get(i));
            }
        }
        
        //Clear original ArrayList
        list.clear();
        
        //Store non-duplicate ArrayList in the second ArrayList
        list.addAll(tempList);
    }
}
