class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Deque<Integer> dq = new ArrayDeque<>();
        int[] result = new int[temperatures.length];

        for (int i = 0; i < temperatures.length; i++) {
            while (!dq.isEmpty() && temperatures[dq.peekFirst()] < temperatures[i]) {
                int idx = dq.pop();
                result[idx] = i - idx;
            }

            dq.push(i);
        }

        while(!dq.isEmpty()) {
            result[dq.pop()] = 0;
        }

        return result;
    }
}
