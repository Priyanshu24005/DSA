class Solution {
    public int singleNonDuplicate(int[] nums) {
        int f = 0;
        int l = nums.length - 1;
        int ans = -1;

        while (f <= l) {
            int mid = f + (l - f) / 2;

            if (mid % 2 != 0) {
                mid--;
            }

            if (mid < nums.length - 1 && nums[mid] == nums[mid + 1]) {
                f = mid + 2;
            } else {
                ans = nums[mid];
                l = mid - 1;
            }
        }

        return ans;
    }
}