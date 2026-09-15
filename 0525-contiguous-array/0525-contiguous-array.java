class Solution {
    public int findMaxLength(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        int maxLength = 0;

        // sum 0 pehle index -1 par tha
        map.put(0, -1);

        for (int i = 0; i < nums.length; i++) {

            // 0 ko -1 treat karenge
            if (nums[i] == 0) {
                sum -= 1;
            } else {
                sum += 1;
            }

            int k = 0;

            // same prefix sum mila
            if (map.containsKey(sum - k)) {

                int length = i - map.get(sum - k);

                maxLength = Math.max(maxLength, length);

            } else {

                // first occurrence hi store karni hai
                map.put(sum, i);
            }
        }

        return maxLength;
    }
}