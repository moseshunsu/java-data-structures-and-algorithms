package stack.arrayStack;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(4);
//        boolean result = stack.isEmpty();
//        boolean result = newStack.isFull();
//        System.out.println(result);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
//        stack.push(5);
        int result = stack.pop();
        System.out.println(result);
        int result1 = stack.pop();
        System.out.println(result1);
        System.out.println(stack.peek());
        stack.deleteStack();
    }
}
