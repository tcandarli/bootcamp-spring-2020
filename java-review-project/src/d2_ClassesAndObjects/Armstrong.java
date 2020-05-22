package d2_ClassesAndObjects;

/*
TASK - 2
Create a method that will accept a number and check if the number is an Armstrong number. If the number
is an Armstrong number return true otherwise return false.
 */

public class Armstrong {

    // 153 > 1^3 + 5^3 + 3^3 == 153
    // 1^3 = 1 * 1 * 1
    // 5^3 = 5 * 5 * 5

    public static void main(String[] args) {

        System.out.println(isArmstrong(153));

    }

    public static boolean isArmstrong(int num) {

        String number = String.valueOf(num);
        int power = number.length();
        int sum = 0;

        for (int i = 0; i<number.length(); i++) {
            int digit = Integer.parseInt( "" + number.charAt(i));
            sum += Math.pow(digit, power);
        }
        return sum == num;
    }

}
