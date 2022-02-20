import java.util.*;

public class DisplayGT {
    private  static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();
    }
//d(10) -> 10 will print itself and it's family
//faith -> d  (20),d(30),d(40) will print themselves and their families
//d(10) = s(10) + d(20) + d(30) + d(40)
public static void display(Node node){
    String str = node.data + "->";
    for(Node child:node.children){
        str += child.data + ",";
    }
    str+= ".";
    System.out.println(str);

    for(Node child:node.children){ //call of d(10),d(20),d(30)
        display(child);
    }
}





    public static void main(String[]args) {
        
        int[] arr = {10,20,50,-1,60,-1,-1,30,70,-1,80,110,-1,120,-1,-1,90,-1,-1,40,100,-1,-1,-1};
        Node root = null;
        Stack<Node> st = new Stack<>();

    for(int i =0;i<arr.length;i++){
        if(arr[i] == -1){
            st.pop();
        }else{
            Node t = new Node();//node bnaya
            t.data = arr[i]; //data set krna

            if(st.size() > 0){
            st.peek().children.add(t);
            st.push(t);
            }else{
                root = t;
            }
            st.push(t);
        }
    }
    display(root);
    
    
    }
}


