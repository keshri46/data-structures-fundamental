package NeetCode.stacks;
/*
Minimum Stack
Solved
Design a stack class that supports the push, pop, top, and getMin operations.

MinStack() initializes the stack object.
void push(int val) pushes the element val onto the stack.
void pop() removes the element on the top of the stack.
int top() gets the top element of the stack.
int getMin() retrieves the minimum element in the stack.
Each function should run in
O
(
1
)
O(1) time.

Example 1:

Input: ["MinStack", "push", 1, "push", 2, "push", 0, "getMin", "pop", "top", "getMin"]

Output: [null,null,null,null,0,null,2,1]

Explanation:
MinStack minStack = new MinStack();
minStack.push(1);
minStack.push(2);
minStack.push(0);
minStack.getMin(); // return 0
minStack.pop();
minStack.top();    // return 2
minStack.getMin(); // return 1
Constraints:

-2^31 <= val <= 2^31 - 1.
pop, top and getMin will always be called on non-empty stacks.


Recommended Time & Space Complexity
You should aim for a solution with O(1) time for each function call and O(n) space, where n is the maximum number of elements present in the stack.


Hint 1
A brute force solution would be to always check for the minimum element in the stack for the getMin() function call. This would be an O(n) appraoch. Can you think of a better way? Maybe O(n) extra space to store some information.


Hint 2
We can use a stack to maintain the elements. But how can we find the minimum element at any given time? Perhaps we should consider a prefix approach.


Hint 3
We use an additional stack to maintain the prefix minimum element. When popping elements from the main stack, we should also pop from this extra stack. However, when pushing onto the extra stack, we should push the minimum of the top element of the extra stack and the current element onto this extra stack.
 */
public class MinimumStack {

    int[] arr;
    int topIndex;

    public MinimumStack() {
        arr =new int[10];
        topIndex=0;
    }

    public void push(int val) {
        if(arr.length==topIndex)
            resize();
        arr[topIndex++]=val;
    }

    public void resize(){
        int[] newArr=new int[2*arr.length];
        for(int i=0;i<arr.length;i++){
            newArr[i]=arr[i];
        }
        arr=newArr;
    }

    public void pop() {
        int num=arr[--topIndex];
        arr[topIndex]=0;
    }

    public int top() {
        return arr[topIndex-1];
    }

    public int getMin() {
        int min=arr[0];
        for(int i=1;i<topIndex;i++)
            if(min>arr[i])
                min=arr[i];
        return min;
    }
}

