/*
TASK - 2
Write a program that will count how many times “java” is found in any given String
 */

package d1_StringsAndLoops;

public class countJava {

    public static void main(String[] args) {

        String str = "java is the best. java is fun java";
        int java = 0;

        // approach 1
        for (int i = 0; i < str.length() - 3; i++) {
            if(str.substring(i, i+4).equalsIgnoreCase("java")) java++;

        }
        System.out.println("Java was found " + java);

        // approach 2
        int java2 = 0;
        str = str.toLowerCase();
        while(str.contains("java")) {
            java2++;
            str = str.replaceFirst("java", "");
        }
        System.out.println("Second way - Java was found " + java2 + " times");
    }
}
