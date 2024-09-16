import java.util.Stack;

public class ValidParentheses {

    public static boolean isValid(String str) {
        Stack<Character> st = new Stack<>();
        
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch=='(' || ch=='{' || ch=='['){    // if str is opening brackets
                st.push(ch);
            }
            else{   // if str is closing brackets

                if(st.isEmpty()) return false;

                if(st.peek()=='(' && ch==')' 
                || st.peek()=='{' && ch=='}'
                || st.peek()=='[' && ch==']'){
                    st.pop(); 
                }
                else{
                    return false;
                }
            }
        }

        if(st.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        String str1 = "([{}])";   // true
        String str2 = "(([))]";  // false
        String str3 = "){}(";  // false
        System.out.println(isValid(str1));        
        System.out.println(isValid(str2));        
        System.out.println(isValid(str3));        
    }
}
