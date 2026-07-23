public class Binarysearch {

    public static int binarysearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length -1;
        while(low <= high) {
            int mid = (low + high) / 2;
            if(arr[mid] == target) {
                return mid;
            }
            else if(target > arr[mid]) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String args[]) {
        int[] arr = {10, 20, 30, 40, 50};

        int target = 50;

        int ans = binarysearch(arr, target);
        System.out.println("Element found at index: " + ans);
    }
}
