class Solution {
    public int searchInsert(int[] nums, int target) {
        int f = 0;
        int l = nums.length - 1;

        while (f <= l) {
            int mid = f + (l - f) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                l = mid - 1;
            } else {
                f = mid + 1;
            }
        }

        return f;
    }
}