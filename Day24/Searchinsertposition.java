public class Searchinsertposition {

    public static void main(String[] args) {

        int[] nums = {1, 2, 6, 8, 9, 11, 23};

        int target = 9;

        int index = searchInsert(nums, target);

        System.out.println("Search Insert Position: " + index);
    }

    public static int searchInsert(int[] nums, int target) {

        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return low;
    }
}