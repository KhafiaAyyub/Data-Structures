
import java.io.*;
import java.util.*;

public class LevelOrderZigzag {
  private static class Node {
    int data;
    ArrayList<Node> children = new ArrayList<>();
  }

  public static Node construct(int[] arr) {
    Node root = null;

    Stack<Node> st = new Stack<>();
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == -1) {
        st.pop();
      } else {
        Node t = new Node();
        t.data = arr[i];

        if (st.size() > 0) {
          st.peek().children.add(t);
        } else {
          root = t;
        }

        st.push(t);
      }
    }

    return root;
  }


  public static void levelOrderLinewiseZZ(Node node){
    Stack<Node> ms = new Stack<>();//main stack
    ms.push(node);

    Stack<Node> cs = new Stack<>();//child stack

    int level=1;
    while(ms.size() != 0){
        node = ms.pop();//remove
        System.out.print(node.data+ " ");//print

        if(level %2 == 1){//odd level i.e. 1 and 3
            for(int i=0;i<node.children.size();i++){
                Node child = node.children.get(i);
                cs.push(child);
            }
        }else{
            for(int i=node.children.size()-1;i>=0;i--){
                Node child = node.children.get(i);
                cs.push(child);
            }
        }
        if(ms.size()== 0){
            ms = cs;
            cs =new Stack<>();
            level++;
            System.out.println();
        }
    }
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n];
    String[] values = br.readLine().split(" ");
    for (int i = 0; i < n; i++) {
      arr[i] = Integer.parseInt(values[i]);
    }

    Node root = construct(arr);
    levelOrderLinewiseZZ(root);
  }

}

