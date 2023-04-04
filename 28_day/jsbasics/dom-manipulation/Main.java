import java.util.Arrays;
import java.util.Scanner;

class Main {
    public void helper_function() {
        int[] arr = { 1, 2, 3, 4, 5 };
        int min = Arrays.stream(arr).min().orElse(0);
        int max = Arrays.stream(arr).max().orElse(0);
        double avg = Arrays.stream(arr).average().orElse(0);
        System.out.println(min);
        System.out.println(max);
        System.out.println(avg);
    }

    public static void main(String[] args) {
        Main m = new Main();
        m.helper_function();
    }
}