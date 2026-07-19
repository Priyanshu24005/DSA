import java.util.ArrayList;

class Solution {
    public boolean isHappy(int n) {
        ArrayList <Integer> list = new ArrayList<>();
        int sum = 0;

        while (n != 1) {
            sum = 0;

            while (n > 0) {
                int digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }

            if (list.contains(sum)) {
                return false;
            }
            list.add(sum);
            n = sum;
        }

        return true;
        
    }
}