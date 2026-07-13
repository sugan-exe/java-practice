package Assignment;

import java.util.*;

public class BubbleSortDescending {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 1, 2};

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) { // Changed > to <
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped)
                break;
        }

        System.out.println(Arrays.toString(arr));
    }
}