package numbers;

import java.util.Scanner;

public class PreviousPrime {

    static int findPreviousPrime(Scanner sc) {
        System.out.print("Enter number for finding previous prime number : ");
        int num = sc.nextInt();
        while (true){
            if (isPrime(--num))
                return num;
        }
    }

    static private boolean isPrime(int num) {
        for (int i = 2; i < num / 2; i++)
            if (num % i == 0)
                return false;
        return true;
    }
}
