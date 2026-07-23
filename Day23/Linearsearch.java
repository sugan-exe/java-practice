public class Linearsearch {
    public static int linearsearch(int[] arr, int target) {
        if(arr.length == 0) {
            return -1;
        }
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]) {
        int[] arr = {10, 30, 20, 90, 50};

        int target = 90;
        int ans = linearsearch(arr, target);
        System.out.println("Element found at index: " + ans);
    }
}
