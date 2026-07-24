import java.util.*;

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
         HashSet<Character> set = new HashSet<>();
        int count = 0;

        for (int i = 0; i < jewels.length(); i++) {
            char ch = jewels.charAt(i);
            set.add(ch);

        }

        for (int j = 0; j < stones.length(); j++) {
            char ch2 = stones.charAt(j);

            if (set.contains(ch2)) {
                count++;
            }
        }
        return count;
        
    }
}