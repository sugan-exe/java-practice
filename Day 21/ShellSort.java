import java.util.Arrays;

public class ShellSort {
    public static void main(String[] args) {
        int[] arr = {12, 34, 54, 2, 3};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int sort(int[] arr) {
        int n = arr.length;
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i += 1) {
                int temp = arr[i];
                int j;
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) {
                    arr[j] = arr[j - gap];
                }
                arr[j] = temp;
            }
        }
        return 0;
    }
}
