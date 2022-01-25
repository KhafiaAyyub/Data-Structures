import java.io.*;
import java.util.*;

public class LargestAreaHistogram {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
        arr[i] = sc.nextInt();
        }
        //nse to right -> loop from r to l
        int[] rb = new int[arr.length]; //nse index on right (rb-right boundary)
        Stack<Integer> st = new Stack<>();
        st.push(arr.length-1);
        rb[arr.length - 1] = arr.length;

        for(int i=arr.length- 2;i>=0;i--){
            while(st.size() > 0 && arr[i] < arr[st.peek()]){
                st.pop();
            }
            if(st.size() == 0){
                rb[i] = arr.length;
            }else{
                rb[i] = st.peek();
            }
            st.push(i);
        }
        
        //nse index to left
        int[] lb = new int[arr.length];
        st = new Stack<>();
        st.push(0);
        lb[0] = -1;

        for(int i=1;i<arr.length;i++){
            while(st.size() > 0 && arr[i] < arr[st.peek()]){
                st.pop();
            }
            if(st.size() == 0){
                lb[i] = -1;
            }else{
                lb[i] = st.peek();
            }
            st.push(i);
        }

        int maxArea = 0;
        for(int i =0;i<arr.length;i++){
            int width = rb[i] -lb[i] - 1;
            int area = arr[i] * width;
            if(area >  maxArea){  //toh update
                maxArea= area;
            }
        }
        System.out.println(maxArea);
     } 
}
