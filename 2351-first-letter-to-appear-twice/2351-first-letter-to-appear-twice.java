import java.util.*;

class Solution {
    public char repeatedCharacter(String s) {
        HashSet<Character> set = new HashSet<>();
        char result = ' ';
        
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);

            if(set.contains(ch)){
                result = ch;
                break;
            }else{
                set.add(ch);
            }
        }
        return result;
    }
}
