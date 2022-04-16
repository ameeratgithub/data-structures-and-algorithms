import java.util.NoSuchElementException;

public class LinkedList {
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

    }

    private Node first;
    private Node last;
    private int size;

    public void addLast(int item) {
        Node node = new Node(item);
        if (isEmpty())
            first = last = node;
        else {
            last.next = node;
            last = node;
        }
        size++;
    }

    public void addFirst(int item) {
        Node node = new Node(item);
        if (isEmpty())
            first = last = node;
        else {
            node.next = first;
            first = node;
        }
        size++;
    }



    public int indexOf(int item) {
        int index = 0;
        Node current = first;
        while (current != null) {
            if (current.value == item) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }

    public boolean contains(int item) {
        return indexOf(item) != -1;
    }

    public void removeFirst() {
        if (isEmpty())
            throw new NoSuchElementException();
        size--;
        if (first == last) {
            first = last = null;
            return;
        }

        Node second = first.next;
        first.next = null;
        first = second;
    }

    private void removeLast() {
        if (isEmpty())
            throw new NoSuchElementException();
        size--;
        if (first == last) {
            first = last = null;
            return;
        }
        Node previousNode = getPreviousNode(last);
        if (previousNode != null) {
            last = previousNode;
            last.next = null;
        }

    }

    private Node getPreviousNode(Node node) {
        Node current = first;
        while (current != null) {
            if (current.next == node) return current;
            current = current.next;
        }
        return null;
    }
    public int size(){
        return size;
    }
    public int[] toArray(){
        int[] array=new int[size];
        Node current = first;

        int index=0;

        while (current!=null){
            array[index++]=current.value;
            current=current.next;
        }

        return array;
    }
    private boolean isEmpty() {
        return first == null;
    }
    public void reverse(){
        if(isEmpty()) throw new IllegalArgumentException();

        Node p=first;
        Node c=first.next;
        while (c!=null){
            Node next=c.next;
            c.next=p;
            p=c;
            c=next;
        }
        last=first;
        last.next=null;
        first=p;

    }

}
