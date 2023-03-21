package com.axis.basicCodes;

class Occurances {
    public static void occuranceOfEle(int[] arr) {
        int[] counts = new int[100];
        for (int num : arr) {
            counts[num]++;
        }
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > 0) {
                System.out.println("The elements " + i + " is repeated " + counts[i] + " times!");
            }
        }
    }
}

public class OccuranceMain {
    public static void main(String[] args) {
        Occurances.occuranceOfEle(new int[] { 1, 2, 3, 1, 3, 22, 4, 22, 5 });
    }
}
