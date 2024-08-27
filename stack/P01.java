package stack;

import java.util.Stack;

public class P01 {

    public static void main(String arg[]) {
        Stack st = new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        System.out.println("Stack: " + st);

        System.out.println("Peek: " + st.peek());
    }
}
