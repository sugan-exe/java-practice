public class FindMaxElement {
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) max = num;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(findMax(new int[]{10, 25, 3, 99, 42}));
    }
}
