class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        ArrayList <Integer> list = new ArrayList<>();

        while(i<nums.length){
            int correct = nums[i]-1;
            if(nums[i]!=nums[correct]) {
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }else i++;
        }

        for(int j = 0;j<nums.length;j++){
            if(j+1!=nums[j]){
                list.add(j+1);
            }
        }
        return list;
    }
}