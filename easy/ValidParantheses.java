/*Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Note that an empty string is also considered valid.

Example 1:
Input: "()[]{}"
Output: true

Example 2:
Input: "(]"
Output: false

Example 3:
Input: "([)]"
Output: false


Solution - 
The catch - While iterating and reaching a closing paranthesis, check if the top element of stack has the same closing paranthesis
(which was added when the opening paranthesis was iterated)

*/



class ValidParantheses {
    public boolean isValid(String s) {
        Stack<Character> theStack = new Stack<Character>();
    
        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i)=='(')
                theStack.push(')');
            else if(s.charAt(i)=='{')
                theStack.push('}');
            else if(s.charAt(i)=='[')
                theStack.push(']');
            else if(theStack.isEmpty() || theStack.pop() != s.charAt(i))
                return false;
        }
        return theStack.isEmpty();  
    }
}
