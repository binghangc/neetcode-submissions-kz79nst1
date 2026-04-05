class Solution {
    public boolean isValid(String s) {
        Stack stack = new Stack();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }

            if (c == ')' || c == '}' || c == ']') {
                if (stack.empty()) return false;

                char recentChar = (char) stack.pop();
                
                if (c == ')' && recentChar != '(') return false;
                if (c == '}' && recentChar != '{') return false;
                if (c == ']' && recentChar != '[') return false;
            }
        }

        if (stack.empty()) return true;

        return false;
    }
}
