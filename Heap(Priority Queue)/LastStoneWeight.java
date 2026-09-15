import java.util.*;

class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int i = 0; i < stones.length; i++)
            pq.offer(stones[i]);
        

        while(pq.size() > 1)
            pq.offer(pq.poll() - pq.poll());
            
        return pq.peek();
    }
}
