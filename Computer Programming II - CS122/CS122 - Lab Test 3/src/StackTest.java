
public class StackTest {

    public static void main(String[] args) {
        LinkedStack stack = new LinkedStack();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println(stack);

        stack.pop();

        System.out.println(stack);

        stack.push(6);
        System.out.println("The current top integer is " + stack.peek());

    }

}
