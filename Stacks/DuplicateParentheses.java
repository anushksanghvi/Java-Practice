import java.util.Stack;

public class DuplicateParentheses {

    public static boolean isDuplicate(String str){
        Stack<Character> st = new Stack<>();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            
            // closing bracket
            if(ch==')'){
                int count = 0;
                while(st.peek() != '('){
                    st.pop();
                    count++;
                }
                if(count<1){
                    return true;    // Duplicate exist
                }
                else{
                    st.pop();   // popping the opening bracket
                }
            }

            //Opening bracket, operator, operand
            else{
                st.push(ch);
            }
        }
        return false;   // Duplicate does not exist
    }
    public static void main(String[] args) {
        //VALID BALANCED STRING TO BE ENTERED--> 
        String str1 = "((a+b))";    //true
        String str2 = "((a+b)+(c+d))";  // false
        
        System.out.println(isDuplicate(str1));
        System.out.println(isDuplicate(str2));
    }
}
