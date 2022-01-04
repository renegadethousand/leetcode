import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        ValidParentheses validParentheses = new ValidParentheses();
        System.out.println(validParentheses.isValidStack("()"));
        System.out.println(validParentheses.isValidStack("()[]{}"));
        System.out.println(validParentheses.isValidStack("(]"));
        System.out.println(validParentheses.isValidStack("([)]"));
        System.out.println(validParentheses.isValidStack("{[]}"));
    }

    public boolean isValid(String s) {
        int length;

        do {
            length = s.length();
            s = s.replace("()", "").replace("[]", "").replace("{}", "");
        } while (s.length() != length);
        return length == 0;
    }

    public boolean isValidStack(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (currentChar == '(' || currentChar == '[' || currentChar == '{') {
                stack.push(currentChar);
            } else if (currentChar == ')' && stack.pop() != '(') {
                return false;
            } else if (currentChar == ']' && stack.pop() != '[') {
                return false;
            } else if (currentChar == '}' && stack.pop() != '{') {
                return false;
            }
        }
        return stack.empty();
    }
}
