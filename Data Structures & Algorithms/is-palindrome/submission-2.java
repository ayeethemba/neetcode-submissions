class Solution {
    public boolean isPalindrome(String s) {
        if (s.length() == 0) {
            return true;
        }
       
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            char front = s.charAt(left);
            char back = s.charAt(right);
            while (left < right && !Character.isLetterOrDigit(front)) {
                left += 1;
                front = s.charAt(left);
            }
            while (left < right && !Character.isLetterOrDigit(back)) {
                right -= 1;
                back = s.charAt(right);
            }

            if(Character.toLowerCase(front) != Character.toLowerCase(back)) {
                return false;
            }
            left += 1;
            right -= 1;
        }

        return true;


        

        

        
        
    }
}
