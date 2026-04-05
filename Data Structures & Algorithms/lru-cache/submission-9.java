class LRUCache {
    int capacity;
    HashMap<Integer, Integer> cacheMap = new HashMap<>();
    Deque<Integer> order = new ArrayDeque<>();

    public LRUCache(int capacity) {
        this.capacity = capacity;
    }
    
    public int get(int key) {
        if (!cacheMap.containsKey(key)) return -1;
        order.remove(key);
        order.push(key);
        return cacheMap.getOrDefault(key, -1);
    }
    
    public void put(int key, int value) {
        if (cacheMap.containsKey(key)) {
            order.remove(key);
        } else if (cacheMap.size() == capacity) {
            int lru = order.pollLast();
            cacheMap.remove(lru);
        }

        order.push(key);
        cacheMap.put(key, value);
    }
}
