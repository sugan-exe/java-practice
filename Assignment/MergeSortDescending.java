package Assignment;

import java.util.*;

public class MergeSortDescending {

    static void merge(int[] arr, int l, int m, int r) {
        int[] temp = new int[r - l + 1];

        int i = l, j = m + 1, k = 0;

        while (i <= m && j <= r) {
            if (arr[i] >= arr[j]) { // Changed <= to >=
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while (i <= m)
            temp[k++] = arr[i++];

        while (j <= r)
            temp[k++] = arr[j++];

        for (i = l, k = 0; i <= r; i++, k++)
            arr[i] = temp[k];
    }

    static void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int mid = (l + r) / 2;

            mergeSort(arr, l, mid);
            mergeSort(arr, mid + 1, r);

            merge(arr, l, mid, r);
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 1, 2};

        mergeSort(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }
}