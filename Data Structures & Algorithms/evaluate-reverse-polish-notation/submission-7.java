class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> tokenStack = new ArrayDeque<>();

        for (String s : tokens) {
            if (s.equals("+") || s.equals("-") || s.equals("/") || s.equals("*")) {
                int rightOperand = tokenStack.pop();
                int leftOperand = tokenStack.pop();
                int result = 0;

                switch (s) {
                    case "+":
                        result = leftOperand + rightOperand;
                        break;
                    case "-":
                        result = leftOperand - rightOperand;
                        break;
                    case "/":
                        result = leftOperand / rightOperand;
                        break;
                    case "*":
                        result = leftOperand * rightOperand;
                        break;
                }

                tokenStack.push(result);
            } else {
                tokenStack.push(Integer.parseInt(s));
            }
        }

        return tokenStack.pop();
    }
}
