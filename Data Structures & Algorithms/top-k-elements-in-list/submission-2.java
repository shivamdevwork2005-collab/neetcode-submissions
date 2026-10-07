class Pair implements Comparable<Pair> {
    int freq;
    int ele;

    Pair(int freq, int ele) {
        this.freq = freq;
        this.ele = ele;
    }

    @Override
    public int compareTo(Pair other) {
         if (this.freq == other.freq) {
            return Integer.compare(this.ele, other.ele);
        }
        return Integer.compare(this.freq, other.freq);
    }
}

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
         // Frequency Map
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Pair> pq = new PriorityQueue();

        // Traverse map
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int ele = entry.getKey();
            int freq = entry.getValue();

            pq.add(new Pair(freq, ele));

            if (pq.size() > k) {
                pq.poll();
            }
        }

        // Extract answer
        int[] ans = new int[k];
        int i = 0;

        while (!pq.isEmpty()) {
            ans[i++] = pq.poll().ele;
        }
        return ans;
    }
}




















