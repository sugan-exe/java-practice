public class Sorting1 {
    public static void main(String[] args) {
        int[] arr = {7, 40, 30, 60, 15, 8};
        sort(arr);
        for(int x: arr) {
            System.out.print(x+" ");
        }
    }

    public static void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n ; i++) {
            int min = i;
            for (int j = i + 1; j < n ; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
}
