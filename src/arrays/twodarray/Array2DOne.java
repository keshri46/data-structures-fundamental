package arrays.twodarray;

class Array2DOne {
    int[][] arr;

    //Time complexity of tdaCreation is O(n^2)
    public Array2DOne(int row_size,int col_size) {
        arr=new int[row_size][col_size];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col]=Integer.MIN_VALUE;
            }
        }
    }

    //Time complexity of tdaInsertion is O(1)
    public void tdaInsertion(int row,int col,int value){
        try {
            if (arr[row][col]==Integer.MIN_VALUE){
                arr[row][col]=value;
                System.out.println("The value "+value+" is inserted at row > "+row+" and column > "+col);
            }
            else
                System.out.println("The block is already filled");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid Row and Column");
        }
    }

    //Time complexity of tdaTraverse is O(n^2)
    public void tdaTraverse(){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col]+"  ");
            }
            System.out.println();
        }
    }

    //Time complexity of tdaPrintValue is O(1)
    public void tdaPrintValue(int row,int col){
        try {
            if (arr[row][col]==Integer.MIN_VALUE){
                System.out.println("The block is empty with default value > "+arr[row][col]);
            }
            else
                System.out.println("The value "+arr[row][col]+" is present at row > "+row+" and column > "+col);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid Row and Column");
        }
    }

    //Time complexity of tdaSearching is O(n^2)
    public void tdaSearching(int value){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col]==value) {
                    System.out.println("The value "+arr[row][col]+" is present at row > "+row+" and column > "+col);
                    return;
                }
            }
            System.out.println("Value not found!");
        }
    }

    //Time complexity of tdaDeletion is O(1)
    public void tdaDeletion(int row,int col){
        try {
            if (arr[row][col]==Integer.MIN_VALUE){
                System.out.println("The block is already empty with default value > "+arr[row][col]);
            }
            else {
                System.out.println("The value " + arr[row][col] + " is deleted from row > " + row + " and column > " + col);
                arr[row][col]=Integer.MIN_VALUE;
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid Row and Column");
        }
    }

    public static void main(String[] args) {
        Array2DOne array2DOneObject = new Array2DOne(3,3);

        array2DOneObject.tdaInsertion(0,0,0);
        array2DOneObject.tdaInsertion(0,0,100);
        array2DOneObject.tdaInsertion(1,1,10);
        array2DOneObject.tdaInsertion(2,2,20);
        array2DOneObject.tdaInsertion(3,3,30);

        array2DOneObject.tdaTraverse();

        array2DOneObject.tdaPrintValue(1,1);
        array2DOneObject.tdaPrintValue(2,2);
        array2DOneObject.tdaPrintValue(0,0);
        array2DOneObject.tdaPrintValue(1,2);
        array2DOneObject.tdaPrintValue(3,3);

        array2DOneObject.tdaSearching(10);
        array2DOneObject.tdaSearching(20);
        array2DOneObject.tdaSearching(200);

        array2DOneObject.tdaDeletion(0,0);
        array2DOneObject.tdaDeletion(0,2);
        array2DOneObject.tdaDeletion(2,0);

        array2DOneObject.tdaTraverse();

    }

}
