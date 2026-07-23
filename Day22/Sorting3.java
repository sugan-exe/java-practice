public class Sorting3 {
    public static void main(String[] args) {
        int arr[] = {12, 11, 13, 5, 9};
        int n = arr.length;

        for(int i=0;i<n;i++) {
            int current = arr[i];
            int j = i-1;
            while(j >= 0 && arr[j] > current) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }

        System.out.println("Sorted array:");
        for(int i=0;i<n;i++) {
            System.out.print(arr[i] + " ");
        }
    }
}