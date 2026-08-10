class Solution {
    public int trap(int[] height) {
         int leftmax = height[0];
        int rightmax = height[height.length-1];
        int[] left = new int[height.length];
        int[] right = new int[height.length];
        int sum = 0;

        for(int i = 0;i<height.length;i++){
            left[i] = Math.max(leftmax,height[i]);
            leftmax = left[i];
        }

        for(int i = height.length-1;i>=0;i--){
            right[i] = Math.max(rightmax,height[i]);
            rightmax = right[i];
        }
        
        for(int i = 0;i<height.length;i++){
            sum += Math.min(left[i],right[i]) - height[i];
        }

        return sum;
    }
}