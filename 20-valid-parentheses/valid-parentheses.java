class Solution {
    public boolean isValid(String s) {
        int n = s.length();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);

            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } 
            else {
                if (stack.isEmpty()) {
                    return false;
                }

                char open = stack.peek();

                if (open == '(' && ch == ')' ||
                    open == '[' && ch == ']' ||
                    open == '{' && ch == '}') {

                    stack.pop();
                } 
                else {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}