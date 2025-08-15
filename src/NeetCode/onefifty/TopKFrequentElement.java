package NeetCode.onefifty;
/*
Top K Frequent Elements
Solved
Given an integer array nums and an integer k, return the k most frequent elements within the array.

The test cases are generated such that the answer is always unique.

You may return the output in any order.

Example 1:

Input: nums = [1,2,2,3,3,3], k = 2

Output: [2,3]
Example 2:

Input: nums = [7,7], k = 1

Output: [7]
Constraints:

1 <= nums.length <= 10^4.
-1000 <= nums[i] <= 1000
1 <= k <= number of distinct elements in nums.


Recommended Time & Space Complexity
You should aim for a solution with O(n) time and O(n) space, where n is the size of the input array.


Hint 1
A naive solution would be to count the frequency of each number and then sort the array based on each element’s frequency. After that, we would select the top k frequent elements. This would be an O(nlogn) solution. Though this solution is acceptable, can you think of a better way?


Hint 2
Can you think of an algorithm which involves grouping numbers based on their frequency?


Hint 3
Use the bucket sort algorithm to create n buckets, grouping numbers based on their frequencies from 1 to n. Then, pick the top k numbers from the buckets, starting from n down to 1.
 */



import java.util.*;

public class TopKFrequentElement {
    public int[] topKFrequent(int[] nums, int k) {
        Arrays.sort(nums);
        ArrayList<Integer> numsList = new ArrayList<>();
        HashMap<Integer,Integer> countTrack = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int count=1;
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                    i++;
                }
                else{
                    break;
                }
            }
            countTrack.put(nums[i],count);
        }
        System.out.println(countTrack);
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(countTrack.entrySet());
        Collections.sort(list, (o1, o2) -> o2.getValue().compareTo(o1.getValue()));
        int[] output = new int[k];
        for (int i = 0; i < k; i++) {
            output[i] = list.get(i).getKey();
        }
        //int[] output = numsList.stream().mapToInt(Integer::intValue).toArray();
        return output;
    }
}

