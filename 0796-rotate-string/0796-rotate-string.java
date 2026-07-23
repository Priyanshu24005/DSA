class Solution {
    public boolean rotateString(String s, String goal) {
         
        boolean isRotate = false;


        if (s.length() != goal.length()) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            s = s.substring(1) + s.charAt(0);

            if (s.equals(goal)) {
                isRotate = true;
            }
        }

        return isRotate;

        
    }
}
