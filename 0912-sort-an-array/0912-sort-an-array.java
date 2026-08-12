class Solution {
    public void divide(int nums[], int f, int l) {
        if (f >= l) return;

        int mid = f + (l - f) / 2;

        divide(nums, f, mid);
        divide(nums, mid + 1, l);

        merge(nums, mid, f, l);
    }

    public void merge(int nums[], int mid, int f, int l) {
        int i = f;
        int j = mid + 1;
        int k = 0;

        int[] temp = new int[l - f + 1];

        while (i <= mid && j <= l) {
            if (nums[i] < nums[j])
                temp[k++] = nums[i++];
            else
                temp[k++] = nums[j++];
        }

        while (i <= mid) temp[k++] = nums[i++];
        while (j <= l) temp[k++] = nums[j++];

        k = 0;
        i = f;

        while (i <= l) {
            nums[i++] = temp[k++];
        }
    }

    public int[] sortArray(int[] nums) {
        divide(nums, 0, nums.length - 1);
        return nums;
    }
}