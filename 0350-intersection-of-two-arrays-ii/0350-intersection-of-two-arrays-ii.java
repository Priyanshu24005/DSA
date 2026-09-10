class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
         HashMap <Integer,Integer> map = new HashMap<>();
         ArrayList <Integer> list = new ArrayList<>();

         for(int i = 0;i<nums1.length;i++){
            if(map.containsKey(nums1[i])){
                map.put(nums1[i],map.get(nums1[i])+1);
            }else{
                map.put(nums1[i],1);
            }
         }

         for(int a:nums2){
            if(map.containsKey(a)){
                list.add(a);
                if(map.get(a) == 1) map.remove(a);
                else map.put(a,map.get(a)-1);
            }
         }

         int[] arr = new int[list.size()];
        int k = 0;
         for(int num:list){
            arr[k] = num;
            k++; 
         }
         return arr;
    }
}