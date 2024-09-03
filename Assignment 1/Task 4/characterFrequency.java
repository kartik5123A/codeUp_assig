/***
 * Task 2: Character Frequency in a String
Write a Java program that takes a string input and outputs the frequency of
    each character in a compressed form.
    Example 1:
    ● Input: "aabcccdeee"
    ● Output: "a2b1c3d1e3"
    ● Explanation:
    The character 'a' appears 2 times.
    The character 'b' appears 1 time.
    The character 'c' appears 3 times.
    The character 'd' appears 1 time.
    The character 'e' appears 3 times.
    Concatenating these frequencies results in "a2b1c3d1e3".
    Example 2:
    ● Input: "aaaaaaaaaaaa"
    ● Output: "a12"
    ● Explanation:
    The character 'a' appears 12 times.
    The final output is "a12".
    Constraints:
    ● The input string will only contain lowercase English letters.
    ● The input string length will be at most 1000.

    Owner Name: Kartik Agarwal
    DOf : 3/9/2024
 */
import java.util.Scanner;

public class characterFrequency {
    public static String character_frequency(String s1) {
            s1= s1+" ";
            String result = "";
            int count = 1;

            for (int i = 1; i < s1.length(); i++) {
                if (s1.charAt(i) == s1.charAt(i - 1)) {
                    count++;
                }
                else {
                    result =  result + (s1.charAt(i - 1) + String.valueOf(count));
                    count = 1;
                }
            }
            return result;
    }

        public static void main(String[] args) {
            Constant constant = new Constant();
            Scanner sc = new Scanner(System.in);
            System.out.print(constant.ENTER_STRING);

            String s1 =sc.next();

            System.out.println(character_frequency(s1));
        }
    }



