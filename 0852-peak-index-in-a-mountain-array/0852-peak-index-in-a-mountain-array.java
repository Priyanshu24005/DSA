class Solution {
    public int peakIndexInMountainArray(int[] arr) {
         int f = 0;
        int l = arr.length-1;
        int ans = -1;

        while(f<l){
            int mid = f+(l-f)/2;

            if(arr[mid]>arr[mid+1]){
                ans = mid;
                l = mid;
            }else if(arr[mid]<arr[mid+1]){
                f = mid+1;
            }
        }

        return ans;
    }
}