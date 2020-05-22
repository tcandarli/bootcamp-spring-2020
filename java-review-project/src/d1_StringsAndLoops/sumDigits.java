/*
TASK - 5
Create a program that will take any String and print the total sum of all the number in the String.
Note: numbers can be more than digits from 1-9 so if you have “14” next to each other it should be
considered 14 and not 1 and 4 separate
Ex:
Input: “jav45ai15sgre1at82”
Output: (45 + 15 + 1 + 82) = 143
 */

package d1_StringsAndLoops;

public class sumDigits {

    public static void main(String[] args) {

        String str = "jav45ai15sgre1at82";
        int sum = 0;
        String num = "";

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                num += str.charAt(i);
                if (i == str.length() - 1 || !Character.isDigit(str.charAt(i + 1))) {
                    sum += Integer.parseInt(num);
                    num = "";
                }
            }
        }
        System.out.println("Sum of digits in String = " + sum);
    }
}
