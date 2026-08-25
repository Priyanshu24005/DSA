class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
          char ans = letters[0];
        int f = 0;
        int l = letters.length-1;

        while(f<=l){
            int mid = f+(l-f)/2;
            if(letters[mid] > target){
                ans = letters[mid];
                l = mid-1;
            }else{
                f = mid+1;
            }
        }
        return ans;
    }
}