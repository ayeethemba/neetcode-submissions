class Solution {
    public double myPow(double x, int n) {
        double z = x;

        if (n == 0) {
            return 1.0000;
        }
        if (n > 0) {
            for(int i = 1; i < n; i++) {
                z *= x;
            }
            return z;
        }
        else {
            for (int i = 1; i < Math.abs(n); i++) {
                z *= x;
            }
            return (double) 1 / z;

        }
        
    }
}
