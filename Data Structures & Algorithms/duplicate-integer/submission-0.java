class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> setNums = new HashSet<>();

        for (int x : nums) {
            setNums.add(x);
        }

        return !(nums.length == setNums.size());

        
        
    }
}