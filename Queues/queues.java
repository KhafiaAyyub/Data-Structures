import java.util.*;

public class QueuesIntro {
    public static void main(String[] args){
        Queue<Integer> que = new ArrayDeque<>();
        
        que.add(10);
        System.out.println(que); //10
        que.add(20);
        System.out.println(que);//10,20
        que.add(30);
        System.out.println(que);//10,20,30

        System.out.println(que.peek());//10
        System.out.println(que);//10,20,30

        System.out.println(que.remove());//10
        System.out.println(que);//20,30
        
    }
}
