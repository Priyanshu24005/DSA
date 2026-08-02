class Solution {
     double ans = 1;

    public double solve(double x, int n) {

        if (n == 0) return 1;

        ans = solve(x, n / 2);

        if (n % 2 == 0) return ans * ans;

        return ans * ans * x;
    }    
    public double myPow(double x, int n) {
        if (n == 0) return 1.0;

        return n < 0
                ? 1.0 / solve(x, -n)
                : solve(x, n);
    }
}