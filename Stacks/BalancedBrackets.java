import java.util.*;

public class BalancedBrackets3 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        Stack<Character> st = new Stack<>();
        for(int i=-0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch == '(' || ch == '{' || ch == '['){
                st.push(ch);

                }else if(ch == ')'){
                boolean val = handleClosing(st, '(');
                if(val == false){
                    System.out.println(val);
                    return;
                }

                }else if(ch == '}'){
                   boolean val =  handleClosing(st, '}');
                   if(val == false){
                    System.out.println(val);
                    return;
                }
                }else if(ch == ']'){
                   boolean val =handleClosing(st, ']');
                   if(val == false){
                    System.out.println(val);
                    return;
                }

                }
                if(st.size()==0){
                System.out.println(true);
                }else{
                    System.out.println(false); //opening bracket size zada thai
                }

            }
        }
    

        public static boolean handleClosing(Stack<Character> st, char corresch){
        if(st.size()==0){   //extra h closing sb pop ho chuka hai
            System.out.println(false);
            return false;
        }else if(st.peek() != corresch){  //mismatch case 
            System.out.println(false);
            return false;
        }else{
            st.pop();
            return true;
        }
    }
}



