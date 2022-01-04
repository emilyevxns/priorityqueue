

import java.util.Random;

/**
 * Simple, non-exhaustive, test program to check that heaps can be
 * constructed. This test does not attempt to test the heap methods 
 * in any meaningful way.
 */
public class Test {
    /**
     * Instantiates a two heaps, adds some data, and executes repeated gets. 
     * This should display the values in order.
     *@param args ignored
     */
    public static void main(String[] args) {
        Random rand = new Random();
        // Heap constructor takes in the initial heap size
        IHeap<Integer> max = new MaxHeap<Integer>(10);
        IHeap<Integer> min = new MinHeap<Integer>(10);
        // Add random data to the heap where the priority and value are the same
//        for(int i=0; i<8; i++) {
//            int v = rand.nextInt();
//            max.put(i,i);
//            min.put(i,i);
//        }
        
        System.out.println("Testing resize_max");
        max.put(1, 1);
        System.out.println("Should be 1. "+ max.peek());
        System.out.println("Size is now: "+ max.size());
        max.put(2, 2);
        System.out.println("Should be 2. "+ max.peek());
        System.out.println("Size is now: "+ max.size());
        max.put(3, 3);
        System.out.println("Should be 3. "+ max.peek());
        System.out.println("Size is now: "+ max.size());
        max.put(4, 4);
        System.out.println("Should be 4. "+ max.peek());
        System.out.println("Size is now: "+ max.size());
        max.put(5, 5);
        System.out.println("Should be 5. "+ max.peek());
        System.out.println("Size is now: "+ max.get());
        max.put(6, 6);
        for (int i = 0; i < max.size(); i++) {
        	System.out.print("The order is: " + max.get()+",");
        }
       
//        
// 
//        System.out.println("Testing ush peek max");
//        max.put(0, 0);
//        System.out.println("Should be 1. "+ max.peek());
//        max.put(5, 5);
//        System.out.println("Should be 1. "+ max.peek());
//        max.put(2, 2);
//        System.out.println("Should be 1. "+ max.peek());
//        max.put(6, 6);
//        System.out.println("Should be 1. "+ max.peek());
//        max.put(1, 7);
//        System.out.println("Should be 1. "+ max.peek());
//        max.put(1, 1);
//        System.out.println("Should be 1. "+ max.peek());
//        max.put(8, 8);
//        System.out.println("Should be 1. "+ max.peek());
//        max.put(9, 9);
//        System.out.println("Should be 1. "+ max.peek());
//        max.put(3, 3);
//        System.out.println("Should be 1. "+ max.peek());
//        max.put(4, 4);
//        System.out.println("Should be 1. "+ max.peek());
//        
//        
//        System.out.println("Testing  end to end max");
//        max.put(13, 13);
//        max.put(12, 12);
//        max.put(11, 11);
//        max.put(10, 10);
//        max.put(6, 6);
//        max.put(8, 8);
//        max.put(9, 9);
//        max.put(7, 7);
//        
//        System.out.println("Should be 13. "+ max.get());
        
        
        // Display in descending order
//        for(int i=0; i<5; i++) {
//            System.out.print(max.get()+", ");
//        }
//        System.out.println("");
//        // Display in ascending order
//        for(int i=0; i<8; i++) {
//            System.out.print(min.get()+", ");
//        }
//        System.out.println("");
    }
}

