import java.io.*;
import java.util.*;

public class MinStack {

  public static class MinStack1 {
    Stack<Integer> allData;
    Stack<Integer> minData;

    public MinStack1() {
      allData = new Stack<>();
      minData = new Stack<>();
    }


    int size() {
      // write your code here  
    }

    void push(int val) {
      // write your code here
    }

    int pop() {
      // write your code here
    }

    int top() {
      // write your code here
    }

    int min(){
  	  // write your code here
    }
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    MinStack st = new MinStack();

    String str = br.readLine();
    while(str.equals("quit") == false){
      if(str.startsWith("push")){
        int val = Integer.parseInt(str.split(" ")[1]);
        st.push(val);
      } else if(str.startsWith("pop")){
        int val = st.pop();
        if(val != -1){
          System.out.println(val);
        }
      } else if(str.startsWith("top")){
        int val = st.top();
        if(val != -1){
          System.out.println(val);
        }
      } else if(str.startsWith("size")){
        System.out.println(st.size());
      } else if(str.startsWith("min")){
        int val = st.min();
        if(val != -1){
          System.out.println(val);
        }
      }
      str = br.readLine();
    }
  }
}
