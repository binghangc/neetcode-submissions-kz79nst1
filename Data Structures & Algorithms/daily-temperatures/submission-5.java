class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        ArrayDeque<Integer> stackIndex = new ArrayDeque<>();
        int[] res = new int[temperatures.length];

        for (int i = 0; i < temperatures.length; i++) {
            while (!stackIndex.isEmpty() && temperatures[i] > temperatures[stackIndex.peek()]) {
                int curr = stackIndex.pop();
                res[curr] = i - curr;
            }

            stackIndex.push(i);
        }

        return res;
    }
}
