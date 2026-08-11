class Solution {
    public int maxArea(int[] height) {
        int left = 0, right = height.length-1, maxWidth = 0;

        while(left < right){
            // int area = Math.min(height[left], height[right]) * (right-left);
            // maxWidth = Math.max(maxWidth,area);

            if(height[left] < height[right]){
                maxWidth = Math.max(maxWidth, height[left] * (right-left));
                left++;
            } else {
                maxWidth = Math.max(maxWidth, height[right] * (right-left));
                right--;
            }
        }
        return maxWidth;
    }
}