class Solution {
    public int search(int[] nums, int target) {
         int f = 0;
        int l = nums.length-1;

        while(f<=l){
            int mid = f+(l-f)/2;
            if(nums[mid] == target){
               return mid;
            }else if(nums[f]<=nums[mid]){
               if(target>=nums[f] && target<=nums[mid]){
                 l = mid-1;
               }else{
                f = mid+1;
               }
            }else{
                if(nums[mid+1]<=target && target<=nums[l]){
                    f = mid+1;
                }else{
                    l = mid-1;
                }
            }
        }
        return -1;
    }
}