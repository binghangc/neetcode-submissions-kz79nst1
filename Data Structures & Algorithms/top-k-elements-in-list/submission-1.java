class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // set up hashMap
        HashMap<Integer, Integer> freqTable = new HashMap<>();
        for (int num : nums) {
            freqTable.put(num, freqTable.getOrDefault(num, 0) + 1);
        }
        // set up PQ
        PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>((a, b) -> a.getValue() - b.getValue());

        for (Map.Entry<Integer, Integer> entry : freqTable.entrySet()) {
            minHeap.add(entry);
        }

        // get top k
        while (minHeap.size() > k) {
            minHeap.poll();
        }

        int[] result = new int[k];
        int index = 0;
        for (Map.Entry<Integer, Integer> entry : minHeap) {
            result[index++] = entry.getKey();
        }

        return result;
    }
}
