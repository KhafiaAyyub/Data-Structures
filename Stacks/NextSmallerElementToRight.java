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
