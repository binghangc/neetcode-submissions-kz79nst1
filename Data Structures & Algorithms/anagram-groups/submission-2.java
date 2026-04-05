   
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> groupMap = new HashMap<>();

        for (String str : strs) {
            int[] freqArr = new int[26];
            for (char c : str.toCharArray()) {
                freqArr[c - 'a']++;
            }
            String freqKey = Arrays.toString(freqArr);  // FIXED

            groupMap.computeIfAbsent(freqKey, k -> new ArrayList<>()).add(str);  // FIXED
        }

        return new ArrayList<>(groupMap.values());
    }
}