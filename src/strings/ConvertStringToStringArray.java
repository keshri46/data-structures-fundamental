package strings;

import java.util.Arrays;
import java.util.Scanner;

public class ConvertStringToStringArray {

    static void convertStringToStringArrayWithoutSplit(Scanner sc) {
        System.out.print("Enter a string to be converted into string array without split : ");
        String str = sc.nextLine().trim();
        //We are using split to find the length of the array, that's it !
        System.out.println(Arrays.toString(str.split(" ")));
        String[] stringArray = new String[str.split(" ").length];
        String temp = "";
        int index = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ')
                temp += str.charAt(i);
            else {
                stringArray[index++] = temp;
                temp = "";
            }
        }
        stringArray[index++] = temp;
        System.out.println(Arrays.toString(stringArray));
    }

}
