package NeetCode.stacks;
/*
Valid Parentheses
Solved
You are given a string s consisting of the following characters: '(', ')', '{', '}', '[' and ']'.

The input string s is valid if and only if:

Every open bracket is closed by the same type of close bracket.
Open brackets are closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
Return true if s is a valid string, and false otherwise.

Example 1:

Input: s = "[]"

Output: true
Example 2:

Input: s = "([{}])"

Output: true
Example 3:

Input: s = "[(])"

Output: false
Explanation: The brackets are not closed in the correct order.

Constraints:

1 <= s.length <= 1000


Recommended Time & Space Complexity
You should aim for a solution with O(n) time and O(n) space, where n is the length of the given string.


Hint 1
A brute force solution would be to continuously remove valid brackets until no more can be removed. If the remaining string is empty, return true; otherwise, return false. This would result in an O(n^2) solution. Can we think of a better approach? Perhaps a data structure could help.


Hint 2
We can use a stack to store characters. Iterate through the string by index. For an opening bracket, push it onto the stack. If the bracket is a closing type, check for the corresponding opening bracket at the top of the stack. If we don't find the corresponding opening bracket, immediately return false. Why does this work?


Hint 3
In a valid parenthesis expression, every opening bracket must have a corresponding closing bracket. The stack is used to process the valid string, and it should be empty after the entire process. This ensures that there is a valid substring between each opening and closing bracket.
 */

public class ValidParentheses {
    public boolean isValid(String s) {
        char[] chrs=s.toCharArray();
        if(chrs.length%2!=0)
            return false;
        String ans="";
        for(int i=0;i<chrs.length;i++){
            char ch = chrs[i];
            switch (ch) {
                case '{':
                case '(':
                case '[': {
                    ans+=ch;
                    break;
                }
                case '}': {
                    if(ans!=""&&ans.charAt(ans.length()-1)=='{'){
                        ans = ans.substring(0,ans.length()-1);
                    }
                    else
                        return false;
                    break;
                }
                case ')':{
                    if(ans!=""&&ans.charAt(ans.length()-1)=='('){
                        ans = ans.substring(0,ans.length()-1);
                    }
                    else
                        return false;
                    break;
                }
                case ']':{
                    if(ans!=""&&ans.charAt(ans.length()-1)=='['){
                        ans = ans.substring(0,ans.length()-1);
                    }
                    else
                        return false;
                    break;
                }
                default : System.out.print("DEF");
            }
        }
        return ans.isEmpty();
    }
}
