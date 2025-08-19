package NeetCode.onefifty;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Encode and Decode Strings
Solved
Design an algorithm to encode a list of strings to a single string. The encoded string is then decoded back to the original list of strings.

Please implement encode and decode

Example 1:

Input: ["neet","code","love","you"]

Output:["neet","code","love","you"]
Example 2:

Input: ["we","say",":","yes"]

Output: ["we","say",":","yes"]
Constraints:

0 <= strs.length < 100
0 <= strs[i].length < 200
strs[i] contains only UTF-8 characters.


Recommended Time & Space Complexity
You should aim for a solution with O(m) time for each encode() and decode() call and O(m+n) space, where m is the sum of lengths of all the strings and n is the number of strings.


Hint 1
A naive solution would be to use a non-ascii character as a delimiter. Can you think of a better way?


Hint 2
Try to encode and decode the strings using a smart approach based on the lengths of each string. How can you differentiate between the lengths and any numbers that might be present in the strings?


Hint 3
We can use an encoding approach where we start with a number representing the length of the string, followed by a separator character (let's use # for simplicity), and then the string itself. To decode, we read the number until we reach a #, then use that number to read the specified number of characters as the string.
 */


public class EncodeAndDecodeString {

    public String encode(List<String> strs) {
        if(!strs.isEmpty())
            return String.join("__yoyoyo__", strs);
        return "____";
    }

    public List<String> decode(String str) {
        if(str!="____")
            return new ArrayList<String>(Arrays.asList(str.split("__yoyoyo__")));
        return new ArrayList<String>();
    }
}
