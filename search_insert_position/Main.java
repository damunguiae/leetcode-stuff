package search_insert_position;

public class Main {

    public static void main(String[] args) {
        int result = searchInsert(new int[]{1,3,5,6}, 5);
        System.out.println(result);
    }

    public static int searchInsert(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        int mid = 0;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (nums[mid] == target)
                return mid;
            if (nums[mid] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }
        if (nums[mid] < target) {
            return mid + 1;
        } else {
            return mid;
        }

    }
}