package Stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class Expression {

    private final ArrayList<Character> leftBrackets = (ArrayList<Character>) Arrays.asList('(','<','[','{');
    private final ArrayList<Character> rightBrackets = (ArrayList<Character>) Arrays.asList(')','>',']','}');

    public boolean isBalanced(String input) {
        if (input == null) throw new IllegalArgumentException();

        Stack<Character> stack = new Stack<>();

        for (char ch : input.toCharArray()) {
            if (isLeftBracket(ch)) stack.push(ch);
            if (isRightBracket(ch)) {
                if (stack.empty()) return false;

                Character top = stack.pop();
                if (!bracketsMatch(top, ch)) return false;
            }
        }

        return stack.empty();
    }

    private boolean isLeftBracket(Character ch) {
        return leftBrackets.contains(ch);
    }

    private boolean isRightBracket(Character ch) {
        return rightBrackets.contains(ch);
    }

    private boolean bracketsMatch(Character left, Character right) {
        return leftBrackets.indexOf(left) == rightBrackets.indexOf(right);
    }
}
