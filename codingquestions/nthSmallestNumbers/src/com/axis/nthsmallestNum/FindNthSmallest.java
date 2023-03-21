package com.axis.nthsmallestNum;

import java.util.Arrays;
import java.util.Scanner;

public class FindNthSmallest {

    public static void nthSmallestNumberinArr(int[] arr) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number : ");
        int n = 0;
        try {
            n = scan.nextInt();
            Arrays.sort(arr);
            int nthsmaller = arr[n - 1];

            System.out.println("The " + n + "th smallest Number is : " + nthsmaller);

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("ArrayIndex Out of bound" + e.getMessage());

        }

    }
}
