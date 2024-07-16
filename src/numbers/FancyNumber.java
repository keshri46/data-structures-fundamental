package numbers;

import java.util.Scanner;

// Finding the previous Palindrome Number
class FancyNumber {
    static int findPreviousPalindrome(Scanner sc){
        System.out.print("Enter Number for finding Fancy Number : ");
        int n = sc.nextInt();
        while(true){
            if(isPalindrome(n))
                return n;
            n--;
        }
    }


    static private boolean isPalindrome(int num) {
        int n = num;
        int rev=0;
        while(n>0){
            rev=rev*10+n%10;
            n/=10;
        }
        return rev==num;
    }
}
