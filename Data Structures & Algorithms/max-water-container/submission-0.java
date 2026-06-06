class Solution {
    public int maxArea(int[] heights) {
        int max = 0;
        
        for (int i = 0; i < heights.length; i++) {
            for(int j = 1; j < heights.length; j++) {
                double raw = (Math.min(heights[i], heights[j])) * Math.abs(j - i);
                int curr = (int)raw;
                if (curr > max) {
                    max = curr;
                }
            }
        }

        return max;




        
        
    }
}
