class Solution {
    public int kthFactor(int n, int k) {

        // First half of the factors
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                k--;
                if (k == 0) {
                    return i;
                }
            }
        }

        // Avoid repeating the square root if n is a perfect square
        int start = (int) Math.sqrt(n);
        if (start * start == n) {
            start--;
        }

        // Second half of the factors
        for (int i = start; i >= 1; i--) {
            if (n % i == 0) {
                k--;
                if (k == 0) {
                    return n / i;
                }
            }
        }

        return -1;
    }
}