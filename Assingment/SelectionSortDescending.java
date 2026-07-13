package Assingment;

import java.util.*;

public class SelectionSortDescending {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 1, 2};

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int max = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[max]) { // Find maximum
                    max = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[max];
            arr[max] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}