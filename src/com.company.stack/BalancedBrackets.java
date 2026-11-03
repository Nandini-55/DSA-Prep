
import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {
    public static void main(String[] args) {
        Stack<Character> st = new Stack<>();

        Scanner src = new Scanner(System.in);

        String exp = src.next();
        int balance = 0;
        for (char ch : exp.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if ((ch == ')' && st.peek() == '(') || (ch == '}' && st.peek() == '{')
                        || (ch == ']' && st.peek() == '[')) {
                    st.pop();
                } else {
                    balance = 1;
                    break;
                }
            }
        }

        if (balance == 0 && st.isEmpty()) {
            System.out.println("Expression is balanced. ");
        } else {
            System.out.println("Expression is not balanced. ");
        }
    }
}
