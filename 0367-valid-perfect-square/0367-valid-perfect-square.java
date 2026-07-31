class Solution {
    public boolean isPerfectSquare(int num) {
        int low = 0;
        int high = num;

        boolean ans = false;

        while (low <= high) {

            int mid = low + (high - low) / 2;

           long square = 1L * mid * mid;

if (square == num) {
    ans = true;
    break;
} else if (square < num) {
    low = mid + 1;
} else {
    high = mid - 1;
}
        }

        if (ans) {
            return true;
        } else {
            return false;
        }
    }
}