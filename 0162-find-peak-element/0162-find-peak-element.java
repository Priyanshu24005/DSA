class Solution {
    public int findPeakElement(int[] nums) {
        int f = 0;
        int l = nums.length - 1;

        while (f < l) {
            int mid = f + (l - f) / 2;

            if (nums[mid] > nums[mid + 1]) {
                l = mid;
            } else {
                f = mid + 1;
            }
        }

        return f;
    }
}