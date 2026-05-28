class Solution {
    public boolean isHappy(int n) {
        // Pointer to x
        int x = 0;
        Set<Integer> seen = new HashSet<>();
        
        //Repeat until number(n) equals 1
        while (n != 1) {
            x = 0;
            int length = String.valueOf(n).length();
            for(int i = 0; i < length; i++) {
                x += Math.pow(n % 10, 2);
                n /= 10;
            }
            n = x;
            

            if(seen.contains(n)){
                return false;
            }
            else {
                seen.add(n);
            }
            
        }

        //If not infinite loop return true
        return true;
    }
}
