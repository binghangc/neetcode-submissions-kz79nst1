class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramMap = new HashMap<>();

        for (String str : strs) {
            int[] freqArr = new int[26];
            for (char c : str.toCharArray()) {
                freqArr[c - 'a']++;
            }

            String key = Arrays.toString(freqArr);

            List<String> res = anagramMap.getOrDefault(key, new ArrayList<>());
            res.add(str);
            anagramMap.put(key, res);
        }

        List<List<String>> res = new ArrayList<>();

        for (String key : anagramMap.keySet()) {
            res.add(anagramMap.get(key));
        }

        return res;


    }
}
