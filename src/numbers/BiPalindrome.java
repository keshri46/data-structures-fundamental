package numbers;

import java.util.Scanner;

//A Bi palindrome is a number composed of two palindromes of the same length, and it cannot start with 0.
public class BiPalindrome {

    static boolean isBiPalindrome(Scanner sc) {
        System.out.print("Enter Number for checking Bi-Palindrome : ");
        int n = sc.nextInt();
        int digits = String.valueOf(n).length();
        if (digits % 2 != 0)
            return false;
        return isPalindrome((int) (n / Math.pow(10,digits/2))) && isPalindrome((int) (n % Math.pow(10,digits/2)));

    }

    static private boolean isPalindrome(int num) {
        int n = num;
        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return rev == num;
    }

}
