class Solution {
       public int BinarySearch(int nums[],int target,boolean isStarting){
    int f = 0;
    int l = nums.length-1;
    int ans = -1;

    while(f<=l){
        int mid = f + (l-f)/2;

        if(nums[mid]==target){
            ans = mid;
            if(isStarting) l = mid-1;
            else f = mid+1;
        }else if(nums[mid]<target){
             f = mid+1;
        }else{
             l = mid-1;
        }     
    }
    return ans;
   }

    public int[] searchRange(int[] nums, int target) {
        
          int first = BinarySearch(nums,target,true);
        int last = BinarySearch(nums,target,false);

        return new int[]{first,last};
    }
}