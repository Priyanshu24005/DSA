class Solution {
    public int searchInsert(int[] nums, int target) {
        int f = 0;
        int l = nums.length - 1;

        while (f <= l) {
            int mid = f + (l - f) / 2;

            if (nums[mid] == target) {
                return mid;
            } 
            else if (nums[mid] > target) {

                if (mid == 0 || nums[mid - 1] < target) {
                    return mid;
                } 
                else {
                    l = mid - 1;
                }
            } 
            else {

                if (mid == nums.length - 1 || nums[mid + 1] > target) {
                    return mid + 1;
                } 
                else {
                    f = mid + 1;
                }
            }
        }

        return nums.length;
    }
}