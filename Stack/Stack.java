package Stack;

import java.util.Arrays;

public class Stack {
    private int[] stack= new int[10];
    private int numItems=0;
    public void push(int item){
        if(stack.length==numItems){
         throw new StackOverflowError();
            /*
             For Dynamic stack
                        int[] temp= new int[numItems+numItems/2];
                        for(int i=0;i<stack.length;i++){
                            temp[i]=stack[i];
                        }
                        stack=temp;
            */
        }
        stack[numItems++]=item;
    }
    public int pop(){
        if(numItems<1) throw new IllegalStateException();
        return stack[--numItems];
    }
    public int peek(){
        if(numItems<1) throw new IllegalStateException();
        return stack[numItems-1];
    }
    public boolean empty(){
        return numItems < 1;
    }

    @Override
    public String toString(){
        int[] content= Arrays.copyOfRange(stack,0, numItems);
        return Arrays.toString(content);
    }
}
