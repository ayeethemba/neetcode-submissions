class Solution {
    public int lastStoneWeight(int[] stones) {
        
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
        

        for (int x : stones) {
            maxHeap.offer(x);
        }



        while(maxHeap.size() >= 2) {
            int first = maxHeap.poll();
            int second = maxHeap.poll();

           int diff = first - second;

           if(diff > 0){
            maxHeap.offer(diff);
           }
        }
        if (maxHeap.isEmpty()) {
            return 0;
        }
        else {
            return maxHeap.poll();
        }


        
        
        
    }
}
