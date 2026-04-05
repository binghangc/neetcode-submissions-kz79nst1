class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> results = new ArrayList<>();
        backtrack(new StringBuilder(), 0, 0, n, results);
        return results;
    }

    public void backtrack(StringBuilder curr, int open, int close, int n, List<String> res) {
        if (curr.length() == n * 2) {
            res.add(curr.toString());
            return;
        }

        if (open < n) {
            curr.append("(");
            backtrack(curr, open + 1, close, n, res);
            curr.deleteCharAt(curr.length() - 1);
        }

        if (close < open) {
            curr.append(")");
            backtrack(curr, open, close + 1, n, res);
            curr.deleteCharAt(curr.length() - 1);
        }
    }
}
