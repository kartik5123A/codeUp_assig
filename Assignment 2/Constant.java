/***
 * It contains all methods and constants used in BasicOperations.java
 * Owner Name: Kartik Agarwal
 */
public class Constant {

    final String Enter_String = "Enter the first String - ";
    final String Entry = "You have Entered - ";
    final String Operation = "Choose which operation you want to perform.";
    final String Append = "1. Append ";
    final String Count = "2. Count words ";
    final String Replace = "3. Replace character ";
    final String Palindrome = "4. Palindrome ";
    final String Splice = "5. Splice ";
    final String Split = "6. split ";
    final String Repeat = "7. Repeat ";
    final String Sort = "8. Sort ";
    final String Shift = "9. Shift ";
    final String Reverse = "10. Reverse ";
    final String Exit = "0. Exit ";
    final String Choice = "Enter The number of The operation you want to perform - ";
    final String Invalid = "Invalid Input ! \nPlease enter Number between 1 to 10.";
    final String Enter_Append = "Enter a string you want to append: ";
    final String Output = "Your output is: ";
    final String Input = "Enter your string: ";
    final String End = "Now please rate me 1 to 5.";
    final String NewString = "11. New Input String";
    final String startIndex = "Enter start index(int only): ";
    final String endIndex = "Enter length(int only): ";
    final String SplitInput = "Enter the character(char only): ";
    final String OldChar = "Enter the old character(char only): ";
    final String NewChar = "Enter the new character(char only): ";
    final String rotateInt = "Enter the number(int only): ";

    public static void main(String[] args) {
        
    }
    
    // Function to append a string
    // This function takes two string as input and add them.
    // It returns the added string.
    public static String appendString(String firstInput, String secondInput){
        return firstInput + secondInput;
    }

    // Function to count letters in a string
    // This function takes string as input and count the number of words present in the string.
    // It returns the integer value.
    public static int wordCount(String name){   
        int totalLetter = 0 ;
        boolean isWord = false;
        for(int i = 0 ; i < name.length() ; i++ ){
            char ch = name.charAt(i);
            if(ch != ' ' && ch!= '\t' && ch != '.'){
                if(!isWord){
                    totalLetter++;
                    isWord = true;
                }
            }else{
                isWord = false;
            }
        }
        return totalLetter;
    }

    // Function to replace character in a string
    // This function takes one string and two char as input and replace the old character to the new one.
    // It returns new string
    public static String replaceString(String input, char oldChar, char newChar){
        String output = "";

        for (int i = 0; i < input.length(); i++)
        {
            if (input.charAt(i) == oldChar)
            {
                output += newChar;
                if (input.charAt(i) == ' ')
                {
                    output += ' ';
                }
            } else
            {
                output += input.charAt(i);
            }
        }
        return output;
    }

    // Function to check wheather a string is palindrome or not
    // This function takes string as input and check wheather they look same when they get reversed.
    // It returns boolean value
    public static boolean isPalindrome(String input)
    {
        int length = input.length();
        char[] nameCharacter = input.toCharArray();
        for (int i = 0; i < length; i++)
        {
            if (nameCharacter[i] >= 'A' && nameCharacter[i] <= 'Z')
            {
                nameCharacter[i] = (char) (nameCharacter[i] + ('a' - 'A'));
            }
        }
        for (int i = 0, j = length - 1; i <= j; i++, j--)
        {
            if (nameCharacter[i] != nameCharacter[j])
            {
                return false;
            }
        }
        return true;
    }

    // Function to splice a string
    // This function takes string and two integer as input and delete the string comes between the range.
    // It returns updated string.
    public static String spliceString(String input, int startIndex, int length){
        String output = "";
        for(int i = 0; i < input.length(); i++){
            if(startIndex < 0 || length < 0 || startIndex + length > input.length()){
                output = "Invalid input";
                break;
            }
            if(i>=startIndex && i<=length-1+startIndex) continue;
            else output = output + input.charAt(i);
        }
        return output;
    }

    // Function to split a string
    // This function takes string and character as input and split the string whenever that character appears and add it into an array.
    // It returns string array
    public static String[] splitString(String originalString, char delimiter) {
        if (originalString == null) {
            return null; 
        }
        int substringCount = 1; 
        for (int i = 0; i < originalString.length(); i++) {
            if (originalString.charAt(i) == delimiter) {
                substringCount++;
            }
        }
        String[] result = new String[substringCount];
        int start = 0;
        int resultIndex = 0;
        for (int i = 0; i < originalString.length(); i++) {
            if (originalString.charAt(i) == delimiter) {
                result[resultIndex] = extractSubstring(originalString, start, i);
                resultIndex++;
                start = i + 1;
            }
        }
        result[resultIndex] = extractSubstring(originalString, start, originalString.length());
        return result;
    }

    // Function to extract a substring
    // This function takes string and two integer as input and extracted the substring comes between those indexes.
    // It returns the extracted string
    private static String extractSubstring(String str, int start, int end) {
        char[] substring = new char[end - start];
        for (int i = start; i < end; i++) {
            substring[i - start] = str.charAt(i);
        }
        return new String(substring);
    }

    // Function to reverse a string
    // This function takes string as input and reverse the characters in it.
    // It returns the updated string
    public static String reverseString(String first) {
        char[] strArray = first.toCharArray();
        int left = 0;
        int right = strArray.length - 1;
        while (left < right) {
            char temp = strArray[left];
            strArray[left] = strArray[right];
            strArray[right] = temp;
            left++;
            right--;
        }
        return new String(strArray);
    }

    // Function to rotate a string
    // This function takes string and integer as input and add moves their indexes integer times.
    // It returns the updated string
    public static String shifter(String inputString, int position){
        if(inputString == null) return null;
        int length = inputString.length();
        position = position % length;
        if(position < 0) position += length;
        char[] rotatedString = new char[length];
        for(int i = 0; i < length; i++){
            int newPosition = (i + position) % length;
            rotatedString[newPosition] = inputString.charAt(i);
        }
        return new String(rotatedString);
    }

    // Function to find most repeated character in a string
    // This function takes string as input and find the character that repeated most in the string.
    // It returns the character value
    public static char maxRepeat(String input) {
        if (input == null || input.length() == 0) {
            return '\0'; 
        }
        int[] charCount = new int[256]; 
        int maxCount = 0;
        char maxChar = '\0';
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            charCount[currentChar]++;
            
            if (charCount[currentChar] > maxCount) {
                maxCount = charCount[currentChar];
                maxChar = currentChar;
            }
        }
        return maxChar;
    }

    // Function to sort a string
    // This function takes string as input and sort them by their ASCII values.
    // It returns the updated string
    public static String sortString(String input){
        if(input == null || input.length() == 0) return input;
        char[] charArray = input.toCharArray();
        int n = charArray.length;
        boolean swapped;
        for(int i = 0; i < n - 1; i++){
            swapped = false;
            for(int j = 0; j < n - i - 1; j++){
                if(charArray[j] > charArray[j+1]){
                    char temp = charArray[j];
                    charArray[j] = charArray[j+1];
                    charArray[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped) break;
        }
        return new String(charArray);
    }
}
