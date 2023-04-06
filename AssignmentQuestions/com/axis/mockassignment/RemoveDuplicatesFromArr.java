package com.axis.mockassignment;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicatesFromArr {
    private Scanner scanner;

    public void removeduplicates() {
        scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        Set<Integer> set = new HashSet<>();
        for (int ele : arr) {

            set.add(ele);
            // System.out.println(set);

        }
        System.out.println(set);

    }
}
