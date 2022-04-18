package Stack;

import java.util.Stack;

public class StringReverser {
    public String reverse(String input){
        if(input==null) throw new IllegalArgumentException();

        Stack<Character> stack = new Stack<>();
        for(char c:input.toCharArray()){
            stack.push(c);
        }
        StringBuffer buffer = new StringBuffer();
        while(!stack.empty()){
            buffer.append(stack.pop());
        }

        return buffer.toString();

    }
}
