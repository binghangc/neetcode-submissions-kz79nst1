class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> tokenStack = new ArrayDeque<>();

        for (String s : tokens) {
            switch (s) {
                case "+":
                    tokenStack.push(tokenStack.pop() + tokenStack.pop());
                    break;
                case "-": {
                    int right = tokenStack.pop();
                    int left = tokenStack.pop();
                    tokenStack.push(left - right);
                    break;
                }
                case "/": {
                    int right = tokenStack.pop();
                    int left = tokenStack.pop();
                    tokenStack.push(left / right);
                    break;
                }
                case "*":
                    tokenStack.push(tokenStack.pop() * tokenStack.pop());
                    break;
                default:
                    tokenStack.push(Integer.parseInt(s));
            }
        }

        return tokenStack.pop();
    }
}
