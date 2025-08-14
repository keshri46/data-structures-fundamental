package NeetCode.onefifty;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Group Anagrams
Solved
Given an array of strings strs, group all anagrams together into sublists. You may return the output in any order.

An anagram is a string that contains the exact same characters as another string, but the order of the characters can be different.

Example 1:

Input: strs = ["act","pots","tops","cat","stop","hat"]

Output: [["hat"],["act", "cat"],["stop", "pots", "tops"]]
Example 2:

Input: strs = ["x"]

Output: [["x"]]
Example 3:

Input: strs = [""]

Output: [[""]]
Constraints:

1 <= strs.length <= 1000.
0 <= strs[i].length <= 100
strs[i] is made up of lowercase English letters.


Recommended Time & Space Complexity
You should aim for a solution with O(m * n) time and O(m) space, where m is the number of strings and n is the length of the longest string.


Hint 1
A naive solution would be to sort each string and group them using a hash map. This would be an O(m * nlogn) solution. Though this solution is acceptable, can you think of a better way without sorting the strings?


Hint 2
By the definition of an anagram, we only care about the frequency of each character in a string. How is this helpful in solving the problem?


Hint 3
We can simply use an array of size O(26), since the character set is a through z (26 continuous characters), to count the frequency of each character in a string. Then, we can use this array as the key in the hash map to group the strings.
 */
public class GroupAnagrams{
    public List<List<String>> groupAnagrams(String[] strs) {
        Arrays.sort(strs);
        printArray(strs);
        List<String> stringList = new ArrayList<>();
        List<List<String>> outputList = new ArrayList<>();
        for(int i=0;i<strs.length-1;i++){
            if(strs[i]==null)
                continue;
            char[] charri = strs[i].toCharArray();
            //System.out.println("i : " + new String(charri));
            Arrays.sort(charri);
            boolean found = false;
            for(int j=i+1;(j<strs.length);j++){
                if(strs[j]==null)
                    continue;
                else if(strs[j].length()==strs[i].length()){
                    char[] charrj = strs[j].toCharArray();
                    Arrays.sort(charrj);
                    //System.out.println("j : " + new String(charrj));
                    if(Arrays.equals(charri,charrj)){
                        if(stringList.isEmpty()){
                            stringList.add(strs[i]);
                            //System.out.println(stringList);
                        }
                        //System.out.println(stringList);
                        stringList.add(strs[j]);
                        strs[j]=null;
                        found = true;
                    }
                }
            }
            // System.out.println(stringList);
            if(!found&&strs[i]!=null){
                System.out.println(strs[i]);
                stringList.add(strs[i]);
            }
            if(!stringList.isEmpty()){
                outputList.add(stringList);
                stringList = new ArrayList<>();
            }

        }
        if(strs.length < 2){
            outputList.add(Arrays.asList(strs));
            return outputList;
        }
        if(strs[strs.length-1]!=null) {
            stringList = new ArrayList<>();
            stringList.add(strs[strs.length-1]);
            outputList.add(stringList);
        }
        return outputList;
    }

    public void printArray(String[] strs){
        for(String str:strs)
            System.out.print("\""+str+"\" , ");
    }
}
