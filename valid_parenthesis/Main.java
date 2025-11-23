package valid_parenthesis;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String args[]){
        System.out.println(isValid("()"));
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("(]"));
        System.out.println(isValid("([])"));
        System.out.println(isValid("([)]"));
        
    }

     public static boolean isValid(String s) {

        //iterate through every character
        Deque<Character> stack = new  ArrayDeque<>();
        for(int i=0;i<s.length();i++){
            char currentChar = s.charAt(i);
            Character top = stack.peek();
            //System.out.println(currentChar);
            //System.out.println("current map: "+stack.toString());

            if(top==null){
                stack.push(currentChar);
                continue;
            }
            if(currentChar=='(' || currentChar=='{' || currentChar=='['){
                stack.push(currentChar);
            }else{
                if(currentChar==')' && top=='('){
                    stack.pop();
                    continue;
                }
                if(currentChar=='}' && top=='{'){
                    stack.pop();
                    continue;
                }
                if( currentChar==']' && top=='['){
                    stack.pop();
                    continue;
                }
                return false;
            }
                
        }
        return stack.isEmpty();
        
    }


}
