
// ***************************************************************
// ArrayStack.java
//
// An array-based Object stack class with operations push,
// pop, and isEmpty and isFull.
//
// ***************************************************************
public class ArrayStack implements StackADT {

    private int stackSize = 5; // capacity of stack
    private int top; // index of slot for next element
    private Object[] elements;
    // ---------------------------------------------------
    // Constructor -- initializes top and creates array
    // ---------------------------------------------------

    public ArrayStack() {
        elements = new Object[stackSize];
        top = 0;
    }
    // --------------------------------------------------
    // Adds element to top of stack if it's not full, else
    // does nothing.
    // --------------------------------------------------

    @Override
    public void push(Object val) {
        if (isFull()) {
            System.out.println("The stack is full");
        } else {
            elements[top] = val;
            top++;
        }
    }
    // ---------------------------------------------------
    // Removes and returns value at top of stack. If stack
    // is empty returns null.
    // ---------------------------------------------------

    @Override
    public Object pop() {
        if (isEmpty()) {
            return null;
        } else {
            top--;
            Object result = elements[top];
            return result;
        }
    }
    // ---------------------------------------------------
    // Returns true if stack is empty, false otherwise.
    // ---------------------------------------------------

    @Override
    public boolean isEmpty() {
        return top == 0;
    }
    // ---------------------------------------------------
    // Returns true if stack is full, false otherwise.
    // ---------------------------------------------------

    @Override
    public boolean isFull() {
        return top == stackSize;
    }
}
