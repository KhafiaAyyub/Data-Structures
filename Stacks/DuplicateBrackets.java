import java.util.*;

public class DuplicateBrackets2 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Stack<Character> st = new Stack<>();

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch == ')'){
                if(st.peek() == '('){
                    System.out.println(true);
                    return;
                }else{
                    while(st.peek() != '('){        //jb tk '(' na ajaye
                        st.pop();           //pop-a,b,+
                    }
                    st.pop();
                }
            }else{       
                st.push(ch);  //push-a,b,+
            }
        }
        System.out.println(false);
    }
    
}
