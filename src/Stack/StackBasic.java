package Stack;

import java.util.Stack;

public class StackBasic {
    public static void main(String[] args) {
        Stack<String> st=new Stack<>();
        st.push("me");
        st.push("you");
        st.push("together");
        System.out.println(st.size());
        System.out.println(st);
        System.out.println(st.peek());
    }
}
