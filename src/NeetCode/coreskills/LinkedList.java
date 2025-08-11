package NeetCode.coreskills;

import java.util.ArrayList;

/*
Design Singly Linked List
Solved
Design a Singly Linked List class.

Your LinkedList class should support the following operations:

LinkedList() will initialize an empty linked list.
int get(int i) will return the value of the ith node (0-indexed). If the index is out of bounds, return -1.
void insertHead(int val) will insert a node with val at the head of the list.
void insertTail(int val) will insert a node with val at the tail of the list.
bool remove(int i) will remove the ith node (0-indexed). If the index is out of bounds, return false, otherwise return true.
int[] getValues() return an array of all the values in the linked list, ordered from head to tail.
Example 1:

Input:
["insertHead", 1, "insertTail", 2, "insertHead", 0, "remove", 1, "getValues"]

Output:
[null, null, null, true, [0, 2]]
Example 2:

Input:
["insertHead", 1, "insertHead", 2, "get", 5]

Output:
[null, null, -1]
Note:

The index int i provided to get(int i) and remove(int i) is guaranteed to be greater than or equal to 0.
 */
public class LinkedList {

    int[] arr;
    int currentIndex;
    public LinkedList() {
        arr=new int[10];
        currentIndex=0;
    }

    public void resize(){
        int[] arr2 = new int[arr.length*2];
        for(int i=0;i<arr.length;i++){
            arr2[i]=arr[i];
        }
        arr=arr2;
    }

    public int get(int index) {
        return (index<currentIndex) ? arr[index] : -1 ;
    }

    public void insertHead(int val) {
        if(currentIndex>=arr.length)
            resize();
        int tempArr[] = new int[arr.length];
        tempArr[0]=val;
        currentIndex++;
        for(int i=1;i<currentIndex;i++){
            tempArr[i]=arr[i-1];
        }
        arr=tempArr;
    }

    public void insertTail(int val) {
        if(currentIndex>=arr.length)
            resize();
        arr[currentIndex++]=val;
    }

    public boolean remove(int index) {
        if(index>=currentIndex)
            return false;
        for(int i=index;i<currentIndex;i++){
            if(!((i+1)>=currentIndex))
                arr[i]=arr[i+1];
        }
        currentIndex--;
        return true;
    }

    public ArrayList<Integer> getValues() {
        ArrayList<Integer> val = new ArrayList<>();
        for(int i=0;i<currentIndex;i++){
            val.add(arr[i]);
        }
        return val;
    }
}
