import java.util.*;

class Solution {
    public boolean checkIfPangram(String s) {
       HashSet<Character> set = new HashSet<>();
       boolean isPangram = false;
        
        for(int i = 0;i<s.length();i++){
            set.add(s.charAt(i));
        }

        if(set.size()== 26 ){
            isPangram = true;
        }
        return isPangram;
    }
}
