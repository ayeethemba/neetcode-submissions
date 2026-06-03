class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for (int x : nums) {
            seen.add(x);
        }
        int maxSequence = 0;
        List<Integer> currSequence = new ArrayList<>(); 
        for (int i = 0; i < nums.length; i++) {
            if (seen.contains(nums[i] - 1)) {
                continue;
            }
            else {
                int x = nums[i];
                currSequence.add(x);
                while(seen.contains(x + 1)) {
                    currSequence.add(x + 1);
                    x += 1;   
                }
                if (maxSequence < currSequence.size()){
                    maxSequence = currSequence.size();
                }
                currSequence.clear();
            }
        }

        return maxSequence;
    }
}
