class Solution {
    public int removeDuplicates(int[] nums) {
         int i = 0;
        int j = 1;

        while(i<nums.length-1){
            if(nums[i]!=nums[i+1]){
                nums[j] = nums[i+1];
                j++;
            }
            i++;
        }

        return j;
    }
}