class Solution {
    public int evalRPN(String[] tokens) {
        Deque<String> tokenStack = new ArrayDeque<>();

        for (String s : tokens) {
            if (s.equals("+") || s.equals("-") || s.equals("/") || s.equals("*")) {
                int rightOperand = Integer.parseInt(tokenStack.pop());
                int leftOperand = Integer.parseInt(tokenStack.pop());
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

                tokenStack.push(String.valueOf(result));
            } else {
                tokenStack.push(s);
            }
        }

        return Integer.parseInt(tokenStack.pop());
    }
}
