import java.io.*;
import java.util.*;

public class NgetR5 {
    public static void display(int[] a){
        StringBuilder sb = new StringBuilder();
    
        for(int val: a){
          sb.append(val + "\n");
        }
        System.out.println(sb);
      }

      public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
        a[i] = sc.nextInt();
        }
        int[] nge = solve(a);
        display(nge);
     }

     public static int[] solve(int[] arr){
        int[] nge = new int[arr.length];

        Stack<Integer> st = new Stack<>();
        st.push(0);
         
        for(int i=1;i<arr.length;i++){
            //pop //print
            //push
            while(st.size()>0 && arr[i] > arr[st.peek()]){ // jb tk stack mai element h tb tk or
                int pos = st.peek();
                nge[pos] = arr[i];
                st.pop();  //pop small element
            }
            st.push(i);

        }
            while(st.size()>0){
                int pos = st.peek();
                nge[pos] = -1;
                st.pop();
            }
        


        return nge;
      }
    
}
