/***
 * This File contains all methods used in NoLoopOperations.java
 * 
 * Owner: Kartik Agarwal
 */
import java.util.Scanner;
public class Methods {
    static Scanner scanner = new Scanner(System.in);

    // This function prints Nth digit of fibonacci series
    // It takes two long integer and two integer as an input
    // It returns void
    public void NthFibonacci(long firstDigit, long secondDigit, int NthDigit, int count){
        Constant constant = new Constant();
        if(count == NthDigit){System.out.println(constant.Output + secondDigit);}
        else{
            count++;
            long sumOfDigits = firstDigit + secondDigit;
            firstDigit = secondDigit;
            secondDigit = sumOfDigits;
            NthFibonacci(firstDigit, secondDigit, NthDigit, count);
        }
    }

    // This functions prints number of consonants present in a string
    // It takes one character array and two integer as input
    // It returns void
    public static void isConsonant(char[] characterArray, int numberOfConsonant, int index){
        Constant constant = new Constant();
        if(index < characterArray.length){
            char character = characterArray[index];
            if((character >= 'a' && character <= 'z') && !(character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u')){
                numberOfConsonant++;
                index++;
                isConsonant(characterArray, numberOfConsonant, index);
            }
            else{
                index++;
                isConsonant(characterArray, numberOfConsonant, index);
            }
        }
        else{
            System.out.println(constant.Output + numberOfConsonant);
        }
    }

    // This function converts binary number to decimal number
    // It takes three integer as input
    // It returns void
    public static void BinaryToDecimal(int integerInput,int power, int result){
        Constant constant = new Constant();
        if(integerInput > 0){
            int lastDigit = integerInput % 10;
            if(lastDigit != 0 && lastDigit != 1){
                System.out.println(constant.Invalid);
                return;
            }
            result += lastDigit*Math.pow(2, power);
            integerInput /= 10;
            power++;
            BinaryToDecimal(integerInput, power, result);
        }
        else{System.out.println(constant.Output + result);}
    }

    // This function count number of palindrome
    // It takes one string and one integer as integer
    // It also has a sub function isPalindrome
    // It returns void
    public static void countPalindromes(String inputString, int numberOfPalindrome) {
        if (inputString.isEmpty()) {
            System.out.println(numberOfPalindrome);
            return;
        }
        if (inputString.length() == 1) {
            numberOfPalindrome += 1;
            System.out.println(numberOfPalindrome);
            return;
        } 
        else {
            if (isPalindrome(inputString)) {
                numberOfPalindrome += 2;
            } else {
                numberOfPalindrome += 1;
            }
        }
        countPalindromes(inputString.substring(1, inputString.length() - 1), numberOfPalindrome);
    }

    // This function returns if a string is palindrome or not to countPalindrome
    // It takes String as an Input
    // It returns boolean
    public static boolean isPalindrome(String string) {
        if (string.length() == 1 || string.isEmpty()){return true;}
        if (string.charAt(0) == string.charAt(string.length() - 1)) {
            isPalindrome(string.substring(1, string.length() - 1));
        } 
        else {return false;}
        return true;
    }
    
    // This function converts a string to camel case
    // It takes two string and two boolean inputs
    // It returns string
    public static String ToCamel(String originalString, boolean makeNextUppercase, boolean isFirstCharacter, String result) {
        if (originalString.isEmpty()) {return result;}
        char currentCharacter = originalString.charAt(0);
        if (Character.isSpaceChar(currentCharacter) || Character.isWhitespace(currentCharacter)) {
            return ToCamel(originalString.substring(1), true, isFirstCharacter, result);
        } 
        else if (isFirstCharacter) {
            result += currentCharacter;
            return ToCamel(originalString.substring(1), false, false, result);
        } 
        else if (makeNextUppercase) {
            result += Character.toTitleCase(currentCharacter);
            return ToCamel(originalString.substring(1), false, false, result);
        } 
        else {
            result += currentCharacter;
            return ToCamel(originalString.substring(1), false, false, result);
        }
    }
    
    // This function converts a string to camel case
    // It takes two string and one boolean inputs
    // It returns string
    public static String ToSnake(String originalString, String result, boolean appendUnderscore) {
        if (originalString.isEmpty()) {
            return result;
        }
        char currentCharacter = originalString.charAt(0);
        if (Character.isSpaceChar(currentCharacter) || Character.isWhitespace(currentCharacter)) {
            if (appendUnderscore) {
                result += "_";
            }
            return ToSnake(originalString.substring(1), result, false);
        } 
        else {
            result += currentCharacter;
            return ToSnake(originalString.substring(1), result, true);
        }
    }

    // This function tells wheather the substring provided by countPalindrome is palindrome or not
    // It takes one string and two integer
    // It returns boolean value
    public static boolean isPalindrome(String str, int start, int end) {
        if (start >= end) return true; 
        if (str.charAt(start) != str.charAt(end)) return false;  
        return isPalindrome(str, start + 1, end - 1);
    }

    // This function extracts substring from a string provided by countPalindrome
    // It takes one string and two integer
    // It returns String
    public static String extractSubstring(String str, int start, int end) {
        if (start > end) return "";
        return str.charAt(start) + extractSubstring(str, start + 1, end);
    }

    // This function checks wheather any palindrome repeats or not
    // It takes one string array, one string and one integer
    // It returns boolean value
    public static boolean isRepeat(String[] uniquePalindromes, String palindrome, int size) {
        if (size == 0) return false;
        if (uniquePalindromes[size - 1].equals(palindrome)) return true;
        return isRepeat(uniquePalindromes, palindrome, size - 1);
    }

    // This function counts number of palindrome present in a string
    // It takes one string, two integer, one string array and one integer array as input
    // This function has three sub functions isPalindrome, extractSubstring, isRepeat
    // It repeats void
    public static void countPalindromes(String str, int start, int end, String[] uniquePalindromes, int[] palindromeCount) {
        int n = str.length();
        if (start >= n) return;
        if (end > n) {
            countPalindromes(str, start + 1, start + 1, uniquePalindromes, palindromeCount); 
            return;
        }
        String substring = extractSubstring(str, start, end - 1); 
        if (!substring.isEmpty() && isPalindrome(str, start, end - 1)) { 
            if (!isRepeat(uniquePalindromes, substring, palindromeCount[0])) {
                uniquePalindromes[palindromeCount[0]] = substring;  
                palindromeCount[0]++; 
            }
        }
        countPalindromes(str, start, end + 1, uniquePalindromes, palindromeCount);
    }
}
