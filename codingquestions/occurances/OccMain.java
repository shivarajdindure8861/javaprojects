package com.axis.occurances;

class Occurance {

    public void findOccurances(int[] arr) {
        // [1, 4, 6, 7, 1, 4 , 6]

        int[] counts = new int[10]; // o(1)

        // [0, 1, 0, 1, 0, 0, 0, 0, 0 ,0]
        for (int num : arr) { // o(n)
            counts[num]++;
        }

        for (int i = 0; i < counts.length; i++) { // o(n)
            if (counts[i] > 0) { // o(1)
                System.out.println("" + i + " is repeated " + counts[i] + " times ");
            }
        }
    }
    // public void findOcc(int[] arr) {
    // int[] counts = new int[10];
    // for (int num : counts) {
    // counts[num]++;

    // }
    // for (int i = 0; i < counts.length; i++) {
    // if (counts[i] > 0) {
    // System.out.println(" " + i + " is repeated " + counts[i] + " times");
    // }
    // }

    // }
}

public class OccMain {
    public static void main(String[] args) {
        Occurance oc = new Occurance();
        oc.findOccurances(new int[] { 1, 0, 0, 3, 21, 2, 1, 5, 4, 56 });
    }
}
