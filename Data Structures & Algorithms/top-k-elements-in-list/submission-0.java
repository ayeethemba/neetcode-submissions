class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] mostFrequent = new int[k];
        Map<Integer, Integer> seen = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            if(seen.containsKey(nums[i])) {
                seen.put(nums[i], seen.get(nums[i]) + 1);
            }
            else {
                seen.put(nums[i], 1);
            }
        }


        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> seen.get(b) - seen.get(a));
        seen.forEach((key, value) -> {
            maxHeap.add(key);
        });

        for(int z = 0; z < k; z++) {
            mostFrequent[z] = maxHeap.poll();
        }

        return mostFrequent;




        
    }
}
