/***
 * This File contains all methods used in Operations.java
 * 
 * Owner: Kartik Agarwal
 */
import java.util.Arrays;
import java.util.Collections;

public class Methods { 

    // This function continuously takes a number as input and replaces it with the sum of its digits until the number is reduced to a single digit.
    // It takes long integer as an input and returns integer
    public static void DigitSum(long inputInteger){
        Constant constant = new Constant();
        if(inputInteger < 0){
            System.out.println(constant.Invalid_Input);
        }else{
            while (inputInteger >= 10) {
                int sum = 0;
                while (inputInteger > 0) {
                    sum += inputInteger % 10; 
                    inputInteger /= 10;
                }
                inputInteger = sum;
            }
            System.out.println(constant.Output + inputInteger);
        }
    }

    // This function generates all valid combinations of the string pairs of parentheses.
    // It takes two character array, two integer and one boolean array.
    public static void CombinationGenerator(char[] inputChar, char[] result, int index, boolean[] boolUsed, int length) {
        if (index == length) {
            for (int i = 0; i < length; i++) {
                System.out.print(result[i]);
            }
            System.out.println();
            return;
        }
        for (int i = 0; i < inputChar.length; i++) {
            if (!boolUsed[i]) {
                boolUsed[i] = true;
                result[index] = inputChar[i];
                CombinationGenerator(inputChar, result, index + 1, boolUsed, length);
                boolUsed[i] = false;
            }
        }
    }

    // This function that finds whether a given number can be expressed as the sum of two or more consecutive natural numbers.
    // It takes one integer value.
    // It also has one sub function to print the numbers.
    public static void NumberSummer(int target){
        Constant constant = new Constant();
        boolean found = false;
        for (int start = 1; start <= target / 2; start++) {
            int sum = 0;
            for (int num = start; sum < target; num++) {
                sum += num;
                if (sum == target) {
                    found = true;
                    printConsecutiveNumbers(start, num);
                }
            }
        }

        if (!found) {
            System.out.println(constant.NotAvailable + target);
        }
    }

    // This functions prints the output of NumberSummer function
    // It takes two integer value as input
    private static void printConsecutiveNumbers(int startIndex, int endIndex) {
        for (int i = startIndex; i <= endIndex; i++) {
            if (i == endIndex) {
                System.out.print(i);
            } else {
                System.out.print(i + " + ");
            }
        }
        System.out.println();
    }

    // This function takes an unsorted array of digits and a series of integers. 
    // It encodes the highest digits, based on the provided series, into their corresponding ASCII characters.
    // It also has a sub function Reverse
    public static void Encoding(int[] array, int[] series){
        Constant constant = new Constant();
        if(array.length < series.length){
            System.out.println(constant.Invalid_Input);
        }
        Arrays.sort(array);
        array = Reverse(array);
        String output = "";
        for(int seriesValue: series){
            char value = (char) (array[seriesValue-1] + 48);
            output = output + (int) value;
        }
        System.out.println(output);
    }

    // This function reverses the sorted array provided by Encoding function
    private static int[] Reverse(int[] array){
        int startIndex = 0, endIndex = array.length - 1;
        while(startIndex <= endIndex){
            int temp = array[startIndex];
            array[startIndex] = array[endIndex];
            array[endIndex] = temp;
            startIndex++; endIndex--;
        }
        return array;
    }

    // This function take an input string and a shift pattern array. For each character in the string, apply the corresponding shift value from the pattern array.
    // It takes one string and one array as an input
    public static void CaesarCipher(String inputString, int[] array){
        Constant constant = new Constant();
        int j = 0;
        String output = "";
        for(int i = 0; i < inputString.length(); i++){
            char value = inputString.charAt(i);
            if(j == array.length){
                j = 0;
            }
            if(value >= 'A' && value <= 'Z' || value >= 'a' && value <= 'z'){
                output += (char) ((int)value + array[j++]);
            }
            else{
                output += value;
            }
        }
        System.out.println(constant.Output + output);
    }

    public static String charRemoveAt(String str, int p) {
        return str.substring(0, p) + str.substring(p + 1);
    }
}
