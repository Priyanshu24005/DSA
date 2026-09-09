import java.util.HashSet;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList <Integer> list = new ArrayList<>();
        ArrayList <Integer> ans = new ArrayList<>();

        for(int i = 0;i<nums1.length;i++){
            set.add(nums1[i]);
        }

        for(int a:nums2){
            if(set.contains(a) && !list.contains(a)){
                list.add(a);
                ans.add(a);
            }
        }

        int[] arr = new int[ans.size()];
        int k = 0;

        for (int num : ans) {
        arr[k] = num;
        k++;
    }

    return arr;
    }
}