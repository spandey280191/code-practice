package leetCode.Others;

import java.util.LinkedList;
import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {

        Stack<String> stack = new Stack<>();
        String arr[] = s.split("");

        for (int i = 0; i < arr.length; i++) {

            switch (arr[i]) {
                case "(":
                    stack.push(")");
                    break;
                case "{":
                    stack.push("}");
                    break;
                case "[":
                    stack.push("]");
                    break;
                case "]":
                    if (stack.size()==0 || !stack.pop().equals("]"))
                        return false;
                    break;
                case "}":
                    if (stack.size()==0 || !stack.pop().equals("}"))
                        return false;
                    break;
                case ")":
                    if (stack.size()==0 || !stack.pop().equals(")"))
                        return false;
                    break;
            }


        }
        if(stack.size()!=0){
            return false;
        }
        return true;

    }

    public static void main(String[] args) {
        ValidParentheses v = new ValidParentheses();
        boolean result = v.isValid("(){[}]");
        System.out.println(result);
    }
}
