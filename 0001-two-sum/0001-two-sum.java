import java.util.*;

class Solution {
    public int[] twoSum(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int res = target - arr[i];
            if (map.containsKey(res)) {
                return new int[]{map.get(res),i};
            } else {
                map.put(arr[i], i);
            }
        }
 
     return new int[]{-1,-1};
       
    }
}