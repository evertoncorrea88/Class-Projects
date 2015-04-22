
public class LinkedStack {

    private Node top;

    public void LinkedStack() {
        top = null;
    }

//  public void push (int i)—puts an integer on the top of the stack    
    public void push(int i) {
        Node node = new Node(i);
        Node temp = top;
        top = node;
        top.next = temp;
    }

//  public void pop ()—remove an integer from the top of the stack    
    public void pop() {
        if (top != null) {
            top = top.next;
        }
    }

//  public int peek()—return the top integer on the list, without removing it from the list    
    public int peek() {
        if (top != null) {
            return top.val;
        }
        System.out.println("The list is empty");
        return -1;
    }

//  public booleam isEmpty()—return true if the stack is empty    
    public boolean isEmpty() {
        return top == null;
    }

//  public String toString()—return all the integers in the stack as a string, 
//  from top to bottom, separate each number by a space    
    @Override
    public String toString() {
        Node temp = top;
        String result = "";
        while (temp != null) {
            result += temp.val + " ";
            temp = temp.next;
        }
        return result;
    }

    private class Node {

        public int val;
        public Node next;

        public Node(int i) {
            val = i;
            next = null;
        }
    }

}
