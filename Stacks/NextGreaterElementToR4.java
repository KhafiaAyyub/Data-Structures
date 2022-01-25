import java.io.*;
import java.util.*;

public class NextGreaterElementToR4 {
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
        st.push(arr[arr.length-1]);
        nge[arr.length-1] = -1;
        for(int i=arr.length-2;i>=0;i--){
            //pop
            //print
            //push
            while(st.size()>0 && arr[i] >=st.peek()){
                st.pop();
            }
            if(st.size()==0){
                nge[i] = -1;
            }else{ //stack k top p bada element ho 
                nge[i]=st.peek();
            }
            st.push(arr[i]);

        }


        return nge;
      }
    
}
