import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        testLinkedList();
    }
    private static void testLinkedList(){
        LinkedList linkedList=new LinkedList();
        linkedList.addFirst(0);
        linkedList.addLast(10);
        linkedList.addLast(20);
        linkedList.addLast(30);
        linkedList.addLast(40);
        linkedList.reverse();
        System.out.println(Arrays.toString(linkedList.toArray()));
    }
}
