import java.util.*;

class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int result = -1;
        int maxFreq = 0;

        for (int num : nums) {
            if (num % 2 == 0) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }

        for (int k : map.keySet()) {

            if (map.get(k) > maxFreq) {
                maxFreq = map.get(k);
                result = k;
            } 
            else if (map.get(k) == maxFreq && k < result) {
                result = k;
            }
        }

        return result;
    }
}