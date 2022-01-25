import java.util.*;

public class StackIntro1 {

    public static void main(String[] args) throws Exception {

        Stack<Integer> stack = new Stack<>(); // push, pop, peek are all 0(1)
       stack.push(10);
       stack.push(20);
       stack.push(30);
       stack.push(40);
       System.out.println(stack);
       stack.pop();
       System.out.println(stack);
       stack.peek();
       System.out.println(stack.peek());
       stack.push(50);
       System.out.println(stack);
      }
    }

