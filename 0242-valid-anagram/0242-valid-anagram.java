class Solution {
    public boolean isAnagram(String s, String t) {
        boolean isAnaragram = true;

        int[] freq = new int[26];

        if (s.length() != t.length()) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch != ' ') {
                freq[ch-97] = freq[ch-97] + 1;
            }
        }

        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);

            if (ch != ' ') {
                freq[ch-97] = freq[ch-97] - 1;
            }
        }

        for (int i = 0; i < freq.length; i++) {

            if (freq[i] != 0) {
                isAnaragram = false;
                break;
            }
        }

        return isAnaragram;
    }
}