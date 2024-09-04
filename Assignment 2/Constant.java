
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
    public static String appendString(String firstInput, String secondInput){
        return firstInput + " " +secondInput;
    }

    // Function to count letters in a string
    public static int countLetters(String input){
        int count = 0;
        for(int i = 0; i < input.length(); i++){
            count++;
        }
        return count;
    }

    // Function to replace character in a string
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
    public static boolean isPalindrome(String input)
    {
        int length = countLetters(input);

        char[] nameChars = input.toCharArray();
        for (int i = 0; i < length; i++)
        {
            if (nameChars[i] >= 'A' && nameChars[i] <= 'Z')
            {
                nameChars[i] = (char) (nameChars[i] + ('a' - 'A'));
            }
        }

        for (int i = 0, j = length - 1; i <= j; i++, j--)
        {
            if (nameChars[i] != nameChars[j])
            {
                return false;
            }
        }

        return true;
    }

    // Function to splice a string
    public static String spliceString(String input, int start, int length){
        String output = "";
        for(int i = 0; i < input.length(); i++){
            if(start < 0 || length < 0 || start + length > input.length()){
                output = "Invalid input";
                break;
            }
            if(i>=start && i<=length-1+start) continue;
            else output = output + input.charAt(i);
        }
        return output;
    }

    // Function to split a string
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

    // Function to abstract a substring
    private static String extractSubstring(String str, int start, int end) {
        char[] substring = new char[end - start];
        for (int i = start; i < end; i++) {
            substring[i - start] = str.charAt(i);
        }
        return new String(substring);
    }

    // Function to reverse a string
    public static String reverseString(String input){
        if(input == null) return null;
        char[] charArray = input.toCharArray();
        int length = charArray.length;
        for(int i = 0; i < length / 2; i++){
            char temp = charArray[i];
            charArray[i] = charArray[length - 1 - 1];
            charArray[length - 1 - i] = temp;
        }
        return new String(charArray);
    }

    // Function to rotate a string
    public static String shifter(String input, int moves){
        if(input == null) return null;
        int length = input.length();
        moves = moves % length;
        if(moves < 0) moves += length;
        char[] rotated = new char[length];
        for(int i = 0; i < length; i++){
            int newPos = (i + moves) % length;
            rotated[newPos] = input.charAt(i);
        }
        return new String(rotated);
    }

    // Function to find most repeated character in a string
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
