class Solution {
    public int lengthOfLongestSubstring(String s) {
        int longest = 0;
        Set<Character> unique = new HashSet<>();
        int left = 0;
    

        for (int i = 0; i < s.length(); i++) {
            
            while (unique.contains(s.charAt(i))) {
                unique.remove(s.charAt(left));
                left++;
            }
            unique.add(s.charAt(i));

            longest = Math.max(longest, i - left + 1);


         

            

        }


        return longest;
    




        
    }
}
