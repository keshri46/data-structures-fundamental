public class Practice {
    public static void main(String[] args) {
        PracticeArrays practiceArrays = new PracticeArrays();
        practiceArrays.findMax();
        practiceArrays.findEvenOdd();
        practiceArrays.reverseArray();
        practiceArrays.findSecondMax();
    }
}

class PracticeArrays {
    int[] arr;
    PracticeArrays(int[] arr){
        this.arr=arr;
    }
    PracticeArrays(){
        this.arr = new int[]{1, 2, 4, 5, 7, 8, 10, 11, 13, 14};
    }
    void printArray(int[] arr){
        for(int n:arr)
            System.out.print(n+", ");
        System.out.println();
    }
    void findMax(){
        int max=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(max<arr[i])
                max=arr[i];
        }
        System.out.println("Max : "+max );
    }
    void findEvenOdd(){
        int e=0,o=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0)
                e++;
            else
                o++;
        }
        printArray(arr);
        System.out.println("Even : "+e );
        System.out.println("Odd : "+o );
    }
    void reverseArray(){
        int[] reverseArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reverseArray[i]=arr[arr.length-1-i];
        }
        printArray(reverseArray);
    }
    void findSecondMax() {
        int max = arr[0];
        int secondMax = Integer.MIN_VALUE;
        boolean foundSecondMax = false;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
                foundSecondMax = true;
            } else if (arr[i] > secondMax && arr[i] < max) {
                secondMax = arr[i];
                foundSecondMax = true;
            }
        }

        if(foundSecondMax) {
            System.out.println("Second Largest: " + secondMax);
        } else {
            System.out.println("No second largest element found.");
        }
    }

}
