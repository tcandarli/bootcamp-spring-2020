/*
TASK - 3
Given any String determine if it is Palindrome. Print “Palindrome” if it is and “Not Palindrome” if it is not
 */

package d1_StringsAndLoops;

public class palindrome {

    public static void main(String[] args) {

        String str = "racecar";
        str = str.trim().toLowerCase();
        boolean check = true;

        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                check = false;
                break;
            }
        }

        if (check) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
