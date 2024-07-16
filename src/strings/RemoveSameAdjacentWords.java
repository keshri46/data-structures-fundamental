package strings;

import java.util.Scanner;

class RemoveSameAdjacentWords {

    static String removeSameAdjacentWordsWithoutEqual(Scanner sc) {
        System.out.print("Enter String to remove adjacent words : ");
        String str = sc.nextLine();
        String[] strArr = str.split(" ");
        String output = "";
        for (int i = 0; i < strArr.length - 1; i++) {
            if (!isEqualString(strArr[i], strArr[i + 1]))
                output += strArr[i] + " ";
        }
        output += strArr[strArr.length - 1];
        return output;
    }

    private static boolean isEqualString(String s, String s1) {
        s = s.toLowerCase();
        s1 = s1.toLowerCase();
        if (s.length() != s1.length())
            return false;
        else {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != s1.charAt(i))
                    return false;
            }
        }
        return true;
    }
}
